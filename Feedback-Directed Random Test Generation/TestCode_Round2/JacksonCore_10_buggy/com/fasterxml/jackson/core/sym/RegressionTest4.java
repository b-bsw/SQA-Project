package com.fasterxml.jackson.core.sym;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._tertiaryShift = (-432210439);
        byteQuadsCanonicalizer0._count = 584597326;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0._count;
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
// flaky "1) test2002(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432185193) + "'", int8 == (-432185193));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-99047565));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._count;
        int int10 = byteQuadsCanonicalizer0.hashSeed();
        int int11 = byteQuadsCanonicalizer0._tertiaryStart;
        int int12 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "2) test2004(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432185159) + "'", int1 == (-432185159));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "1) test2004(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432185159) + "'", int3 == (-432185159));
// flaky "1) test2004(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726339856 + "'", int8 == 726339856);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "1) test2004(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432185159) + "'", int10 == (-432185159));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 1741453774;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "3) test2005(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432185147) + "'", int1 == (-432185147));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer6);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        byteQuadsCanonicalizer1._tertiaryShift = 465607381;
        int int6 = byteQuadsCanonicalizer1._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        java.lang.Class<?> wildcardClass75 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "4) test2007(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432185087) + "'", int9 == (-432185087));
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
// flaky "2) test2007(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-766239651) + "'", int32 == (-766239651));
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
// flaky "2) test2007(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-766239651) + "'", int63 == (-766239651));
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0._count;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        boolean boolean3 = byteQuadsCanonicalizer1._failOnDoS;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer1.makeChild((-1008950360));
        int int6 = byteQuadsCanonicalizer5.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(629702000);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432225203));
        int int2 = byteQuadsCanonicalizer1._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int int6 = byteQuadsCanonicalizer4._tertiaryShift;
        byteQuadsCanonicalizer4._secondaryStart = (-432857889);
        int int9 = byteQuadsCanonicalizer4.tertiaryCount();
        byteQuadsCanonicalizer4._count = 1300450668;
        int int12 = byteQuadsCanonicalizer4._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "5) test2012(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432184961) + "'", int1 == (-432184961));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        java.lang.String str7 = byteQuadsCanonicalizer0.toString();
        int[] intArray8 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str7, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(32, 0);
        int int7 = byteQuadsCanonicalizer3.size();
        int int8 = byteQuadsCanonicalizer3.totalCount();
        boolean boolean9 = byteQuadsCanonicalizer3._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 722552620 + "'", int6 == 722552620);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1574754311));
        int[] intArray2 = byteQuadsCanonicalizer1._hashArea;
        boolean boolean3 = byteQuadsCanonicalizer1._intern;
        byteQuadsCanonicalizer1._spilloverEnd = (-1520843152);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        byteQuadsCanonicalizer0._longNameOffset = (-1001525864);
        int int31 = byteQuadsCanonicalizer0._tertiaryStart;
        int int33 = byteQuadsCanonicalizer0.calcHash(850600217);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer34 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int35 = byteQuadsCanonicalizer34._hashSize;
        int int39 = byteQuadsCanonicalizer34.calcHash((-432857889), (-432802824), (-432235691));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer40 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int41 = byteQuadsCanonicalizer40._hashSize;
        byteQuadsCanonicalizer40._count = (byte) 100;
        java.lang.String[] strArray44 = byteQuadsCanonicalizer40._names;
        byteQuadsCanonicalizer40._spilloverEnd = (byte) 100;
        int int47 = byteQuadsCanonicalizer40._spilloverEnd;
        int int48 = byteQuadsCanonicalizer40.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer49 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int50 = byteQuadsCanonicalizer49._hashSize;
        byteQuadsCanonicalizer49._count = (byte) 100;
        java.lang.String[] strArray53 = byteQuadsCanonicalizer49._names;
        int[] intArray58 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int60 = byteQuadsCanonicalizer49.calcHash(intArray58, 4);
        java.lang.String[] strArray66 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer49._names = strArray66;
        byteQuadsCanonicalizer40._names = strArray66;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer69 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int70 = byteQuadsCanonicalizer69._hashSize;
        byteQuadsCanonicalizer69._count = (byte) 100;
        java.lang.String[] strArray73 = byteQuadsCanonicalizer69._names;
        int[] intArray78 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int80 = byteQuadsCanonicalizer69.calcHash(intArray78, 4);
        byteQuadsCanonicalizer40._hashArea = intArray78;
        byteQuadsCanonicalizer34._hashArea = intArray78;
        int int84 = byteQuadsCanonicalizer34.calcHash(11880);
        int[] intArray85 = byteQuadsCanonicalizer34._hashArea;
        byteQuadsCanonicalizer0._hashArea = intArray85;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "6) test2016(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432184883) + "'", int4 == (-432184883));
// flaky "3) test2016(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850703969 + "'", int7 == 850703969);
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
// flaky "3) test2016(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1060964162 + "'", int26 == 1060964162);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
// flaky "2) test2016(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-729653869) + "'", int33 == (-729653869));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
// flaky "1) test2016(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 646892769 + "'", int39 == 646892769);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "1) test2016(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1060964162 + "'", int60 == 1060964162);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNull(strArray73);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "1) test2016(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1060964162 + "'", int80 == 1060964162);
// flaky "1) test2016(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-433039871) + "'", int84 == (-433039871));
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { (-432237577), (-432237873), 100, (-1) });
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        byteQuadsCanonicalizer9._tertiaryStart = (-342801551);
        byteQuadsCanonicalizer9._hashSize = 1828264743;
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
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        byteQuadsCanonicalizer0._count = (-1529513694);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "7) test2018(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432184851) + "'", int9 == (-432184851));
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
// flaky "4) test2018(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2034335588) + "'", int32 == (-2034335588));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "8) test2019(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432184825) + "'", int1 == (-432184825));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "5) test2019(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432184825) + "'", int3 == (-432184825));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(1144623545, (-1335274636));
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "9) test2020(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 963005206 + "'", int7 == 963005206);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild((-432227091));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        byteQuadsCanonicalizer0._longNameOffset = (-1509909397);
        byteQuadsCanonicalizer0._count = '#';
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "10) test2022(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-750886006) + "'", int17 == (-750886006));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._tertiaryStart = 601297471;
        int int16 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._count = (-432200887);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "11) test2023(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-410744267) + "'", int11 == (-410744267));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._hashSize = (-2027202559);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "12) test2024(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432184713) + "'", int1 == (-432184713));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2027202559) + "'", int8 == (-2027202559));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        byteQuadsCanonicalizer0._longNameOffset = 586144840;
        boolean boolean10 = byteQuadsCanonicalizer0.maybeDirty();
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "13) test2025(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432184695) + "'", int4 == (-432184695));
// flaky "6) test2025(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850706993 + "'", int7 == 850706993);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        int int4 = byteQuadsCanonicalizer1.tertiaryCount();
        boolean boolean5 = byteQuadsCanonicalizer1.maybeDirty();
        int int6 = byteQuadsCanonicalizer1.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        byteQuadsCanonicalizer0._longNameOffset = (-432857107);
        byteQuadsCanonicalizer0._secondaryStart = (-432236413);
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "14) test2027(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432184673) + "'", int1 == (-432184673));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "7) test2027(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432184673) + "'", int3 == (-432184673));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        byteQuadsCanonicalizer0._secondaryStart = 502092519;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432230871));
        int int5 = byteQuadsCanonicalizer1.calcHash((-1643624147), (-1029318143), (-432196041));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1079613540) + "'", int5 == (-1079613540));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1097223542);
        int int2 = byteQuadsCanonicalizer1._secondaryStart;
        int int3 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._secondaryStart = (-2131008022);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0.secondaryCount();
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._spilloverEnd = (-432203917);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        int int13 = byteQuadsCanonicalizer9.bucketCount();
        int int14 = byteQuadsCanonicalizer9._tertiaryStart;
        int int15 = byteQuadsCanonicalizer9.primaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer16.calcHash((-432238239), (-432238045), (int) ' ');
        java.lang.String[] strArray21 = byteQuadsCanonicalizer16._names;
        byteQuadsCanonicalizer16._intern = false;
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
        byteQuadsCanonicalizer9._hashArea = intArray35;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray35, 1857653552);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "15) test2031(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432184601) + "'", int1 == (-432184601));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
// flaky "8) test2031(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 929307115 + "'", int20 == 929307115);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "4) test2031(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1990003893 + "'", int37 == 1990003893);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = byteQuadsCanonicalizer0.findName((-182439848), (-432193697), 26194);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1145574221 out of bounds for length 4");
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
// flaky "16) test2032(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-626309805) + "'", int17 == (-626309805));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0.primaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int6 = byteQuadsCanonicalizer5._longNameOffset;
        int int7 = byteQuadsCanonicalizer5._longNameOffset;
        int int8 = byteQuadsCanonicalizer5.totalCount();
        int int9 = byteQuadsCanonicalizer5._spilloverEnd;
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
        int int29 = byteQuadsCanonicalizer10._secondaryStart;
        byteQuadsCanonicalizer10._secondaryStart = (-1776808604);
        boolean boolean32 = byteQuadsCanonicalizer10.maybeDirty();
        int int33 = byteQuadsCanonicalizer10.hashSeed();
        byteQuadsCanonicalizer10._tertiaryStart = 1979216242;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer36 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int37 = byteQuadsCanonicalizer36.hashSeed();
        int int38 = byteQuadsCanonicalizer36._longNameOffset;
        int int39 = byteQuadsCanonicalizer36.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer40 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int41 = byteQuadsCanonicalizer40._hashSize;
        byteQuadsCanonicalizer40._count = (byte) 100;
        java.lang.String[] strArray44 = byteQuadsCanonicalizer40._names;
        byteQuadsCanonicalizer40._spilloverEnd = (byte) 100;
        int int47 = byteQuadsCanonicalizer40._spilloverEnd;
        int int48 = byteQuadsCanonicalizer40.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer49 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int50 = byteQuadsCanonicalizer49._hashSize;
        byteQuadsCanonicalizer49._count = (byte) 100;
        java.lang.String[] strArray53 = byteQuadsCanonicalizer49._names;
        int[] intArray58 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int60 = byteQuadsCanonicalizer49.calcHash(intArray58, 4);
        java.lang.String[] strArray66 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer49._names = strArray66;
        byteQuadsCanonicalizer40._names = strArray66;
        java.lang.String[] strArray69 = new java.lang.String[] {};
        byteQuadsCanonicalizer40._names = strArray69;
        byteQuadsCanonicalizer36._names = strArray69;
        byteQuadsCanonicalizer10._names = strArray69;
        byteQuadsCanonicalizer5._names = strArray69;
        byteQuadsCanonicalizer0._names = strArray69;
        byteQuadsCanonicalizer0._secondaryStart = 2101329662;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
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
// flaky "17) test2033(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1496564890 + "'", int27 == 1496564890);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky "9) test2033(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-432184553) + "'", int33 == (-432184553));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer36);
// flaky "5) test2033(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-432184553) + "'", int37 == (-432184553));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "3) test2033(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1496564890 + "'", int60 == 1496564890);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] {});
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        int int5 = byteQuadsCanonicalizer0.hashSeed();
        int int6 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "18) test2034(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432184535) + "'", int1 == (-432184535));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "10) test2034(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432184535) + "'", int5 == (-432184535));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432227703));
        int int2 = byteQuadsCanonicalizer1.primaryCount();
        byteQuadsCanonicalizer1._count = 13247;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer58 = byteQuadsCanonicalizer0.makeChild((-432212587));
        int int59 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "19) test2036(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 473467145 + "'", int5 == 473467145);
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
// flaky "11) test2036(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 958242591 + "'", int26 == 958242591);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "6) test2036(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 958242591 + "'", int46 == 958242591);
// flaky "4) test2036(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-433041289) + "'", int50 == (-433041289));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "2) test2036(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-905862081) + "'", int54 == (-905862081));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer58);
// flaky "2) test2036(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-432184513) + "'", int59 == (-432184513));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        int int12 = byteQuadsCanonicalizer0.bucketCount();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._tertiaryShift = 18652;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "20) test2037(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432184497) + "'", int1 == (-432184497));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._secondaryStart = (-432231459);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = byteQuadsCanonicalizer0.makeChild(1122162970);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "21) test2038(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1261198415) + "'", int11 == (-1261198415));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        byteQuadsCanonicalizer1._hashSize = (-86011045);
        byteQuadsCanonicalizer1._tertiaryStart = (-432229389);
        int int6 = byteQuadsCanonicalizer1._secondaryStart;
        int int7 = byteQuadsCanonicalizer1._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0.totalCount();
        int int9 = byteQuadsCanonicalizer0._hashSize;
        int int10 = byteQuadsCanonicalizer0.secondaryCount();
        int int11 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._longNameOffset = (-1420518152);
        int int14 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "22) test2040(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432184439) + "'", int4 == (-432184439));
// flaky "12) test2040(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850709441 + "'", int7 == 850709441);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._longNameOffset = 726921751;
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        int int12 = byteQuadsCanonicalizer0.calcHash((-432216561), (-432215979), 828497578);
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "23) test2041(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432184401) + "'", int4 == (-432184401));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "13) test2041(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432184401) + "'", int8 == (-432184401));
// flaky "7) test2041(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-214056832) + "'", int12 == (-214056832));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash(726732643, 950858184);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0._parent;
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "24) test2042(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 129910 + "'", int6 == 129910);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "14) test2042(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1216895011 + "'", int10 == 1216895011);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0.release();
        java.lang.String[] strArray5 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._count = (-550751361);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857889);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._count = (byte) 100;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        int[] intArray21 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int23 = byteQuadsCanonicalizer12.calcHash(intArray21, 4);
        java.lang.String[] strArray29 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer12._names = strArray29;
        byteQuadsCanonicalizer0._names = strArray29;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer33 = byteQuadsCanonicalizer0.makeChild(0);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer34 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._count = 394296971;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "25) test2044(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432184357) + "'", int1 == (-432184357));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "15) test2044(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432184357) + "'", int3 == (-432184357));
// flaky "8) test2044(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726339676 + "'", int8 == 726339676);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "5) test2044(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1181126523 + "'", int23 == 1181126523);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer33);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer34);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1802720763);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = (-432235911);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        int int10 = byteQuadsCanonicalizer6.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        byteQuadsCanonicalizer11._count = (byte) 100;
        java.lang.String[] strArray15 = byteQuadsCanonicalizer11._names;
        int[] intArray20 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int22 = byteQuadsCanonicalizer11.calcHash(intArray20, 4);
        byteQuadsCanonicalizer11._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int26 = byteQuadsCanonicalizer25._hashSize;
        byteQuadsCanonicalizer25._count = (byte) 100;
        java.lang.String[] strArray29 = byteQuadsCanonicalizer25._names;
        int[] intArray34 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int36 = byteQuadsCanonicalizer25.calcHash(intArray34, 4);
        byteQuadsCanonicalizer11._hashArea = intArray34;
        byteQuadsCanonicalizer6._hashArea = intArray34;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = byteQuadsCanonicalizer0.findName(intArray34, 1993740644);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "26) test2046(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432184335) + "'", int1 == (-432184335));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "16) test2046(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-779992233) + "'", int22 == (-779992233));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "9) test2046(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-779992233) + "'", int36 == (-779992233));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        int[] intArray7 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer0._hashArea = intArray7;
        int int9 = byteQuadsCanonicalizer0.size();
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str2, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(726721177);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0.makeChild((-432232557));
        java.lang.String str15 = byteQuadsCanonicalizer11.addName("hi!", 726804292, (-432231187));
        int int16 = byteQuadsCanonicalizer11.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(726927673);
        int[] intArray10 = byteQuadsCanonicalizer9._hashArea;
        byteQuadsCanonicalizer9._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432208383));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1548189191));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild((-1011195396));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = 64;
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-1466576893);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        boolean boolean11 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._spilloverEnd = (-44895162);
        int int17 = byteQuadsCanonicalizer0.calcHash(726927871, 726384856, (-1643624147));
        int int20 = byteQuadsCanonicalizer0.calcHash((-432229567), (-432192677));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "27) test2054(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432184171) + "'", int1 == (-432184171));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "17) test2054(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432184171) + "'", int3 == (-432184171));
// flaky "10) test2054(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726331558 + "'", int8 == 726331558);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "6) test2054(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1174200372) + "'", int17 == (-1174200372));
// flaky "3) test2054(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 513782309 + "'", int20 == 513782309);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        byteQuadsCanonicalizer0._longNameOffset = (-432232881);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6.hashSeed();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer6._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer6.makeChild(1081706716);
        int int11 = byteQuadsCanonicalizer10.primaryCount();
        int[] intArray12 = byteQuadsCanonicalizer10._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13.hashSeed();
        int int15 = byteQuadsCanonicalizer13._longNameOffset;
        int int16 = byteQuadsCanonicalizer13._longNameOffset;
        boolean boolean17 = byteQuadsCanonicalizer13._intern;
        int int18 = byteQuadsCanonicalizer13._secondaryStart;
        int int19 = byteQuadsCanonicalizer13._secondaryStart;
        int int20 = byteQuadsCanonicalizer13._tertiaryShift;
        byteQuadsCanonicalizer13.release();
        int int22 = byteQuadsCanonicalizer13._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        byteQuadsCanonicalizer23._count = (byte) 100;
        java.lang.String[] strArray27 = byteQuadsCanonicalizer23._names;
        java.lang.String str28 = byteQuadsCanonicalizer23.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer29 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int30 = byteQuadsCanonicalizer29._hashSize;
        byteQuadsCanonicalizer29._count = (byte) 100;
        java.lang.String[] strArray33 = byteQuadsCanonicalizer29._names;
        int[] intArray38 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int40 = byteQuadsCanonicalizer29.calcHash(intArray38, 4);
        byteQuadsCanonicalizer23._hashArea = intArray38;
        byteQuadsCanonicalizer13._hashArea = intArray38;
        java.lang.String str44 = byteQuadsCanonicalizer10.findName(intArray38, (-2050116369));
        byteQuadsCanonicalizer0._hashArea = intArray38;
        byteQuadsCanonicalizer0._hashSize = (-432211145);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
// flaky "28) test2055(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-432184159) + "'", int7 == (-432184159));
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
// flaky "18) test2055(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-432184159) + "'", int14 == (-432184159));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str28, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "11) test2055(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-920867731) + "'", int40 == (-920867731));
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432197199));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        byteQuadsCanonicalizer9._tertiaryStart = (-342801551);
        int[] intArray15 = byteQuadsCanonicalizer9._hashArea;
        int int16 = byteQuadsCanonicalizer9.size();
        boolean boolean17 = byteQuadsCanonicalizer9._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1257672196);
        byteQuadsCanonicalizer1._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int4 = byteQuadsCanonicalizer3.size();
        java.lang.String str7 = byteQuadsCanonicalizer3.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432184925));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str7, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._longNameOffset = 726921751;
        int int8 = byteQuadsCanonicalizer0.totalCount();
        int int9 = byteQuadsCanonicalizer0.size();
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "29) test2060(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432184063) + "'", int4 == (-432184063));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(956109619);
        byteQuadsCanonicalizer1._spilloverEnd = 645220874;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        int int29 = byteQuadsCanonicalizer0.calcHash((-1558844040), (-1983388062));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = byteQuadsCanonicalizer0.makeChild(722552620);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "30) test2062(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432184019) + "'", int1 == (-432184019));
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
// flaky "19) test2062(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1242024771) + "'", int18 == (-1242024771));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
// flaky "12) test2062(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-907689395) + "'", int29 == (-907689395));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.calcHash((-432236713));
        boolean boolean5 = byteQuadsCanonicalizer0._failOnDoS;
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "31) test2063(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432183979) + "'", int1 == (-432183979));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "20) test2063(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 127516 + "'", int4 == 127516);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432230393));
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer3);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432227977));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        int int7 = byteQuadsCanonicalizer0._hashSize;
        int int8 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._longNameOffset = (-329778385);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        int int8 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "32) test2067(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433049609) + "'", int5 == (-433049609));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        int int4 = byteQuadsCanonicalizer0._count;
        int int5 = byteQuadsCanonicalizer0._longNameOffset;
        java.lang.String[] strArray6 = byteQuadsCanonicalizer0._names;
        int int8 = byteQuadsCanonicalizer0.calcHash((-432222159));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "33) test2068(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432183835) + "'", int1 == (-432183835));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strArray6);
// flaky "21) test2068(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 112078 + "'", int8 == 112078);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._hashSize = (-432231821);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0.makeChild((-432210017));
        byteQuadsCanonicalizer11._count = (-432210639);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        byteQuadsCanonicalizer4._hashSize = (-432236017);
        int int8 = byteQuadsCanonicalizer4._hashSize;
        byteQuadsCanonicalizer4.release();
        int int10 = byteQuadsCanonicalizer4.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "34) test2071(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432183767) + "'", int1 == (-432183767));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432236017) + "'", int8 == (-432236017));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild(733821121);
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        int int12 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._hashSize = 726700099;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "35) test2073(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432183727) + "'", int1 == (-432183727));
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0.release();
        int int12 = byteQuadsCanonicalizer0.bucketCount();
        int int13 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "36) test2074(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1648889066 + "'", int7 == 1648889066);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "22) test2074(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432183677) + "'", int9 == (-432183677));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        int int9 = byteQuadsCanonicalizer0.calcHash(1910040666);
        byteQuadsCanonicalizer0._spilloverEnd = (-432231879);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "37) test2075(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1053668441) + "'", int6 == (-1053668441));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "23) test2075(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1745921852) + "'", int9 == (-1745921852));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer36 = byteQuadsCanonicalizer1._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "38) test2076(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-981473922) + "'", int14 == (-981473922));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "24) test2076(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-981473922) + "'", int28 == (-981473922));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1133109320 + "'", int34 == 1133109320);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer36);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        int int7 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryStart = (-1846064292);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        int int4 = byteQuadsCanonicalizer1._tertiaryShift;
        byteQuadsCanonicalizer1._tertiaryStart = (-1701677292);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer7.calcHash((-432238239), (-432238045), (int) ' ');
        java.lang.String[] strArray12 = byteQuadsCanonicalizer7._names;
        byteQuadsCanonicalizer7._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17._hashSize;
        byteQuadsCanonicalizer17._count = (byte) 100;
        java.lang.String[] strArray21 = byteQuadsCanonicalizer17._names;
        int[] intArray26 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int28 = byteQuadsCanonicalizer17.calcHash(intArray26, 4);
        byteQuadsCanonicalizer15._hashArea = intArray26;
        byteQuadsCanonicalizer7._hashArea = intArray26;
        byteQuadsCanonicalizer1._hashArea = intArray26;
        int int32 = byteQuadsCanonicalizer1.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
// flaky "39) test2078(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-609563185) + "'", int11 == (-609563185));
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "25) test2078(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1537797370) + "'", int28 == (-1537797370));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 726920401;
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0.spilloverCount();
        int int5 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '4');
        boolean boolean9 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._hashSize = (-432811187);
        int int12 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "40) test2081(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433049895) + "'", int5 == (-433049895));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "26) test2081(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-433049962) + "'", int8 == (-433049962));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432210183));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        boolean boolean57 = byteQuadsCanonicalizer0.maybeDirty();
        boolean boolean58 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "41) test2083(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 754429647 + "'", int5 == 754429647);
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
// flaky "27) test2083(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1916544119) + "'", int26 == (-1916544119));
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "13) test2083(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1916544119) + "'", int46 == (-1916544119));
// flaky "7) test2083(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-433042350) + "'", int50 == (-433042350));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "4) test2083(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-905852460) + "'", int54 == (-905852460));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1993740644);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        int int48 = byteQuadsCanonicalizer1.totalCount();
        int int49 = byteQuadsCanonicalizer1.primaryCount();
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
// flaky "42) test2085(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1056849990) + "'", int34 == (-1056849990));
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._tertiaryShift = 622936314;
        java.lang.String str11 = byteQuadsCanonicalizer3.findName(797443144);
        int int13 = byteQuadsCanonicalizer3.calcHash((-432232669));
        int int14 = byteQuadsCanonicalizer3.tertiaryCount();
        int int16 = byteQuadsCanonicalizer3.calcHash((-432230801));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1031526 + "'", int13 == 1031526);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1029162 + "'", int16 == 1029162);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        int int24 = byteQuadsCanonicalizer0.calcHash((-432220191), (-432220495), (-1005758546));
        int int25 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "43) test2087(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-353508651) + "'", int11 == (-353508651));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "28) test2087(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1134575377 + "'", int24 == 1134575377);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "44) test2088(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2024653967) + "'", int11 == (-2024653967));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.calcHash((-432237891), 0, (-432234527));
        int int15 = byteQuadsCanonicalizer0.calcHash(13247, (-432225301));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "45) test2089(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-443678623) + "'", int12 == (-443678623));
// flaky "29) test2089(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-905072520) + "'", int15 == (-905072520));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int4 = byteQuadsCanonicalizer3.hashSeed();
        byteQuadsCanonicalizer3._secondaryStart = (-1106296139);
        boolean boolean7 = byteQuadsCanonicalizer3._intern;
        int int8 = byteQuadsCanonicalizer3.spilloverCount();
        byteQuadsCanonicalizer3._spilloverEnd = (-1654346617);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432858451) + "'", int4 == (-432858451));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._tertiaryShift = (-432802830);
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = 0;
        int int14 = byteQuadsCanonicalizer0.totalCount();
        int int15 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "46) test2091(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432183345) + "'", int1 == (-432183345));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "30) test2091(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432183345) + "'", int3 == (-432183345));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash(726732643, 950858184);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int12 = byteQuadsCanonicalizer0.tertiaryCount();
        java.lang.Class<?> wildcardClass13 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "47) test2092(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 130922 + "'", int6 == 130922);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "31) test2092(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1216904092 + "'", int10 == 1216904092);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._secondaryStart;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            byteQuadsCanonicalizer6._spilloverEnd = 1291396535;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "48) test2093(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432183323) + "'", int1 == (-432183323));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer6);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432224623));
        int int2 = byteQuadsCanonicalizer1._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild((-432231971));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0.makeChild(126233);
        java.lang.String str12 = byteQuadsCanonicalizer11.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str12, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0._count;
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._count = 726921598;
        int int12 = byteQuadsCanonicalizer0.calcHash((-937635559));
        byteQuadsCanonicalizer0._count = (-432227577);
        byteQuadsCanonicalizer0._longNameOffset = (-432212339);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "49) test2096(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 330990968 + "'", int6 == 330990968);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "32) test2096(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 774047039 + "'", int12 == 774047039);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        int int4 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.totalCount();
        int int8 = byteQuadsCanonicalizer0.calcHash((-432218033), (-432223341));
        int int12 = byteQuadsCanonicalizer0.calcHash(95133932, (-2056298817), (-960848979));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "50) test2097(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 523687637 + "'", int8 == 523687637);
// flaky "33) test2097(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-421135903) + "'", int12 == (-421135903));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._hashSize;
        int int21 = byteQuadsCanonicalizer16.calcHash((-432857889), (-432802824), (-432235691));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._hashSize;
        byteQuadsCanonicalizer22._count = (byte) 100;
        java.lang.String[] strArray26 = byteQuadsCanonicalizer22._names;
        byteQuadsCanonicalizer22._spilloverEnd = (byte) 100;
        int int29 = byteQuadsCanonicalizer22._spilloverEnd;
        int int30 = byteQuadsCanonicalizer22.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31._hashSize;
        byteQuadsCanonicalizer31._count = (byte) 100;
        java.lang.String[] strArray35 = byteQuadsCanonicalizer31._names;
        int[] intArray40 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int42 = byteQuadsCanonicalizer31.calcHash(intArray40, 4);
        java.lang.String[] strArray48 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer31._names = strArray48;
        byteQuadsCanonicalizer22._names = strArray48;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer51 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int52 = byteQuadsCanonicalizer51._hashSize;
        byteQuadsCanonicalizer51._count = (byte) 100;
        java.lang.String[] strArray55 = byteQuadsCanonicalizer51._names;
        int[] intArray60 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int62 = byteQuadsCanonicalizer51.calcHash(intArray60, 4);
        byteQuadsCanonicalizer22._hashArea = intArray60;
        byteQuadsCanonicalizer16._hashArea = intArray60;
        int int66 = byteQuadsCanonicalizer16.calcHash(11880);
        int[] intArray67 = byteQuadsCanonicalizer16._hashArea;
        byteQuadsCanonicalizer16._tertiaryStart = 13247;
        byteQuadsCanonicalizer16._hashSize = (-226516474);
        int[] intArray72 = byteQuadsCanonicalizer16._hashArea;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str74 = byteQuadsCanonicalizer14.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray72, (-209131490));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "51) test2098(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-147966372) + "'", int7 == (-147966372));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky "34) test2098(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1783316767 + "'", int21 == 1783316767);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "14) test2098(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-319721791) + "'", int42 == (-319721791));
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "8) test2098(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-319721791) + "'", int62 == (-319721791));
// flaky "5) test2098(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-433041538) + "'", int66 == (-433041538));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { (-432237577), (-432237873), 100, (-1) });
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { (-432237577), (-432237873), 100, (-1) });
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 3846;
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._longNameOffset = (-1393861803);
        java.lang.String[] strArray14 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]");
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int11 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "52) test2100(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432183215) + "'", int1 == (-432183215));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "35) test2100(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432183215) + "'", int3 == (-432183215));
// flaky "15) test2100(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726337534 + "'", int8 == 726337534);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-1776808604);
        byteQuadsCanonicalizer0._secondaryStart = (-432858399);
        int int11 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "53) test2101(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432183195) + "'", int1 == (-432183195));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray7 = byteQuadsCanonicalizer0._names;
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        int int9 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "54) test2102(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432183169) + "'", int6 == (-432183169));
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        byteQuadsCanonicalizer11._count = (byte) 100;
        java.lang.String[] strArray15 = byteQuadsCanonicalizer11._names;
        int[] intArray20 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int22 = byteQuadsCanonicalizer11.calcHash(intArray20, 4);
        byteQuadsCanonicalizer9._hashArea = intArray20;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-631239760, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "55) test2103(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432183143) + "'", int1 == (-432183143));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "36) test2103(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432183143) + "'", int3 == (-432183143));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "16) test2103(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1102767296 + "'", int22 == 1102767296);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._tertiaryStart = 601297471;
        int int16 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean17 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "56) test2104(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-919520467) + "'", int11 == (-919520467));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        int int18 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._count = (-846225059);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "57) test2105(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1125181372) + "'", int11 == (-1125181372));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky "37) test2105(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-432183117) + "'", int15 == (-432183117));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash(726732643, 950858184);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int12 = byteQuadsCanonicalizer0.secondaryCount();
        int int13 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "58) test2106(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 126990 + "'", int6 == 126990);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "38) test2106(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1216877938 + "'", int10 == 1216877938);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        int int11 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "59) test2107(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 281251619 + "'", int6 == 281251619);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        int int15 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) '4');
        byteQuadsCanonicalizer1._tertiaryShift = 726745252;
        byteQuadsCanonicalizer1._tertiaryShift = (-433031352);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        boolean boolean27 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "60) test2110(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432182991) + "'", int1 == (-432182991));
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
// flaky "39) test2110(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1666393973 + "'", int18 == 1666393973);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        java.lang.Class<?> wildcardClass56 = byteQuadsCanonicalizer0.getClass();
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
// flaky "61) test2111(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 724790334 + "'", int39 == 724790334);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "62) test2112(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432182953) + "'", int1 == (-432182953));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "40) test2112(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432182953) + "'", int3 == (-432182953));
// flaky "17) test2112(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726335248 + "'", int8 == 726335248);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-282253155));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 608397355 out of bounds for length 4");
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
// flaky "63) test2113(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-591184148) + "'", int12 == (-591184148));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "41) test2113(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1999085614) + "'", int29 == (-1999085614));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        int int7 = byteQuadsCanonicalizer0._longNameOffset;
        int int9 = byteQuadsCanonicalizer0.calcHash(585128182);
        byteQuadsCanonicalizer0._hashSize = 0;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "64) test2114(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-992887883) + "'", int9 == (-992887883));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._spilloverEnd = (-432230449);
        int int9 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._count = (-231018909);
        int int13 = byteQuadsCanonicalizer0.calcHash((-432218697));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
// flaky "65) test2115(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 111652 + "'", int13 == 111652);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432204463));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(585130666);
        int int2 = byteQuadsCanonicalizer1._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        int int5 = byteQuadsCanonicalizer0._count;
        int int6 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._longNameOffset = (-1953084381);
        boolean boolean9 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryStart = (-1070321381);
        byteQuadsCanonicalizer0._secondaryStart = (-584220967);
        byteQuadsCanonicalizer0._tertiaryShift = 2083148869;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int3 = byteQuadsCanonicalizer1._hashSize;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer1._names;
        byteQuadsCanonicalizer1._count = 726387322;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "66) test2121(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 702769950 + "'", int6 == 702769950);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str9, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        java.lang.String str9 = byteQuadsCanonicalizer6.findName((-432232965), (-432235911));
        java.lang.String str14 = byteQuadsCanonicalizer6.addName("", 726477763, (-432198359), (-906078756));
        int int15 = byteQuadsCanonicalizer6.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean5 = byteQuadsCanonicalizer0.maybeDirty();
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "67) test2124(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433048664) + "'", int5 == (-433048664));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._secondaryStart = (-432235313);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer1.makeChild((-432811187));
        byteQuadsCanonicalizer1._spilloverEnd = (-432211535);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        int int13 = byteQuadsCanonicalizer11._spilloverEnd;
        int int14 = byteQuadsCanonicalizer11.primaryCount();
        int int15 = byteQuadsCanonicalizer11._longNameOffset;
        int int16 = byteQuadsCanonicalizer11._tertiaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17._hashSize;
        int int19 = byteQuadsCanonicalizer17._spilloverEnd;
        int int20 = byteQuadsCanonicalizer17._tertiaryShift;
        int int24 = byteQuadsCanonicalizer17.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer17._reportTooManyCollisions();
        int int26 = byteQuadsCanonicalizer17.hashSeed();
        int int27 = byteQuadsCanonicalizer17.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer29 = byteQuadsCanonicalizer17.makeChild((-432230027));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int[] intArray32 = byteQuadsCanonicalizer31._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer33 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int34 = byteQuadsCanonicalizer33._hashSize;
        byteQuadsCanonicalizer33._count = (byte) 100;
        java.lang.String[] strArray37 = byteQuadsCanonicalizer33._names;
        int[] intArray42 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int44 = byteQuadsCanonicalizer33.calcHash(intArray42, 4);
        byteQuadsCanonicalizer33._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer47 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int48 = byteQuadsCanonicalizer47._hashSize;
        byteQuadsCanonicalizer47._count = (byte) 100;
        java.lang.String[] strArray51 = byteQuadsCanonicalizer47._names;
        int[] intArray56 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int58 = byteQuadsCanonicalizer47.calcHash(intArray56, 4);
        byteQuadsCanonicalizer33._hashArea = intArray56;
        byteQuadsCanonicalizer31._hashArea = intArray56;
        java.lang.String str62 = byteQuadsCanonicalizer29.findName(intArray56, (-432226507));
        byteQuadsCanonicalizer11._hashArea = intArray56;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", intArray56, (-432202147));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "68) test2125(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-952017420) + "'", int24 == (-952017420));
// flaky "42) test2125(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-432182753) + "'", int26 == (-432182753));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer29);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
        org.junit.Assert.assertNull(intArray32);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "18) test2125(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1255434318 + "'", int44 == 1255434318);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "9) test2125(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1255434318 + "'", int58 == 1255434318);
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "69) test2126(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-512936955) + "'", int11 == (-512936955));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6.hashSeed();
        int int8 = byteQuadsCanonicalizer6._longNameOffset;
        int int9 = byteQuadsCanonicalizer6.hashSeed();
        byteQuadsCanonicalizer6._longNameOffset = (short) 10;
        int int14 = byteQuadsCanonicalizer6.calcHash((int) '#', (int) (short) 10);
        int int15 = byteQuadsCanonicalizer6._longNameOffset;
        int int16 = byteQuadsCanonicalizer6._tertiaryShift;
        java.lang.String str17 = byteQuadsCanonicalizer6.toString();
        byteQuadsCanonicalizer6._tertiaryStart = (-432228391);
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
        byteQuadsCanonicalizer6._names = strArray46;
        byteQuadsCanonicalizer0._names = strArray46;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "70) test2127(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432182671) + "'", int4 == (-432182671));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
// flaky "43) test2127(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-432182671) + "'", int7 == (-432182671));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "19) test2127(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432182671) + "'", int9 == (-432182671));
// flaky "10) test2127(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 726357676 + "'", int14 == 726357676);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str17, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
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
// flaky "6) test2127(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-513276935) + "'", int40 == (-513276935));
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._hashSize = (-432231821);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0.makeChild((-432210017));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer0.makeChild((-1262086));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._longNameOffset = (-1901767430);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        byteQuadsCanonicalizer0._secondaryStart = (-432208479);
        int int61 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "71) test2131(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 662468913 + "'", int6 == 662468913);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "44) test2131(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1675945638 + "'", int14 == 1675945638);
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
// flaky "20) test2131(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1378624955) + "'", int35 == (-1378624955));
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "11) test2131(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1378624955) + "'", int55 == (-1378624955));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._count = 595210654;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer0.makeChild((-432229659));
        boolean boolean8 = byteQuadsCanonicalizer7._intern;
        boolean boolean9 = byteQuadsCanonicalizer7._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "72) test2132(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432182603) + "'", int1 == (-432182603));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._longNameOffset = (-432225113);
        int[] intArray11 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "73) test2133(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 638363909 + "'", int6 == 638363909);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0._count;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int9 = byteQuadsCanonicalizer0.calcHash(1122192358, 726576799);
        boolean boolean10 = byteQuadsCanonicalizer0._failOnDoS;
        int int11 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "74) test2134(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-922299830) + "'", int9 == (-922299830));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        byteQuadsCanonicalizer0._spilloverEnd = (-432858953);
        int int10 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0.release();
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int15 = byteQuadsCanonicalizer14.hashSeed();
        int int19 = byteQuadsCanonicalizer14.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean20 = byteQuadsCanonicalizer14.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = byteQuadsCanonicalizer14._parent;
        int int22 = byteQuadsCanonicalizer14._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        byteQuadsCanonicalizer23._count = (byte) 100;
        java.lang.String[] strArray27 = byteQuadsCanonicalizer23._names;
        byteQuadsCanonicalizer23._spilloverEnd = (byte) 100;
        int int30 = byteQuadsCanonicalizer23._spilloverEnd;
        int int31 = byteQuadsCanonicalizer23.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer32 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int33 = byteQuadsCanonicalizer32._hashSize;
        byteQuadsCanonicalizer32._count = (byte) 100;
        java.lang.String[] strArray36 = byteQuadsCanonicalizer32._names;
        int[] intArray41 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int43 = byteQuadsCanonicalizer32.calcHash(intArray41, 4);
        java.lang.String[] strArray49 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer32._names = strArray49;
        byteQuadsCanonicalizer23._names = strArray49;
        java.lang.String[] strArray52 = new java.lang.String[] {};
        byteQuadsCanonicalizer23._names = strArray52;
        byteQuadsCanonicalizer14._names = strArray52;
        java.lang.String[] strArray55 = byteQuadsCanonicalizer14._names;
        byteQuadsCanonicalizer0._names = strArray55;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "75) test2135(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432182573) + "'", int12 == (-432182573));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1797043 + "'", int19 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "45) test2135(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-398623127) + "'", int43 == (-398623127));
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] {});
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-1776808604);
        byteQuadsCanonicalizer0._secondaryStart = (-432858399);
        int int11 = byteQuadsCanonicalizer0._tertiaryStart;
        boolean boolean12 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "76) test2136(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432182515) + "'", int1 == (-432182515));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1548189191));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = byteQuadsCanonicalizer1._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer2);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "77) test2138(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-257592618) + "'", int4 == (-257592618));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(111461789);
        byteQuadsCanonicalizer1._secondaryStart = (-432217417);
        int int4 = byteQuadsCanonicalizer1.tertiaryCount();
        int int6 = byteQuadsCanonicalizer1.calcHash((-816093618));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-905130540) + "'", int6 == (-905130540));
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        int int33 = byteQuadsCanonicalizer1._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "78) test2140(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 832835033 + "'", int14 == 832835033);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "46) test2140(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 832835033 + "'", int28 == 832835033);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash((-432233131), (-432807676), (-1654346617));
        byteQuadsCanonicalizer1._tertiaryStart = (-231018909);
        java.lang.String[] strArray9 = byteQuadsCanonicalizer1._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-41777064) + "'", int6 == (-41777064));
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int[] intArray6 = byteQuadsCanonicalizer4._hashArea;
        java.lang.String str11 = byteQuadsCanonicalizer4.addName("", (-861626282), (-432229659), 1763641886);
        byteQuadsCanonicalizer4.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "79) test2142(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432182383) + "'", int1 == (-432182383));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String[] strArray3 = byteQuadsCanonicalizer0._names;
        int int4 = byteQuadsCanonicalizer0._spilloverEnd;
        int int5 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (-432235313);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = byteQuadsCanonicalizer8._spilloverEnd;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432812775));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int8 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild((int) (byte) 0);
        int int11 = byteQuadsCanonicalizer10.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        byteQuadsCanonicalizer0._longNameOffset = 2104532546;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "80) test2147(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 942074797 + "'", int6 == 942074797);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "47) test2147(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1333624859) + "'", int16 == (-1333624859));
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int6 = byteQuadsCanonicalizer0.size();
        int int7 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean9 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "81) test2148(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432182279) + "'", int1 == (-432182279));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = byteQuadsCanonicalizer8._names;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "82) test2149(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1894582375 + "'", int6 == 1894582375);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int int5 = byteQuadsCanonicalizer0._tertiaryShift;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7._hashSize;
        int int9 = byteQuadsCanonicalizer7._spilloverEnd;
        int int10 = byteQuadsCanonicalizer7._longNameOffset;
        byteQuadsCanonicalizer7._count = ' ';
        byteQuadsCanonicalizer7._secondaryStart = (-432237891);
        byteQuadsCanonicalizer7._spilloverEnd = (-432858953);
        int int17 = byteQuadsCanonicalizer7._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        byteQuadsCanonicalizer18._count = (byte) 100;
        int int23 = byteQuadsCanonicalizer18.calcHash((int) (short) 1);
        int int24 = byteQuadsCanonicalizer18.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = byteQuadsCanonicalizer18._parent;
        int int26 = byteQuadsCanonicalizer18.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int[] intArray29 = byteQuadsCanonicalizer28._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int31 = byteQuadsCanonicalizer30._hashSize;
        byteQuadsCanonicalizer30._count = (byte) 100;
        java.lang.String[] strArray34 = byteQuadsCanonicalizer30._names;
        int[] intArray39 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int41 = byteQuadsCanonicalizer30.calcHash(intArray39, 4);
        byteQuadsCanonicalizer30._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer44 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int45 = byteQuadsCanonicalizer44._hashSize;
        byteQuadsCanonicalizer44._count = (byte) 100;
        java.lang.String[] strArray48 = byteQuadsCanonicalizer44._names;
        int[] intArray53 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int55 = byteQuadsCanonicalizer44.calcHash(intArray53, 4);
        byteQuadsCanonicalizer30._hashArea = intArray53;
        byteQuadsCanonicalizer28._hashArea = intArray53;
        byteQuadsCanonicalizer18._hashArea = intArray53;
        byteQuadsCanonicalizer7._hashArea = intArray53;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-631239760, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray53, (-2057176286));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky "83) test2150(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-433049210) + "'", int23 == (-433049210));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "48) test2150(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 826344861 + "'", int41 == 826344861);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "21) test2150(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 826344861 + "'", int55 == 826344861);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        byteQuadsCanonicalizer1._hashSize = (-86011045);
        int int4 = byteQuadsCanonicalizer1.size();
        boolean boolean5 = byteQuadsCanonicalizer1._failOnDoS;
        byteQuadsCanonicalizer1.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7.hashSeed();
        int int9 = byteQuadsCanonicalizer7._longNameOffset;
        int int10 = byteQuadsCanonicalizer7._secondaryStart;
        int int11 = byteQuadsCanonicalizer7.totalCount();
        int int12 = byteQuadsCanonicalizer7.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432223521));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer16._hashSize = (short) 10;
        int int19 = byteQuadsCanonicalizer16._hashSize;
        byteQuadsCanonicalizer16._hashSize = 1797043;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._hashSize;
        byteQuadsCanonicalizer22._count = (byte) 100;
        java.lang.String[] strArray26 = byteQuadsCanonicalizer22._names;
        byteQuadsCanonicalizer22._spilloverEnd = (byte) 100;
        int int29 = byteQuadsCanonicalizer22._spilloverEnd;
        int int30 = byteQuadsCanonicalizer22.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31._hashSize;
        byteQuadsCanonicalizer31._count = (byte) 100;
        java.lang.String[] strArray35 = byteQuadsCanonicalizer31._names;
        int[] intArray40 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int42 = byteQuadsCanonicalizer31.calcHash(intArray40, 4);
        java.lang.String[] strArray48 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer31._names = strArray48;
        byteQuadsCanonicalizer22._names = strArray48;
        java.lang.String[] strArray51 = new java.lang.String[] {};
        byteQuadsCanonicalizer22._names = strArray51;
        byteQuadsCanonicalizer16._names = strArray51;
        byteQuadsCanonicalizer14._names = strArray51;
        byteQuadsCanonicalizer7._names = strArray51;
        byteQuadsCanonicalizer1._names = strArray51;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
// flaky "84) test2151(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432182219) + "'", int8 == (-432182219));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "49) test2151(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-448724998) + "'", int42 == (-448724998));
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] {});
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryShift = (-1404148093);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        byteQuadsCanonicalizer0._count = (-432217179);
        byteQuadsCanonicalizer0._spilloverEnd = (-41777064);
        int int56 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "85) test2153(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2004301194) + "'", int5 == (-2004301194));
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
// flaky "50) test2153(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1807427760) + "'", int26 == (-1807427760));
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "22) test2153(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1807427760) + "'", int46 == (-1807427760));
// flaky "12) test2153(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-433042692) + "'", int50 == (-433042692));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-432237577), (-432237873), 100, (-1) });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-41777064) + "'", int56 == (-41777064));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryStart = (-1070321381);
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        int int43 = byteQuadsCanonicalizer0._secondaryStart;
        int int46 = byteQuadsCanonicalizer0.calcHash((-2034335588), 529072413);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "86) test2155(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432182105) + "'", int9 == (-432182105));
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
// flaky "51) test2155(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-247390733) + "'", int32 == (-247390733));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
// flaky "23) test2155(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 713389745 + "'", int46 == 713389745);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        byteQuadsCanonicalizer0._count = (-432217179);
        int int54 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "87) test2156(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2000951316) + "'", int5 == (-2000951316));
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
// flaky "52) test2156(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1856898168) + "'", int26 == (-1856898168));
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "24) test2156(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1856898168) + "'", int46 == (-1856898168));
// flaky "13) test2156(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-433042698) + "'", int50 == (-433042698));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-432237577), (-432237873), 100, (-1) });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        int int23 = byteQuadsCanonicalizer0._secondaryStart;
        int int24 = byteQuadsCanonicalizer0._longNameOffset;
        int int25 = byteQuadsCanonicalizer0.primaryCount();
        int int26 = byteQuadsCanonicalizer0.secondaryCount();
        int int27 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "88) test2157(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1442260563 + "'", int11 == 1442260563);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        byteQuadsCanonicalizer0._longNameOffset = 46902629;
        byteQuadsCanonicalizer0._spilloverEnd = (-432212895);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "89) test2158(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1914619475) + "'", int4 == (-1914619475));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._secondaryStart;
        int int8 = byteQuadsCanonicalizer0.primaryCount();
        int int9 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "90) test2159(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432182029) + "'", int1 == (-432182029));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "53) test2159(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432182029) + "'", int3 == (-432182029));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._intern = false;
        int int9 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-433051067);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.calcHash((int) 'a');
        int int8 = byteQuadsCanonicalizer0.totalCount();
        int int10 = byteQuadsCanonicalizer0.calcHash((-432214643));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "91) test2162(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-433049498) + "'", int7 == (-433049498));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "54) test2162(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 98483 + "'", int10 == 98483);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432221335));
        byteQuadsCanonicalizer1._tertiaryShift = (-1860651042);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        int int9 = byteQuadsCanonicalizer0.calcHash((-1725608836));
        int int10 = byteQuadsCanonicalizer0._longNameOffset;
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
        java.lang.String[] strArray12 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "92) test2164(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181953) + "'", int1 == (-432181953));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "55) test2164(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432181953) + "'", int3 == (-432181953));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "25) test2164(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2132758993 + "'", int9 == 2132758993);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0.release();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "93) test2165(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432181943) + "'", int9 == (-432181943));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._secondaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0.makeChild(2104532546);
        java.lang.String str8 = byteQuadsCanonicalizer5.findName(736114656, (-432191583));
        int int9 = byteQuadsCanonicalizer5.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "94) test2166(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181913) + "'", int1 == (-432181913));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0._count;
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._count = 726921598;
        int int13 = byteQuadsCanonicalizer0.calcHash((-432196427), (-432229085));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "95) test2167(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 204477394 + "'", int6 == 204477394);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "56) test2167(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 486944030 + "'", int13 == 486944030);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        byteQuadsCanonicalizer0._intern = false;
        byteQuadsCanonicalizer0._secondaryStart = 0;
        java.lang.String[] strArray24 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "96) test2168(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 202509014 + "'", int6 == 202509014);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "57) test2168(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 800670085 + "'", int15 == 800670085);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strArray24);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-432232221));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "97) test2169(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181855) + "'", int1 == (-432181855));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        int int5 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-432232707));
        int[] intArray15 = new int[] { (-432224835), 585076000, (-432228709), (-432820704), 1487490903, (-432230311) };
        byteQuadsCanonicalizer0._hashArea = intArray15;
        boolean boolean17 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "98) test2171(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 128382 + "'", int6 == 128382);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432224835), 585076000, (-432228709), (-432820704), 1487490903, (-432230311) });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._intern = false;
        int int10 = byteQuadsCanonicalizer0._hashSize;
        int[] intArray11 = null;
        byteQuadsCanonicalizer0._hashArea = intArray11;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int[] intArray6 = byteQuadsCanonicalizer4._hashArea;
        java.lang.String str10 = byteQuadsCanonicalizer4.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1011195396), 2073961006);
        boolean boolean11 = byteQuadsCanonicalizer4._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "99) test2173(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181789) + "'", int1 == (-432181789));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str10, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int11 = byteQuadsCanonicalizer1.calcHash((-790193954), (-432802824));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer1.makeChild((-432231575));
        int int14 = byteQuadsCanonicalizer1._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1373664638 + "'", int11 == 1373664638);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer37 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int38 = byteQuadsCanonicalizer37.secondaryCount();
        int int39 = byteQuadsCanonicalizer37.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer40 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int44 = byteQuadsCanonicalizer40.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer40._hashSize = (-432857107);
        int int47 = byteQuadsCanonicalizer40._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer48 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int49 = byteQuadsCanonicalizer48.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer50 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int51 = byteQuadsCanonicalizer50._hashSize;
        byteQuadsCanonicalizer50._count = (byte) 100;
        java.lang.String[] strArray54 = byteQuadsCanonicalizer50._names;
        int[] intArray59 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int61 = byteQuadsCanonicalizer50.calcHash(intArray59, 4);
        byteQuadsCanonicalizer48._hashArea = intArray59;
        byteQuadsCanonicalizer40._hashArea = intArray59;
        byteQuadsCanonicalizer37._hashArea = intArray59;
        int[] intArray67 = new int[] { (-432232857), (-432216899) };
        byteQuadsCanonicalizer37._hashArea = intArray67;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = byteQuadsCanonicalizer1.addName("", intArray67, (-1445499331));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "100) test2175(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-675038209) + "'", int14 == (-675038209));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "58) test2175(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-675038209) + "'", int28 == (-675038209));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1133109320 + "'", int34 == 1133109320);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer40);
// flaky "26) test2175(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-2053248549) + "'", int44 == (-2053248549));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(strArray54);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "14) test2175(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-675038209) + "'", int61 == (-675038209));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { (-432232857), (-432216899) });
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1574754311));
        int[] intArray2 = byteQuadsCanonicalizer1._hashArea;
        byteQuadsCanonicalizer1._intern = true;
        int int5 = byteQuadsCanonicalizer1._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._count = 0;
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        byteQuadsCanonicalizer0._secondaryStart = (-580650583);
        int int7 = byteQuadsCanonicalizer0.totalCount();
        int[] intArray8 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "101) test2178(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181693) + "'", int1 == (-432181693));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._tertiaryShift = 622936314;
        java.lang.String str11 = byteQuadsCanonicalizer3.findName(797443144);
        int int13 = byteQuadsCanonicalizer3.calcHash((-432232669));
        int int14 = byteQuadsCanonicalizer3._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1031526 + "'", int13 == 1031526);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "102) test2180(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181671) + "'", int1 == (-432181671));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "59) test2180(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432181671) + "'", int3 == (-432181671));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        int int7 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "103) test2181(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181659) + "'", int1 == (-432181659));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int3 = byteQuadsCanonicalizer1.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        int int9 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "104) test2183(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 14992400 + "'", int6 == 14992400);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13.hashSeed();
        int int15 = byteQuadsCanonicalizer13._longNameOffset;
        int int16 = byteQuadsCanonicalizer13.totalCount();
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
        java.lang.String[] strArray46 = new java.lang.String[] {};
        byteQuadsCanonicalizer17._names = strArray46;
        byteQuadsCanonicalizer13._names = strArray46;
        byteQuadsCanonicalizer0._names = strArray46;
        int int50 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "105) test2184(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181625) + "'", int1 == (-432181625));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
// flaky "60) test2184(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-432181625) + "'", int14 == (-432181625));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
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
// flaky "27) test2184(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1973268022 + "'", int37 == 1973268022);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] {});
// flaky "15) test2184(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-432181625) + "'", int50 == (-432181625));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        int[] intArray25 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "106) test2185(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181611) + "'", int1 == (-432181611));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "61) test2185(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432181611) + "'", int3 == (-432181611));
// flaky "28) test2185(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726355462 + "'", int8 == 726355462);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str16, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
        org.junit.Assert.assertNull(byteQuadsCanonicalizer26);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-2066636029);
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        int int12 = byteQuadsCanonicalizer0.calcHash(40688251, (-432219739));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]" + "'", str9, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]");
// flaky "107) test2186(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-333812640) + "'", int12 == (-333812640));
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild(0);
        byteQuadsCanonicalizer8.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        boolean boolean2 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._secondaryStart;
        int int4 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._spilloverEnd = (-461401283);
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "108) test2189(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181547) + "'", int1 == (-432181547));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int[] intArray6 = byteQuadsCanonicalizer4._hashArea;
        int int7 = byteQuadsCanonicalizer4.secondaryCount();
        byteQuadsCanonicalizer4._spilloverEnd = (-432808935);
        java.lang.String str12 = byteQuadsCanonicalizer4.findName((-432812218), (-906590991));
        int int13 = byteQuadsCanonicalizer4.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "109) test2190(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181537) + "'", int1 == (-432181537));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        int int4 = byteQuadsCanonicalizer0._count;
        int int5 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        int int8 = byteQuadsCanonicalizer6._spilloverEnd;
        int int9 = byteQuadsCanonicalizer6._longNameOffset;
        byteQuadsCanonicalizer6._count = ' ';
        int int12 = byteQuadsCanonicalizer6.spilloverCount();
        int int13 = byteQuadsCanonicalizer6._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = byteQuadsCanonicalizer6.makeChild(726927673);
        int[] intArray16 = byteQuadsCanonicalizer15._hashArea;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = byteQuadsCanonicalizer0.calcHash(intArray16, (-1729911473));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "110) test2191(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181515) + "'", int1 == (-432181515));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(29365);
        boolean boolean10 = byteQuadsCanonicalizer9._failOnDoS;
        java.lang.String str14 = byteQuadsCanonicalizer9.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 0, (-442190801));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "111) test2192(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 128946 + "'", int6 == 128946);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str14, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int14 = byteQuadsCanonicalizer0._count;
        int[] intArray15 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = byteQuadsCanonicalizer0.makeChild(1755629980);
        int[] intArray18 = byteQuadsCanonicalizer17._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "112) test2193(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1910401380 + "'", int11 == 1910401380);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash((-432233131), (-432807676), (-1654346617));
        int int7 = byteQuadsCanonicalizer1._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8._hashSize;
        int int10 = byteQuadsCanonicalizer8._spilloverEnd;
        int int11 = byteQuadsCanonicalizer8._longNameOffset;
        byteQuadsCanonicalizer8._count = ' ';
        int int14 = byteQuadsCanonicalizer8._count;
        int int15 = byteQuadsCanonicalizer8.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432804524));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432223521));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer21._hashSize = (short) 10;
        int int24 = byteQuadsCanonicalizer21._hashSize;
        byteQuadsCanonicalizer21._hashSize = 1797043;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27._hashSize;
        byteQuadsCanonicalizer27._count = (byte) 100;
        java.lang.String[] strArray31 = byteQuadsCanonicalizer27._names;
        byteQuadsCanonicalizer27._spilloverEnd = (byte) 100;
        int int34 = byteQuadsCanonicalizer27._spilloverEnd;
        int int35 = byteQuadsCanonicalizer27.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer36 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int37 = byteQuadsCanonicalizer36._hashSize;
        byteQuadsCanonicalizer36._count = (byte) 100;
        java.lang.String[] strArray40 = byteQuadsCanonicalizer36._names;
        int[] intArray45 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int47 = byteQuadsCanonicalizer36.calcHash(intArray45, 4);
        java.lang.String[] strArray53 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer36._names = strArray53;
        byteQuadsCanonicalizer27._names = strArray53;
        java.lang.String[] strArray56 = new java.lang.String[] {};
        byteQuadsCanonicalizer27._names = strArray56;
        byteQuadsCanonicalizer21._names = strArray56;
        byteQuadsCanonicalizer19._names = strArray56;
        byteQuadsCanonicalizer17._names = strArray56;
        byteQuadsCanonicalizer8._names = strArray56;
        byteQuadsCanonicalizer1._names = strArray56;
        byteQuadsCanonicalizer1._longNameOffset = (-432225413);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-41777064) + "'", int6 == (-41777064));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(strArray40);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "113) test2194(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-724046823) + "'", int47 == (-724046823));
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] {});
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._intern = true;
        int int7 = byteQuadsCanonicalizer3.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-432858451) + "'", int7 == (-432858451));
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1._longNameOffset = (-432215695);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-1157391731));
        java.lang.String str12 = byteQuadsCanonicalizer8.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-432192377), (-432228433));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "114) test2197(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 128970 + "'", int6 == 128970);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]" + "'", str12, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        int int6 = byteQuadsCanonicalizer0.calcHash(595350631, (-849195324));
        int int7 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "115) test2198(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181373) + "'", int1 == (-432181373));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "62) test2198(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1632473030 + "'", int6 == 1632473030);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857889);
        int int12 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryStart = (-1945450874);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = byteQuadsCanonicalizer0.makeChild((-2066636029));
        byteQuadsCanonicalizer0._tertiaryShift = (-432201839);
        int int19 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "116) test2199(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181361) + "'", int1 == (-432181361));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "63) test2199(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432181361) + "'", int3 == (-432181361));
// flaky "29) test2199(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726348478 + "'", int8 == 726348478);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        byteQuadsCanonicalizer0._spilloverEnd = (-915584381);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "117) test2200(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1087710068 + "'", int11 == 1087710068);
// flaky "64) test2200(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-432181325) + "'", int14 == (-432181325));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
            java.lang.String str36 = byteQuadsCanonicalizer0.findName((-750886006));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -738180037 out of bounds for length 4");
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
// flaky "118) test2201(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1724170853) + "'", int12 == (-1724170853));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "65) test2201(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1834976037 + "'", int29 == 1834976037);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._tertiaryShift = 726740410;
        int int10 = byteQuadsCanonicalizer0._count;
        int int11 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "119) test2202(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433048086) + "'", int5 == (-433048086));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0.release();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean10 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "120) test2203(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432181269) + "'", int9 == (-432181269));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        int int4 = byteQuadsCanonicalizer1.totalCount();
        int int5 = byteQuadsCanonicalizer1.tertiaryCount();
        int int6 = byteQuadsCanonicalizer1.tertiaryCount();
        int int7 = byteQuadsCanonicalizer1._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8.hashSeed();
        java.lang.String[] strArray10 = byteQuadsCanonicalizer8._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer8.makeChild(1081706716);
        int int13 = byteQuadsCanonicalizer12.primaryCount();
        int int14 = byteQuadsCanonicalizer12._tertiaryShift;
        int int15 = byteQuadsCanonicalizer12.primaryCount();
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        byteQuadsCanonicalizer1._names = strArray16;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "121) test2204(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432181259) + "'", int9 == (-432181259));
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._count = (-432230825);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._tertiaryStart = 821504543;
        java.lang.String[] strArray10 = null;
        byteQuadsCanonicalizer0._names = strArray10;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "122) test2205(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181247) + "'", int1 == (-432181247));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        byteQuadsCanonicalizer0._tertiaryStart = (-432214531);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "123) test2206(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432181231) + "'", int4 == (-432181231));
// flaky "66) test2206(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850664090 + "'", int7 == 850664090);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = byteQuadsCanonicalizer0.makeChild((-432205553));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "124) test2207(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 167202530 + "'", int11 == 167202530);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky "67) test2207(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-432181217) + "'", int20 == (-432181217));
// flaky "30) test2207(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-282229631) + "'", int22 == (-282229631));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0.makeChild((-432232557));
        java.lang.String str15 = byteQuadsCanonicalizer11.addName("hi!", 726804292, (-432231187));
        boolean boolean16 = byteQuadsCanonicalizer11._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int7 = byteQuadsCanonicalizer0.calcHash((-432234053), (-432217951), (-432224225));
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str2, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "125) test2209(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-99755398) + "'", int7 == (-99755398));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        int[] intArray9 = byteQuadsCanonicalizer0._hashArea;
        int int13 = byteQuadsCanonicalizer0.calcHash((-432202987), (-1413688396), 1246348846);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "126) test2210(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1640465673 + "'", int6 == 1640465673);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(intArray9);
// flaky "68) test2210(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-219148501) + "'", int13 == (-219148501));
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        byteQuadsCanonicalizer0._intern = false;
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "127) test2211(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 446445380 + "'", int11 == 446445380);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky "69) test2211(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-432181153) + "'", int15 == (-432181153));
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        int int14 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "128) test2212(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-847457213) + "'", int13 == (-847457213));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(726927673);
        int int10 = byteQuadsCanonicalizer0.size();
        int int11 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = 726703924;
        int int14 = byteQuadsCanonicalizer0.calcHash(25, (-432218191), (-432213691));
        int[] intArray15 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "129) test2214(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 258150435 + "'", int7 == 258150435);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "70) test2214(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-679169492) + "'", int14 == (-679169492));
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726691972);
        int int2 = byteQuadsCanonicalizer1.spilloverCount();
        int int6 = byteQuadsCanonicalizer1.calcHash((-432197103), (-432200967), (-432223041));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 257470996 + "'", int6 == 257470996);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
        int[] intArray17 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "130) test2216(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1780460008 + "'", int6 == 1780460008);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
// flaky "71) test2216(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1007516286) + "'", int15 == (-1007516286));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432206987));
        int int2 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        byteQuadsCanonicalizer0._longNameOffset = (-561835032);
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "131) test2218(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584740255 + "'", int10 == 584740255);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = 1791970984;
        boolean boolean9 = byteQuadsCanonicalizer0._intern;
        java.lang.Class<?> wildcardClass10 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._longNameOffset = 926034734;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean17 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = byteQuadsCanonicalizer0.makeChild((-432226435));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "132) test2220(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 766913615 + "'", int11 == 766913615);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        byteQuadsCanonicalizer0._tertiaryStart = (-585511819);
        boolean boolean18 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "133) test2221(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584739337 + "'", int10 == 584739337);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int[] intArray9 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._hashSize = (-2128033203);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "134) test2222(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1707258002 + "'", int6 == 1707258002);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 726920401;
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0.makeChild(1754387191);
        int int12 = byteQuadsCanonicalizer11._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-198368878) + "'", int8 == (-198368878));
// flaky "135) test2223(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432181021) + "'", int9 == (-432181021));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int11 = byteQuadsCanonicalizer0.calcHash(119736, (-432220679));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "136) test2224(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432181011) + "'", int1 == (-432181011));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "72) test2224(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-903138420) + "'", int11 == (-903138420));
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-33593767));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int int9 = byteQuadsCanonicalizer0.primaryCount();
        int int12 = byteQuadsCanonicalizer0.calcHash(1616355694, 0);
        int int16 = byteQuadsCanonicalizer0.calcHash((-432200199), (-1632569954), 1982178110);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "137) test2226(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4889981) + "'", int12 == (-4889981));
// flaky "73) test2226(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 38325492 + "'", int16 == 38325492);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.totalCount();
        int int10 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._count = 726926494;
        int int13 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "138) test2228(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180961) + "'", int1 == (-432180961));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "74) test2228(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432180961) + "'", int3 == (-432180961));
// flaky "31) test2228(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726356461 + "'", int8 == 726356461);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1346240492);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "139) test2230(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180901) + "'", int1 == (-432180901));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "75) test2230(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432180901) + "'", int3 == (-432180901));
// flaky "32) test2230(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726354868 + "'", int8 == 726354868);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int15 = byteQuadsCanonicalizer14.hashSeed();
        int int19 = byteQuadsCanonicalizer14.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean20 = byteQuadsCanonicalizer14.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = byteQuadsCanonicalizer14._parent;
        int int24 = byteQuadsCanonicalizer14.calcHash((-790193954), (-432802824));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = byteQuadsCanonicalizer14.makeChild((-432231575));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27._hashSize;
        int int29 = byteQuadsCanonicalizer27._spilloverEnd;
        int int30 = byteQuadsCanonicalizer27._tertiaryShift;
        int int34 = byteQuadsCanonicalizer27.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer27._reportTooManyCollisions();
        int int36 = byteQuadsCanonicalizer27.hashSeed();
        int int37 = byteQuadsCanonicalizer27.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer39 = byteQuadsCanonicalizer27.makeChild((-432230027));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer41 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int[] intArray42 = byteQuadsCanonicalizer41._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer43 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int44 = byteQuadsCanonicalizer43._hashSize;
        byteQuadsCanonicalizer43._count = (byte) 100;
        java.lang.String[] strArray47 = byteQuadsCanonicalizer43._names;
        int[] intArray52 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int54 = byteQuadsCanonicalizer43.calcHash(intArray52, 4);
        byteQuadsCanonicalizer43._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer57 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int58 = byteQuadsCanonicalizer57._hashSize;
        byteQuadsCanonicalizer57._count = (byte) 100;
        java.lang.String[] strArray61 = byteQuadsCanonicalizer57._names;
        int[] intArray66 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int68 = byteQuadsCanonicalizer57.calcHash(intArray66, 4);
        byteQuadsCanonicalizer43._hashArea = intArray66;
        byteQuadsCanonicalizer41._hashArea = intArray66;
        java.lang.String str72 = byteQuadsCanonicalizer39.findName(intArray66, (-432226507));
        java.lang.String str74 = byteQuadsCanonicalizer26.findName(intArray66, (-432205465));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str76 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray66, (-1840443685));
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 181687966 + "'", int11 == 181687966);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1797043 + "'", int19 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1373664638 + "'", int24 == 1373664638);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
// flaky "140) test2231(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 521562240 + "'", int34 == 521562240);
// flaky "76) test2231(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-432180889) + "'", int36 == (-432180889));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer39);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer41);
        org.junit.Assert.assertNull(intArray42);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(strArray47);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "33) test2231(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1194649258) + "'", int54 == (-1194649258));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(strArray61);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "16) test2231(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1194649258) + "'", int68 == (-1194649258));
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryStart = (-896388567);
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        int int13 = byteQuadsCanonicalizer0.calcHash(850843766, (-432233457), (-432236463));
        int int14 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._longNameOffset = 108967;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "141) test2233(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180867) + "'", int1 == (-432180867));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "77) test2233(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432180867) + "'", int3 == (-432180867));
// flaky "34) test2233(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726355057 + "'", int8 == 726355057);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "17) test2233(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1125454671 + "'", int13 == 1125454671);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        int int74 = byteQuadsCanonicalizer0.calcHash((-432231575));
        int int77 = byteQuadsCanonicalizer0.calcHash(629702000, 648038151);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "142) test2234(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432180859) + "'", int9 == (-432180859));
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
// flaky "78) test2234(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-955270614) + "'", int32 == (-955270614));
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
// flaky "35) test2234(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-955270614) + "'", int63 == (-955270614));
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
// flaky "18) test2234(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 121584 + "'", int74 == 121584);
// flaky "7) test2234(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int77 + "' != '" + 450942704 + "'", int77 == 450942704);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        byteQuadsCanonicalizer0.release();
        int int15 = byteQuadsCanonicalizer0.hashSeed();
        int int16 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "143) test2235(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584742073 + "'", int10 == 584742073);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "79) test2235(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432180845) + "'", int12 == (-432180845));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "36) test2235(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-432180845) + "'", int15 == (-432180845));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        boolean boolean5 = byteQuadsCanonicalizer4._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "144) test2236(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180819) + "'", int1 == (-432180819));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0.calcHash(272503154, (-938993884), (-2098837397));
        int[] intArray9 = byteQuadsCanonicalizer0._hashArea;
        int int12 = byteQuadsCanonicalizer0.calcHash(135206238, 952656);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "145) test2237(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1912069272) + "'", int8 == (-1912069272));
        org.junit.Assert.assertNull(intArray9);
// flaky "80) test2237(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-363982937) + "'", int12 == (-363982937));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        int int9 = byteQuadsCanonicalizer0._hashSize;
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "146) test2238(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180783) + "'", int1 == (-432180783));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "81) test2238(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432180783) + "'", int3 == (-432180783));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._count = (-1509909397);
        byteQuadsCanonicalizer0._tertiaryStart = (-433032981);
        java.lang.Class<?> wildcardClass15 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "147) test2239(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1657338485 + "'", int6 == 1657338485);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        int int7 = byteQuadsCanonicalizer0._longNameOffset;
        int int9 = byteQuadsCanonicalizer0.calcHash(585128182);
        byteQuadsCanonicalizer0._secondaryStart = (-432219949);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "148) test2240(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-992894976) + "'", int9 == (-992894976));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-2066636029);
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._secondaryStart = 1023311;
        int int11 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-1643099997);
        byteQuadsCanonicalizer0._secondaryStart = (-432207231);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1023311 + "'", int11 == 1023311);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(726315187);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._count = (-432220375);
        byteQuadsCanonicalizer0._tertiaryStart = (-432231187);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int15 = byteQuadsCanonicalizer14.hashSeed();
        int int19 = byteQuadsCanonicalizer14.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean20 = byteQuadsCanonicalizer14.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = byteQuadsCanonicalizer14._parent;
        int int22 = byteQuadsCanonicalizer14._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        byteQuadsCanonicalizer23._count = (byte) 100;
        java.lang.String[] strArray27 = byteQuadsCanonicalizer23._names;
        byteQuadsCanonicalizer23._spilloverEnd = (byte) 100;
        int int30 = byteQuadsCanonicalizer23._spilloverEnd;
        int int31 = byteQuadsCanonicalizer23.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer32 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int33 = byteQuadsCanonicalizer32._hashSize;
        byteQuadsCanonicalizer32._count = (byte) 100;
        java.lang.String[] strArray36 = byteQuadsCanonicalizer32._names;
        int[] intArray41 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int43 = byteQuadsCanonicalizer32.calcHash(intArray41, 4);
        java.lang.String[] strArray49 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer32._names = strArray49;
        byteQuadsCanonicalizer23._names = strArray49;
        java.lang.String[] strArray52 = new java.lang.String[] {};
        byteQuadsCanonicalizer23._names = strArray52;
        byteQuadsCanonicalizer14._names = strArray52;
        byteQuadsCanonicalizer0._names = strArray52;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer57 = byteQuadsCanonicalizer0.makeChild((-1136073280));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "149) test2243(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180719) + "'", int1 == (-432180719));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "82) test2243(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432180719) + "'", int3 == (-432180719));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1797043 + "'", int19 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "37) test2243(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1289138484) + "'", int43 == (-1289138484));
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer57);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        byteQuadsCanonicalizer0._hashSize = (-2089682640);
        int int31 = byteQuadsCanonicalizer0.calcHash((-1802129393), (-1888159813));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "150) test2244(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180705) + "'", int1 == (-432180705));
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
// flaky "83) test2244(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1945069288) + "'", int18 == (-1945069288));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
// flaky "38) test2244(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-678282120) + "'", int31 == (-678282120));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        int int37 = byteQuadsCanonicalizer1.tertiaryCount();
        int int40 = byteQuadsCanonicalizer1.calcHash(926034734, 585132439);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "151) test2245(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1724262951 + "'", int19 == 1724262951);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "84) test2245(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1724262951 + "'", int33 == 1724262951);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1457039035) + "'", int40 == (-1457039035));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer0._names;
        int int15 = byteQuadsCanonicalizer0.calcHash(0, 1365014251, 770249287);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._longNameOffset;
        byteQuadsCanonicalizer16._tertiaryStart = 0;
        boolean boolean20 = byteQuadsCanonicalizer16.maybeDirty();
        byteQuadsCanonicalizer16._spilloverEnd = (-2066636029);
        int int23 = byteQuadsCanonicalizer16.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int25 = byteQuadsCanonicalizer24.hashSeed();
        int int26 = byteQuadsCanonicalizer24._longNameOffset;
        int int27 = byteQuadsCanonicalizer24.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28._hashSize;
        byteQuadsCanonicalizer28._count = (byte) 100;
        java.lang.String[] strArray32 = byteQuadsCanonicalizer28._names;
        byteQuadsCanonicalizer28._spilloverEnd = (byte) 100;
        int int35 = byteQuadsCanonicalizer28._spilloverEnd;
        int int36 = byteQuadsCanonicalizer28.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer37 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int38 = byteQuadsCanonicalizer37._hashSize;
        byteQuadsCanonicalizer37._count = (byte) 100;
        java.lang.String[] strArray41 = byteQuadsCanonicalizer37._names;
        int[] intArray46 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int48 = byteQuadsCanonicalizer37.calcHash(intArray46, 4);
        java.lang.String[] strArray54 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer37._names = strArray54;
        byteQuadsCanonicalizer28._names = strArray54;
        byteQuadsCanonicalizer24._names = strArray54;
        byteQuadsCanonicalizer16._names = strArray54;
        byteQuadsCanonicalizer0._names = strArray54;
        java.lang.String[] strArray60 = null;
        byteQuadsCanonicalizer0._names = strArray60;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "152) test2246(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180681) + "'", int1 == (-432180681));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "85) test2246(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432180681) + "'", int3 == (-432180681));
// flaky "39) test2246(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726375550 + "'", int8 == 726375550);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertNull(strArray11);
// flaky "19) test2246(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1644938145) + "'", int15 == (-1644938145));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-516659008) + "'", int23 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
// flaky "8) test2246(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-432180681) + "'", int25 == (-432180681));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "3) test2246(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-141783590) + "'", int48 == (-141783590));
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._hashSize = (-1529115260);
        byteQuadsCanonicalizer0._tertiaryShift = (-432230357);
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        int int14 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._hashSize = 27436;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "153) test2247(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1906108076 + "'", int6 == 1906108076);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._count;
        int int6 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "154) test2248(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180601) + "'", int1 == (-432180601));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        java.lang.String[] strArray5 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._intern = false;
        int int9 = byteQuadsCanonicalizer0.calcHash((-432220245));
        java.lang.String[] strArray10 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "155) test2249(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1304029771) + "'", int4 == (-1304029771));
        org.junit.Assert.assertNull(strArray5);
// flaky "86) test2249(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 107809 + "'", int9 == 107809);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0._count;
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        boolean boolean9 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._tertiaryShift = 1789329582;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432229523));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        boolean boolean14 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._tertiaryStart = 726323926;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "156) test2252(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 223882440 + "'", int11 == 223882440);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._hashSize = (-1529115260);
        byteQuadsCanonicalizer0._tertiaryShift = (-432230357);
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        int int17 = byteQuadsCanonicalizer0.calcHash((-432829064), (-861626282), (-432235003));
        byteQuadsCanonicalizer0._tertiaryShift = 1365014251;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "157) test2253(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1951389248 + "'", int6 == 1951389248);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "87) test2253(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-349006517) + "'", int17 == (-349006517));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        int int29 = byteQuadsCanonicalizer0.calcHash((-1558844040), (-1983388062));
        byteQuadsCanonicalizer0._count = (-432828641);
        java.lang.String[] strArray32 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "158) test2254(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180527) + "'", int1 == (-432180527));
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
// flaky "88) test2254(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1555748407 + "'", int18 == 1555748407);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
// flaky "40) test2254(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-907706369) + "'", int29 == (-907706369));
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int8 = byteQuadsCanonicalizer0.totalCount();
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str9, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        int int2 = byteQuadsCanonicalizer0.bucketCount();
        int int3 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        int int11 = byteQuadsCanonicalizer0.size();
        int int13 = byteQuadsCanonicalizer0.calcHash((-1689370643));
        int int14 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "159) test2257(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1973147189 + "'", int6 == 1973147189);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "89) test2257(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2104761673 + "'", int13 == 2104761673);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        int int4 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "160) test2258(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180487) + "'", int1 == (-432180487));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._spilloverEnd = (-432228893);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer9._secondaryStart = 0;
        int int12 = byteQuadsCanonicalizer9._tertiaryShift;
        byteQuadsCanonicalizer9._tertiaryStart = (-1701677292);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer15.calcHash((-432238239), (-432238045), (int) ' ');
        java.lang.String[] strArray20 = byteQuadsCanonicalizer15._names;
        byteQuadsCanonicalizer15._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int26 = byteQuadsCanonicalizer25._hashSize;
        byteQuadsCanonicalizer25._count = (byte) 100;
        java.lang.String[] strArray29 = byteQuadsCanonicalizer25._names;
        int[] intArray34 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int36 = byteQuadsCanonicalizer25.calcHash(intArray34, 4);
        byteQuadsCanonicalizer23._hashArea = intArray34;
        byteQuadsCanonicalizer15._hashArea = intArray34;
        byteQuadsCanonicalizer9._hashArea = intArray34;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = byteQuadsCanonicalizer0.calcHash(intArray34, (-432223235));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
// flaky "161) test2259(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1518771774) + "'", int19 == (-1518771774));
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "90) test2259(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2112040484) + "'", int36 == (-2112040484));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        int[] intArray9 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._intern = false;
        int int12 = byteQuadsCanonicalizer0.spilloverCount();
        int int13 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "162) test2260(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 167558807 + "'", int6 == 167558807);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        byteQuadsCanonicalizer1._spilloverEnd = 851025305;
        byteQuadsCanonicalizer1._hashSize = 1608546598;
        int int8 = byteQuadsCanonicalizer1.totalCount();
        int int9 = byteQuadsCanonicalizer1.secondaryCount();
        int int10 = byteQuadsCanonicalizer1.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = (-432235817);
        int int7 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int int6 = byteQuadsCanonicalizer4._tertiaryShift;
        byteQuadsCanonicalizer4._secondaryStart = (-432857889);
        byteQuadsCanonicalizer4._count = (-432234429);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        int int14 = byteQuadsCanonicalizer12._spilloverEnd;
        int int15 = byteQuadsCanonicalizer12._longNameOffset;
        int int16 = byteQuadsCanonicalizer12.hashSeed();
        int int19 = byteQuadsCanonicalizer12.calcHash((-1776808604), (int) (short) 100);
        int int20 = byteQuadsCanonicalizer12._spilloverEnd;
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
        byteQuadsCanonicalizer12._hashArea = intArray36;
        byteQuadsCanonicalizer12._longNameOffset = (-1001525864);
        int int43 = byteQuadsCanonicalizer12._tertiaryStart;
        int int44 = byteQuadsCanonicalizer12.bucketCount();
        int[] intArray45 = byteQuadsCanonicalizer12._hashArea;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = byteQuadsCanonicalizer4.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", intArray45, (-50559261));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "163) test2263(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180411) + "'", int1 == (-432180411));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky "91) test2263(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-432180411) + "'", int16 == (-432180411));
// flaky "41) test2263(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 850666097 + "'", int19 == 850666097);
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
// flaky "20) test2263(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1433884827) + "'", int38 == (-1433884827));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-432237577), (-432237873), 100, (-1) });
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        int int9 = byteQuadsCanonicalizer0._hashSize;
        int int10 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "164) test2264(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 193605965 + "'", int6 == 193605965);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "92) test2264(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432180399) + "'", int10 == (-432180399));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        int int12 = byteQuadsCanonicalizer0.totalCount();
        int int13 = byteQuadsCanonicalizer0._secondaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int16 = byteQuadsCanonicalizer15.hashSeed();
        int int20 = byteQuadsCanonicalizer15.calcHash(0, (int) 'a', (int) (short) 100);
        int int21 = byteQuadsCanonicalizer15.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._hashSize;
        int int24 = byteQuadsCanonicalizer22._spilloverEnd;
        int int25 = byteQuadsCanonicalizer22._hashSize;
        byteQuadsCanonicalizer22._tertiaryShift = (-432857136);
        byteQuadsCanonicalizer22._reportTooManyCollisions();
        boolean boolean29 = byteQuadsCanonicalizer22._failOnDoS;
        int int30 = byteQuadsCanonicalizer22.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31.hashSeed();
        int int33 = byteQuadsCanonicalizer31._longNameOffset;
        int int34 = byteQuadsCanonicalizer31._longNameOffset;
        boolean boolean35 = byteQuadsCanonicalizer31._intern;
        int int36 = byteQuadsCanonicalizer31._secondaryStart;
        int int37 = byteQuadsCanonicalizer31._secondaryStart;
        int int38 = byteQuadsCanonicalizer31._tertiaryShift;
        byteQuadsCanonicalizer31.release();
        int int40 = byteQuadsCanonicalizer31._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer41 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int42 = byteQuadsCanonicalizer41._hashSize;
        byteQuadsCanonicalizer41._count = (byte) 100;
        java.lang.String[] strArray45 = byteQuadsCanonicalizer41._names;
        java.lang.String str46 = byteQuadsCanonicalizer41.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer47 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int48 = byteQuadsCanonicalizer47._hashSize;
        byteQuadsCanonicalizer47._count = (byte) 100;
        java.lang.String[] strArray51 = byteQuadsCanonicalizer47._names;
        int[] intArray56 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int58 = byteQuadsCanonicalizer47.calcHash(intArray56, 4);
        byteQuadsCanonicalizer41._hashArea = intArray56;
        byteQuadsCanonicalizer31._hashArea = intArray56;
        byteQuadsCanonicalizer22._hashArea = intArray56;
        byteQuadsCanonicalizer15._hashArea = intArray56;
        byteQuadsCanonicalizer0._hashArea = intArray56;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "165) test2265(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-433046926) + "'", int11 == (-433046926));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1797043 + "'", int20 == 1797043);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
// flaky "93) test2265(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-432180389) + "'", int32 == (-432180389));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(strArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str46, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "42) test2265(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-995605260) + "'", int58 == (-995605260));
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        int int2 = byteQuadsCanonicalizer1.tertiaryCount();
        int int3 = byteQuadsCanonicalizer1._hashSize;
        boolean boolean4 = byteQuadsCanonicalizer1._intern;
        int int5 = byteQuadsCanonicalizer1.spilloverCount();
        byteQuadsCanonicalizer1._count = 1430851400;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int[] intArray2 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int6 = byteQuadsCanonicalizer5._hashSize;
        int int7 = byteQuadsCanonicalizer5._spilloverEnd;
        int int11 = byteQuadsCanonicalizer5.calcHash((-86011045), 0, 10);
        int int12 = byteQuadsCanonicalizer5.bucketCount();
        int int13 = byteQuadsCanonicalizer5.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        int int19 = byteQuadsCanonicalizer14.calcHash((-432857889), (-432802824), (-432235691));
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
        byteQuadsCanonicalizer14._hashArea = intArray58;
        byteQuadsCanonicalizer5._hashArea = intArray58;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = byteQuadsCanonicalizer3.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", intArray58, 2121761092);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "166) test2267(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 146519874 + "'", int11 == 146519874);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky "94) test2267(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1820207042) + "'", int19 == (-1820207042));
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
// flaky "43) test2267(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1927402901 + "'", int40 == 1927402901);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "21) test2267(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1927402901 + "'", int60 == 1927402901);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        int int16 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "167) test2268(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 348473829 + "'", int7 == 348473829);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "95) test2268(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432180351) + "'", int9 == (-432180351));
// flaky "44) test2268(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 600992137 + "'", int14 == 600992137);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        int int7 = byteQuadsCanonicalizer1.calcHash(586081183, (-432230393), 726700144);
        int int8 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2127311314 + "'", int7 == 2127311314);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432200215));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235137));
        byteQuadsCanonicalizer1._hashSize = 1;
        int[] intArray4 = byteQuadsCanonicalizer1._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray4);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.totalCount();
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "168) test2272(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180299) + "'", int1 == (-432180299));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "96) test2272(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432180299) + "'", int3 == (-432180299));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-432221335);
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0.size();
        int int11 = byteQuadsCanonicalizer0._tertiaryShift;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "169) test2273(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1486232316) + "'", int4 == (-1486232316));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "97) test2273(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432180287) + "'", int9 == (-432180287));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "45) test2273(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432180287) + "'", int12 == (-432180287));
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._count = 770249287;
        int[] intArray5 = byteQuadsCanonicalizer0._hashArea;
        int int8 = byteQuadsCanonicalizer0.calcHash((-432220067), (-791207515));
        byteQuadsCanonicalizer0._hashSize = (-432202063);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertNull(intArray5);
// flaky "170) test2274(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-214509536) + "'", int8 == (-214509536));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432225203));
        byteQuadsCanonicalizer1._hashSize = (-2111376560);
        byteQuadsCanonicalizer1.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int3 = byteQuadsCanonicalizer1.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1644487950));
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer3);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._tertiaryShift = 622936314;
        java.lang.String str13 = byteQuadsCanonicalizer3.addName("", 585184567, (int) '#');
        byteQuadsCanonicalizer3._count = 561343593;
        int int16 = byteQuadsCanonicalizer3._tertiaryShift;
        byteQuadsCanonicalizer3._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 622936314 + "'", int16 == 622936314);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0.hashSeed();
        int int6 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "171) test2279(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432180177) + "'", int5 == (-432180177));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._tertiaryShift = (-432802830);
        byteQuadsCanonicalizer0.release();
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._tertiaryShift = 595546127;
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "172) test2280(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180157) + "'", int1 == (-432180157));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "98) test2280(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432180157) + "'", int3 == (-432180157));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int[] intArray6 = byteQuadsCanonicalizer4._hashArea;
        int int7 = byteQuadsCanonicalizer4.secondaryCount();
        byteQuadsCanonicalizer4._spilloverEnd = (-432808935);
        int int10 = byteQuadsCanonicalizer4.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "173) test2281(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432180133) + "'", int1 == (-432180133));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        byteQuadsCanonicalizer0._secondaryStart = (-269666549);
        byteQuadsCanonicalizer0._longNameOffset = (-934010218);
        int int17 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "174) test2282(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1147187185 + "'", int6 == 1147187185);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int int2 = byteQuadsCanonicalizer1.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer1.makeChild((-432215719));
        int int5 = byteQuadsCanonicalizer1._tertiaryShift;
        int int6 = byteQuadsCanonicalizer1.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(889899169);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1097223542);
        int int2 = byteQuadsCanonicalizer1._secondaryStart;
        int int3 = byteQuadsCanonicalizer1._hashSize;
        int int7 = byteQuadsCanonicalizer1.calcHash(122778, 272630271, 726409813);
        int int8 = byteQuadsCanonicalizer1.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 764785959 + "'", int7 == 764785959);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._intern = true;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer3._parent;
        int int8 = byteQuadsCanonicalizer3._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        java.lang.Class<?> wildcardClass16 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "175) test2288(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433047308) + "'", int5 == (-433047308));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "99) test2288(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432180011) + "'", int10 == (-432180011));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int4 = byteQuadsCanonicalizer3.size();
        int int7 = byteQuadsCanonicalizer3.calcHash((-432807290), 1794842379);
        byteQuadsCanonicalizer3._hashSize = (-432233335);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer3._parent;
        int int13 = byteQuadsCanonicalizer10.calcHash((-432813498), (-432236017));
        int int14 = byteQuadsCanonicalizer10._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-202237041) + "'", int7 == (-202237041));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 491099564 + "'", int13 == 491099564);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._longNameOffset = (-693285981);
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._hashSize = 970405743;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "176) test2290(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432179993) + "'", int1 == (-432179993));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-1577129675));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857889);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._count = (byte) 100;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        int[] intArray21 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int23 = byteQuadsCanonicalizer12.calcHash(intArray21, 4);
        java.lang.String[] strArray29 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer12._names = strArray29;
        byteQuadsCanonicalizer0._names = strArray29;
        int[] intArray32 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._count = 726793717;
        int int35 = byteQuadsCanonicalizer0.hashSeed();
        int[] intArray36 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "177) test2292(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432179973) + "'", int1 == (-432179973));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "100) test2292(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432179973) + "'", int3 == (-432179973));
// flaky "46) test2292(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726381022 + "'", int8 == 726381022);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "22) test2292(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1848116053) + "'", int23 == (-1848116053));
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNull(intArray32);
// flaky "9) test2292(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-432179973) + "'", int35 == (-432179973));
        org.junit.Assert.assertNull(intArray36);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int8 = byteQuadsCanonicalizer0.calcHash((-432228293));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        java.lang.String[] strArray13 = byteQuadsCanonicalizer9._names;
        byteQuadsCanonicalizer9._spilloverEnd = (byte) 100;
        int int16 = byteQuadsCanonicalizer9._spilloverEnd;
        int int17 = byteQuadsCanonicalizer9.secondaryCount();
        java.lang.String[] strArray18 = byteQuadsCanonicalizer9._names;
        int int20 = byteQuadsCanonicalizer9.calcHash((int) (byte) 1);
        boolean boolean21 = byteQuadsCanonicalizer9._intern;
        byteQuadsCanonicalizer9.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = byteQuadsCanonicalizer9.makeChild(722552620);
        java.lang.String str25 = byteQuadsCanonicalizer24.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int27 = byteQuadsCanonicalizer26.hashSeed();
        int int28 = byteQuadsCanonicalizer26._longNameOffset;
        int int29 = byteQuadsCanonicalizer26.hashSeed();
        byteQuadsCanonicalizer26._longNameOffset = (short) 10;
        int int34 = byteQuadsCanonicalizer26.calcHash((int) '#', (int) (short) 10);
        int int35 = byteQuadsCanonicalizer26._secondaryStart;
        byteQuadsCanonicalizer26._tertiaryShift = (-432857889);
        boolean boolean38 = byteQuadsCanonicalizer26.maybeDirty();
        int int39 = byteQuadsCanonicalizer26._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer40 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int41 = byteQuadsCanonicalizer40._hashSize;
        java.lang.String str42 = byteQuadsCanonicalizer40.toString();
        int[] intArray47 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer40._hashArea = intArray47;
        byteQuadsCanonicalizer26._hashArea = intArray47;
        byteQuadsCanonicalizer24._hashArea = intArray47;
        byteQuadsCanonicalizer0._hashArea = intArray47;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "178) test2293(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433047386) + "'", int5 == (-433047386));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "101) test2293(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 118049 + "'", int8 == 118049);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strArray18);
// flaky "47) test2293(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-433047386) + "'", int20 == (-433047386));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str25, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
// flaky "23) test2293(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-432179961) + "'", int27 == (-432179961));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky "10) test2293(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-432179961) + "'", int29 == (-432179961));
// flaky "4) test2293(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 726382453 + "'", int34 == 726382453);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str42, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        int int12 = byteQuadsCanonicalizer0.totalCount();
        java.lang.String str13 = byteQuadsCanonicalizer0.toString();
        java.lang.String str14 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "179) test2294(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-433047382) + "'", int11 == (-433047382));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]" + "'", str13, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]" + "'", str14, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0.makeChild((-432230027));
        boolean boolean13 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-432231723);
        int int17 = byteQuadsCanonicalizer0.calcHash((-432213769));
        int int18 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "180) test2295(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-13183798) + "'", int7 == (-13183798));
// flaky "102) test2295(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432179909) + "'", int9 == (-432179909));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "48) test2295(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99797 + "'", int17 == 99797);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        int int5 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        int int7 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._count = (-432217611);
        int int10 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._tertiaryShift = 622936314;
        java.lang.String str12 = byteQuadsCanonicalizer3.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432213711));
        int int13 = byteQuadsCanonicalizer3._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str12, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._count = (-847585761);
        byteQuadsCanonicalizer0._longNameOffset = (-432212789);
        int int9 = byteQuadsCanonicalizer0.calcHash((-1079613540), (-107463259));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "181) test2298(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1518817950 + "'", int9 == 1518817950);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432223147));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        java.lang.String str4 = byteQuadsCanonicalizer1.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._secondaryStart = (-432235313);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer1.makeChild((-432811187));
        boolean boolean8 = byteQuadsCanonicalizer1._intern;
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) '4');
        byteQuadsCanonicalizer1._tertiaryShift = (-432236143);
        int int4 = byteQuadsCanonicalizer1.size();
        byteQuadsCanonicalizer1._secondaryStart = (-222775371);
        byteQuadsCanonicalizer1._hashSize = 2075315505;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int int2 = byteQuadsCanonicalizer1._spilloverEnd;
        int int3 = byteQuadsCanonicalizer1._secondaryStart;
        int[] intArray4 = byteQuadsCanonicalizer1._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray4);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
        int int20 = byteQuadsCanonicalizer0._tertiaryShift;
        int int21 = byteQuadsCanonicalizer0.hashSeed();
        int int22 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = 269845336;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "182) test2304(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584695129 + "'", int10 == 584695129);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "103) test2304(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432179763) + "'", int12 == (-432179763));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "49) test2304(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-432179763) + "'", int21 == (-432179763));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-432230027) + "'", int22 == (-432230027));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._tertiaryShift = 622936314;
        java.lang.String str11 = byteQuadsCanonicalizer3.findName(797443144);
        int int13 = byteQuadsCanonicalizer3.calcHash((-432232669));
        int int14 = byteQuadsCanonicalizer3._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15._hashSize;
        byteQuadsCanonicalizer15._count = (byte) 100;
        int int20 = byteQuadsCanonicalizer15.calcHash((int) (short) 1);
        int int21 = byteQuadsCanonicalizer15.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22.secondaryCount();
        int int24 = byteQuadsCanonicalizer22.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int26 = byteQuadsCanonicalizer25._hashSize;
        int int27 = byteQuadsCanonicalizer25._spilloverEnd;
        java.lang.String[] strArray28 = byteQuadsCanonicalizer25._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer29 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int30 = byteQuadsCanonicalizer29.hashSeed();
        int int31 = byteQuadsCanonicalizer29._longNameOffset;
        int int32 = byteQuadsCanonicalizer29.hashSeed();
        byteQuadsCanonicalizer29._longNameOffset = (short) 10;
        int int37 = byteQuadsCanonicalizer29.calcHash((int) '#', (int) (short) 10);
        int int38 = byteQuadsCanonicalizer29._secondaryStart;
        byteQuadsCanonicalizer29._tertiaryShift = (-432857889);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer41 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int42 = byteQuadsCanonicalizer41._hashSize;
        byteQuadsCanonicalizer41._count = (byte) 100;
        java.lang.String[] strArray45 = byteQuadsCanonicalizer41._names;
        int[] intArray50 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int52 = byteQuadsCanonicalizer41.calcHash(intArray50, 4);
        java.lang.String[] strArray58 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer41._names = strArray58;
        byteQuadsCanonicalizer29._names = strArray58;
        byteQuadsCanonicalizer25._names = strArray58;
        byteQuadsCanonicalizer22._names = strArray58;
        byteQuadsCanonicalizer15._names = strArray58;
        byteQuadsCanonicalizer3._names = strArray58;
        int int65 = byteQuadsCanonicalizer3.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1031526 + "'", int13 == 1031526);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky "183) test2305(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-433045520) + "'", int20 == (-433045520));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer29);
// flaky "104) test2305(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-432179751) + "'", int30 == (-432179751));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
// flaky "50) test2305(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-432179751) + "'", int32 == (-432179751));
// flaky "24) test2305(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 726383182 + "'", int37 == 726383182);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(strArray45);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "11) test2305(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-376843777) + "'", int52 == (-376843777));
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._count;
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        int int5 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "184) test2306(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432179737) + "'", int5 == (-432179737));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        int int13 = byteQuadsCanonicalizer0.calcHash((-432236497), 1278604715);
        int int14 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "185) test2307(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432179725) + "'", int1 == (-432179725));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "105) test2307(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 785029560 + "'", int13 == 785029560);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-752838103));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1.release();
        int int9 = byteQuadsCanonicalizer1.spilloverCount();
        int int10 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        byteQuadsCanonicalizer0._longNameOffset = (-1001525864);
        int int31 = byteQuadsCanonicalizer0._tertiaryStart;
        int int32 = byteQuadsCanonicalizer0.bucketCount();
        int[] intArray33 = byteQuadsCanonicalizer0._hashArea;
        int int34 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "186) test2310(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432179653) + "'", int4 == (-432179653));
// flaky "106) test2310(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850651346 + "'", int7 == 850651346);
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
// flaky "51) test2310(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 382921342 + "'", int26 == 382921342);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-432237577), (-432237873), 100, (-1) });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-849338229));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        int[] intArray7 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer0._hashArea = intArray7;
        int int9 = byteQuadsCanonicalizer0.size();
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._secondaryStart = (-432190385);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str2, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int[] intArray5 = byteQuadsCanonicalizer0._hashArea;
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "187) test2313(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-433045595) + "'", int3 == (-433045595));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray5);
// flaky "107) test2313(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432179609) + "'", int6 == (-432179609));
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726691972);
        int int2 = byteQuadsCanonicalizer1.spilloverCount();
        int int4 = byteQuadsCanonicalizer1.calcHash((-432824146));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-848802876) + "'", int4 == (-848802876));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int11 = byteQuadsCanonicalizer1.calcHash((-790193954), (-432802824));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer1.makeChild((-432231575));
        boolean boolean14 = byteQuadsCanonicalizer1.maybeDirty();
        int int15 = byteQuadsCanonicalizer1._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1373664638 + "'", int11 == 1373664638);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432192555));
        byteQuadsCanonicalizer1._count = 420594097;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = 27137223;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        int int13 = byteQuadsCanonicalizer0.calcHash((-432191903));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "188) test2317(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1528016303 + "'", int6 == 1528016303);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "108) test2317(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12537 + "'", int13 == 12537);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857889);
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._tertiaryStart = (-432226833);
        int int18 = byteQuadsCanonicalizer0.calcHash(770249287, (-432811767));
        int int20 = byteQuadsCanonicalizer0.calcHash((-1191014489));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "189) test2318(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432179545) + "'", int1 == (-432179545));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "109) test2318(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432179545) + "'", int3 == (-432179545));
// flaky "52) test2318(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726375199 + "'", int8 == 726375199);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "25) test2318(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 974735344 + "'", int18 == 974735344);
// flaky "12) test2318(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1598401594 + "'", int20 == 1598401594);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        boolean boolean17 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryShift = 1237269611;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "190) test2319(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584683807 + "'", int10 == 584683807);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726927871);
        int int2 = byteQuadsCanonicalizer1.totalCount();
        int int3 = byteQuadsCanonicalizer1._count;
        boolean boolean4 = byteQuadsCanonicalizer1._intern;
        int int5 = byteQuadsCanonicalizer1._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
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
        byteQuadsCanonicalizer1.release();
        java.lang.String str32 = byteQuadsCanonicalizer1.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "191) test2321(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1623628089) + "'", int14 == (-1623628089));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "110) test2321(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1623628089) + "'", int28 == (-1623628089));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str32, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._tertiaryShift = (-432182341);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._tertiaryStart = 850806038;
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0._count;
        int int8 = byteQuadsCanonicalizer0._tertiaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._longNameOffset;
        byteQuadsCanonicalizer9._tertiaryStart = 0;
        int int13 = byteQuadsCanonicalizer9._tertiaryShift;
        int int15 = byteQuadsCanonicalizer9.calcHash((-432236371));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = byteQuadsCanonicalizer9.makeChild((-432232707));
        int[] intArray24 = new int[] { (-432224835), 585076000, (-432228709), (-432820704), 1487490903, (-432230311) };
        byteQuadsCanonicalizer9._hashArea = intArray24;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = byteQuadsCanonicalizer0.calcHash(intArray24, (-432200495));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "192) test2323(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432179415) + "'", int6 == (-432179415));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 850806038 + "'", int8 == 850806038);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "111) test2323(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 126875 + "'", int15 == 126875);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-432224835), 585076000, (-432228709), (-432820704), 1487490903, (-432230311) });
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int9 = byteQuadsCanonicalizer1._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        byteQuadsCanonicalizer10._count = (byte) 100;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer10._names;
        byteQuadsCanonicalizer10._spilloverEnd = (byte) 100;
        int int17 = byteQuadsCanonicalizer10._spilloverEnd;
        int int18 = byteQuadsCanonicalizer10.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        byteQuadsCanonicalizer19._count = (byte) 100;
        java.lang.String[] strArray23 = byteQuadsCanonicalizer19._names;
        int[] intArray28 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int30 = byteQuadsCanonicalizer19.calcHash(intArray28, 4);
        java.lang.String[] strArray36 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer19._names = strArray36;
        byteQuadsCanonicalizer10._names = strArray36;
        java.lang.String[] strArray39 = new java.lang.String[] {};
        byteQuadsCanonicalizer10._names = strArray39;
        byteQuadsCanonicalizer1._names = strArray39;
        int[] intArray42 = byteQuadsCanonicalizer1._hashArea;
        int int43 = byteQuadsCanonicalizer1._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "193) test2324(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1415793754) + "'", int30 == (-1415793754));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertNull(intArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int int10 = byteQuadsCanonicalizer0.size();
        int int11 = byteQuadsCanonicalizer0._tertiaryStart;
        int int12 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean13 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._tertiaryShift = 622936314;
        java.lang.String str13 = byteQuadsCanonicalizer3.addName("", 585184567, (int) '#');
        boolean boolean14 = byteQuadsCanonicalizer3._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        boolean boolean24 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._count = 584683807;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "194) test2327(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432179333) + "'", int1 == (-432179333));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "112) test2327(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432179333) + "'", int3 == (-432179333));
// flaky "53) test2327(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726369862 + "'", int8 == 726369862);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str16, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-849191551));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        int int4 = byteQuadsCanonicalizer3.tertiaryCount();
        int int5 = byteQuadsCanonicalizer3._hashSize;
        boolean boolean6 = byteQuadsCanonicalizer3._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432223521));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer10._hashSize = (short) 10;
        int int13 = byteQuadsCanonicalizer10._hashSize;
        byteQuadsCanonicalizer10._hashSize = 1797043;
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
        java.lang.String[] strArray45 = new java.lang.String[] {};
        byteQuadsCanonicalizer16._names = strArray45;
        byteQuadsCanonicalizer10._names = strArray45;
        byteQuadsCanonicalizer8._names = strArray45;
        byteQuadsCanonicalizer3._names = strArray45;
        int int50 = byteQuadsCanonicalizer3.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer52 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int[] intArray53 = byteQuadsCanonicalizer52._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer54 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int55 = byteQuadsCanonicalizer54._hashSize;
        byteQuadsCanonicalizer54._count = (byte) 100;
        java.lang.String[] strArray58 = byteQuadsCanonicalizer54._names;
        int[] intArray63 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int65 = byteQuadsCanonicalizer54.calcHash(intArray63, 4);
        byteQuadsCanonicalizer54._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer68 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int69 = byteQuadsCanonicalizer68._hashSize;
        byteQuadsCanonicalizer68._count = (byte) 100;
        java.lang.String[] strArray72 = byteQuadsCanonicalizer68._names;
        int[] intArray77 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int79 = byteQuadsCanonicalizer68.calcHash(intArray77, 4);
        byteQuadsCanonicalizer54._hashArea = intArray77;
        byteQuadsCanonicalizer52._hashArea = intArray77;
        byteQuadsCanonicalizer3._hashArea = intArray77;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str84 = byteQuadsCanonicalizer1.findName(intArray77, 726542509);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
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
// flaky "195) test2328(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1568783585) + "'", int36 == (-1568783585));
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer52);
        org.junit.Assert.assertNull(intArray53);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(strArray58);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "113) test2328(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1568783585) + "'", int65 == (-1568783585));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(strArray72);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "54) test2328(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1568783585) + "'", int79 == (-1568783585));
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._hashSize = 585058621;
        int int13 = byteQuadsCanonicalizer0.calcHash(0, (-432192289), (-432224053));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "196) test2329(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 699362422 + "'", int13 == 699362422);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0._longNameOffset;
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "197) test2330(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432179299) + "'", int1 == (-432179299));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "114) test2330(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432179299) + "'", int6 == (-432179299));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int10 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._count = 0;
        java.lang.String str10 = byteQuadsCanonicalizer0.toString();
        int int13 = byteQuadsCanonicalizer0.calcHash((-209828172), (-432224737));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str10, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "198) test2332(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1610141896 + "'", int13 == 1610141896);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        int int13 = byteQuadsCanonicalizer0.calcHash((-2146533989), (-432204377));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "199) test2333(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1348118008 + "'", int6 == 1348118008);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(intArray10);
// flaky "115) test2333(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-382568212) + "'", int13 == (-382568212));
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        java.lang.String[] strArray7 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._secondaryStart = (-432196087);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        int int6 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        int int7 = byteQuadsCanonicalizer0.calcHash((-432232075), (-432210793));
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "200) test2336(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432179231) + "'", int1 == (-432179231));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "116) test2336(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 518206061 + "'", int7 == 518206061);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._count = (-432230825);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-432823208));
        int int9 = byteQuadsCanonicalizer8._tertiaryShift;
        byteQuadsCanonicalizer8._intern = true;
        java.lang.String str15 = byteQuadsCanonicalizer8.findName((-2031079620), 726375550, (-432196669));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "201) test2337(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432179221) + "'", int1 == (-432179221));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        byteQuadsCanonicalizer1._hashSize = (-86011045);
        boolean boolean4 = byteQuadsCanonicalizer1._failOnDoS;
        int int5 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1._spilloverEnd = (-432221905);
        int int8 = byteQuadsCanonicalizer1.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        byteQuadsCanonicalizer0.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._hashSize;
        byteQuadsCanonicalizer16._count = (byte) 100;
        java.lang.String[] strArray20 = byteQuadsCanonicalizer16._names;
        java.lang.String str21 = byteQuadsCanonicalizer16.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._hashSize;
        byteQuadsCanonicalizer22._count = (byte) 100;
        java.lang.String[] strArray26 = byteQuadsCanonicalizer22._names;
        int[] intArray31 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int33 = byteQuadsCanonicalizer22.calcHash(intArray31, 4);
        byteQuadsCanonicalizer16._hashArea = intArray31;
        int int35 = byteQuadsCanonicalizer16._secondaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer36 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int37 = byteQuadsCanonicalizer36._hashSize;
        byteQuadsCanonicalizer36._count = (byte) 100;
        java.lang.String[] strArray40 = byteQuadsCanonicalizer36._names;
        int[] intArray45 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int47 = byteQuadsCanonicalizer36.calcHash(intArray45, 4);
        boolean boolean48 = byteQuadsCanonicalizer36._failOnDoS;
        int int49 = byteQuadsCanonicalizer36.primaryCount();
        int int50 = byteQuadsCanonicalizer36.secondaryCount();
        int int51 = byteQuadsCanonicalizer36._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer52 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int53 = byteQuadsCanonicalizer52._hashSize;
        byteQuadsCanonicalizer52._count = (byte) 100;
        java.lang.String[] strArray56 = byteQuadsCanonicalizer52._names;
        int[] intArray61 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int63 = byteQuadsCanonicalizer52.calcHash(intArray61, 4);
        java.lang.String[] strArray69 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer52._names = strArray69;
        byteQuadsCanonicalizer36._names = strArray69;
        byteQuadsCanonicalizer16._names = strArray69;
        byteQuadsCanonicalizer0._names = strArray69;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "202) test2339(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584721688 + "'", int10 == 584721688);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "117) test2339(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432179199) + "'", int12 == (-432179199));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str21, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "55) test2339(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1193776650 + "'", int33 == 1193776650);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(strArray40);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "26) test2339(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1193776650 + "'", int47 == 1193776650);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(strArray56);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "13) test2339(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1193776650 + "'", int63 == 1193776650);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int int6 = byteQuadsCanonicalizer4._tertiaryShift;
        int int7 = byteQuadsCanonicalizer4.primaryCount();
        int[] intArray8 = byteQuadsCanonicalizer4._hashArea;
        byteQuadsCanonicalizer4._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "203) test2340(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432179183) + "'", int1 == (-432179183));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        byteQuadsCanonicalizer0._spilloverEnd = (-432216941);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "204) test2341(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584721958 + "'", int10 == 584721958);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "118) test2341(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432179163) + "'", int12 == (-432179163));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        boolean boolean3 = byteQuadsCanonicalizer1._intern;
        byteQuadsCanonicalizer1._intern = false;
        byteQuadsCanonicalizer1._spilloverEnd = 850855124;
        int[] intArray8 = byteQuadsCanonicalizer1._hashArea;
        byteQuadsCanonicalizer1._count = (-685125017);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._longNameOffset = (-704654910);
        int int7 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        int int20 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray21 = byteQuadsCanonicalizer0._names;
        int int24 = byteQuadsCanonicalizer0.calcHash((-12896225), (-432200103));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "205) test2344(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-710367023) + "'", int17 == (-710367023));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky "119) test2344(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-432179131) + "'", int20 == (-432179131));
        org.junit.Assert.assertNull(strArray21);
// flaky "56) test2344(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-855114042) + "'", int24 == (-855114042));
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        java.lang.String str20 = byteQuadsCanonicalizer18.toString();
        byteQuadsCanonicalizer18._tertiaryShift = 850855124;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        byteQuadsCanonicalizer23._count = (byte) 100;
        java.lang.String[] strArray27 = byteQuadsCanonicalizer23._names;
        int[] intArray32 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int34 = byteQuadsCanonicalizer23.calcHash(intArray32, 4);
        byteQuadsCanonicalizer18._hashArea = intArray32;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = byteQuadsCanonicalizer0.findName(intArray32, 323240946);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "206) test2345(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-811487471) + "'", int11 == (-811487471));
// flaky "120) test2345(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1122178754 + "'", int15 == 1122178754);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str20, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "57) test2345(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-811487471) + "'", int34 == (-811487471));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        int int4 = byteQuadsCanonicalizer0._spilloverEnd;
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        int[] intArray7 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer0._hashArea = intArray7;
        int int10 = byteQuadsCanonicalizer0.calcHash(258150435);
        int int11 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str2, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
// flaky "207) test2347(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-380517281) + "'", int10 == (-380517281));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-1913936922));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1596861526);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer3._hashSize;
        int int5 = byteQuadsCanonicalizer3._spilloverEnd;
        int int6 = byteQuadsCanonicalizer3._longNameOffset;
        byteQuadsCanonicalizer3._count = ' ';
        byteQuadsCanonicalizer3._secondaryStart = (-432237891);
        int int13 = byteQuadsCanonicalizer3.calcHash((-432238147), 1973355417);
        boolean boolean14 = byteQuadsCanonicalizer3._failOnDoS;
        int int15 = byteQuadsCanonicalizer3.hashSeed();
        byteQuadsCanonicalizer3._tertiaryStart = (-432230027);
        byteQuadsCanonicalizer3._longNameOffset = 1072045803;
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int22 = byteQuadsCanonicalizer21.hashSeed();
        java.lang.String[] strArray23 = byteQuadsCanonicalizer21._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = byteQuadsCanonicalizer21.makeChild(1081706716);
        int int26 = byteQuadsCanonicalizer25.primaryCount();
        int[] intArray27 = byteQuadsCanonicalizer25._hashArea;
        byteQuadsCanonicalizer3._hashArea = intArray27;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray27, (-432196163));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "208) test2349(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 584722822 + "'", int13 == 584722822);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "121) test2349(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-432179069) + "'", int15 == (-432179069));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
// flaky "58) test2349(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-432179069) + "'", int22 == (-432179069));
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        int int10 = byteQuadsCanonicalizer0._longNameOffset;
        int int11 = byteQuadsCanonicalizer0._secondaryStart;
        int int12 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "209) test2350(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432179057) + "'", int1 == (-432179057));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "122) test2350(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432179057) + "'", int3 == (-432179057));
// flaky "59) test2350(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726251278 + "'", int8 == 726251278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        int int43 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "210) test2351(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432179013) + "'", int9 == (-432179013));
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
// flaky "123) test2351(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1620810378) + "'", int32 == (-1620810378));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-1157391731));
        boolean boolean9 = byteQuadsCanonicalizer8.maybeDirty();
        byteQuadsCanonicalizer8._tertiaryStart = 1091455544;
        byteQuadsCanonicalizer8._hashSize = (-432218051);
        byteQuadsCanonicalizer8._count = (-432212789);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "211) test2352(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 122967 + "'", int6 == 122967);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        int int19 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "212) test2353(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1356406662) + "'", int6 == (-1356406662));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "124) test2353(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2049729789) + "'", int16 == (-2049729789));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        boolean boolean11 = byteQuadsCanonicalizer0.maybeDirty();
        int int12 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "213) test2354(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1319418767 + "'", int7 == 1319418767);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "125) test2354(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432178947) + "'", int9 == (-432178947));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432180601));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
        byteQuadsCanonicalizer0.release();
        int int18 = byteQuadsCanonicalizer0.calcHash((-432221541), (-432235003), (-432819147));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "214) test2356(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584723659 + "'", int10 == 584723659);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "126) test2356(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432178923) + "'", int12 == (-432178923));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "60) test2356(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-334154648) + "'", int18 == (-334154648));
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        boolean boolean14 = byteQuadsCanonicalizer0._failOnDoS;
        int int15 = byteQuadsCanonicalizer0._tertiaryShift;
        int int16 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "215) test2357(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1797269670 + "'", int11 == 1797269670);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        int int38 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "216) test2358(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432178901) + "'", int1 == (-432178901));
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
// flaky "127) test2358(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1428301602 + "'", int24 == 1428301602);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }
}
