package com.fasterxml.jackson.core.sym;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        int int11 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "1) test0501(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432212483) + "'", int1 == (-432212483));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "1) test0501(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432212483) + "'", int3 == (-432212483));
// flaky "1) test0501(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726549088 + "'", int8 == 726549088);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        int int9 = byteQuadsCanonicalizer0.calcHash((-432232833), 726926494, (-432225587));
        int int10 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "2) test0502(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432212453) + "'", int4 == (-432212453));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "2) test0502(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102976034 + "'", int9 == 102976034);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432216899));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        int int9 = byteQuadsCanonicalizer0.calcHash((-432232833), 726926494, (-432225587));
        int int10 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "3) test0504(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432212421) + "'", int4 == (-432212421));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "3) test0504(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 119056282 + "'", int9 == 119056282);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432216259));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int[] intArray4 = byteQuadsCanonicalizer0._hashArea;
        int int5 = byteQuadsCanonicalizer0._hashSize;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-1446089868);
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(intArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._tertiaryStart = 872635325;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1548189191));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._count = (byte) 100;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        byteQuadsCanonicalizer12._spilloverEnd = (byte) 100;
        int int19 = byteQuadsCanonicalizer12._spilloverEnd;
        int int20 = byteQuadsCanonicalizer12.secondaryCount();
        byteQuadsCanonicalizer12._longNameOffset = 3846;
        java.lang.String str23 = byteQuadsCanonicalizer12.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int25 = byteQuadsCanonicalizer24._longNameOffset;
        byteQuadsCanonicalizer24._tertiaryStart = 0;
        boolean boolean28 = byteQuadsCanonicalizer24.maybeDirty();
        byteQuadsCanonicalizer24._spilloverEnd = (-2066636029);
        int int31 = byteQuadsCanonicalizer24.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer32 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int33 = byteQuadsCanonicalizer32.hashSeed();
        int int34 = byteQuadsCanonicalizer32._longNameOffset;
        int int35 = byteQuadsCanonicalizer32.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer36 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int37 = byteQuadsCanonicalizer36._hashSize;
        byteQuadsCanonicalizer36._count = (byte) 100;
        java.lang.String[] strArray40 = byteQuadsCanonicalizer36._names;
        byteQuadsCanonicalizer36._spilloverEnd = (byte) 100;
        int int43 = byteQuadsCanonicalizer36._spilloverEnd;
        int int44 = byteQuadsCanonicalizer36.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer45 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int46 = byteQuadsCanonicalizer45._hashSize;
        byteQuadsCanonicalizer45._count = (byte) 100;
        java.lang.String[] strArray49 = byteQuadsCanonicalizer45._names;
        int[] intArray54 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int56 = byteQuadsCanonicalizer45.calcHash(intArray54, 4);
        java.lang.String[] strArray62 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer45._names = strArray62;
        byteQuadsCanonicalizer36._names = strArray62;
        byteQuadsCanonicalizer32._names = strArray62;
        byteQuadsCanonicalizer24._names = strArray62;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer67 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int68 = byteQuadsCanonicalizer67._hashSize;
        byteQuadsCanonicalizer67._count = (byte) 100;
        java.lang.String[] strArray71 = byteQuadsCanonicalizer67._names;
        byteQuadsCanonicalizer67._spilloverEnd = (byte) 100;
        int int74 = byteQuadsCanonicalizer67._spilloverEnd;
        int int75 = byteQuadsCanonicalizer67.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer76 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int77 = byteQuadsCanonicalizer76._hashSize;
        byteQuadsCanonicalizer76._count = (byte) 100;
        java.lang.String[] strArray80 = byteQuadsCanonicalizer76._names;
        int[] intArray85 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int87 = byteQuadsCanonicalizer76.calcHash(intArray85, 4);
        java.lang.String[] strArray93 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer76._names = strArray93;
        byteQuadsCanonicalizer67._names = strArray93;
        byteQuadsCanonicalizer24._names = strArray93;
        byteQuadsCanonicalizer12._names = strArray93;
        byteQuadsCanonicalizer11._names = strArray93;
        byteQuadsCanonicalizer0._names = strArray93;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "4) test0507(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432212339) + "'", int1 == (-432212339));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]" + "'", str23, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-516659008) + "'", int31 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer32);
// flaky "4) test0507(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-432212339) + "'", int33 == (-432212339));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(strArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "2) test0507(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1850811634) + "'", int56 == (-1850811634));
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(strArray71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(strArray80);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "1) test0507(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1850811634) + "'", int87 == (-1850811634));
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(2086675986);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726812095);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "5) test0510(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432212257) + "'", int1 == (-432212257));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        int int11 = byteQuadsCanonicalizer0.size();
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "6) test0511(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1611616031) + "'", int6 == (-1611616031));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432234613));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2._hashSize;
        byteQuadsCanonicalizer2._count = (byte) 100;
        java.lang.String[] strArray6 = byteQuadsCanonicalizer2._names;
        int[] intArray11 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int13 = byteQuadsCanonicalizer2.calcHash(intArray11, 4);
        java.lang.String[] strArray19 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer2._names = strArray19;
        byteQuadsCanonicalizer1._names = strArray19;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "7) test0512(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1045431144) + "'", int13 == (-1045431144));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2._hashSize;
        byteQuadsCanonicalizer2._count = (byte) 100;
        java.lang.String[] strArray6 = byteQuadsCanonicalizer2._names;
        int[] intArray11 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int13 = byteQuadsCanonicalizer2.calcHash(intArray11, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = byteQuadsCanonicalizer1.calcHash(intArray11, (-432214853));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "8) test0513(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-171164463) + "'", int13 == (-171164463));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8.hashSeed();
        int int10 = byteQuadsCanonicalizer8._secondaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        int int16 = byteQuadsCanonicalizer11.calcHash((-432857889), (-432802824), (-432235691));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17._hashSize;
        byteQuadsCanonicalizer17._count = (byte) 100;
        java.lang.String[] strArray21 = byteQuadsCanonicalizer17._names;
        byteQuadsCanonicalizer17._spilloverEnd = (byte) 100;
        int int24 = byteQuadsCanonicalizer17._spilloverEnd;
        int int25 = byteQuadsCanonicalizer17.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int27 = byteQuadsCanonicalizer26._hashSize;
        byteQuadsCanonicalizer26._count = (byte) 100;
        java.lang.String[] strArray30 = byteQuadsCanonicalizer26._names;
        int[] intArray35 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int37 = byteQuadsCanonicalizer26.calcHash(intArray35, 4);
        java.lang.String[] strArray43 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer26._names = strArray43;
        byteQuadsCanonicalizer17._names = strArray43;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer46 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int47 = byteQuadsCanonicalizer46._hashSize;
        byteQuadsCanonicalizer46._count = (byte) 100;
        java.lang.String[] strArray50 = byteQuadsCanonicalizer46._names;
        int[] intArray55 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int57 = byteQuadsCanonicalizer46.calcHash(intArray55, 4);
        byteQuadsCanonicalizer17._hashArea = intArray55;
        byteQuadsCanonicalizer11._hashArea = intArray55;
        int int61 = byteQuadsCanonicalizer11.calcHash(11880);
        int[] intArray62 = byteQuadsCanonicalizer11._hashArea;
        byteQuadsCanonicalizer8._hashArea = intArray62;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = byteQuadsCanonicalizer0.findName(intArray62, 1828264743);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "9) test0515(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2041063137 + "'", int4 == 2041063137);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "5) test0515(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432212177) + "'", int9 == (-432212177));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "3) test0515(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-502311532) + "'", int16 == (-502311532));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "2) test0515(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1790636478 + "'", int37 == 1790636478);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(strArray50);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "1) test0515(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1790636478 + "'", int57 == 1790636478);
// flaky "1) test0515(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-432808872) + "'", int61 == (-432808872));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-432237577), (-432237873), 100, (-1) });
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "10) test0516(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2029439425 + "'", int4 == 2029439425);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "6) test0516(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432212149) + "'", int8 == (-432212149));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        byteQuadsCanonicalizer4._hashSize = (-432236017);
        int int8 = byteQuadsCanonicalizer4._hashSize;
        byteQuadsCanonicalizer4.release();
        byteQuadsCanonicalizer4._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "11) test0517(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432212123) + "'", int1 == (-432212123));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432236017) + "'", int8 == (-432236017));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        int int22 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = byteQuadsCanonicalizer23._tertiaryStart;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "12) test0518(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 532559846 + "'", int17 == 532559846);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer23);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        byteQuadsCanonicalizer0._longNameOffset = (-432857107);
        byteQuadsCanonicalizer0._spilloverEnd = (-432226555);
        java.lang.String[] strArray10 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._tertiaryShift = (-432224569);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "13) test0519(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432212045) + "'", int1 == (-432212045));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "7) test0519(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432212045) + "'", int3 == (-432212045));
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0.makeChild(11880);
        java.lang.String[] strArray6 = byteQuadsCanonicalizer5._names;
        int int7 = byteQuadsCanonicalizer5.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "14) test0520(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432212031) + "'", int1 == (-432212031));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "8) test0520(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432212031) + "'", int3 == (-432212031));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-44895162));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0._secondaryStart;
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "15) test0523(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432211959) + "'", int8 == (-432211959));
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0._count;
        int int10 = byteQuadsCanonicalizer0.primaryCount();
        int int11 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = (-760426642);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = byteQuadsCanonicalizer0.findName((-432223185));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 53751 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "16) test0525(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 861512102 + "'", int17 == 861512102);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "9) test0525(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-432211887) + "'", int23 == (-432211887));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
// flaky "4) test0525(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-432211887) + "'", int27 == (-432211887));
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
// flaky "3) test0525(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 861512102 + "'", int50 == 861512102);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] {});
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer1.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        int int8 = byteQuadsCanonicalizer6._spilloverEnd;
        int int9 = byteQuadsCanonicalizer6._tertiaryShift;
        int int13 = byteQuadsCanonicalizer6.calcHash(6000, (-432236993), 0);
        boolean boolean14 = byteQuadsCanonicalizer6._failOnDoS;
        int int15 = byteQuadsCanonicalizer6.hashSeed();
        byteQuadsCanonicalizer6._reportTooManyCollisions();
        byteQuadsCanonicalizer6._hashSize = (-1461335867);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        byteQuadsCanonicalizer19._count = (byte) 100;
        java.lang.String[] strArray23 = byteQuadsCanonicalizer19._names;
        int[] intArray28 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int30 = byteQuadsCanonicalizer19.calcHash(intArray28, 4);
        byteQuadsCanonicalizer19._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer33 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int34 = byteQuadsCanonicalizer33._hashSize;
        byteQuadsCanonicalizer33._count = (byte) 100;
        java.lang.String[] strArray37 = byteQuadsCanonicalizer33._names;
        int[] intArray42 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int44 = byteQuadsCanonicalizer33.calcHash(intArray42, 4);
        byteQuadsCanonicalizer19._hashArea = intArray42;
        byteQuadsCanonicalizer6._hashArea = intArray42;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray42, 726596302);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "17) test0527(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 787905911 + "'", int13 == 787905911);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "10) test0527(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-432211817) + "'", int15 == (-432211817));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "5) test0527(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1868233821) + "'", int30 == (-1868233821));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "4) test0527(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1868233821) + "'", int44 == (-1868233821));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0.makeChild(11880);
        java.lang.String str9 = byteQuadsCanonicalizer5.findName(1483912190, (-1776808604), (-432228007));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "18) test0528(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432211799) + "'", int1 == (-432211799));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "11) test0528(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432211799) + "'", int3 == (-432211799));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 6000;
        int int9 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int15 = byteQuadsCanonicalizer0.calcHash((-1529115260));
        byteQuadsCanonicalizer0._longNameOffset = (-432229721);
        int int19 = byteQuadsCanonicalizer0.calcHash(74007406);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "19) test0530(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 928376625 + "'", int11 == 928376625);
// flaky "12) test0530(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1122211415 + "'", int15 == 1122211415);
// flaky "6) test0530(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-497501331) + "'", int19 == (-497501331));
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0._count;
        int int10 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.Class<?> wildcardClass11 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        int int8 = byteQuadsCanonicalizer3._longNameOffset;
        int int12 = byteQuadsCanonicalizer3.calcHash((-552967), (-432223195), 315521232);
        int int13 = byteQuadsCanonicalizer3.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1746443196 + "'", int12 == 1746443196);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0.release();
        int int9 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        byteQuadsCanonicalizer10._count = (byte) 100;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer10._names;
        java.lang.String str15 = byteQuadsCanonicalizer10.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._hashSize;
        byteQuadsCanonicalizer16._count = (byte) 100;
        java.lang.String[] strArray20 = byteQuadsCanonicalizer16._names;
        int[] intArray25 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int27 = byteQuadsCanonicalizer16.calcHash(intArray25, 4);
        byteQuadsCanonicalizer10._hashArea = intArray25;
        byteQuadsCanonicalizer0._hashArea = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = byteQuadsCanonicalizer0.findName(73865783, (-432227493), (-432228749));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1394908547 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "20) test0533(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432211719) + "'", int1 == (-432211719));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str15, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "13) test0533(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1948492079 + "'", int27 == 1948492079);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer47 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int48 = byteQuadsCanonicalizer47._hashSize;
        byteQuadsCanonicalizer47._count = (byte) 100;
        java.lang.String[] strArray51 = byteQuadsCanonicalizer47._names;
        int[] intArray56 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int58 = byteQuadsCanonicalizer47.calcHash(intArray56, 4);
        byteQuadsCanonicalizer18._hashArea = intArray56;
        byteQuadsCanonicalizer0._hashArea = intArray56;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "21) test0534(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-506444486) + "'", int11 == (-506444486));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "14) test0534(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 967006589 + "'", int17 == 967006589);
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
// flaky "7) test0534(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-506444486) + "'", int38 == (-506444486));
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "5) test0534(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-506444486) + "'", int58 == (-506444486));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        int int5 = byteQuadsCanonicalizer3._count;
        int int6 = byteQuadsCanonicalizer3._spilloverEnd;
        int int7 = byteQuadsCanonicalizer3.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 448 + "'", int6 == 448);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432220603));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int int2 = byteQuadsCanonicalizer1.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer1.makeChild((-432215719));
        int[] intArray5 = byteQuadsCanonicalizer1._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNull(intArray5);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "22) test0539(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432211635) + "'", int1 == (-432211635));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        int int10 = byteQuadsCanonicalizer0.calcHash((-1), (-432236713), 726739627);
        byteQuadsCanonicalizer0._intern = true;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13.hashSeed();
        java.lang.String[] strArray15 = byteQuadsCanonicalizer13._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = byteQuadsCanonicalizer13.makeChild(1081706716);
        int int18 = byteQuadsCanonicalizer17.primaryCount();
        int[] intArray19 = byteQuadsCanonicalizer17._hashArea;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = byteQuadsCanonicalizer0.calcHash(intArray19, 74007406);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 512 out of bounds for length 512");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "23) test0540(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25072 + "'", int6 == 25072);
// flaky "15) test0540(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 145812602 + "'", int10 == 145812602);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
// flaky "8) test0540(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-432211621) + "'", int14 == (-432211621));
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._longNameOffset = 726921751;
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        int int9 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "24) test0541(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432211603) + "'", int4 == (-432211603));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "16) test0541(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432211603) + "'", int8 == (-432211603));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int10 = byteQuadsCanonicalizer0.calcHash((-432221857), 726920401, (-432226301));
        int int13 = byteQuadsCanonicalizer0.calcHash(585071716, (-432213723));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "25) test0542(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-585511819) + "'", int10 == (-585511819));
// flaky "17) test0542(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-438478109) + "'", int13 == (-438478109));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        int int4 = byteQuadsCanonicalizer1._tertiaryShift;
        int[] intArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray6, (-432804152));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
        int int17 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "26) test0544(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-474133760) + "'", int6 == (-474133760));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "18) test0544(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 797273386 + "'", int15 == 797273386);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        int int36 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-1889133708);
        int int39 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "27) test0545(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432211535) + "'", int1 == (-432211535));
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
// flaky "19) test0545(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-40816465) + "'", int24 == (-40816465));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1.secondaryCount();
        boolean boolean8 = byteQuadsCanonicalizer1._intern;
        byteQuadsCanonicalizer1._hashSize = (-910620441);
        int int11 = byteQuadsCanonicalizer1.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean9 = byteQuadsCanonicalizer0._failOnDoS;
        int int10 = byteQuadsCanonicalizer0._count;
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._tertiaryShift = (-432237891);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15._hashSize;
        int int17 = byteQuadsCanonicalizer15._spilloverEnd;
        int int18 = byteQuadsCanonicalizer15._longNameOffset;
        int int19 = byteQuadsCanonicalizer15.hashSeed();
        int int22 = byteQuadsCanonicalizer15.calcHash((-1776808604), (int) (short) 100);
        int int23 = byteQuadsCanonicalizer15._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int25 = byteQuadsCanonicalizer24._hashSize;
        byteQuadsCanonicalizer24._count = (byte) 100;
        java.lang.String[] strArray28 = byteQuadsCanonicalizer24._names;
        java.lang.String str29 = byteQuadsCanonicalizer24.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int31 = byteQuadsCanonicalizer30._hashSize;
        byteQuadsCanonicalizer30._count = (byte) 100;
        java.lang.String[] strArray34 = byteQuadsCanonicalizer30._names;
        int[] intArray39 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int41 = byteQuadsCanonicalizer30.calcHash(intArray39, 4);
        byteQuadsCanonicalizer24._hashArea = intArray39;
        byteQuadsCanonicalizer15._hashArea = intArray39;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray39, (-432219391));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "28) test0548(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432211513) + "'", int4 == (-432211513));
// flaky "20) test0548(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850963088 + "'", int7 == 850963088);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky "9) test0548(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-432211513) + "'", int19 == (-432211513));
// flaky "6) test0548(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 850963088 + "'", int22 == 850963088);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str29, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "2) test0548(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1800909163) + "'", int41 == (-1800909163));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        java.lang.String[] strArray13 = byteQuadsCanonicalizer9._names;
        java.lang.String str14 = byteQuadsCanonicalizer9.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15._hashSize;
        byteQuadsCanonicalizer15._count = (byte) 100;
        java.lang.String[] strArray19 = byteQuadsCanonicalizer15._names;
        int[] intArray24 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int26 = byteQuadsCanonicalizer15.calcHash(intArray24, 4);
        byteQuadsCanonicalizer9._hashArea = intArray24;
        byteQuadsCanonicalizer0._hashArea = intArray24;
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "29) test0549(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432211479) + "'", int4 == (-432211479));
// flaky "21) test0549(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850965140 + "'", int7 == 850965140);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str14, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "10) test0549(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 947791857 + "'", int26 == 947791857);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12.hashSeed();
        int int14 = byteQuadsCanonicalizer12._longNameOffset;
        int int15 = byteQuadsCanonicalizer12._longNameOffset;
        boolean boolean16 = byteQuadsCanonicalizer12._intern;
        int int17 = byteQuadsCanonicalizer12._secondaryStart;
        int int18 = byteQuadsCanonicalizer12._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        byteQuadsCanonicalizer19._count = (byte) 100;
        java.lang.String[] strArray23 = byteQuadsCanonicalizer19._names;
        int[] intArray28 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int30 = byteQuadsCanonicalizer19.calcHash(intArray28, 4);
        java.lang.String[] strArray36 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer19._names = strArray36;
        byteQuadsCanonicalizer12._names = strArray36;
        byteQuadsCanonicalizer0._names = strArray36;
        java.lang.Class<?> wildcardClass40 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "30) test0550(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 585074776 + "'", int10 == 585074776);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
// flaky "22) test0550(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-432211461) + "'", int13 == (-432211461));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "11) test0550(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 68565890 + "'", int30 == 68565890);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        boolean boolean3 = byteQuadsCanonicalizer1._failOnDoS;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer1.makeChild((-1008950360));
        int int6 = byteQuadsCanonicalizer1.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int6 = byteQuadsCanonicalizer0.size();
        int int7 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._tertiaryShift = 648038151;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "31) test0552(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432211429) + "'", int1 == (-432211429));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        byteQuadsCanonicalizer0._tertiaryStart = 'a';
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "32) test0553(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 585058621 + "'", int10 == 585058621);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "23) test0553(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432211415) + "'", int12 == (-432211415));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._intern = true;
        int int10 = byteQuadsCanonicalizer3.calcHash((-432231187), (-432228301), (-1967485713));
        int int14 = byteQuadsCanonicalizer3.calcHash(901591338, 1122142730, 0);
        int int15 = byteQuadsCanonicalizer3._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1481041286) + "'", int10 == (-1481041286));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-961434091) + "'", int14 == (-961434091));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 448 + "'", int15 == 448);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        int int7 = byteQuadsCanonicalizer1.calcHash(586081183, (-432230393), 726700144);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int9 = byteQuadsCanonicalizer1._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2127311314 + "'", int7 == 2127311314);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        java.lang.String str7 = byteQuadsCanonicalizer0.toString();
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "33) test0556(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50074113) + "'", int6 == (-50074113));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str7, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._secondaryStart = (-432235313);
        int int6 = byteQuadsCanonicalizer1.totalCount();
        int[] intArray7 = byteQuadsCanonicalizer1._hashArea;
        byteQuadsCanonicalizer1._tertiaryStart = 1659441768;
        int int10 = byteQuadsCanonicalizer1.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        byteQuadsCanonicalizer0._count = 586121521;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int36 = byteQuadsCanonicalizer35.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer37 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int38 = byteQuadsCanonicalizer37._hashSize;
        byteQuadsCanonicalizer37._count = (byte) 100;
        java.lang.String[] strArray41 = byteQuadsCanonicalizer37._names;
        int[] intArray46 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int48 = byteQuadsCanonicalizer37.calcHash(intArray46, 4);
        byteQuadsCanonicalizer35._hashArea = intArray46;
        // The following exception was thrown during execution in test generation
        try {
            int int51 = byteQuadsCanonicalizer0.calcHash(intArray46, (-432219497));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
// flaky "34) test0558(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1702970163 + "'", int16 == 1702970163);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "24) test0558(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1702970163 + "'", int30 == 1702970163);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "12) test0558(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1702970163 + "'", int48 == 1702970163);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (-432807676);
        int int4 = byteQuadsCanonicalizer1.hashSeed();
        java.lang.String[] strArray5 = byteQuadsCanonicalizer1._names;
        boolean boolean6 = byteQuadsCanonicalizer1._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray7 = byteQuadsCanonicalizer0._names;
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432231187);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "35) test0560(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432211215) + "'", int6 == (-432211215));
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1.secondaryCount();
        boolean boolean8 = byteQuadsCanonicalizer1._intern;
        boolean boolean9 = byteQuadsCanonicalizer1.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "36) test0562(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-148081990) + "'", int6 == (-148081990));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 1797043;
        boolean boolean7 = byteQuadsCanonicalizer1._failOnDoS;
        int int8 = byteQuadsCanonicalizer1._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        java.lang.String str7 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str7, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._hashSize = (-432230135);
        int int16 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "37) test0565(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 702527112 + "'", int11 == 702527112);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-432230135) + "'", int16 == (-432230135));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int6 = byteQuadsCanonicalizer5.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7._hashSize;
        byteQuadsCanonicalizer7._count = (byte) 100;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer7._names;
        int[] intArray16 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int18 = byteQuadsCanonicalizer7.calcHash(intArray16, 4);
        byteQuadsCanonicalizer5._hashArea = intArray16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = byteQuadsCanonicalizer0.findName(intArray16, 1881134293);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "38) test0566(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432211103) + "'", int1 == (-432211103));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "25) test0566(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1241552205 + "'", int18 == 1241552205);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        byteQuadsCanonicalizer0._tertiaryStart = 726716047;
        byteQuadsCanonicalizer0._hashSize = (-432229523);
        byteQuadsCanonicalizer0._spilloverEnd = (-432215695);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "39) test0567(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432211089) + "'", int1 == (-432211089));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int[] intArray9 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "40) test0568(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-260308138) + "'", int6 == (-260308138));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer10);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-41777064));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._secondaryStart = (-41777064);
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        int int30 = byteQuadsCanonicalizer0.calcHash(11880);
        int int31 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "41) test0571(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-864851999) + "'", int11 == (-864851999));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "26) test0571(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-864851999) + "'", int25 == (-864851999));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky "13) test0571(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-432807998) + "'", int30 == (-432807998));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        int[] intArray7 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer0._hashArea = intArray7;
        int int9 = byteQuadsCanonicalizer0.size();
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-680563359);
        byteQuadsCanonicalizer0._secondaryStart = (-1529115260);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = byteQuadsCanonicalizer0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1529115257 out of bounds for length 4");
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
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (-432807676);
        boolean boolean4 = byteQuadsCanonicalizer1.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int10 = byteQuadsCanonicalizer0.calcHash(1809837904, 13759, 1596861526);
        byteQuadsCanonicalizer0._tertiaryShift = 0;
        byteQuadsCanonicalizer0._count = 595350631;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "42) test0574(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432210907) + "'", int1 == (-432210907));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "27) test0574(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-792185605) + "'", int10 == (-792185605));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._count;
        int int10 = byteQuadsCanonicalizer0.primaryCount();
        boolean boolean11 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "43) test0575(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432210887) + "'", int1 == (-432210887));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "28) test0575(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432210887) + "'", int3 == (-432210887));
// flaky "14) test0575(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726674161 + "'", int8 == 726674161);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash((-432233131), (-432807676), (-1654346617));
        int int8 = byteQuadsCanonicalizer1.calcHash((-432236071));
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        int int13 = byteQuadsCanonicalizer1.calcHash(242738004, 5951790, 850842587);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-41777064) + "'", int6 == (-41777064));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432806963) + "'", int8 == (-432806963));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1341533946) + "'", int13 == (-1341533946));
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (-432219723);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "44) test0577(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432210821) + "'", int4 == (-432210821));
// flaky "29) test0577(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850969613 + "'", int7 == 850969613);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        int int7 = byteQuadsCanonicalizer0._longNameOffset;
        int[] intArray8 = byteQuadsCanonicalizer0._hashArea;
        int int9 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._spilloverEnd = 18652;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857889);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._secondaryStart = 726927673;
        int[] intArray15 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "45) test0579(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432210793) + "'", int1 == (-432210793));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "30) test0579(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432210793) + "'", int3 == (-432210793));
// flaky "15) test0579(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726666781 + "'", int8 == 726666781);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        java.lang.Class<?> wildcardClass20 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "46) test0580(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1973212506) + "'", int17 == (-1973212506));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        int int15 = byteQuadsCanonicalizer0.calcHash((-432213565), 585164866, (-432231173));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "47) test0581(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432210755) + "'", int1 == (-432210755));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "31) test0581(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1765050200) + "'", int15 == (-1765050200));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        int int14 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "48) test0582(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 76835642 + "'", int11 == 76835642);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._secondaryStart = (-432236017);
        int int14 = byteQuadsCanonicalizer0.calcHash(726926494, (-432237577));
        int[] intArray15 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = byteQuadsCanonicalizer0.makeChild((-849210075));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "49) test0584(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-195863211) + "'", int7 == (-195863211));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "32) test0584(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432210697) + "'", int9 == (-432210697));
// flaky "16) test0584(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 600013180 + "'", int14 == 600013180);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0.calcHash((-432221335));
        int int10 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "50) test0585(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1306083656 + "'", int4 == 1306083656);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "33) test0585(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11884 + "'", int9 == 11884);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer11);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        int int46 = byteQuadsCanonicalizer0.calcHash(29099, 1998404501);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "51) test0586(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432210675) + "'", int9 == (-432210675));
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
// flaky "34) test0586(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 68241774 + "'", int32 == 68241774);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
// flaky "17) test0586(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1893656685 + "'", int46 == 1893656685);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-1157391731));
        byteQuadsCanonicalizer0._tertiaryShift = 326206797;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "52) test0587(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 26110 + "'", int6 == 26110);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        byteQuadsCanonicalizer0._tertiaryStart = (-432230135);
        int int9 = byteQuadsCanonicalizer0.totalCount();
        int int12 = byteQuadsCanonicalizer0.calcHash((-849176249), 1158871334);
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "53) test0588(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 315497301 + "'", int12 == 315497301);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        byteQuadsCanonicalizer1._longNameOffset = (-432235879);
        int int9 = byteQuadsCanonicalizer1.spilloverCount();
        byteQuadsCanonicalizer1._hashSize = (-432228433);
        int int12 = byteQuadsCanonicalizer1._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        byteQuadsCanonicalizer0._tertiaryShift = 100;
        int int15 = byteQuadsCanonicalizer0.calcHash((-432231413), 726920401);
        int int16 = byteQuadsCanonicalizer0.totalCount();
        int int17 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._intern = false;
        int[] intArray20 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "54) test0590(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-843952380) + "'", int6 == (-843952380));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "35) test0590(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 797229997 + "'", int15 == 797229997);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "55) test0591(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1180405953 + "'", int4 == 1180405953);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "36) test0591(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432210545) + "'", int8 == (-432210545));
// flaky "18) test0591(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432210545) + "'", int9 == (-432210545));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        byteQuadsCanonicalizer1._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer1.makeChild((-432234613));
        int[] intArray7 = byteQuadsCanonicalizer1._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432237577));
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        boolean boolean3 = byteQuadsCanonicalizer1._intern;
        java.lang.Class<?> wildcardClass4 = byteQuadsCanonicalizer1.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726927871);
        int int2 = byteQuadsCanonicalizer1.totalCount();
        int int3 = byteQuadsCanonicalizer1._secondaryStart;
        boolean boolean4 = byteQuadsCanonicalizer1._failOnDoS;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer1.makeChild(1652291135);
        int int7 = byteQuadsCanonicalizer1._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-437944693));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-129002493));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer44 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int45 = byteQuadsCanonicalizer44._hashSize;
        byteQuadsCanonicalizer44._count = (byte) 100;
        java.lang.String[] strArray48 = byteQuadsCanonicalizer44._names;
        int[] intArray53 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int55 = byteQuadsCanonicalizer44.calcHash(intArray53, 4);
        byteQuadsCanonicalizer44._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer58 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int59 = byteQuadsCanonicalizer58.hashSeed();
        java.lang.String[] strArray60 = byteQuadsCanonicalizer58._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer62 = byteQuadsCanonicalizer58.makeChild(1081706716);
        int int63 = byteQuadsCanonicalizer62.primaryCount();
        int[] intArray64 = byteQuadsCanonicalizer62._hashArea;
        byteQuadsCanonicalizer44._hashArea = intArray64;
        // The following exception was thrown during execution in test generation
        try {
            int int67 = byteQuadsCanonicalizer0.calcHash(intArray64, (-1529115260));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "56) test0597(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432210479) + "'", int9 == (-432210479));
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
// flaky "37) test0597(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2063112755 + "'", int32 == 2063112755);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "19) test0597(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2063112755 + "'", int55 == 2063112755);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer58);
// flaky "7) test0597(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-432210479) + "'", int59 == (-432210479));
        org.junit.Assert.assertNull(strArray60);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(intArray64);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._count = 622936314;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = intArray6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        int int11 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-2066636029);
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        boolean boolean9 = byteQuadsCanonicalizer0._intern;
        boolean boolean10 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        int int6 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        int int5 = byteQuadsCanonicalizer3._count;
        boolean boolean6 = byteQuadsCanonicalizer3.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        int int12 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "57) test0604(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432210215) + "'", int1 == (-432210215));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "38) test0604(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432210215) + "'", int3 == (-432210215));
// flaky "20) test0604(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726669607 + "'", int8 == 726669607);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._secondaryStart = 1616355694;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "58) test0605(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 845827026 + "'", int11 == 845827026);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432811330));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean15 = byteQuadsCanonicalizer0.maybeDirty();
        int int16 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17.secondaryCount();
        int int19 = byteQuadsCanonicalizer17.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer20.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer20._hashSize = (-432857107);
        int int27 = byteQuadsCanonicalizer20._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int31 = byteQuadsCanonicalizer30._hashSize;
        byteQuadsCanonicalizer30._count = (byte) 100;
        java.lang.String[] strArray34 = byteQuadsCanonicalizer30._names;
        int[] intArray39 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int41 = byteQuadsCanonicalizer30.calcHash(intArray39, 4);
        byteQuadsCanonicalizer28._hashArea = intArray39;
        byteQuadsCanonicalizer20._hashArea = intArray39;
        byteQuadsCanonicalizer17._hashArea = intArray39;
        byteQuadsCanonicalizer0._hashArea = intArray39;
        int int46 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "59) test0607(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-70027317) + "'", int11 == (-70027317));
// flaky "39) test0607(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-432210097) + "'", int14 == (-432210097));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
// flaky "21) test0607(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1136073280) + "'", int24 == (-1136073280));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "8) test0607(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-70027317) + "'", int41 == (-70027317));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryStart = 1167071952;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = byteQuadsCanonicalizer7.totalCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "60) test0608(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432210089) + "'", int1 == (-432210089));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer7);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        int int13 = byteQuadsCanonicalizer0.calcHash(726740779);
        int int14 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "61) test0609(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-432830856) + "'", int11 == (-432830856));
// flaky "40) test0609(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-849196220) + "'", int13 == (-849196220));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer15);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        boolean boolean23 = byteQuadsCanonicalizer0._intern;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = byteQuadsCanonicalizer0.findName(1652291135, (-41777064));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 367182511 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "62) test0610(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1304677801) + "'", int17 == (-1304677801));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0._parent;
        int int10 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "63) test0611(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432210043) + "'", int4 == (-432210043));
// flaky "41) test0611(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850968074 + "'", int7 == 850968074);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._tertiaryStart = 1791970984;
        int int10 = byteQuadsCanonicalizer0.hashSeed();
        int int11 = byteQuadsCanonicalizer0.bucketCount();
        int[] intArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", intArray13, (-432237359));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "64) test0612(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432830964) + "'", int5 == (-432830964));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "42) test0612(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432210025) + "'", int10 == (-432210025));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int11 = byteQuadsCanonicalizer1.calcHash((-790193954), (-432802824));
        int int12 = byteQuadsCanonicalizer1._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1373664638 + "'", int11 == 1373664638);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        byteQuadsCanonicalizer0._hashSize = (-432221015);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "65) test0614(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 585051448 + "'", int10 == 585051448);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "43) test0614(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432209985) + "'", int12 == (-432209985));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._secondaryStart = (-432229443);
        java.lang.Class<?> wildcardClass7 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "66) test0615(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432209963) + "'", int1 == (-432209963));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        int int9 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        int int4 = byteQuadsCanonicalizer0._count;
        int int5 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = (-432224053);
        byteQuadsCanonicalizer0._spilloverEnd = (-432224737);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "67) test0617(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432209951) + "'", int1 == (-432209951));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0._count;
        int int8 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "68) test0618(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-747253898) + "'", int6 == (-747253898));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(1644466484);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        byteQuadsCanonicalizer0._intern = true;
        int int75 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "69) test0620(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432209881) + "'", int9 == (-432209881));
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
// flaky "44) test0620(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 671300622 + "'", int32 == 671300622);
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
// flaky "22) test0620(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 671300622 + "'", int63 == 671300622);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._longNameOffset = 726921751;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer8._parent;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "70) test0621(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432209873) + "'", int4 == (-432209873));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-2105879442));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        int[] intArray7 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer0._hashArea = intArray7;
        int int9 = byteQuadsCanonicalizer0.size();
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-680563359);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = byteQuadsCanonicalizer0.findName((-432218009));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 491799 out of bounds for length 4");
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
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-2066636029);
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2066636029) + "'", int7 == (-2066636029));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "71) test0625(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2115040224 + "'", int7 == 2115040224);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "45) test0625(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432209823) + "'", int9 == (-432209823));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int11 = byteQuadsCanonicalizer1.calcHash((-790193954), (-432802824));
        java.lang.Class<?> wildcardClass12 = byteQuadsCanonicalizer1.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1373664638 + "'", int11 == 1373664638);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        boolean boolean9 = byteQuadsCanonicalizer0.maybeDirty();
        int int12 = byteQuadsCanonicalizer0.calcHash((-432220593), (-1509909397));
        int int13 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "72) test0627(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1464162468) + "'", int12 == (-1464162468));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        int int11 = byteQuadsCanonicalizer0._count;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._intern = false;
        java.lang.String str15 = byteQuadsCanonicalizer0.toString();
        int int16 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "73) test0628(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432209761) + "'", int1 == (-432209761));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "46) test0628(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432209761) + "'", int3 == (-432209761));
// flaky "23) test0628(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726658069 + "'", int8 == 726658069);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "9) test0628(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432209761) + "'", int12 == (-432209761));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str15, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._count = (-432230825);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-432823208));
        int int9 = byteQuadsCanonicalizer8._tertiaryShift;
        java.lang.String str13 = byteQuadsCanonicalizer8.findName((-432220067), 123955884, (-432212761));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "74) test0629(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432209735) + "'", int1 == (-432209735));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int5 = byteQuadsCanonicalizer4.hashSeed();
        java.lang.String[] strArray6 = byteQuadsCanonicalizer4._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer4.makeChild(1081706716);
        int int9 = byteQuadsCanonicalizer8.primaryCount();
        int[] intArray10 = byteQuadsCanonicalizer8._hashArea;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = byteQuadsCanonicalizer1.calcHash(intArray10, 637399221);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 512 out of bounds for length 512");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
// flaky "75) test0630(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432209719) + "'", int5 == (-432209719));
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._count = 595210654;
        int int6 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "76) test0631(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432209713) + "'", int1 == (-432209713));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(1582216432);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        byteQuadsCanonicalizer0._intern = true;
        boolean boolean38 = byteQuadsCanonicalizer0._intern;
        java.lang.Class<?> wildcardClass39 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "77) test0633(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432209679) + "'", int1 == (-432209679));
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
// flaky "47) test0633(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1430977024) + "'", int24 == (-1430977024));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        int int16 = byteQuadsCanonicalizer0._tertiaryStart;
        int int20 = byteQuadsCanonicalizer0.calcHash((-432224623), 2026676831, 1122214214);
        int int21 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "78) test0634(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584704192 + "'", int10 == 584704192);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky "48) test0634(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-625621496) + "'", int20 == (-625621496));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-432237891) + "'", int21 == (-432237891));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1.release();
        byteQuadsCanonicalizer1.release();
        byteQuadsCanonicalizer1._secondaryStart = (-1930785656);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._spilloverEnd = (-432228893);
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._spilloverEnd = 726751867;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int int12 = byteQuadsCanonicalizer0.calcHash((-767619548), (-992923260));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "79) test0637(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1377295574) + "'", int12 == (-1377295574));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        int int2 = byteQuadsCanonicalizer1.tertiaryCount();
        int int3 = byteQuadsCanonicalizer1._hashSize;
        boolean boolean4 = byteQuadsCanonicalizer1._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432223521));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer8._hashSize = (short) 10;
        int int11 = byteQuadsCanonicalizer8._hashSize;
        byteQuadsCanonicalizer8._hashSize = 1797043;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        byteQuadsCanonicalizer14._count = (byte) 100;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer14._names;
        byteQuadsCanonicalizer14._spilloverEnd = (byte) 100;
        int int21 = byteQuadsCanonicalizer14._spilloverEnd;
        int int22 = byteQuadsCanonicalizer14.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        byteQuadsCanonicalizer23._count = (byte) 100;
        java.lang.String[] strArray27 = byteQuadsCanonicalizer23._names;
        int[] intArray32 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int34 = byteQuadsCanonicalizer23.calcHash(intArray32, 4);
        java.lang.String[] strArray40 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer23._names = strArray40;
        byteQuadsCanonicalizer14._names = strArray40;
        java.lang.String[] strArray43 = new java.lang.String[] {};
        byteQuadsCanonicalizer14._names = strArray43;
        byteQuadsCanonicalizer8._names = strArray43;
        byteQuadsCanonicalizer6._names = strArray43;
        byteQuadsCanonicalizer1._names = strArray43;
        byteQuadsCanonicalizer1._tertiaryStart = (-2138635169);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "80) test0638(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1744321051) + "'", int34 == (-1744321051));
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] {});
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1644487950));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 0;
        byteQuadsCanonicalizer0._spilloverEnd = 0;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "81) test0640(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432209457) + "'", int1 == (-432209457));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = byteQuadsCanonicalizer0._parent;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int int5 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer2);
// flaky "82) test0642(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432209417) + "'", int3 == (-432209417));
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash(726732643, 950858184);
        int[] intArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", intArray12, (-432219537));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "83) test0643(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 104776 + "'", int6 == 104776);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "49) test0643(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1217245030 + "'", int10 == 1217245030);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = byteQuadsCanonicalizer14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "84) test0644(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584804308 + "'", int10 == 584804308);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "50) test0644(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432209403) + "'", int12 == (-432209403));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer14);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        int int10 = byteQuadsCanonicalizer3.calcHash((-432220483), 29929788, (-432233131));
        byteQuadsCanonicalizer3._count = 585159502;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1745369958 + "'", int10 == 1745369958);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        int int9 = byteQuadsCanonicalizer3.primaryCount();
        int int10 = byteQuadsCanonicalizer3.secondaryCount();
        java.lang.Class<?> wildcardClass11 = byteQuadsCanonicalizer3.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        int int5 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(586080877);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "85) test0647(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-992417359) + "'", int7 == (-992417359));
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0.makeChild((-432230027));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int[] intArray15 = byteQuadsCanonicalizer14._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._hashSize;
        byteQuadsCanonicalizer16._count = (byte) 100;
        java.lang.String[] strArray20 = byteQuadsCanonicalizer16._names;
        int[] intArray25 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int27 = byteQuadsCanonicalizer16.calcHash(intArray25, 4);
        byteQuadsCanonicalizer16._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int31 = byteQuadsCanonicalizer30._hashSize;
        byteQuadsCanonicalizer30._count = (byte) 100;
        java.lang.String[] strArray34 = byteQuadsCanonicalizer30._names;
        int[] intArray39 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int41 = byteQuadsCanonicalizer30.calcHash(intArray39, 4);
        byteQuadsCanonicalizer16._hashArea = intArray39;
        byteQuadsCanonicalizer14._hashArea = intArray39;
        java.lang.String str45 = byteQuadsCanonicalizer12.findName(intArray39, (-432226507));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer47 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int48 = byteQuadsCanonicalizer47.secondaryCount();
        int int49 = byteQuadsCanonicalizer47.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer50 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int54 = byteQuadsCanonicalizer50.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer50._hashSize = (-432857107);
        int int57 = byteQuadsCanonicalizer50._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer58 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int59 = byteQuadsCanonicalizer58.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer60 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int61 = byteQuadsCanonicalizer60._hashSize;
        byteQuadsCanonicalizer60._count = (byte) 100;
        java.lang.String[] strArray64 = byteQuadsCanonicalizer60._names;
        int[] intArray69 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int71 = byteQuadsCanonicalizer60.calcHash(intArray69, 4);
        byteQuadsCanonicalizer58._hashArea = intArray69;
        byteQuadsCanonicalizer50._hashArea = intArray69;
        byteQuadsCanonicalizer47._hashArea = intArray69;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str76 = byteQuadsCanonicalizer12.addName("hi!", intArray69, (-432217351));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "86) test0648(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1301472780 + "'", int7 == 1301472780);
// flaky "51) test0648(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432209325) + "'", int9 == (-432209325));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "24) test0648(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-960503014) + "'", int27 == (-960503014));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "10) test0648(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-960503014) + "'", int41 == (-960503014));
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer50);
// flaky "3) test0648(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2090851601 + "'", int54 == 2090851601);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(strArray64);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "2) test0648(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-960503014) + "'", int71 == (-960503014));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(460502028);
        int int2 = byteQuadsCanonicalizer1._secondaryStart;
        int int3 = byteQuadsCanonicalizer1._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        int int9 = byteQuadsCanonicalizer0.calcHash(878801585, (-86011045));
        boolean boolean10 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "87) test0650(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-636549936) + "'", int6 == (-636549936));
// flaky "52) test0650(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-925344664) + "'", int9 == (-925344664));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        byteQuadsCanonicalizer0._tertiaryStart = 13247;
        int int54 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "88) test0651(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1649603874 + "'", int5 == 1649603874);
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
// flaky "53) test0651(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2063683277 + "'", int26 == 2063683277);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "25) test0651(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2063683277 + "'", int46 == 2063683277);
// flaky "11) test0651(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-433032981) + "'", int50 == (-433032981));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-432237577), (-432237873), 100, (-1) });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 13247 + "'", int54 == 13247);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        int int22 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = byteQuadsCanonicalizer0._parent;
        int int24 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "89) test0652(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 316561482 + "'", int17 == 316561482);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        int int9 = byteQuadsCanonicalizer0.calcHash(1660403783, 1442319748);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        byteQuadsCanonicalizer10._count = (byte) 100;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer10._names;
        java.lang.String str15 = byteQuadsCanonicalizer10.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._hashSize;
        byteQuadsCanonicalizer16._count = (byte) 100;
        java.lang.String[] strArray20 = byteQuadsCanonicalizer16._names;
        int[] intArray25 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int27 = byteQuadsCanonicalizer16.calcHash(intArray25, 4);
        byteQuadsCanonicalizer10._hashArea = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = byteQuadsCanonicalizer0.calcHash(intArray25, (-432210915));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
// flaky "90) test0653(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1608940375 + "'", int9 == 1608940375);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str15, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "54) test0653(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1538612430 + "'", int27 == 1538612430);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        int int21 = byteQuadsCanonicalizer0.calcHash((-432818349), (-432216137));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "91) test0654(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1889326234 + "'", int11 == 1889326234);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky "55) test0654(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 522048035 + "'", int21 == 522048035);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int int6 = byteQuadsCanonicalizer4._tertiaryShift;
        int int7 = byteQuadsCanonicalizer4.primaryCount();
        int int8 = byteQuadsCanonicalizer4.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "92) test0655(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432209163) + "'", int1 == (-432209163));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._spilloverEnd = (-432237359);
        byteQuadsCanonicalizer0._secondaryStart = 726680614;
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._count;
        int int4 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int[] intArray8 = byteQuadsCanonicalizer7._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        java.lang.String[] strArray13 = byteQuadsCanonicalizer9._names;
        int[] intArray18 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int20 = byteQuadsCanonicalizer9.calcHash(intArray18, 4);
        byteQuadsCanonicalizer9._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        byteQuadsCanonicalizer23._count = (byte) 100;
        java.lang.String[] strArray27 = byteQuadsCanonicalizer23._names;
        int[] intArray32 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int34 = byteQuadsCanonicalizer23.calcHash(intArray32, 4);
        byteQuadsCanonicalizer9._hashArea = intArray32;
        byteQuadsCanonicalizer7._hashArea = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray32, 785323905);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "93) test0657(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1388927836) + "'", int20 == (-1388927836));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "56) test0657(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1388927836) + "'", int34 == (-1388927836));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        int int12 = byteQuadsCanonicalizer0._tertiaryStart;
        int int13 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "94) test0658(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432209115) + "'", int1 == (-432209115));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 872635325 + "'", int12 == 872635325);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432232441));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        int int13 = byteQuadsCanonicalizer0.calcHash(850843766, (-432233457), (-432236463));
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "95) test0660(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432209097) + "'", int1 == (-432209097));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "57) test0660(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432209097) + "'", int3 == (-432209097));
// flaky "26) test0660(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726656782 + "'", int8 == 726656782);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "12) test0660(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-186125836) + "'", int13 == (-186125836));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int4 = byteQuadsCanonicalizer3.hashSeed();
        java.lang.String str8 = byteQuadsCanonicalizer3.findName((-2105879442), 1298041532, (-432809055));
        byteQuadsCanonicalizer3._spilloverEnd = (-432228739);
        int int11 = byteQuadsCanonicalizer3.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432858451) + "'", int4 == (-432858451));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._hashSize = (-1461335867);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        byteQuadsCanonicalizer13._count = (byte) 100;
        java.lang.String[] strArray17 = byteQuadsCanonicalizer13._names;
        int[] intArray22 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        byteQuadsCanonicalizer13._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27._hashSize;
        byteQuadsCanonicalizer27._count = (byte) 100;
        java.lang.String[] strArray31 = byteQuadsCanonicalizer27._names;
        int[] intArray36 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int38 = byteQuadsCanonicalizer27.calcHash(intArray36, 4);
        byteQuadsCanonicalizer13._hashArea = intArray36;
        byteQuadsCanonicalizer0._hashArea = intArray36;
        int int41 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "96) test0662(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1151091484 + "'", int7 == 1151091484);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "58) test0662(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432209053) + "'", int9 == (-432209053));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "27) test0662(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-963662094) + "'", int24 == (-963662094));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "13) test0662(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-963662094) + "'", int38 == (-963662094));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 409854119 + "'", int41 == 409854119);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int[] intArray7 = byteQuadsCanonicalizer0._hashArea;
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "97) test0663(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432209029) + "'", int1 == (-432209029));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "59) test0663(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432209029) + "'", int3 == (-432209029));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        int int20 = byteQuadsCanonicalizer0.calcHash((-1653987075));
        byteQuadsCanonicalizer0._tertiaryStart = (-432237577);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "98) test0664(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584808079 + "'", int10 == 584808079);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "60) test0664(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432209007) + "'", int12 == (-432209007));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky "28) test0664(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2068845497 + "'", int20 == 2068845497);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = (-432222557);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "99) test0665(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432208985) + "'", int1 == (-432208985));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0._count;
        int int10 = byteQuadsCanonicalizer0.secondaryCount();
        int int11 = byteQuadsCanonicalizer0._spilloverEnd;
        int int13 = byteQuadsCanonicalizer0.calcHash(726812095);
        int[] intArray14 = byteQuadsCanonicalizer0._hashArea;
        java.lang.String[] strArray15 = null;
        byteQuadsCanonicalizer0._names = strArray15;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "100) test0666(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-847461248) + "'", int13 == (-847461248));
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._secondaryStart = (-432230357);
        byteQuadsCanonicalizer0._tertiaryShift = 2115679121;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0._tertiaryShift = (short) 0;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer41 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int42 = byteQuadsCanonicalizer41._hashSize;
        int int43 = byteQuadsCanonicalizer41._spilloverEnd;
        int int44 = byteQuadsCanonicalizer41._longNameOffset;
        byteQuadsCanonicalizer41._count = ' ';
        byteQuadsCanonicalizer41._secondaryStart = (-432237891);
        int int51 = byteQuadsCanonicalizer41.calcHash((-432238147), 1973355417);
        boolean boolean52 = byteQuadsCanonicalizer41._failOnDoS;
        int int53 = byteQuadsCanonicalizer41.hashSeed();
        byteQuadsCanonicalizer41._tertiaryStart = (-432230027);
        byteQuadsCanonicalizer41._longNameOffset = 1072045803;
        byteQuadsCanonicalizer41._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer59 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int60 = byteQuadsCanonicalizer59.hashSeed();
        java.lang.String[] strArray61 = byteQuadsCanonicalizer59._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer63 = byteQuadsCanonicalizer59.makeChild(1081706716);
        int int64 = byteQuadsCanonicalizer63.primaryCount();
        int[] intArray65 = byteQuadsCanonicalizer63._hashArea;
        byteQuadsCanonicalizer41._hashArea = intArray65;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray65, 595360144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 512 out of bounds for length 512");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "101) test0668(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432208947) + "'", int1 == (-432208947));
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
// flaky "61) test0668(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1725626765 + "'", int24 == 1725626765);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
// flaky "29) test0668(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 584808313 + "'", int51 == 584808313);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
// flaky "14) test0668(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-432208947) + "'", int53 == (-432208947));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer59);
// flaky "4) test0668(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-432208947) + "'", int60 == (-432208947));
        org.junit.Assert.assertNull(strArray61);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(intArray65);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        int int7 = byteQuadsCanonicalizer0._longNameOffset;
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._count = (-906114045);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "102) test0669(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432208937) + "'", int8 == (-432208937));
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        int int9 = byteQuadsCanonicalizer0.calcHash((-432232833), 726926494, (-432225587));
        byteQuadsCanonicalizer0._longNameOffset = (-432818871);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "103) test0671(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432208909) + "'", int4 == (-432208909));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "62) test0671(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1862499842 + "'", int9 == 1862499842);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._tertiaryStart = 850806038;
        int int7 = byteQuadsCanonicalizer0.calcHash((-432211785));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "104) test0672(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 130212 + "'", int7 == 130212);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432804524));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432223521));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer5._hashSize = (short) 10;
        int int8 = byteQuadsCanonicalizer5._hashSize;
        byteQuadsCanonicalizer5._hashSize = 1797043;
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
        byteQuadsCanonicalizer5._names = strArray40;
        byteQuadsCanonicalizer3._names = strArray40;
        byteQuadsCanonicalizer1._names = strArray40;
        int int45 = byteQuadsCanonicalizer1.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
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
// flaky "105) test0673(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2024603730 + "'", int31 == 2024603730);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._hashSize = (-1461335867);
        byteQuadsCanonicalizer0._secondaryStart = (-432230011);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "106) test0674(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1586649744 + "'", int7 == 1586649744);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "63) test0674(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432208849) + "'", int9 == (-432208849));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(850968686);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        java.lang.String[] strArray5 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._intern = false;
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "107) test0676(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1782392263 + "'", int4 == 1782392263);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432224835));
        int int2 = byteQuadsCanonicalizer1._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        int int4 = byteQuadsCanonicalizer1.totalCount();
        byteQuadsCanonicalizer1._secondaryStart = 1881134293;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        java.lang.Class<?> wildcardClass25 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "108) test0679(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1803442217 + "'", int4 == 1803442217);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "64) test0679(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1701135992 + "'", int21 == 1701135992);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0._count;
        int int10 = byteQuadsCanonicalizer0.primaryCount();
        int int11 = byteQuadsCanonicalizer0.primaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12.hashSeed();
        int int14 = byteQuadsCanonicalizer12._longNameOffset;
        int int15 = byteQuadsCanonicalizer12._longNameOffset;
        boolean boolean16 = byteQuadsCanonicalizer12._intern;
        int int17 = byteQuadsCanonicalizer12._secondaryStart;
        int int18 = byteQuadsCanonicalizer12._secondaryStart;
        int int19 = byteQuadsCanonicalizer12._tertiaryShift;
        byteQuadsCanonicalizer12.release();
        int int21 = byteQuadsCanonicalizer12._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._hashSize;
        byteQuadsCanonicalizer22._count = (byte) 100;
        java.lang.String[] strArray26 = byteQuadsCanonicalizer22._names;
        java.lang.String str27 = byteQuadsCanonicalizer22.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28._hashSize;
        byteQuadsCanonicalizer28._count = (byte) 100;
        java.lang.String[] strArray32 = byteQuadsCanonicalizer28._names;
        int[] intArray37 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int39 = byteQuadsCanonicalizer28.calcHash(intArray37, 4);
        byteQuadsCanonicalizer22._hashArea = intArray37;
        byteQuadsCanonicalizer12._hashArea = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = byteQuadsCanonicalizer0.findName(intArray37, 1982178110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
// flaky "109) test0680(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-432208727) + "'", int13 == (-432208727));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str27, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "65) test0680(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 203254278 + "'", int39 == 203254278);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._longNameOffset = (-432237673);
        java.lang.Class<?> wildcardClass11 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "110) test0681(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 979562018 + "'", int6 == 979562018);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._hashSize = (-1529115260);
        byteQuadsCanonicalizer0._intern = true;
        int[] intArray13 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "111) test0682(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-517567642) + "'", int6 == (-517567642));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        byteQuadsCanonicalizer0._tertiaryStart = 726700099;
        int int12 = byteQuadsCanonicalizer0.calcHash((-432225647), (-432212349));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "112) test0683(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432208673) + "'", int4 == (-432208673));
// flaky "66) test0683(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850642616 + "'", int7 == 850642616);
// flaky "30) test0683(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 518118779 + "'", int12 == 518118779);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0.release();
        int int8 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._secondaryStart = (-432230413);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "113) test0684(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432208667) + "'", int1 == (-432208667));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String[] strArray3 = byteQuadsCanonicalizer0._names;
        int int4 = byteQuadsCanonicalizer0.secondaryCount();
        int int5 = byteQuadsCanonicalizer0.tertiaryCount();
        int int6 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._secondaryStart = 1738568936;
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        int int5 = byteQuadsCanonicalizer3._count;
        int int6 = byteQuadsCanonicalizer3._spilloverEnd;
        boolean boolean7 = byteQuadsCanonicalizer3._failOnDoS;
        int int8 = byteQuadsCanonicalizer3.spilloverCount();
        byteQuadsCanonicalizer3._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 448 + "'", int6 == 448);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        boolean boolean9 = byteQuadsCanonicalizer0._failOnDoS;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "114) test0687(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1905222664 + "'", int4 == 1905222664);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1794842379, (-432230789));
        byteQuadsCanonicalizer0._secondaryStart = (-432823952);
        byteQuadsCanonicalizer0._spilloverEnd = (-432213207);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
// flaky "115) test0688(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-669196780) + "'", int10 == (-669196780));
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = byteQuadsCanonicalizer9.tertiaryCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "116) test0689(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432208581) + "'", int4 == (-432208581));
// flaky "67) test0689(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850640546 + "'", int7 == 850640546);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer9);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        boolean boolean3 = byteQuadsCanonicalizer1._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int5 = byteQuadsCanonicalizer4.hashSeed();
        java.lang.String[] strArray6 = byteQuadsCanonicalizer4._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer4.makeChild(1081706716);
        int int9 = byteQuadsCanonicalizer8.primaryCount();
        int[] intArray10 = byteQuadsCanonicalizer8._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11.hashSeed();
        int int13 = byteQuadsCanonicalizer11._longNameOffset;
        int int14 = byteQuadsCanonicalizer11._longNameOffset;
        boolean boolean15 = byteQuadsCanonicalizer11._intern;
        int int16 = byteQuadsCanonicalizer11._secondaryStart;
        int int17 = byteQuadsCanonicalizer11._secondaryStart;
        int int18 = byteQuadsCanonicalizer11._tertiaryShift;
        byteQuadsCanonicalizer11.release();
        int int20 = byteQuadsCanonicalizer11._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int22 = byteQuadsCanonicalizer21._hashSize;
        byteQuadsCanonicalizer21._count = (byte) 100;
        java.lang.String[] strArray25 = byteQuadsCanonicalizer21._names;
        java.lang.String str26 = byteQuadsCanonicalizer21.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27._hashSize;
        byteQuadsCanonicalizer27._count = (byte) 100;
        java.lang.String[] strArray31 = byteQuadsCanonicalizer27._names;
        int[] intArray36 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int38 = byteQuadsCanonicalizer27.calcHash(intArray36, 4);
        byteQuadsCanonicalizer21._hashArea = intArray36;
        byteQuadsCanonicalizer11._hashArea = intArray36;
        java.lang.String str42 = byteQuadsCanonicalizer8.findName(intArray36, (-2050116369));
        // The following exception was thrown during execution in test generation
        try {
            int int44 = byteQuadsCanonicalizer1.calcHash(intArray36, (-1139615986));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
// flaky "117) test0690(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432208559) + "'", int5 == (-432208559));
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
// flaky "68) test0690(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432208559) + "'", int12 == (-432208559));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str26, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "31) test0690(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 334149340 + "'", int38 == 334149340);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._secondaryStart = (-432236071);
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        int int12 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "118) test0691(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 794546174 + "'", int6 == 794546174);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0._longNameOffset;
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "119) test0692(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432208479) + "'", int1 == (-432208479));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int4 = byteQuadsCanonicalizer1.hashSeed();
        int[] intArray5 = null;
        byteQuadsCanonicalizer1._hashArea = intArray5;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432858451) + "'", int4 == (-432858451));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        int int7 = byteQuadsCanonicalizer1.calcHash(586081183, (-432230393), 726700144);
        int int8 = byteQuadsCanonicalizer1._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9.hashSeed();
        int int11 = byteQuadsCanonicalizer9._longNameOffset;
        int int12 = byteQuadsCanonicalizer9.hashSeed();
        byteQuadsCanonicalizer9._longNameOffset = (short) 10;
        int int17 = byteQuadsCanonicalizer9.calcHash((int) '#', (int) (short) 10);
        int int18 = byteQuadsCanonicalizer9._secondaryStart;
        byteQuadsCanonicalizer9._tertiaryShift = (-432857889);
        boolean boolean21 = byteQuadsCanonicalizer9.maybeDirty();
        int int22 = byteQuadsCanonicalizer9._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        java.lang.String str25 = byteQuadsCanonicalizer23.toString();
        int[] intArray30 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer23._hashArea = intArray30;
        byteQuadsCanonicalizer9._hashArea = intArray30;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = byteQuadsCanonicalizer1.calcHash(intArray30, 1921783281);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2127311314 + "'", int7 == 2127311314);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
// flaky "120) test0694(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432208429) + "'", int10 == (-432208429));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "69) test0694(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432208429) + "'", int12 == (-432208429));
// flaky "32) test0694(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 726652660 + "'", int17 == 726652660);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str25, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int16 = byteQuadsCanonicalizer0.calcHash(726927673, (-432806535));
        boolean boolean17 = byteQuadsCanonicalizer0._intern;
        int int18 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "121) test0695(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1910390679 + "'", int11 == 1910390679);
// flaky "70) test0695(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-915592661) + "'", int16 == (-915592661));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1776808604);
        byteQuadsCanonicalizer0.release();
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "122) test0696(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432208413) + "'", int1 == (-432208413));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "71) test0696(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432208413) + "'", int3 == (-432208413));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._secondaryStart;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "123) test0697(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432208383) + "'", int1 == (-432208383));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(23675);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "124) test0699(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432208327) + "'", int1 == (-432208327));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._secondaryStart = 1119007952;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "125) test0700(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432208311) + "'", int1 == (-432208311));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "72) test0700(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432208311) + "'", int3 == (-432208311));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int8 = byteQuadsCanonicalizer0._count;
        int int9 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._spilloverEnd = (-432819147);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._longNameOffset = (-693285981);
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = 584986576;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "126) test0702(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432208267) + "'", int1 == (-432208267));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 1;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int13 = byteQuadsCanonicalizer12.hashSeed();
        int int17 = byteQuadsCanonicalizer12.calcHash(0, (int) 'a', (int) (short) 100);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        byteQuadsCanonicalizer18._count = (byte) 100;
        java.lang.String[] strArray22 = byteQuadsCanonicalizer18._names;
        int[] intArray27 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int29 = byteQuadsCanonicalizer18.calcHash(intArray27, 4);
        java.lang.String[] strArray35 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer18._names = strArray35;
        byteQuadsCanonicalizer12._names = strArray35;
        byteQuadsCanonicalizer0._names = strArray35;
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1797043 + "'", int17 == 1797043);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "127) test0703(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1542357209 + "'", int29 == 1542357209);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '4');
        boolean boolean9 = byteQuadsCanonicalizer0.maybeDirty();
        int int12 = byteQuadsCanonicalizer0.calcHash((-432236885), (-1244495993));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "128) test0704(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432828641) + "'", int5 == (-432828641));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "73) test0704(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432828624) + "'", int8 == (-432828624));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "33) test0704(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1777616137) + "'", int12 == (-1777616137));
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String[] strArray3 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int5 = byteQuadsCanonicalizer4.hashSeed();
        int int6 = byteQuadsCanonicalizer4._longNameOffset;
        int int7 = byteQuadsCanonicalizer4.hashSeed();
        byteQuadsCanonicalizer4._longNameOffset = (short) 10;
        int int12 = byteQuadsCanonicalizer4.calcHash((int) '#', (int) (short) 10);
        int int13 = byteQuadsCanonicalizer4._secondaryStart;
        byteQuadsCanonicalizer4._tertiaryShift = (-432857889);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._hashSize;
        byteQuadsCanonicalizer16._count = (byte) 100;
        java.lang.String[] strArray20 = byteQuadsCanonicalizer16._names;
        int[] intArray25 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int27 = byteQuadsCanonicalizer16.calcHash(intArray25, 4);
        java.lang.String[] strArray33 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer16._names = strArray33;
        byteQuadsCanonicalizer4._names = strArray33;
        byteQuadsCanonicalizer0._names = strArray33;
        int int40 = byteQuadsCanonicalizer0.calcHash(0, 726709144, (-432229865));
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
// flaky "129) test0705(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432208231) + "'", int5 == (-432208231));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "74) test0705(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-432208231) + "'", int7 == (-432208231));
// flaky "34) test0705(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 726644578 + "'", int12 == 726644578);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "15) test0705(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-210955667) + "'", int27 == (-210955667));
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
// flaky "5) test0705(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2145289164) + "'", int40 == (-2145289164));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._hashSize = (-432230135);
        byteQuadsCanonicalizer0._count = 360964059;
        byteQuadsCanonicalizer0._secondaryStart = (-459564991);
        byteQuadsCanonicalizer0._longNameOffset = (-1669855521);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "130) test0706(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1288915524) + "'", int11 == (-1288915524));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726927871);
        int int2 = byteQuadsCanonicalizer1.totalCount();
        int int3 = byteQuadsCanonicalizer1.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-1029717943);
        byteQuadsCanonicalizer0._hashSize = 850843766;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "131) test0708(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-478800595) + "'", int11 == (-478800595));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int int6 = byteQuadsCanonicalizer4._tertiaryShift;
        byteQuadsCanonicalizer4._tertiaryShift = (-720897963);
        byteQuadsCanonicalizer4._tertiaryStart = (-371356505);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "132) test0709(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432208151) + "'", int1 == (-432208151));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean3 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "133) test0710(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432208137) + "'", int1 == (-432208137));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-432228825));
        int int9 = byteQuadsCanonicalizer0.size();
        int int10 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        int int19 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = 726740779;
        int int22 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "134) test0712(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1399198536 + "'", int11 == 1399198536);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 726740779 + "'", int22 == 726740779);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._intern = false;
        int int10 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1499485686);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "135) test0715(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432208027) + "'", int1 == (-432208027));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "75) test0715(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432208027) + "'", int3 == (-432208027));
// flaky "35) test0715(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726648457 + "'", int8 == 726648457);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        byteQuadsCanonicalizer0._spilloverEnd = (-432858953);
        int int10 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean11 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._count = 595210654;
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._spilloverEnd = (-744055193);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "136) test0717(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432207983) + "'", int1 == (-432207983));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        int int8 = byteQuadsCanonicalizer0._count;
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "137) test0718(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1531874888 + "'", int4 == 1531874888);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str9, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432231821));
        java.lang.String str2 = byteQuadsCanonicalizer1.toString();
        int int3 = byteQuadsCanonicalizer1._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str2, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        java.lang.Class<?> wildcardClass9 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "138) test0720(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432207959) + "'", int1 == (-432207959));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._count = 0;
        java.lang.String str10 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._longNameOffset = (-442190801);
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str10, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        byteQuadsCanonicalizer0._tertiaryStart = (-432233731);
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "139) test0722(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432828889) + "'", int5 == (-432828889));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._tertiaryShift = 622936314;
        java.lang.String str11 = byteQuadsCanonicalizer3.findName(797443144);
        int int13 = byteQuadsCanonicalizer3.calcHash((-432232669));
        int int14 = byteQuadsCanonicalizer3.tertiaryCount();
        byteQuadsCanonicalizer3._secondaryStart = (-432231821);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1031526 + "'", int13 == 1031526);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._tertiaryStart = 601297471;
        int int16 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._tertiaryStart = 329628512;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "140) test0724(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-662144911) + "'", int11 == (-662144911));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._hashSize = 586092811;
        byteQuadsCanonicalizer0._spilloverEnd = (-433032981);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "141) test0725(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432207851) + "'", int1 == (-432207851));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "76) test0725(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432207851) + "'", int3 == (-432207851));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._count;
        int int8 = byteQuadsCanonicalizer1._secondaryStart;
        int int9 = byteQuadsCanonicalizer1._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._secondaryStart = (-432236071);
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "142) test0727(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 488536498 + "'", int6 == 488536498);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer1.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726927871);
        int int2 = byteQuadsCanonicalizer1.totalCount();
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        boolean boolean4 = byteQuadsCanonicalizer1.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3.release();
        boolean boolean6 = byteQuadsCanonicalizer3._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        int int16 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._tertiaryStart = 1673642827;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "143) test0731(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584686939 + "'", int10 == 584686939);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        int int35 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._longNameOffset = (-432226467);
        java.lang.String str38 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "144) test0732(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432207803) + "'", int1 == (-432207803));
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
// flaky "77) test0732(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1929878187 + "'", int24 == 1929878187);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str38, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean15 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int18 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String[] strArray19 = byteQuadsCanonicalizer0._names;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = strArray19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "145) test0733(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-692403672) + "'", int11 == (-692403672));
// flaky "78) test0733(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-432207787) + "'", int14 == (-432207787));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432224835));
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int3 = byteQuadsCanonicalizer1.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int[] intArray6 = byteQuadsCanonicalizer5._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7._hashSize;
        byteQuadsCanonicalizer7._count = (byte) 100;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer7._names;
        int[] intArray16 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int18 = byteQuadsCanonicalizer7.calcHash(intArray16, 4);
        byteQuadsCanonicalizer7._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int22 = byteQuadsCanonicalizer21._hashSize;
        byteQuadsCanonicalizer21._count = (byte) 100;
        java.lang.String[] strArray25 = byteQuadsCanonicalizer21._names;
        int[] intArray30 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int32 = byteQuadsCanonicalizer21.calcHash(intArray30, 4);
        byteQuadsCanonicalizer7._hashArea = intArray30;
        byteQuadsCanonicalizer5._hashArea = intArray30;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = byteQuadsCanonicalizer1.calcHash(intArray30, 2132657041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "146) test0734(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74274630 + "'", int18 == 74274630);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "79) test0734(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 74274630 + "'", int32 == 74274630);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (-432807676);
        int int6 = byteQuadsCanonicalizer1.calcHash(586131556, (-432227289));
        int int7 = byteQuadsCanonicalizer1.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-858580259) + "'", int6 == (-858580259));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int15 = byteQuadsCanonicalizer0.calcHash((-1529115260));
        int int16 = byteQuadsCanonicalizer0.bucketCount();
        int[] intArray17 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._longNameOffset = (-863274960);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "147) test0736(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2098342392 + "'", int11 == 2098342392);
// flaky "80) test0736(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1122166367 + "'", int15 == 1122166367);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14.hashSeed();
        java.lang.String[] strArray16 = byteQuadsCanonicalizer14._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = byteQuadsCanonicalizer14.makeChild(1081706716);
        int int19 = byteQuadsCanonicalizer18.primaryCount();
        int[] intArray20 = byteQuadsCanonicalizer18._hashArea;
        byteQuadsCanonicalizer0._hashArea = intArray20;
        java.lang.Class<?> wildcardClass22 = intArray20.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "148) test0737(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-750858538) + "'", int11 == (-750858538));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
// flaky "81) test0737(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-432207651) + "'", int15 == (-432207651));
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        byteQuadsCanonicalizer1._longNameOffset = 596935159;
        int int35 = byteQuadsCanonicalizer1.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "149) test0738(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 73951482 + "'", int14 == 73951482);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "82) test0738(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 73951482 + "'", int28 == 73951482);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 6000;
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        int int10 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._count = (byte) 1;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = byteQuadsCanonicalizer13.tertiaryCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer13);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        int int9 = byteQuadsCanonicalizer0._hashSize;
        int int10 = byteQuadsCanonicalizer0.totalCount();
        int int11 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "150) test0740(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432207591) + "'", int1 == (-432207591));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "83) test0740(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432207591) + "'", int3 == (-432207591));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        java.lang.String[] strArray13 = byteQuadsCanonicalizer9._names;
        int[] intArray18 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int20 = byteQuadsCanonicalizer9.calcHash(intArray18, 4);
        byteQuadsCanonicalizer7._hashArea = intArray18;
        int int22 = byteQuadsCanonicalizer7.spilloverCount();
        java.lang.String[] strArray25 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" };
        byteQuadsCanonicalizer7._names = strArray25;
        java.lang.String str27 = byteQuadsCanonicalizer7.toString();
        byteQuadsCanonicalizer7._tertiaryShift = (-432226811);
        int int30 = byteQuadsCanonicalizer7._spilloverEnd;
        int[] intArray31 = byteQuadsCanonicalizer7._hashArea;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = byteQuadsCanonicalizer0.calcHash(intArray31, (-432214951));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "151) test0741(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432207561) + "'", int4 == (-432207561));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "84) test0741(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2112596447) + "'", int20 == (-2112596447));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str27, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-432237577), (-432237873), 100, (-1) });
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432234855));
        int int2 = byteQuadsCanonicalizer1._count;
        int int4 = byteQuadsCanonicalizer1.calcHash((-432212789));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27220 + "'", int4 == 27220);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0.size();
        int int8 = byteQuadsCanonicalizer0._tertiaryStart;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        java.lang.Class<?> wildcardClass10 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = byteQuadsCanonicalizer0.findName((-31371622), 726775456);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 454521179 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "152) test0744(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1083258776) + "'", int5 == (-1083258776));
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
// flaky "85) test0744(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1011117881) + "'", int26 == (-1011117881));
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "36) test0744(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1011117881) + "'", int46 == (-1011117881));
// flaky "16) test0744(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-433033786) + "'", int50 == (-433033786));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "6) test0744(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-906530448) + "'", int54 == (-906530448));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        byteQuadsCanonicalizer0._secondaryStart = 726658069;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "153) test0745(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-403081391) + "'", int17 == (-403081391));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._count = (-432230825);
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = 850968686;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "154) test0746(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432207471) + "'", int1 == (-432207471));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._count = 0;
        int int10 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._secondaryStart = (-432236071);
        int int11 = byteQuadsCanonicalizer0._tertiaryStart;
        int int12 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "155) test0748(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1103626665) + "'", int7 == (-1103626665));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        byteQuadsCanonicalizer0._count = (-432211167);
        int int18 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "156) test0749(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-261839189) + "'", int11 == (-261839189));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky "86) test0749(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-432207363) + "'", int15 == (-432207363));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        int int36 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._tertiaryShift = 616766233;
        boolean boolean39 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "157) test0750(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432207349) + "'", int1 == (-432207349));
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
// flaky "87) test0750(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1335565592 + "'", int24 == 1335565592);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 6000;
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        int int10 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer11);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14.hashSeed();
        int int16 = byteQuadsCanonicalizer14._longNameOffset;
        int int17 = byteQuadsCanonicalizer14._longNameOffset;
        boolean boolean18 = byteQuadsCanonicalizer14._intern;
        int int19 = byteQuadsCanonicalizer14._secondaryStart;
        int int20 = byteQuadsCanonicalizer14._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int22 = byteQuadsCanonicalizer21._hashSize;
        byteQuadsCanonicalizer21._count = (byte) 100;
        java.lang.String[] strArray25 = byteQuadsCanonicalizer21._names;
        int[] intArray30 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int32 = byteQuadsCanonicalizer21.calcHash(intArray30, 4);
        java.lang.String[] strArray38 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer21._names = strArray38;
        byteQuadsCanonicalizer14._names = strArray38;
        byteQuadsCanonicalizer0._names = strArray38;
        boolean boolean42 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "158) test0752(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1891992247) + "'", int11 == (-1891992247));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
// flaky "88) test0752(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-432207321) + "'", int15 == (-432207321));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "37) test0752(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1891992247) + "'", int32 == (-1891992247));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._spilloverEnd = 0;
        int int8 = byteQuadsCanonicalizer0.calcHash(27004, (-1828636043));
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "159) test0753(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1232938336) + "'", int8 == (-1232938336));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._tertiaryShift = 622936314;
        java.lang.String str10 = byteQuadsCanonicalizer3.toString();
        java.lang.String str15 = byteQuadsCanonicalizer3.addName("", (-1211709751), 3846, 600072652);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str10, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        boolean boolean3 = byteQuadsCanonicalizer1._intern;
        byteQuadsCanonicalizer1._intern = false;
        byteQuadsCanonicalizer1._spilloverEnd = 850855124;
        int[] intArray8 = byteQuadsCanonicalizer1._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer9.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer9._hashSize = (-432857107);
        int int16 = byteQuadsCanonicalizer9._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        byteQuadsCanonicalizer19._count = (byte) 100;
        java.lang.String[] strArray23 = byteQuadsCanonicalizer19._names;
        int[] intArray28 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int30 = byteQuadsCanonicalizer19.calcHash(intArray28, 4);
        byteQuadsCanonicalizer17._hashArea = intArray28;
        byteQuadsCanonicalizer9._hashArea = intArray28;
        byteQuadsCanonicalizer1._hashArea = intArray28;
        int int36 = byteQuadsCanonicalizer1.calcHash(726721177, (-432807622));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer38 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int39 = byteQuadsCanonicalizer38._hashSize;
        byteQuadsCanonicalizer38._count = (byte) 100;
        java.lang.String[] strArray42 = byteQuadsCanonicalizer38._names;
        int[] intArray47 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int49 = byteQuadsCanonicalizer38.calcHash(intArray47, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray47, (-1206367486));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
// flaky "160) test0755(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1211714230) + "'", int13 == (-1211714230));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "89) test0755(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 740298583 + "'", int30 == 740298583);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1361359139) + "'", int36 == (-1361359139));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(strArray42);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "38) test0755(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 740298583 + "'", int49 == 740298583);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        byteQuadsCanonicalizer0._tertiaryShift = 100;
        int int15 = byteQuadsCanonicalizer0.calcHash((-432231413), 726920401);
        int int16 = byteQuadsCanonicalizer0.totalCount();
        int int17 = byteQuadsCanonicalizer0.size();
        int int18 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "161) test0756(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-282499821) + "'", int6 == (-282499821));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "90) test0756(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 800588149 + "'", int15 == 800588149);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        byteQuadsCanonicalizer0._tertiaryShift = 100;
        int int15 = byteQuadsCanonicalizer0.calcHash((-432231413), 726920401);
        int int16 = byteQuadsCanonicalizer0.totalCount();
        int int17 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._longNameOffset = (-731213688);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "162) test0757(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-269666549) + "'", int6 == (-269666549));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "91) test0757(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 800588212 + "'", int15 == 800588212);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        byteQuadsCanonicalizer1._spilloverEnd = 851025305;
        int int6 = byteQuadsCanonicalizer1._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 850855124;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int6 = byteQuadsCanonicalizer5._hashSize;
        byteQuadsCanonicalizer5._count = (byte) 100;
        java.lang.String[] strArray9 = byteQuadsCanonicalizer5._names;
        int[] intArray14 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int16 = byteQuadsCanonicalizer5.calcHash(intArray14, 4);
        byteQuadsCanonicalizer0._hashArea = intArray14;
        int int18 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str2, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "163) test0759(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-512972107) + "'", int16 == (-512972107));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._intern = false;
        int int9 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean10 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "164) test0761(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1293293137) + "'", int4 == (-1293293137));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.calcHash((int) 'a');
        byteQuadsCanonicalizer0._tertiaryStart = (-432225395);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10.secondaryCount();
        int int12 = byteQuadsCanonicalizer10.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer13.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer13._hashSize = (-432857107);
        int int20 = byteQuadsCanonicalizer13._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int22 = byteQuadsCanonicalizer21.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        byteQuadsCanonicalizer23._count = (byte) 100;
        java.lang.String[] strArray27 = byteQuadsCanonicalizer23._names;
        int[] intArray32 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int34 = byteQuadsCanonicalizer23.calcHash(intArray32, 4);
        byteQuadsCanonicalizer21._hashArea = intArray32;
        byteQuadsCanonicalizer13._hashArea = intArray32;
        byteQuadsCanonicalizer10._hashArea = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            int int39 = byteQuadsCanonicalizer0.calcHash(intArray32, 726772540);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "165) test0762(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-432827706) + "'", int7 == (-432827706));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
// flaky "92) test0762(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1305145878) + "'", int17 == (-1305145878));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "39) test0762(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1529324121 + "'", int34 == 1529324121);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._tertiaryStart = 872635325;
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        int[] intArray11 = byteQuadsCanonicalizer0._hashArea;
        int int12 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "166) test0763(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432207161) + "'", int1 == (-432207161));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        int int11 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._tertiaryStart = (-442190801);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "167) test0764(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-793970118) + "'", int6 == (-793970118));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean9 = byteQuadsCanonicalizer0._failOnDoS;
        int int10 = byteQuadsCanonicalizer0._count;
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._tertiaryShift = (-432237891);
        int int17 = byteQuadsCanonicalizer0.calcHash((-843952380), (-432228147), (-432822427));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "168) test0765(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432207133) + "'", int4 == (-432207133));
// flaky "93) test0765(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850609937 + "'", int7 == 850609937);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "40) test0765(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1130841260 + "'", int17 == 1130841260);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "169) test0766(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432207125) + "'", int6 == (-432207125));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        int int4 = byteQuadsCanonicalizer1._tertiaryShift;
        byteQuadsCanonicalizer1._tertiaryStart = (-1701677292);
        java.lang.Class<?> wildcardClass7 = byteQuadsCanonicalizer1.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1574754311));
        int int2 = byteQuadsCanonicalizer1.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._hashSize;
        byteQuadsCanonicalizer16._count = (byte) 100;
        java.lang.String[] strArray20 = byteQuadsCanonicalizer16._names;
        int[] intArray25 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int27 = byteQuadsCanonicalizer16.calcHash(intArray25, 4);
        java.lang.String[] strArray33 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer16._names = strArray33;
        byteQuadsCanonicalizer0._names = strArray33;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer36 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "170) test0769(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-636115837) + "'", int11 == (-636115837));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "94) test0769(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-636115837) + "'", int27 == (-636115837));
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNull(byteQuadsCanonicalizer36);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1306083656);
        int int2 = byteQuadsCanonicalizer1.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._count;
        int int10 = byteQuadsCanonicalizer0.hashSeed();
        int int11 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "171) test0771(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432206987) + "'", int1 == (-432206987));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "95) test0771(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432206987) + "'", int3 == (-432206987));
// flaky "41) test0771(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726641104 + "'", int8 == 726641104);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "17) test0771(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432206987) + "'", int10 == (-432206987));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryStart = 1167071952;
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = byteQuadsCanonicalizer8.addName("", (-432233083), 26110);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "172) test0772(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432206969) + "'", int1 == (-432206969));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String[] strArray5 = byteQuadsCanonicalizer0._names;
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._hashSize = 1081706716;
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 254496920 + "'", int11 == 254496920);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer13);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        boolean boolean3 = byteQuadsCanonicalizer1._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int5 = byteQuadsCanonicalizer4.hashSeed();
        int int6 = byteQuadsCanonicalizer4._longNameOffset;
        int int7 = byteQuadsCanonicalizer4.hashSeed();
        byteQuadsCanonicalizer4._longNameOffset = (short) 10;
        int int12 = byteQuadsCanonicalizer4.calcHash((int) '#', (int) (short) 10);
        int int13 = byteQuadsCanonicalizer4._secondaryStart;
        byteQuadsCanonicalizer4._tertiaryShift = (-432857889);
        boolean boolean16 = byteQuadsCanonicalizer4.maybeDirty();
        int int17 = byteQuadsCanonicalizer4._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        java.lang.String str20 = byteQuadsCanonicalizer18.toString();
        int[] intArray25 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer18._hashArea = intArray25;
        byteQuadsCanonicalizer4._hashArea = intArray25;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = byteQuadsCanonicalizer1.findName(intArray25, 1130841260);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
// flaky "173) test0775(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432206927) + "'", int5 == (-432206927));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "96) test0775(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-432206927) + "'", int7 == (-432206927));
// flaky "42) test0775(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 726638152 + "'", int12 == 726638152);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str20, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0._count;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._tertiaryShift = 586080877;
        byteQuadsCanonicalizer0._count = 1441811585;
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17._hashSize;
        byteQuadsCanonicalizer17._count = (byte) 100;
        java.lang.String[] strArray21 = byteQuadsCanonicalizer17._names;
        int[] intArray26 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int28 = byteQuadsCanonicalizer17.calcHash(intArray26, 4);
        byteQuadsCanonicalizer15._hashArea = intArray26;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray26, (-432207077));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "174) test0777(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1914295110) + "'", int11 == (-1914295110));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "97) test0777(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1914295110) + "'", int28 == (-1914295110));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int4 = byteQuadsCanonicalizer3.hashSeed();
        byteQuadsCanonicalizer3._secondaryStart = (-1106296139);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7.hashSeed();
        int int9 = byteQuadsCanonicalizer7._secondaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        int int15 = byteQuadsCanonicalizer10.calcHash((-432857889), (-432802824), (-432235691));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._hashSize;
        byteQuadsCanonicalizer16._count = (byte) 100;
        java.lang.String[] strArray20 = byteQuadsCanonicalizer16._names;
        byteQuadsCanonicalizer16._spilloverEnd = (byte) 100;
        int int23 = byteQuadsCanonicalizer16._spilloverEnd;
        int int24 = byteQuadsCanonicalizer16.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int26 = byteQuadsCanonicalizer25._hashSize;
        byteQuadsCanonicalizer25._count = (byte) 100;
        java.lang.String[] strArray29 = byteQuadsCanonicalizer25._names;
        int[] intArray34 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int36 = byteQuadsCanonicalizer25.calcHash(intArray34, 4);
        java.lang.String[] strArray42 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer25._names = strArray42;
        byteQuadsCanonicalizer16._names = strArray42;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer45 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int46 = byteQuadsCanonicalizer45._hashSize;
        byteQuadsCanonicalizer45._count = (byte) 100;
        java.lang.String[] strArray49 = byteQuadsCanonicalizer45._names;
        int[] intArray54 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int56 = byteQuadsCanonicalizer45.calcHash(intArray54, 4);
        byteQuadsCanonicalizer16._hashArea = intArray54;
        byteQuadsCanonicalizer10._hashArea = intArray54;
        int int60 = byteQuadsCanonicalizer10.calcHash(11880);
        int[] intArray61 = byteQuadsCanonicalizer10._hashArea;
        byteQuadsCanonicalizer7._hashArea = intArray61;
        // The following exception was thrown during execution in test generation
        try {
            int int64 = byteQuadsCanonicalizer3.calcHash(intArray61, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432858451) + "'", int4 == (-432858451));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
// flaky "175) test0779(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432206841) + "'", int8 == (-432206841));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "98) test0779(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-622930169) + "'", int15 == (-622930169));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "43) test0779(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1299153789) + "'", int36 == (-1299153789));
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "18) test0779(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1299153789) + "'", int56 == (-1299153789));
// flaky "7) test0779(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-433034420) + "'", int60 == (-433034420));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-432237577), (-432237873), 100, (-1) });
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        int int5 = byteQuadsCanonicalizer0.calcHash((-2023759883), 1073894391);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "176) test0780(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432206819) + "'", int1 == (-432206819));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "99) test0780(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1042670849 + "'", int5 == 1042670849);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int3 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        int int32 = byteQuadsCanonicalizer0.spilloverCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = byteQuadsCanonicalizer0.addName("hi!", (-432207001));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7299 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
// flaky "177) test0782(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1490905759) + "'", int7 == (-1490905759));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "100) test0782(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1827308553) + "'", int24 == (-1827308553));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-432232857), (-432216899) });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._spilloverEnd = (-432225395);
        byteQuadsCanonicalizer0._secondaryStart = (-432231765);
        byteQuadsCanonicalizer0._tertiaryShift = (-432227863);
        byteQuadsCanonicalizer0._tertiaryStart = (-432218585);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        byteQuadsCanonicalizer0._tertiaryShift = 100;
        int int15 = byteQuadsCanonicalizer0.calcHash((-432231413), 726920401);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = byteQuadsCanonicalizer17.makeChild(1023311);
        int int20 = byteQuadsCanonicalizer19.size();
        int int23 = byteQuadsCanonicalizer19.calcHash((-432807290), 1794842379);
        byteQuadsCanonicalizer19._hashSize = (-432233335);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = byteQuadsCanonicalizer19._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27._hashSize;
        byteQuadsCanonicalizer27._count = (byte) 100;
        java.lang.String[] strArray31 = byteQuadsCanonicalizer27._names;
        java.lang.String str32 = byteQuadsCanonicalizer27.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer33 = byteQuadsCanonicalizer27._parent;
        java.lang.String[] strArray34 = byteQuadsCanonicalizer27._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int39 = byteQuadsCanonicalizer35.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer35._hashSize = (-432857107);
        int int42 = byteQuadsCanonicalizer35._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer43 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int44 = byteQuadsCanonicalizer43.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer45 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int46 = byteQuadsCanonicalizer45._hashSize;
        byteQuadsCanonicalizer45._count = (byte) 100;
        java.lang.String[] strArray49 = byteQuadsCanonicalizer45._names;
        int[] intArray54 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int56 = byteQuadsCanonicalizer45.calcHash(intArray54, 4);
        byteQuadsCanonicalizer43._hashArea = intArray54;
        byteQuadsCanonicalizer35._hashArea = intArray54;
        byteQuadsCanonicalizer27._hashArea = intArray54;
        byteQuadsCanonicalizer19._hashArea = intArray54;
        // The following exception was thrown during execution in test generation
        try {
            int int62 = byteQuadsCanonicalizer0.calcHash(intArray54, (-257429486));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "178) test0784(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1043132301 + "'", int6 == 1043132301);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "101) test0784(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 800592100 + "'", int15 == 800592100);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-202237041) + "'", int23 == (-202237041));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str32, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer33);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
// flaky "44) test0784(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1496041907) + "'", int39 == (-1496041907));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "19) test0784(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-2129877063) + "'", int56 == (-2129877063));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        java.lang.Class<?> wildcardClass13 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "179) test0785(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1366171) + "'", int12 == (-1366171));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._spilloverEnd = (-316241887);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean9 = byteQuadsCanonicalizer0._failOnDoS;
        int int10 = byteQuadsCanonicalizer0._count;
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
        int int14 = byteQuadsCanonicalizer0.calcHash((-432233443), 8570);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "180) test0787(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432206729) + "'", int4 == (-432206729));
// flaky "102) test0787(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850621754 + "'", int7 == 850621754);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "45) test0787(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 62521947 + "'", int14 == 62521947);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        java.lang.Class<?> wildcardClass20 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "181) test0788(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1652090230) + "'", int11 == (-1652090230));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0.release();
        boolean boolean8 = byteQuadsCanonicalizer0._intern;
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str9, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22.secondaryCount();
        int int24 = byteQuadsCanonicalizer22.bucketCount();
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
        byteQuadsCanonicalizer22._hashArea = intArray44;
        int[] intArray52 = new int[] { (-432232857), (-432216899) };
        byteQuadsCanonicalizer22._hashArea = intArray52;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = byteQuadsCanonicalizer0.addName("", intArray52, (-432811330));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "182) test0790(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 197430509 + "'", int11 == 197430509);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
// flaky "103) test0790(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1535996998) + "'", int29 == (-1535996998));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "46) test0790(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 197430509 + "'", int46 == 197430509);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-432232857), (-432216899) });
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        int int34 = byteQuadsCanonicalizer0.hashSeed();
        int int37 = byteQuadsCanonicalizer0.calcHash((-432207917), 24193);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "183) test0791(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432206583) + "'", int1 == (-432206583));
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
// flaky "104) test0791(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2124256075 + "'", int24 == 2124256075);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
// flaky "47) test0791(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-432206583) + "'", int34 == (-432206583));
// flaky "20) test0791(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 58232367 + "'", int37 == 58232367);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        int int11 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-1458255080);
        int int15 = byteQuadsCanonicalizer0.calcHash((-1234131727));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "184) test0792(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584713120 + "'", int10 == 584713120);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "105) test0792(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1346961140 + "'", int15 == 1346961140);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        int int34 = byteQuadsCanonicalizer1.calcHash((-1981207176), (-1507862706), (-870022432));
        byteQuadsCanonicalizer1._count = (-432228147);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "185) test0793(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 306895220 + "'", int14 == 306895220);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "106) test0793(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 306895220 + "'", int28 == 306895220);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1133109320 + "'", int34 == 1133109320);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235137));
        byteQuadsCanonicalizer1._longNameOffset = 586092811;
        int[] intArray4 = null;
        byteQuadsCanonicalizer1._hashArea = intArray4;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._count;
        int int8 = byteQuadsCanonicalizer1.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer1.makeChild((-432229301));
        byteQuadsCanonicalizer4._tertiaryShift = (-432223743);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432219537));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432219391));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        int int14 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "186) test0799(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584711986 + "'", int10 == 584711986);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "107) test0799(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432206431) + "'", int12 == (-432206431));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0.size();
        int int8 = byteQuadsCanonicalizer0._tertiaryStart;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        boolean boolean10 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1794842379, (-432230789));
        int int11 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
// flaky "187) test0801(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2031079620) + "'", int10 == (-2031079620));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        byteQuadsCanonicalizer0._tertiaryShift = 100;
        int int16 = byteQuadsCanonicalizer0.calcHash((-432228903), 1391350493, (-432227289));
        byteQuadsCanonicalizer0._intern = false;
        java.lang.String[] strArray19 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "188) test0802(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1053401874 + "'", int6 == 1053401874);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "108) test0802(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 804928847 + "'", int16 == 804928847);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int[] intArray7 = byteQuadsCanonicalizer0._hashArea;
        int int10 = byteQuadsCanonicalizer0.calcHash((-432227863), 1388163119);
        int int11 = byteQuadsCanonicalizer0._tertiaryStart;
        int int12 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "189) test0803(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432206395) + "'", int1 == (-432206395));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "109) test0803(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432206395) + "'", int3 == (-432206395));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(intArray7);
// flaky "48) test0803(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-30472738) + "'", int10 == (-30472738));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash(726732643, 950858184);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0._parent;
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int14 = byteQuadsCanonicalizer0.calcHash(0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "190) test0804(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 103800 + "'", int6 == 103800);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "110) test0804(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1217271355 + "'", int10 == 1217271355);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "49) test0804(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-432826411) + "'", int14 == (-432826411));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432227153));
        int int2 = byteQuadsCanonicalizer1.size();
        int int3 = byteQuadsCanonicalizer1.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (-432235313);
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        java.lang.String[] strArray13 = byteQuadsCanonicalizer9._names;
        int[] intArray18 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int20 = byteQuadsCanonicalizer9.calcHash(intArray18, 4);
        byteQuadsCanonicalizer9._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        byteQuadsCanonicalizer23._count = (byte) 100;
        java.lang.String[] strArray27 = byteQuadsCanonicalizer23._names;
        int[] intArray32 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int34 = byteQuadsCanonicalizer23.calcHash(intArray32, 4);
        byteQuadsCanonicalizer9._hashArea = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = byteQuadsCanonicalizer0.calcHash(intArray32, 2143270381);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "191) test0806(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432206341) + "'", int8 == (-432206341));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "111) test0806(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1715947350) + "'", int20 == (-1715947350));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "50) test0806(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1715947350) + "'", int34 == (-1715947350));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432211429));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "192) test0808(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432826547) + "'", int3 == (-432826547));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        boolean boolean21 = byteQuadsCanonicalizer0._intern;
        int int22 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "193) test0809(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-11634545) + "'", int17 == (-11634545));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._secondaryStart = (-432218921);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.secondaryCount();
        boolean boolean5 = byteQuadsCanonicalizer0._failOnDoS;
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        int int8 = byteQuadsCanonicalizer0.calcHash(0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(intArray6);
// flaky "194) test0811(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432826547) + "'", int8 == (-432826547));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._hashSize = (-202237041);
        int int11 = byteQuadsCanonicalizer0._tertiaryStart;
        int int12 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "195) test0812(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432826504) + "'", int5 == (-432826504));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432211967));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "196) test0814(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432206211) + "'", int8 == (-432206211));
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 6000;
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        int int10 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._count = (byte) 1;
        java.lang.String str13 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._secondaryStart = (-495729269);
        int[] intArray16 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str13, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "197) test0816(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432206183) + "'", int8 == (-432206183));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._hashSize = 198000946;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        int int10 = byteQuadsCanonicalizer0.calcHash((-432230185));
        boolean boolean11 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
// flaky "198) test0818(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 114282 + "'", int10 == 114282);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = byteQuadsCanonicalizer8.findName((-432227331));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "199) test0819(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 919349719 + "'", int6 == 919349719);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._hashSize = (-1529115260);
        byteQuadsCanonicalizer0._intern = true;
        int int15 = byteQuadsCanonicalizer0.calcHash((-432218869), (-108915153));
        int int16 = byteQuadsCanonicalizer0.size();
        int int17 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "200) test0820(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 923333066 + "'", int6 == 923333066);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
// flaky "112) test0820(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1007650512) + "'", int15 == (-1007650512));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._intern = false;
        int int9 = byteQuadsCanonicalizer0._spilloverEnd;
        int int10 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(726725614);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryStart = 595350631;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        java.lang.String[] strArray20 = null;
        byteQuadsCanonicalizer0._names = strArray20;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 114282, 970330733, 1465386590);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "201) test0824(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584700322 + "'", int10 == 584700322);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "113) test0824(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432206083) + "'", int12 == (-432206083));
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray7 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (-432219437);
        java.lang.Class<?> wildcardClass10 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "202) test0825(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432205995) + "'", int6 == (-432205995));
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1.release();
        byteQuadsCanonicalizer1.release();
        byteQuadsCanonicalizer1._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(585161356);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "203) test0827(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 104386 + "'", int6 == 104386);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 0;
        byteQuadsCanonicalizer0._longNameOffset = (-432218467);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "204) test0828(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432205945) + "'", int1 == (-432205945));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726691972);
        int int2 = byteQuadsCanonicalizer1.spilloverCount();
        int int5 = byteQuadsCanonicalizer1.calcHash(0, 13759);
        int int9 = byteQuadsCanonicalizer1.calcHash((-432212453), (-1744321051), 850806038);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2030095526 + "'", int5 == 2030095526);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1380025087) + "'", int9 == (-1380025087));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        byteQuadsCanonicalizer1._hashSize = (-86011045);
        int int4 = byteQuadsCanonicalizer1.size();
        boolean boolean5 = byteQuadsCanonicalizer1._failOnDoS;
        java.lang.String[] strArray6 = byteQuadsCanonicalizer1._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.size();
        int int15 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._tertiaryStart = 850828601;
        int[] intArray18 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._secondaryStart = 152940266;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int22 = byteQuadsCanonicalizer21._hashSize;
        int int23 = byteQuadsCanonicalizer21._spilloverEnd;
        int int24 = byteQuadsCanonicalizer21._tertiaryShift;
        int int28 = byteQuadsCanonicalizer21.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer21._reportTooManyCollisions();
        byteQuadsCanonicalizer21._secondaryStart = (-432236071);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer32 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int33 = byteQuadsCanonicalizer32._hashSize;
        java.lang.String str34 = byteQuadsCanonicalizer32.toString();
        int[] intArray39 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer32._hashArea = intArray39;
        byteQuadsCanonicalizer21._hashArea = intArray39;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = byteQuadsCanonicalizer0.calcHash(intArray39, (-432208063));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "205) test0831(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 667697695 + "'", int11 == 667697695);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
// flaky "114) test0831(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1835483879 + "'", int28 == 1835483879);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str34, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1.release();
        int int9 = byteQuadsCanonicalizer1.spilloverCount();
        byteQuadsCanonicalizer1._hashSize = (-432212149);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        byteQuadsCanonicalizer0._longNameOffset = (-432225773);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0._count;
        int int11 = byteQuadsCanonicalizer0.calcHash(800588212);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
// flaky "206) test0834(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-913751169) + "'", int11 == (-913751169));
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        int int4 = byteQuadsCanonicalizer0._count;
        int int5 = byteQuadsCanonicalizer0.secondaryCount();
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "207) test0835(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432205755) + "'", int1 == (-432205755));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432234613));
        int int2 = byteQuadsCanonicalizer1._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int[] intArray6 = byteQuadsCanonicalizer4._hashArea;
        boolean boolean7 = byteQuadsCanonicalizer4.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "208) test0837(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432205743) + "'", int1 == (-432205743));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        int int24 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "209) test0838(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1807982342) + "'", int4 == (-1807982342));
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "115) test0838(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2110176992 + "'", int21 == 2110176992);
// flaky "51) test0838(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-432205731) + "'", int24 == (-432205731));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        int int17 = byteQuadsCanonicalizer0.calcHash((-432226611), 29365);
        java.lang.String[] strArray18 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "210) test0839(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584809987 + "'", int10 == 584809987);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "116) test0839(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432205715) + "'", int12 == (-432205715));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky "52) test0839(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60957639 + "'", int17 == 60957639);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int6 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._hashSize = (-432230135);
        int int16 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "211) test0841(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1920681779 + "'", int11 == 1920681779);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-432230135) + "'", int16 == (-432230135));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._count = (-432227725);
        java.lang.String[] strArray5 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
            java.lang.String str19 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432218243), 1200682433);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1524260657 out of bounds for length 4");
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
// flaky "212) test0843(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-683592078) + "'", int13 == (-683592078));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1982014786);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-202237041);
        int int14 = byteQuadsCanonicalizer0.primaryCount();
        int int15 = byteQuadsCanonicalizer0.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        byteQuadsCanonicalizer19._count = (byte) 100;
        java.lang.String[] strArray23 = byteQuadsCanonicalizer19._names;
        int[] intArray28 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int30 = byteQuadsCanonicalizer19.calcHash(intArray28, 4);
        byteQuadsCanonicalizer17._hashArea = intArray28;
        int int32 = byteQuadsCanonicalizer17.spilloverCount();
        java.lang.String[] strArray35 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" };
        byteQuadsCanonicalizer17._names = strArray35;
        java.lang.String str37 = byteQuadsCanonicalizer17.toString();
        byteQuadsCanonicalizer17._tertiaryShift = (-432226811);
        int int40 = byteQuadsCanonicalizer17._spilloverEnd;
        int[] intArray41 = byteQuadsCanonicalizer17._hashArea;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray41, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "213) test0845(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584809375 + "'", int10 == 584809375);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "117) test0845(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 557926239 + "'", int30 == 557926239);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str37, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-432237577), (-432237873), 100, (-1) });
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1574754311));
        int int2 = byteQuadsCanonicalizer1._secondaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer1.makeChild(731125372);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._secondaryStart = (-432236071);
        int int11 = byteQuadsCanonicalizer0.bucketCount();
        int int12 = byteQuadsCanonicalizer0.tertiaryCount();
        int int13 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "214) test0847(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-75386827) + "'", int7 == (-75386827));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432236713));
        byteQuadsCanonicalizer1._longNameOffset = 1745369958;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._hashSize = 726927871;
        int int11 = byteQuadsCanonicalizer0._tertiaryShift;
        int int12 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "215) test0849(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-88607911) + "'", int7 == (-88607911));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432209007));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432209115));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = byteQuadsCanonicalizer10.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 3130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "216) test0852(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-255554952) + "'", int7 == (-255554952));
// flaky "118) test0852(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432205567) + "'", int9 == (-432205567));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer10);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        byteQuadsCanonicalizer1._longNameOffset = (-432235879);
        int int9 = byteQuadsCanonicalizer1.spilloverCount();
        java.lang.String str10 = byteQuadsCanonicalizer1.toString();
        java.lang.String str11 = byteQuadsCanonicalizer1.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str10, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int10 = byteQuadsCanonicalizer0.calcHash((-432227965), (-1643099997));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "217) test0854(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432205539) + "'", int1 == (-432205539));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "119) test0854(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-47986332) + "'", int10 == (-47986332));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        int int17 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "218) test0855(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584812723 + "'", int10 == 584812723);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryStart = 1167071952;
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer8._parent;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "219) test0856(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432205479) + "'", int1 == (-432205479));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        byteQuadsCanonicalizer4._reportTooManyCollisions();
        byteQuadsCanonicalizer4.release();
        int int8 = byteQuadsCanonicalizer4._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "220) test0857(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432205465) + "'", int1 == (-432205465));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        int int37 = byteQuadsCanonicalizer1._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "221) test0858(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1555639240) + "'", int19 == (-1555639240));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "120) test0858(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1555639240) + "'", int33 == (-1555639240));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._secondaryStart = (-432235313);
        int int6 = byteQuadsCanonicalizer1.totalCount();
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        int int8 = byteQuadsCanonicalizer1.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        int int11 = byteQuadsCanonicalizer9._spilloverEnd;
        int int12 = byteQuadsCanonicalizer9._tertiaryShift;
        boolean boolean13 = byteQuadsCanonicalizer9._intern;
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
            int int43 = byteQuadsCanonicalizer1.calcHash(intArray37, 585157990);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "222) test0859(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1077039287) + "'", int25 == (-1077039287));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "121) test0859(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1077039287) + "'", int39 == (-1077039287));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        int int4 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.totalCount();
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        int int18 = byteQuadsCanonicalizer0.calcHash((-432209053), (-432206395), (-432219849));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "223) test0861(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584811148 + "'", int10 == 584811148);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "122) test0861(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432205329) + "'", int12 == (-432205329));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky "53) test0861(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2099047958 + "'", int18 == 2099047958);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432222139));
        byteQuadsCanonicalizer1._intern = false;
        boolean boolean4 = byteQuadsCanonicalizer1._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0.primaryCount();
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "224) test0863(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432205287) + "'", int1 == (-432205287));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432217537));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int9 = byteQuadsCanonicalizer0.calcHash(726603619);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "225) test0865(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-847378963) + "'", int9 == (-847378963));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-906114045));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._count = 595210654;
        boolean boolean6 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "226) test0867(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432205249) + "'", int1 == (-432205249));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryStart = 1962832159;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._tertiaryStart = 872635325;
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "227) test0869(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432205231) + "'", int1 == (-432205231));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "228) test0870(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101091 + "'", int6 == 101091);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1601953389);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        int int36 = byteQuadsCanonicalizer0.bucketCount();
        int int37 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "229) test0872(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432205179) + "'", int1 == (-432205179));
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
// flaky "123) test0872(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1308585500 + "'", int24 == 1308585500);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-2066636029);
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._secondaryStart = 1023311;
        byteQuadsCanonicalizer0._spilloverEnd = (-44895162);
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._longNameOffset = 1869614560;
        java.lang.String str13 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "230) test0874(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432205163) + "'", int1 == (-432205163));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "124) test0874(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432205163) + "'", int3 == (-432205163));
// flaky "54) test0874(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726618694 + "'", int8 == 726618694);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str13, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._secondaryStart = (-432212957);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "231) test0875(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100905 + "'", int6 == 100905);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int[] intArray9 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10.secondaryCount();
        int int12 = byteQuadsCanonicalizer10.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer13.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer13._hashSize = (-432857107);
        int int20 = byteQuadsCanonicalizer13._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int22 = byteQuadsCanonicalizer21.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        byteQuadsCanonicalizer23._count = (byte) 100;
        java.lang.String[] strArray27 = byteQuadsCanonicalizer23._names;
        int[] intArray32 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int34 = byteQuadsCanonicalizer23.calcHash(intArray32, 4);
        byteQuadsCanonicalizer21._hashArea = intArray32;
        byteQuadsCanonicalizer13._hashArea = intArray32;
        byteQuadsCanonicalizer10._hashArea = intArray32;
        int[] intArray40 = new int[] { (-432232857), (-432216899) };
        byteQuadsCanonicalizer10._hashArea = intArray40;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = byteQuadsCanonicalizer0.calcHash(intArray40, (-1445499331));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "232) test0876(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 699208882 + "'", int6 == 699208882);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
// flaky "125) test0876(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-8374220) + "'", int17 == (-8374220));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "55) test0876(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-42277008) + "'", int34 == (-42277008));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-432232857), (-432216899) });
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432232857));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0._count;
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        int int9 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._longNameOffset = (-960848979);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._hashSize = (-1950679178);
        boolean boolean10 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "233) test0879(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432205109) + "'", int1 == (-432205109));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        int int10 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryStart = (-1913973304);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13.hashSeed();
        java.lang.String[] strArray15 = byteQuadsCanonicalizer13._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = byteQuadsCanonicalizer13.makeChild(1081706716);
        int int18 = byteQuadsCanonicalizer17.primaryCount();
        int[] intArray19 = byteQuadsCanonicalizer17._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20.hashSeed();
        int int22 = byteQuadsCanonicalizer20._longNameOffset;
        int int23 = byteQuadsCanonicalizer20._longNameOffset;
        boolean boolean24 = byteQuadsCanonicalizer20._intern;
        int int25 = byteQuadsCanonicalizer20._secondaryStart;
        int int26 = byteQuadsCanonicalizer20._secondaryStart;
        int int27 = byteQuadsCanonicalizer20._tertiaryShift;
        byteQuadsCanonicalizer20.release();
        int int29 = byteQuadsCanonicalizer20._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int31 = byteQuadsCanonicalizer30._hashSize;
        byteQuadsCanonicalizer30._count = (byte) 100;
        java.lang.String[] strArray34 = byteQuadsCanonicalizer30._names;
        java.lang.String str35 = byteQuadsCanonicalizer30.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer36 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int37 = byteQuadsCanonicalizer36._hashSize;
        byteQuadsCanonicalizer36._count = (byte) 100;
        java.lang.String[] strArray40 = byteQuadsCanonicalizer36._names;
        int[] intArray45 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int47 = byteQuadsCanonicalizer36.calcHash(intArray45, 4);
        byteQuadsCanonicalizer30._hashArea = intArray45;
        byteQuadsCanonicalizer20._hashArea = intArray45;
        java.lang.String str51 = byteQuadsCanonicalizer17.findName(intArray45, (-2050116369));
        // The following exception was thrown during execution in test generation
        try {
            int int53 = byteQuadsCanonicalizer0.calcHash(intArray45, (-1430977024));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str9, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
// flaky "234) test0880(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-432205093) + "'", int14 == (-432205093));
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
// flaky "126) test0880(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-432205093) + "'", int21 == (-432205093));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str35, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(strArray40);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "56) test0880(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1369665633) + "'", int47 == (-1369665633));
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        boolean boolean3 = byteQuadsCanonicalizer1._intern;
        int int4 = byteQuadsCanonicalizer1.bucketCount();
        java.lang.String[] strArray5 = byteQuadsCanonicalizer1._names;
        int int8 = byteQuadsCanonicalizer1.calcHash((-2128002484), (-432225827));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1674834281) + "'", int8 == (-1674834281));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-198368878));
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        int int9 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = byteQuadsCanonicalizer10.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "235) test0883(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432205017) + "'", int4 == (-432205017));
// flaky "127) test0883(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850605905 + "'", int7 == 850605905);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer10);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._count;
        int int4 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._hashSize = 0;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = byteQuadsCanonicalizer0._parent;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer5.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer5._hashSize = (-432857107);
        int int12 = byteQuadsCanonicalizer5._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15._hashSize;
        byteQuadsCanonicalizer15._count = (byte) 100;
        java.lang.String[] strArray19 = byteQuadsCanonicalizer15._names;
        int[] intArray24 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int26 = byteQuadsCanonicalizer15.calcHash(intArray24, 4);
        byteQuadsCanonicalizer13._hashArea = intArray24;
        byteQuadsCanonicalizer5._hashArea = intArray24;
        byteQuadsCanonicalizer0._hashArea = intArray24;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer2);
// flaky "236) test0885(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432204985) + "'", int3 == (-432204985));
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
// flaky "128) test0885(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1913692398) + "'", int9 == (-1913692398));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "57) test0885(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1671554860) + "'", int26 == (-1671554860));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        int int14 = byteQuadsCanonicalizer0.calcHash((-432220349));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "237) test0886(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-432825772) + "'", int11 == (-432825772));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "129) test0886(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115729 + "'", int14 == 115729);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int4 = byteQuadsCanonicalizer1.calcHash((-432235817));
        byteQuadsCanonicalizer1._tertiaryStart = (-432225485);
        boolean boolean7 = byteQuadsCanonicalizer1._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432807221) + "'", int4 == (-432807221));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0._count;
        int int10 = byteQuadsCanonicalizer0.size();
        int int11 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._longNameOffset = 1869614560;
        int int13 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "238) test0889(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432204957) + "'", int1 == (-432204957));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "130) test0889(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432204957) + "'", int3 == (-432204957));
// flaky "58) test0889(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726623815 + "'", int8 == 726623815);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        java.lang.String str7 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1548189191));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        byteQuadsCanonicalizer10._count = (byte) 100;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer10._names;
        byteQuadsCanonicalizer10._spilloverEnd = (byte) 100;
        int int17 = byteQuadsCanonicalizer10._spilloverEnd;
        int int18 = byteQuadsCanonicalizer10.secondaryCount();
        byteQuadsCanonicalizer10._longNameOffset = 3846;
        java.lang.String str21 = byteQuadsCanonicalizer10.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._longNameOffset;
        byteQuadsCanonicalizer22._tertiaryStart = 0;
        boolean boolean26 = byteQuadsCanonicalizer22.maybeDirty();
        byteQuadsCanonicalizer22._spilloverEnd = (-2066636029);
        int int29 = byteQuadsCanonicalizer22.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int31 = byteQuadsCanonicalizer30.hashSeed();
        int int32 = byteQuadsCanonicalizer30._longNameOffset;
        int int33 = byteQuadsCanonicalizer30.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer34 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int35 = byteQuadsCanonicalizer34._hashSize;
        byteQuadsCanonicalizer34._count = (byte) 100;
        java.lang.String[] strArray38 = byteQuadsCanonicalizer34._names;
        byteQuadsCanonicalizer34._spilloverEnd = (byte) 100;
        int int41 = byteQuadsCanonicalizer34._spilloverEnd;
        int int42 = byteQuadsCanonicalizer34.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer43 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int44 = byteQuadsCanonicalizer43._hashSize;
        byteQuadsCanonicalizer43._count = (byte) 100;
        java.lang.String[] strArray47 = byteQuadsCanonicalizer43._names;
        int[] intArray52 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int54 = byteQuadsCanonicalizer43.calcHash(intArray52, 4);
        java.lang.String[] strArray60 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer43._names = strArray60;
        byteQuadsCanonicalizer34._names = strArray60;
        byteQuadsCanonicalizer30._names = strArray60;
        byteQuadsCanonicalizer22._names = strArray60;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer65 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int66 = byteQuadsCanonicalizer65._hashSize;
        byteQuadsCanonicalizer65._count = (byte) 100;
        java.lang.String[] strArray69 = byteQuadsCanonicalizer65._names;
        byteQuadsCanonicalizer65._spilloverEnd = (byte) 100;
        int int72 = byteQuadsCanonicalizer65._spilloverEnd;
        int int73 = byteQuadsCanonicalizer65.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer74 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int75 = byteQuadsCanonicalizer74._hashSize;
        byteQuadsCanonicalizer74._count = (byte) 100;
        java.lang.String[] strArray78 = byteQuadsCanonicalizer74._names;
        int[] intArray83 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int85 = byteQuadsCanonicalizer74.calcHash(intArray83, 4);
        java.lang.String[] strArray91 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer74._names = strArray91;
        byteQuadsCanonicalizer65._names = strArray91;
        byteQuadsCanonicalizer22._names = strArray91;
        byteQuadsCanonicalizer10._names = strArray91;
        byteQuadsCanonicalizer9._names = strArray91;
        byteQuadsCanonicalizer0._names = strArray91;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "239) test0890(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1071618667 + "'", int6 == 1071618667);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str7, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]" + "'", str21, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-516659008) + "'", int29 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer30);
// flaky "131) test0890(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-432204903) + "'", int31 == (-432204903));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(strArray47);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "59) test0890(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-2067079139) + "'", int54 == (-2067079139));
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(strArray69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNull(strArray78);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "21) test0890(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-2067079139) + "'", int85 == (-2067079139));
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._longNameOffset = 726679957;
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._longNameOffset = (-230468558);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        boolean boolean21 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._hashSize = 726774628;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "240) test0892(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1531934153 + "'", int17 == 1531934153);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        boolean boolean9 = byteQuadsCanonicalizer0._failOnDoS;
        int int10 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "241) test0893(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1020840104) + "'", int7 == (-1020840104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int[] intArray2 = byteQuadsCanonicalizer1._hashArea;
        int[] intArray3 = null;
        byteQuadsCanonicalizer1._hashArea = intArray3;
        int int5 = byteQuadsCanonicalizer1.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432227153));
        int int5 = byteQuadsCanonicalizer1.calcHash((-432215467), (-1972511887), (-736424100));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-497359240) + "'", int5 == (-497359240));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._count = (-432214951);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "242) test0897(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584769253 + "'", int10 == 584769253);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0._count;
        int int10 = byteQuadsCanonicalizer0.primaryCount();
        int int11 = byteQuadsCanonicalizer0.primaryCount();
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        int int13 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "243) test0898(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432204801) + "'", int12 == (-432204801));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1151091484);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        int int3 = byteQuadsCanonicalizer1.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        byteQuadsCanonicalizer0._tertiaryStart = 1701135992;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "244) test0901(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-970783971) + "'", int11 == (-970783971));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky "132) test0901(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-432204771) + "'", int20 == (-432204771));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int[] intArray2 = byteQuadsCanonicalizer0._hashArea;
        boolean boolean3 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        boolean boolean7 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        int[] intArray7 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer0._hashArea = intArray7;
        boolean boolean9 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str2, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7._hashSize;
        int int9 = byteQuadsCanonicalizer7._spilloverEnd;
        int int10 = byteQuadsCanonicalizer7._tertiaryShift;
        int int14 = byteQuadsCanonicalizer7.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer7._reportTooManyCollisions();
        int int16 = byteQuadsCanonicalizer7.hashSeed();
        int int17 = byteQuadsCanonicalizer7.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = byteQuadsCanonicalizer7.makeChild((-432230027));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int[] intArray22 = byteQuadsCanonicalizer21._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        byteQuadsCanonicalizer23._count = (byte) 100;
        java.lang.String[] strArray27 = byteQuadsCanonicalizer23._names;
        int[] intArray32 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int34 = byteQuadsCanonicalizer23.calcHash(intArray32, 4);
        byteQuadsCanonicalizer23._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer37 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int38 = byteQuadsCanonicalizer37._hashSize;
        byteQuadsCanonicalizer37._count = (byte) 100;
        java.lang.String[] strArray41 = byteQuadsCanonicalizer37._names;
        int[] intArray46 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int48 = byteQuadsCanonicalizer37.calcHash(intArray46, 4);
        byteQuadsCanonicalizer23._hashArea = intArray46;
        byteQuadsCanonicalizer21._hashArea = intArray46;
        java.lang.String str52 = byteQuadsCanonicalizer19.findName(intArray46, (-432226507));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = byteQuadsCanonicalizer0.findName(intArray46, 711999807);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "245) test0905(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-719588681) + "'", int14 == (-719588681));
// flaky "133) test0905(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-432204705) + "'", int16 == (-432204705));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertNull(intArray22);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "60) test0905(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1700158892 + "'", int34 == 1700158892);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "22) test0905(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1700158892 + "'", int48 == 1700158892);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._count = (-2087094428);
        int int12 = byteQuadsCanonicalizer0.calcHash((-432231901), (-432209367));
        int int14 = byteQuadsCanonicalizer0.calcHash((-432210497));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "246) test0906(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432204697) + "'", int1 == (-432204697));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "134) test0906(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432204697) + "'", int3 == (-432204697));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "61) test0906(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520508900 + "'", int12 == 520508900);
// flaky "23) test0906(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 125383 + "'", int14 == 125383);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int25 = byteQuadsCanonicalizer24._hashSize;
        int int26 = byteQuadsCanonicalizer24._spilloverEnd;
        int int27 = byteQuadsCanonicalizer24._tertiaryShift;
        int int31 = byteQuadsCanonicalizer24.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer24._reportTooManyCollisions();
        byteQuadsCanonicalizer24._secondaryStart = (-432236071);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int36 = byteQuadsCanonicalizer35._hashSize;
        java.lang.String str37 = byteQuadsCanonicalizer35.toString();
        int[] intArray42 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer35._hashArea = intArray42;
        byteQuadsCanonicalizer24._hashArea = intArray42;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray42, (-432214597));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "247) test0907(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 565344055 + "'", int11 == 565344055);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky "135) test0907(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-432204689) + "'", int20 == (-432204689));
// flaky "62) test0907(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-282255045) + "'", int22 == (-282255045));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
// flaky "24) test0907(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-728512312) + "'", int31 == (-728512312));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str37, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        int int13 = byteQuadsCanonicalizer0.calcHash(726740779);
        byteQuadsCanonicalizer0._spilloverEnd = (-432207411);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "248) test0908(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-432826002) + "'", int11 == (-432826002));
// flaky "136) test0908(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-849224166) + "'", int13 == (-849224166));
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        int int4 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1.release();
        int int9 = byteQuadsCanonicalizer1.calcHash((-543627745), 1217384755, (-915896330));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        byteQuadsCanonicalizer10._count = (byte) 100;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer10._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15._hashSize;
        int int17 = byteQuadsCanonicalizer15._spilloverEnd;
        int int18 = byteQuadsCanonicalizer15._longNameOffset;
        byteQuadsCanonicalizer15._count = ' ';
        int[] intArray21 = byteQuadsCanonicalizer15._hashArea;
        int int22 = byteQuadsCanonicalizer15._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        byteQuadsCanonicalizer23._count = (byte) 100;
        java.lang.String[] strArray27 = byteQuadsCanonicalizer23._names;
        java.lang.String str28 = byteQuadsCanonicalizer23.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer29 = byteQuadsCanonicalizer23._parent;
        java.lang.String[] strArray30 = byteQuadsCanonicalizer23._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int35 = byteQuadsCanonicalizer31.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer31._hashSize = (-432857107);
        int int38 = byteQuadsCanonicalizer31._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer39 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int40 = byteQuadsCanonicalizer39.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer41 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int42 = byteQuadsCanonicalizer41._hashSize;
        byteQuadsCanonicalizer41._count = (byte) 100;
        java.lang.String[] strArray45 = byteQuadsCanonicalizer41._names;
        int[] intArray50 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int52 = byteQuadsCanonicalizer41.calcHash(intArray50, 4);
        byteQuadsCanonicalizer39._hashArea = intArray50;
        byteQuadsCanonicalizer31._hashArea = intArray50;
        byteQuadsCanonicalizer23._hashArea = intArray50;
        byteQuadsCanonicalizer15._hashArea = intArray50;
        byteQuadsCanonicalizer10._hashArea = intArray50;
        // The following exception was thrown during execution in test generation
        try {
            int int59 = byteQuadsCanonicalizer1.calcHash(intArray50, 231149920);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-338453959) + "'", int9 == (-338453959));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str28, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
// flaky "249) test0909(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-332194997) + "'", int35 == (-332194997));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(strArray45);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "137) test0909(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1590298671) + "'", int52 == (-1590298671));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = byteQuadsCanonicalizer0.makeChild(0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "250) test0910(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432826066) + "'", int5 == (-432826066));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "138) test0910(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432204619) + "'", int10 == (-432204619));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 6000;
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        int int10 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._count = (byte) 1;
        int int13 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-432221335);
        int int9 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "251) test0912(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-270501361) + "'", int4 == (-270501361));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(711999807);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        int int18 = byteQuadsCanonicalizer0._secondaryStart;
        int int19 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "252) test0914(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584766832 + "'", int10 == 584766832);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "139) test0914(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432204573) + "'", int12 == (-432204573));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-432237891) + "'", int18 == (-432237891));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        int int23 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "253) test0915(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1760154237) + "'", int11 == (-1760154237));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "140) test0915(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 966920157 + "'", int17 == 966920157);
// flaky "63) test0915(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1254792113 + "'", int22 == 1254792113);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-849224166));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        int int14 = byteQuadsCanonicalizer9.calcHash((-432857889), (-432802824), (-432235691));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15._hashSize;
        byteQuadsCanonicalizer15._count = (byte) 100;
        java.lang.String[] strArray19 = byteQuadsCanonicalizer15._names;
        byteQuadsCanonicalizer15._spilloverEnd = (byte) 100;
        int int22 = byteQuadsCanonicalizer15._spilloverEnd;
        int int23 = byteQuadsCanonicalizer15.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int25 = byteQuadsCanonicalizer24._hashSize;
        byteQuadsCanonicalizer24._count = (byte) 100;
        java.lang.String[] strArray28 = byteQuadsCanonicalizer24._names;
        int[] intArray33 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int35 = byteQuadsCanonicalizer24.calcHash(intArray33, 4);
        java.lang.String[] strArray41 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer24._names = strArray41;
        byteQuadsCanonicalizer15._names = strArray41;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer44 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int45 = byteQuadsCanonicalizer44._hashSize;
        byteQuadsCanonicalizer44._count = (byte) 100;
        java.lang.String[] strArray48 = byteQuadsCanonicalizer44._names;
        int[] intArray53 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int55 = byteQuadsCanonicalizer44.calcHash(intArray53, 4);
        byteQuadsCanonicalizer15._hashArea = intArray53;
        byteQuadsCanonicalizer9._hashArea = intArray53;
        byteQuadsCanonicalizer0._hashArea = intArray53;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = byteQuadsCanonicalizer0.findName((-432220067), (-432806535));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1076777651 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "254) test0917(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 214207267 + "'", int6 == 214207267);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "141) test0917(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 94908850 + "'", int14 == 94908850);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "64) test0917(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 896890986 + "'", int35 == 896890986);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "25) test0917(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 896890986 + "'", int55 == 896890986);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0._count;
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1._tertiaryStart = (-70027317);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1298041532);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        byteQuadsCanonicalizer0._tertiaryStart = (-432230135);
        byteQuadsCanonicalizer0._tertiaryStart = (-432804524);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726691972);
        int int2 = byteQuadsCanonicalizer1.spilloverCount();
        int int5 = byteQuadsCanonicalizer1.calcHash(0, 13759);
        int int6 = byteQuadsCanonicalizer1._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2030095526 + "'", int5 == 2030095526);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = byteQuadsCanonicalizer0.makeChild((int) (byte) 1);
        byteQuadsCanonicalizer0._spilloverEnd = (-40816465);
        int int28 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "255) test0924(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1461807805 + "'", int13 == 1461807805);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str20, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726927871);
        int int2 = byteQuadsCanonicalizer1.totalCount();
        byteQuadsCanonicalizer1._spilloverEnd = (-432233745);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "256) test0926(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432204377) + "'", int1 == (-432204377));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "142) test0926(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432204377) + "'", int3 == (-432204377));
// flaky "65) test0926(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726616687 + "'", int8 == 726616687);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0.release();
        int int8 = byteQuadsCanonicalizer0.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9.hashSeed();
        int int11 = byteQuadsCanonicalizer9._longNameOffset;
        int int12 = byteQuadsCanonicalizer9.hashSeed();
        byteQuadsCanonicalizer9._longNameOffset = (short) 10;
        int int17 = byteQuadsCanonicalizer9.calcHash((int) '#', (int) (short) 10);
        int int18 = byteQuadsCanonicalizer9._secondaryStart;
        boolean boolean19 = byteQuadsCanonicalizer9._intern;
        int int20 = byteQuadsCanonicalizer9._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int23 = byteQuadsCanonicalizer22.hashSeed();
        int int27 = byteQuadsCanonicalizer22.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean28 = byteQuadsCanonicalizer22.maybeDirty();
        int int29 = byteQuadsCanonicalizer22.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int31 = byteQuadsCanonicalizer30.hashSeed();
        int int32 = byteQuadsCanonicalizer30._longNameOffset;
        int int33 = byteQuadsCanonicalizer30._secondaryStart;
        int int34 = byteQuadsCanonicalizer30.totalCount();
        int int35 = byteQuadsCanonicalizer30.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer37 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432223521));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer39 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer39._hashSize = (short) 10;
        int int42 = byteQuadsCanonicalizer39._hashSize;
        byteQuadsCanonicalizer39._hashSize = 1797043;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer45 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int46 = byteQuadsCanonicalizer45._hashSize;
        byteQuadsCanonicalizer45._count = (byte) 100;
        java.lang.String[] strArray49 = byteQuadsCanonicalizer45._names;
        byteQuadsCanonicalizer45._spilloverEnd = (byte) 100;
        int int52 = byteQuadsCanonicalizer45._spilloverEnd;
        int int53 = byteQuadsCanonicalizer45.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer54 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int55 = byteQuadsCanonicalizer54._hashSize;
        byteQuadsCanonicalizer54._count = (byte) 100;
        java.lang.String[] strArray58 = byteQuadsCanonicalizer54._names;
        int[] intArray63 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int65 = byteQuadsCanonicalizer54.calcHash(intArray63, 4);
        java.lang.String[] strArray71 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer54._names = strArray71;
        byteQuadsCanonicalizer45._names = strArray71;
        java.lang.String[] strArray74 = new java.lang.String[] {};
        byteQuadsCanonicalizer45._names = strArray74;
        byteQuadsCanonicalizer39._names = strArray74;
        byteQuadsCanonicalizer37._names = strArray74;
        byteQuadsCanonicalizer30._names = strArray74;
        byteQuadsCanonicalizer22._names = strArray74;
        byteQuadsCanonicalizer9._names = strArray74;
        byteQuadsCanonicalizer0._names = strArray74;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "257) test0927(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432204365) + "'", int1 == (-432204365));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
// flaky "143) test0927(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432204365) + "'", int10 == (-432204365));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "66) test0927(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432204365) + "'", int12 == (-432204365));
// flaky "26) test0927(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 726616570 + "'", int17 == 726616570);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1797043 + "'", int27 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer30);
// flaky "8) test0927(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-432204365) + "'", int31 == (-432204365));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer37);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(strArray58);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "3) test0927(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1802720763 + "'", int65 == 1802720763);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] {});
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        boolean boolean19 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryStart = (-432221335);
        int int22 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "258) test0928(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2012486798 + "'", int11 == 2012486798);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-432221335) + "'", int22 == (-432221335));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432209567));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._count = 595210654;
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        java.lang.String[] strArray13 = byteQuadsCanonicalizer9._names;
        int[] intArray18 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int20 = byteQuadsCanonicalizer9.calcHash(intArray18, 4);
        byteQuadsCanonicalizer7._hashArea = intArray18;
        int int22 = byteQuadsCanonicalizer7.spilloverCount();
        java.lang.String[] strArray25 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" };
        byteQuadsCanonicalizer7._names = strArray25;
        java.lang.String str27 = byteQuadsCanonicalizer7.toString();
        byteQuadsCanonicalizer7._tertiaryShift = (-432226811);
        int int30 = byteQuadsCanonicalizer7._spilloverEnd;
        int[] intArray31 = byteQuadsCanonicalizer7._hashArea;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = byteQuadsCanonicalizer0.calcHash(intArray31, 585128182);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "259) test0930(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432204283) + "'", int1 == (-432204283));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "144) test0930(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 489102540 + "'", int20 == 489102540);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str27, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-432237577), (-432237873), 100, (-1) });
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        java.lang.String[] strArray10 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str9, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        int[] intArray7 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer0._hashArea = intArray7;
        int int9 = byteQuadsCanonicalizer0.size();
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-680563359);
        byteQuadsCanonicalizer0._secondaryStart = (-1529115260);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = byteQuadsCanonicalizer0.findName((-848975171), (-432210259));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -101659473 out of bounds for length 4");
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
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0._hashSize;
        boolean boolean8 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int4 = byteQuadsCanonicalizer1.hashSeed();
        byteQuadsCanonicalizer1._hashSize = 584811148;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432858451) + "'", int4 == (-432858451));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int int6 = byteQuadsCanonicalizer4._tertiaryShift;
        int int7 = byteQuadsCanonicalizer4._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "260) test0935(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432204159) + "'", int1 == (-432204159));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 384 + "'", int7 == 384);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean7 = byteQuadsCanonicalizer0._intern;
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "261) test0936(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432204145) + "'", int1 == (-432204145));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        boolean boolean18 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "262) test0937(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432824516) + "'", int5 == (-432824516));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "145) test0937(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432204121) + "'", int10 == (-432204121));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._hashSize = (-432231821);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0.makeChild((-432210017));
        java.lang.Class<?> wildcardClass12 = byteQuadsCanonicalizer11.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.tertiaryCount();
        java.lang.Class<?> wildcardClass15 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "263) test0939(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1452651728 + "'", int11 == 1452651728);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        int int13 = byteQuadsCanonicalizer0.bucketCount();
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._spilloverEnd = (-432225395);
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "264) test0941(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432204057) + "'", int8 == (-432204057));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._spilloverEnd = (-432217951);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "265) test0942(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1480525430) + "'", int7 == (-1480525430));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "146) test0942(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432204051) + "'", int9 == (-432204051));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.primaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int5 = byteQuadsCanonicalizer4._hashSize;
        byteQuadsCanonicalizer4._count = (byte) 100;
        java.lang.String[] strArray8 = byteQuadsCanonicalizer4._names;
        int[] intArray13 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int15 = byteQuadsCanonicalizer4.calcHash(intArray13, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = byteQuadsCanonicalizer0.findName(intArray13, 6000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "266) test0943(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 151678765 + "'", int15 == 151678765);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857889);
        int int12 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._secondaryStart = (-432230039);
        boolean boolean15 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "267) test0944(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432204029) + "'", int1 == (-432204029));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "147) test0944(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432204029) + "'", int3 == (-432204029));
// flaky "67) test0944(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726613609 + "'", int8 == 726613609);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        int int16 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "268) test0945(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584758642 + "'", int10 == 584758642);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(494035670);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int[] intArray2 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._secondaryStart = (-2138635169);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer3);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        byteQuadsCanonicalizer0._hashSize = (-432227833);
        byteQuadsCanonicalizer0._count = (-432822410);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "269) test0948(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-525941032) + "'", int11 == (-525941032));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "148) test0948(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 966933298 + "'", int17 == 966933298);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        int int34 = byteQuadsCanonicalizer1.calcHash((-1981207176), (-1507862706), (-870022432));
        int int35 = byteQuadsCanonicalizer1._hashSize;
        int int36 = byteQuadsCanonicalizer1._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "270) test0949(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2030393502) + "'", int14 == (-2030393502));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "149) test0949(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2030393502) + "'", int28 == (-2030393502));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1133109320 + "'", int34 == 1133109320);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int12 = byteQuadsCanonicalizer0.calcHash(884835379, (-1125458333));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "271) test0950(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1160819440) + "'", int7 == (-1160819440));
// flaky "150) test0950(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432203931) + "'", int9 == (-432203931));
// flaky "68) test0950(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-514665196) + "'", int12 == (-514665196));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "272) test0951(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1168874334) + "'", int7 == (-1168874334));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "151) test0951(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432203917) + "'", int9 == (-432203917));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "69) test0951(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-432203917) + "'", int11 == (-432203917));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.primaryCount();
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-1163826865));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432234855));
        int int2 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1._longNameOffset = (-432215793);
        int int5 = byteQuadsCanonicalizer1.size();
        java.lang.Class<?> wildcardClass6 = byteQuadsCanonicalizer1.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        byteQuadsCanonicalizer1._hashSize = (-86011045);
        byteQuadsCanonicalizer1._tertiaryStart = (-432229389);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        byteQuadsCanonicalizer6._spilloverEnd = (byte) 100;
        int int13 = byteQuadsCanonicalizer6._spilloverEnd;
        int int14 = byteQuadsCanonicalizer6.secondaryCount();
        byteQuadsCanonicalizer6._longNameOffset = 3846;
        java.lang.String str17 = byteQuadsCanonicalizer6.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._longNameOffset;
        byteQuadsCanonicalizer18._tertiaryStart = 0;
        boolean boolean22 = byteQuadsCanonicalizer18.maybeDirty();
        byteQuadsCanonicalizer18._spilloverEnd = (-2066636029);
        int int25 = byteQuadsCanonicalizer18.spilloverCount();
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
        byteQuadsCanonicalizer26._names = strArray56;
        byteQuadsCanonicalizer18._names = strArray56;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer61 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int62 = byteQuadsCanonicalizer61._hashSize;
        byteQuadsCanonicalizer61._count = (byte) 100;
        java.lang.String[] strArray65 = byteQuadsCanonicalizer61._names;
        byteQuadsCanonicalizer61._spilloverEnd = (byte) 100;
        int int68 = byteQuadsCanonicalizer61._spilloverEnd;
        int int69 = byteQuadsCanonicalizer61.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer70 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int71 = byteQuadsCanonicalizer70._hashSize;
        byteQuadsCanonicalizer70._count = (byte) 100;
        java.lang.String[] strArray74 = byteQuadsCanonicalizer70._names;
        int[] intArray79 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int81 = byteQuadsCanonicalizer70.calcHash(intArray79, 4);
        java.lang.String[] strArray87 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer70._names = strArray87;
        byteQuadsCanonicalizer61._names = strArray87;
        byteQuadsCanonicalizer18._names = strArray87;
        byteQuadsCanonicalizer6._names = strArray87;
        byteQuadsCanonicalizer1._names = strArray87;
        int int93 = byteQuadsCanonicalizer1.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]" + "'", str17, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-516659008) + "'", int25 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
// flaky "273) test0955(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-432203859) + "'", int27 == (-432203859));
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
// flaky "152) test0955(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 595546127 + "'", int50 == 595546127);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(strArray65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(strArray74);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "70) test0955(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int81 + "' != '" + 595546127 + "'", int81 == 595546127);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 150519328 + "'", int93 == 150519328);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        int int7 = byteQuadsCanonicalizer0._longNameOffset;
        int[] intArray8 = byteQuadsCanonicalizer0._hashArea;
        int int9 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (-432817701);
        int int12 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._spilloverEnd = (-432216985);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        int int34 = byteQuadsCanonicalizer1.calcHash((-1981207176), (-1507862706), (-870022432));
        java.lang.Class<?> wildcardClass35 = byteQuadsCanonicalizer1.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "274) test0957(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1810902294 + "'", int14 == 1810902294);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "153) test0957(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1810902294 + "'", int28 == 1810902294);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1133109320 + "'", int34 == 1133109320);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        int int4 = byteQuadsCanonicalizer1.totalCount();
        int int5 = byteQuadsCanonicalizer1.tertiaryCount();
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
            java.lang.String str32 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray28, (-432229107));
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
// flaky "275) test0958(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432203785) + "'", int8 == (-432203785));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "154) test0958(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432203785) + "'", int10 == (-432203785));
// flaky "71) test0958(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 726612970 + "'", int15 == 726612970);
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
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432222139));
        byteQuadsCanonicalizer1._intern = false;
        int int4 = byteQuadsCanonicalizer1._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        java.lang.String[] strArray20 = null;
        byteQuadsCanonicalizer0._names = strArray20;
        byteQuadsCanonicalizer0._tertiaryShift = 2011571269;
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "276) test0960(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584791114 + "'", int10 == 584791114);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "155) test0960(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432203743) + "'", int12 == (-432203743));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18.hashSeed();
        java.lang.String[] strArray20 = byteQuadsCanonicalizer18._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = byteQuadsCanonicalizer18.makeChild(1081706716);
        int int23 = byteQuadsCanonicalizer22.primaryCount();
        int[] intArray24 = byteQuadsCanonicalizer22._hashArea;
        byteQuadsCanonicalizer0._hashArea = intArray24;
        byteQuadsCanonicalizer0._count = 726587500;
        int int29 = byteQuadsCanonicalizer0.calcHash((-1967485713));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "277) test0961(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584791024 + "'", int10 == 584791024);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "156) test0961(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432203729) + "'", int12 == (-432203729));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
// flaky "72) test0961(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-432203729) + "'", int19 == (-432203729));
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
// flaky "27) test0961(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1821297095 + "'", int29 == 1821297095);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._hashSize;
        byteQuadsCanonicalizer16._count = (byte) 100;
        java.lang.String[] strArray20 = byteQuadsCanonicalizer16._names;
        java.lang.String str21 = byteQuadsCanonicalizer16.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = byteQuadsCanonicalizer16._parent;
        java.lang.String[] strArray23 = byteQuadsCanonicalizer16._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer24.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer24._hashSize = (-432857107);
        int int31 = byteQuadsCanonicalizer24._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer32 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int33 = byteQuadsCanonicalizer32.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer34 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int35 = byteQuadsCanonicalizer34._hashSize;
        byteQuadsCanonicalizer34._count = (byte) 100;
        java.lang.String[] strArray38 = byteQuadsCanonicalizer34._names;
        int[] intArray43 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int45 = byteQuadsCanonicalizer34.calcHash(intArray43, 4);
        byteQuadsCanonicalizer32._hashArea = intArray43;
        byteQuadsCanonicalizer24._hashArea = intArray43;
        byteQuadsCanonicalizer16._hashArea = intArray43;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray43, (-432223877));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "278) test0962(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1398750696) + "'", int11 == (-1398750696));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str21, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
// flaky "157) test0962(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-819897176) + "'", int28 == (-819897176));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "73) test0962(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1398750696) + "'", int45 == (-1398750696));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._count = 1158871334;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "279) test0963(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1277312263) + "'", int11 == (-1277312263));
// flaky "158) test0963(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-432203661) + "'", int14 == (-432203661));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._count = (-433036182);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        java.lang.Class<?> wildcardClass2 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) '4');
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = byteQuadsCanonicalizer1._parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = byteQuadsCanonicalizer2.findName((-407901806), 585191533);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer2);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18.hashSeed();
        java.lang.String[] strArray20 = byteQuadsCanonicalizer18._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = byteQuadsCanonicalizer18.makeChild(1081706716);
        int int23 = byteQuadsCanonicalizer22.primaryCount();
        int[] intArray24 = byteQuadsCanonicalizer22._hashArea;
        byteQuadsCanonicalizer0._hashArea = intArray24;
        byteQuadsCanonicalizer0._count = 726587500;
        int int28 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "280) test0968(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584793391 + "'", int10 == 584793391);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "159) test0968(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432203563) + "'", int12 == (-432203563));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
// flaky "74) test0968(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-432203563) + "'", int19 == (-432203563));
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-432237891) + "'", int28 == (-432237891));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash(726732643, 950858184);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0._parent;
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "281) test0969(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98391 + "'", int6 == 98391);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "160) test0969(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1217299507 + "'", int10 == 1217299507);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._spilloverEnd = (-432235911);
        int int10 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "282) test0970(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1063000526 + "'", int7 == 1063000526);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (-432807676);
        int int4 = byteQuadsCanonicalizer1.hashSeed();
        java.lang.String[] strArray5 = byteQuadsCanonicalizer1._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7.hashSeed();
        int int9 = byteQuadsCanonicalizer7._longNameOffset;
        int int10 = byteQuadsCanonicalizer7.hashSeed();
        byteQuadsCanonicalizer7._longNameOffset = (short) 10;
        int int15 = byteQuadsCanonicalizer7.calcHash((int) '#', (int) (short) 10);
        int int16 = byteQuadsCanonicalizer7._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = byteQuadsCanonicalizer7._parent;
        int int18 = byteQuadsCanonicalizer7._count;
        int int19 = byteQuadsCanonicalizer7.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20._hashSize;
        byteQuadsCanonicalizer20._count = (byte) 100;
        java.lang.String[] strArray24 = byteQuadsCanonicalizer20._names;
        java.lang.String str25 = byteQuadsCanonicalizer20.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int27 = byteQuadsCanonicalizer26._hashSize;
        byteQuadsCanonicalizer26._count = (byte) 100;
        java.lang.String[] strArray30 = byteQuadsCanonicalizer26._names;
        int[] intArray35 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int37 = byteQuadsCanonicalizer26.calcHash(intArray35, 4);
        byteQuadsCanonicalizer20._hashArea = intArray35;
        byteQuadsCanonicalizer7._hashArea = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray35, (-432230311));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
// flaky "283) test0971(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432203507) + "'", int8 == (-432203507));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "161) test0971(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432203507) + "'", int10 == (-432203507));
// flaky "75) test0971(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 726609172 + "'", int15 == 726609172);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky "28) test0971(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-432203507) + "'", int19 == (-432203507));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str25, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "9) test0971(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1292823726) + "'", int37 == (-1292823726));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        int int4 = byteQuadsCanonicalizer1.tertiaryCount();
        boolean boolean5 = byteQuadsCanonicalizer1.maybeDirty();
        java.lang.String str6 = byteQuadsCanonicalizer1.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432221665));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int int10 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._count = (-432228851);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        int int15 = byteQuadsCanonicalizer13._spilloverEnd;
        int int16 = byteQuadsCanonicalizer13._tertiaryShift;
        int int20 = byteQuadsCanonicalizer13.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer13._reportTooManyCollisions();
        int int22 = byteQuadsCanonicalizer13.hashSeed();
        int int23 = byteQuadsCanonicalizer13.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = byteQuadsCanonicalizer13.makeChild((-432230027));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int[] intArray28 = byteQuadsCanonicalizer27._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer29 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int30 = byteQuadsCanonicalizer29._hashSize;
        byteQuadsCanonicalizer29._count = (byte) 100;
        java.lang.String[] strArray33 = byteQuadsCanonicalizer29._names;
        int[] intArray38 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int40 = byteQuadsCanonicalizer29.calcHash(intArray38, 4);
        byteQuadsCanonicalizer29._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer43 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int44 = byteQuadsCanonicalizer43._hashSize;
        byteQuadsCanonicalizer43._count = (byte) 100;
        java.lang.String[] strArray47 = byteQuadsCanonicalizer43._names;
        int[] intArray52 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int54 = byteQuadsCanonicalizer43.calcHash(intArray52, 4);
        byteQuadsCanonicalizer29._hashArea = intArray52;
        byteQuadsCanonicalizer27._hashArea = intArray52;
        java.lang.String str58 = byteQuadsCanonicalizer25.findName(intArray52, (-432226507));
        // The following exception was thrown during execution in test generation
        try {
            int int60 = byteQuadsCanonicalizer0.calcHash(intArray52, (-432820296));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky "284) test0974(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 848567487 + "'", int20 == 848567487);
// flaky "162) test0974(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-432203427) + "'", int22 == (-432203427));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "76) test0974(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1068955684 + "'", int40 == 1068955684);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(strArray47);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "29) test0974(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1068955684 + "'", int54 == 1068955684);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int15 = byteQuadsCanonicalizer0.calcHash((-1529115260));
        byteQuadsCanonicalizer0._longNameOffset = (-432229721);
        boolean boolean18 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "285) test0975(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1221492866) + "'", int11 == (-1221492866));
// flaky "163) test0975(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1122171314 + "'", int15 == 1122171314);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int[] intArray2 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.totalCount();
        java.lang.Class<?> wildcardClass10 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (-432235313);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.size();
        int int15 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._tertiaryStart = 850828601;
        int[] intArray18 = byteQuadsCanonicalizer0._hashArea;
        int int19 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "286) test0979(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 372834745 + "'", int11 == 372834745);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1979216242);
        int int2 = byteQuadsCanonicalizer1.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7.secondaryCount();
        int int9 = byteQuadsCanonicalizer7.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        int int12 = byteQuadsCanonicalizer10._spilloverEnd;
        java.lang.String[] strArray13 = byteQuadsCanonicalizer10._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14.hashSeed();
        int int16 = byteQuadsCanonicalizer14._longNameOffset;
        int int17 = byteQuadsCanonicalizer14.hashSeed();
        byteQuadsCanonicalizer14._longNameOffset = (short) 10;
        int int22 = byteQuadsCanonicalizer14.calcHash((int) '#', (int) (short) 10);
        int int23 = byteQuadsCanonicalizer14._secondaryStart;
        byteQuadsCanonicalizer14._tertiaryShift = (-432857889);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int27 = byteQuadsCanonicalizer26._hashSize;
        byteQuadsCanonicalizer26._count = (byte) 100;
        java.lang.String[] strArray30 = byteQuadsCanonicalizer26._names;
        int[] intArray35 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int37 = byteQuadsCanonicalizer26.calcHash(intArray35, 4);
        java.lang.String[] strArray43 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer26._names = strArray43;
        byteQuadsCanonicalizer14._names = strArray43;
        byteQuadsCanonicalizer10._names = strArray43;
        byteQuadsCanonicalizer7._names = strArray43;
        byteQuadsCanonicalizer0._names = strArray43;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer49 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int50 = byteQuadsCanonicalizer49._hashSize;
        int int51 = byteQuadsCanonicalizer49._spilloverEnd;
        int int52 = byteQuadsCanonicalizer49._tertiaryShift;
        int int56 = byteQuadsCanonicalizer49.calcHash(6000, (-432236993), 0);
        boolean boolean57 = byteQuadsCanonicalizer49._failOnDoS;
        int int58 = byteQuadsCanonicalizer49.hashSeed();
        byteQuadsCanonicalizer49._reportTooManyCollisions();
        byteQuadsCanonicalizer49._hashSize = (-1461335867);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer62 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int63 = byteQuadsCanonicalizer62._hashSize;
        byteQuadsCanonicalizer62._count = (byte) 100;
        java.lang.String[] strArray66 = byteQuadsCanonicalizer62._names;
        int[] intArray71 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int73 = byteQuadsCanonicalizer62.calcHash(intArray71, 4);
        byteQuadsCanonicalizer62._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer76 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int77 = byteQuadsCanonicalizer76._hashSize;
        byteQuadsCanonicalizer76._count = (byte) 100;
        java.lang.String[] strArray80 = byteQuadsCanonicalizer76._names;
        int[] intArray85 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int87 = byteQuadsCanonicalizer76.calcHash(intArray85, 4);
        byteQuadsCanonicalizer62._hashArea = intArray85;
        byteQuadsCanonicalizer49._hashArea = intArray85;
        // The following exception was thrown during execution in test generation
        try {
            int int91 = byteQuadsCanonicalizer0.calcHash(intArray85, 1133109320);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "287) test0981(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432825308) + "'", int5 == (-432825308));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
// flaky "164) test0981(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-432203329) + "'", int15 == (-432203329));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky "77) test0981(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-432203329) + "'", int17 == (-432203329));
// flaky "30) test0981(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 726608119 + "'", int22 == 726608119);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "10) test0981(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1639312071 + "'", int37 == 1639312071);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
// flaky "4) test0981(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 946941598 + "'", int56 == 946941598);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
// flaky "1) test0981(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-432203329) + "'", int58 == (-432203329));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(strArray66);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "1) test0981(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1639312071 + "'", int73 == 1639312071);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(strArray80);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "1) test0981(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1639312071 + "'", int87 == 1639312071);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(1243048537);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._tertiaryShift = (-432233909);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432237873));
        int int11 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "288) test0983(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432203299) + "'", int1 == (-432203299));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "165) test0983(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101131 + "'", int10 == 101131);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.calcHash((-432236713));
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        int int7 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "289) test0984(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432203285) + "'", int1 == (-432203285));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "166) test0984(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 102053 + "'", int4 == 102053);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "290) test0985(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8306058 + "'", int6 == 8306058);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        int int9 = byteQuadsCanonicalizer0.secondaryCount();
        boolean boolean10 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "291) test0986(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 900086368 + "'", int7 == 900086368);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0.bucketCount();
        int int9 = byteQuadsCanonicalizer0.calcHash(851004074, (-432221079), (-1950679178));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "292) test0987(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-433036476) + "'", int3 == (-433036476));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "167) test0987(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 737488620 + "'", int9 == 737488620);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        int int2 = byteQuadsCanonicalizer1.tertiaryCount();
        int int3 = byteQuadsCanonicalizer1._hashSize;
        int int4 = byteQuadsCanonicalizer1.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235137));
        boolean boolean2 = byteQuadsCanonicalizer1._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        int int9 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 1329344937;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "293) test0990(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1736611056 + "'", int6 == 1736611056);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryStart = 726921598;
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "294) test0991(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432203221) + "'", int1 == (-432203221));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432213933));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432227703));
        byteQuadsCanonicalizer1._spilloverEnd = 19982;
        int int4 = byteQuadsCanonicalizer1._secondaryStart;
        byteQuadsCanonicalizer1._tertiaryStart = (-432223621);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        boolean boolean19 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryStart = (-432221335);
        int int22 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0.release();
        int int24 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "295) test0994(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-211685787) + "'", int11 == (-211685787));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0.release();
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        byteQuadsCanonicalizer0._longNameOffset = (-432857107);
        byteQuadsCanonicalizer0._secondaryStart = (-432236413);
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        int[] intArray11 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "296) test0996(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432203183) + "'", int1 == (-432203183));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "168) test0996(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432203183) + "'", int3 == (-432203183));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-2066636029);
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-516659008) + "'", int8 == (-516659008));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._secondaryStart = 1217455144;
        java.lang.Class<?> wildcardClass7 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._intern = false;
        byteQuadsCanonicalizer0._secondaryStart = (-129002493);
        int int9 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857889);
        int int12 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "297) test1000(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432203147) + "'", int1 == (-432203147));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "169) test1000(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432203147) + "'", int3 == (-432203147));
// flaky "78) test1000(com.fasterxml.jackson.core.sym.RegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726461248 + "'", int8 == 726461248);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }
}
