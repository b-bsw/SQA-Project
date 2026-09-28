package com.fasterxml.jackson.core.sym;

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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName(100);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer0.findName((int) (byte) -1, (-1));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.addName("", (-432237673), 585037975);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("hi!", (int) (short) 1, (-432237873), (-432857107));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName((int) (short) 100, (-432236413), (int) (byte) 100);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432858451));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 10, (-432237891));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName(726927871, 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432858561));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 726927871, (int) (short) -1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(0, (-432236371));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        int[] intArray15 = new int[] { (-432236371), (-847585761), (-432237873), 'a', 169947244 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName(intArray15, (-432236017));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("", (-543627745), 1263391974, (-432235911));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._count;
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("hi!", 1263391974, (-432857889));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432807676), (-432807676));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("hi!", (-432237151), (-432235137), (-432237037));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432235313));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        int[] intArray12 = new int[] { 726923506, (-432235179), 584990608, (-432236993) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer1.findName(intArray12, (-86011045));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432236463));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857889);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(736114656);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("", 585037975, (-432235247));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName(1081706716, (-432858399), (-432236747));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((int) ' ');
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("", (-432235879), (-432237151));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(584983039);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.findName((-432238045));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        int int4 = byteQuadsCanonicalizer1.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1950679178), (-432236993));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName(0, (-432807676));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = byteQuadsCanonicalizer0.findName(1797043);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("", (-432235691));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.findName(726745252, 726751228);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        byteQuadsCanonicalizer0._longNameOffset = (-432857107);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1869614560, 1869614560, (int) ' ');
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("", (-194529551));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432234245), 7, (-1));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("hi!", (-432234709), (-432234871));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.calcHash((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName(0, (-1070321381));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int5 = byteQuadsCanonicalizer4.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer4._hashArea = intArray15;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.findName(intArray15, (-1654346617));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-1510560183), (int) (byte) 10, 584986576);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-202237041);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName((-432233131), 7, (int) '4');
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        byteQuadsCanonicalizer0._secondaryStart = (-580650583);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(6000);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1887253739));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((-432857107), (-432233211));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432234855));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((-432233409), 934282494);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("", (-432234053), (-1701677292), (-432234709));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.findName(726745252);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._secondaryStart = (-432235313);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.addName("", (-432235473), (-2089682640));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.findName(intArray15, (-432233491));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("hi!", 0, 0, (-432234871));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432236613), 0, (-432803105));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("hi!", (-432232481), (-432236017), (-432804524));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-432857921), (-432230765), (-825433012));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("hi!", 1430334682, (-198368878));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName(584983039, 1483912190, (-432233335));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._hashSize = (-202237041);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432233409), (-432238239));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((-432807290), (-432233611));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432802311));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._count;
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("hi!", (-432236599), 10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer0.findName((-432233939));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1430334682, 517303168, (-432232221));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int4 = byteQuadsCanonicalizer1.calcHash((-432235817));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.findName(786644105, 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer0.findName((-432229865));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-1776808604);
        byteQuadsCanonicalizer0._secondaryStart = (-432858399);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432233611), (-432858953), 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int int2 = byteQuadsCanonicalizer1.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432807622), 32);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432237151), (-432235473), (-432234855));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432238301), 726679957, 726745252);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432229039));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(726731833);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 726920401;
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        int[] intArray14 = new int[] { 2038, 1053474672, (-432233105), (-432229891), (-432229301) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName(intArray14, (-432235691));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (-432235313);
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("hi!", (-937635559), (-432229107));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((-1368398197), 1053474672);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432236497), 726723526);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("hi!", 0, 1217355370, (-2066636029));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._longNameOffset = 926034734;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 586129180, (-1625364265));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("hi!", 797427052, (-432229107), (-432229731));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.findName((-432804524), 726927673);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._count;
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432229301));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = byteQuadsCanonicalizer0.addName("", (-847585761), 1430334682, 1073894391);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432230311), 726740779);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int[] intArray9 = byteQuadsCanonicalizer0._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432236017), (-432229771), (-1680917051));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("", 1331352675, (-432237891), (-432229231));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer0.findName((-596429556), (-1312816649));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("", 950858184, (-432233373), 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1973355417);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432232481);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432228803));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432231879), 628048797);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer3._hashSize;
        java.lang.String str5 = byteQuadsCanonicalizer3.toString();
        int[] intArray10 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer3._hashArea = intArray10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(intArray10, 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.size();
        int int15 = byteQuadsCanonicalizer0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName((-202237041));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("hi!", (-317336036), (-86011045));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._longNameOffset = 726921598;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName(726691972, (-432236613));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName((-432804152), (-1294590681), (-432235165));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._hashSize = (-202237041);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-432232833), (-432230055), (int) (short) -1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("hi!", (-432802830));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        byteQuadsCanonicalizer0._secondaryStart = (-580650583);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = byteQuadsCanonicalizer0.addName("", (-432231241));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235137));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((-1008950360), (-432227965));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int int10 = byteQuadsCanonicalizer0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(726690136);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 726920401;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432231821));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-1889133708), (-432807221), (-432232965));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int[] intArray7 = new int[] { 1217341024 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName(intArray7, (-432231241));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("", (-432230027), (-1802129393), (-432229695));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash(726732643, 950858184);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 726927871, 586144309, (-1030708984));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._secondaryStart = (-432236071);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(1217355370, 862551178);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        int int10 = byteQuadsCanonicalizer0.calcHash((-1), (-432236713), 726739627);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-432228577));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432227401));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-432858953), (-847585761));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (-432807676);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.findName((-915896330));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("hi!", (-432803711), 873049829);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._spilloverEnd = (-432235911);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(752865357);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName(1388163119);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._longNameOffset = 926034734;
        byteQuadsCanonicalizer0._intern = false;
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str60 = byteQuadsCanonicalizer0.findName(intArray55, 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer3._hashSize;
        byteQuadsCanonicalizer3._count = (byte) 100;
        java.lang.String[] strArray7 = byteQuadsCanonicalizer3._names;
        java.lang.String str8 = byteQuadsCanonicalizer3.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        java.lang.String[] strArray13 = byteQuadsCanonicalizer9._names;
        int[] intArray18 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int20 = byteQuadsCanonicalizer9.calcHash(intArray18, 4);
        byteQuadsCanonicalizer3._hashArea = intArray18;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = byteQuadsCanonicalizer0.findName(intArray18, (-432235473));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName(950858184, (-432225793));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 1797043;
        byteQuadsCanonicalizer1._spilloverEnd = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer1.findName(1217341024);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("", (-432227913), 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName(1435712518, 152940266, 797454223);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(458289561);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(967012613, 726745252, (-1653987075));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432232481);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.findName((-432227863), 586131826);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer0._names;
        int int13 = byteQuadsCanonicalizer0.calcHash(1869614560);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 8570);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._spilloverEnd = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-432228115), 586131556);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        int[] intArray19 = new int[] { 3782 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.findName(intArray19, (-1106296139));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        int int2 = byteQuadsCanonicalizer1.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("hi!", 1513531684, (-432235021));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-432228749), (-432236071));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        int int2 = byteQuadsCanonicalizer1.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.findName(586147864, 1442319748, (-432230413));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = byteQuadsCanonicalizer0.addName("", 878801585);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432224125), (-516588352), (-924996805));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._secondaryStart = (-432235313);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer1.makeChild((-432811187));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.findName(0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._secondaryStart = (-432236017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-432222637), 2182715, (int) (short) 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432231575));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = byteQuadsCanonicalizer1.findName(0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String[] strArray3 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432223147), (-972564820));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName((-432812164), (-1149712613), 772206020);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        int int14 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName(100, (-432236071), 2030095526);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = byteQuadsCanonicalizer0.findName((-432233267), 1476442465, (-432223061));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.findName(586144309, 726801331);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432231575));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432804524));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._hashSize = (-2027202559);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432227277), 572175652);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        byteQuadsCanonicalizer1._longNameOffset = (-432235879);
        int int9 = byteQuadsCanonicalizer1.spilloverCount();
        java.lang.String str10 = byteQuadsCanonicalizer1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer1.findName((-990187648), (-432801843));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-1157391731));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-198368878));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", 13247, (-432229585));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(1122216122, 585267187, 752865357);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash(726732643, 950858184);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-1913951951), (-2023759883));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName(584993128, 726812095);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._secondaryStart = (-432235313);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.findName((int) '#');
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        int int19 = byteQuadsCanonicalizer0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-432228443), (-432238301), (-432224623));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        int int11 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._hashSize = 726927871;
        int int11 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(586129180);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432230393));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.findName(585022189, 1837217408, 1542706042);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("", (-515099051), 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(616766233);
        byteQuadsCanonicalizer1._intern = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.findName((-432222319), (-432237873));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        int int7 = byteQuadsCanonicalizer1.calcHash(586081183, (-432230393), 726700144);
        byteQuadsCanonicalizer1.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-1335274636), (-337906681));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432237577));
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", 726799855);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.findName(19982, (-432232013));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        int[] intArray18 = new int[] { 584993128, (-432813493), 2011571269, (-432229039) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.findName(intArray18, 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._tertiaryShift = (-86011045);
        int int11 = byteQuadsCanonicalizer0.calcHash(726703924, (-432225817));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName(448, 726794545, 348034165);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryStart = 1167071952;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer0._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-432231971), (-432229051));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._longNameOffset = 726921751;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName(1973355417);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-1053074717), (-432223061));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0._count;
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432814902), (-432227121));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._longNameOffset = 726679957;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(1720645573, 726745252, (-432220603));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        int int2 = byteQuadsCanonicalizer1.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.findName((-826779475), 648038151, (-12346970));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(1483495917, (-432238045), (-432223621));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432229919), 1587393582);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 3824, 586145056, (-432230055));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        byteQuadsCanonicalizer0._tertiaryStart = 726700099;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(315751428);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (-432235313);
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0._parent;
        boolean boolean10 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("", (-432237037), (-12346970));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.findName((-2106830907));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-1029717943);
        int[] intArray16 = byteQuadsCanonicalizer0._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.findName((-432220667), 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.findName((-1662223595), 950200784, (-432220679));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int9 = byteQuadsCanonicalizer0.calcHash((-432228403), (-432229283), (-432226983));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-432228815), (-432230989), 1483495917);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        byteQuadsCanonicalizer0._tertiaryStart = (-432233731);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 585128182, (-432236087));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._secondaryStart = (-432236017);
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._tertiaryStart = 726725614;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.findName((-432229443), (-1574754311));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-924996805), (-432218181));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryStart = 726921598;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("hi!", (-432225035), (-432228403));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-848971394), (-432807622), 29365);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._tertiaryShift = 622936314;
        java.lang.String str13 = byteQuadsCanonicalizer3.addName("", 585184567, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = byteQuadsCanonicalizer3.makeChild(586092811);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int10 = byteQuadsCanonicalizer0.calcHash(1809837904, 13759, 1596861526);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("hi!", (-432232221));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-1673206950), (-432225485), (-583049358));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName(0, 851030732, 1582216432);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        byteQuadsCanonicalizer0._count = (-432232441);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432229389));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1507862706), (-432224835), 586502759);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 726920401;
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        int int11 = byteQuadsCanonicalizer9._spilloverEnd;
        int int12 = byteQuadsCanonicalizer9._longNameOffset;
        int int13 = byteQuadsCanonicalizer9.hashSeed();
        int int16 = byteQuadsCanonicalizer9.calcHash((-1776808604), (int) (short) 100);
        int int17 = byteQuadsCanonicalizer9._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        byteQuadsCanonicalizer18._count = (byte) 100;
        java.lang.String[] strArray22 = byteQuadsCanonicalizer18._names;
        java.lang.String str23 = byteQuadsCanonicalizer18.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int25 = byteQuadsCanonicalizer24._hashSize;
        byteQuadsCanonicalizer24._count = (byte) 100;
        java.lang.String[] strArray28 = byteQuadsCanonicalizer24._names;
        int[] intArray33 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int35 = byteQuadsCanonicalizer24.calcHash(intArray33, 4);
        byteQuadsCanonicalizer18._hashArea = intArray33;
        byteQuadsCanonicalizer9._hashArea = intArray33;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = byteQuadsCanonicalizer0.findName(intArray33, (-1654346617));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        int int12 = byteQuadsCanonicalizer10._spilloverEnd;
        int int13 = byteQuadsCanonicalizer10._longNameOffset;
        byteQuadsCanonicalizer10._count = ' ';
        int int16 = byteQuadsCanonicalizer10.spilloverCount();
        int int17 = byteQuadsCanonicalizer10._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = byteQuadsCanonicalizer10.makeChild(726927673);
        int[] intArray20 = byteQuadsCanonicalizer19._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = byteQuadsCanonicalizer0.findName(intArray20, (-432227313));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName(159921419);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.findName(3846);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = byteQuadsCanonicalizer0.addName("", (int) (short) 100, 1809837904);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int[] intArray9 = byteQuadsCanonicalizer0._hashArea;
        int int10 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-972564820), 0, (-31240258));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        int int10 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 585137758, (-432801843), 821504543);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-1308717544), (-432226631));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.calcHash((int) 'a');
        int int8 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432230413), (-432225145), 1312822398);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._longNameOffset = 926034734;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName(7, (-432814320));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        byteQuadsCanonicalizer1._hashSize = (-86011045);
        int int4 = byteQuadsCanonicalizer1.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", 2086675986);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0.release();
        int int5 = byteQuadsCanonicalizer0.calcHash((-1847829001));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName(586092811);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.findName((-432235045), (-432229837));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(0, (-432224623), 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int11 = byteQuadsCanonicalizer1.calcHash((-790193954), (-432802824));
        int int12 = byteQuadsCanonicalizer1._hashSize;
        boolean boolean13 = byteQuadsCanonicalizer1.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer1.findName((-432824146), (-427231616), 281908855);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("", 1735340042);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        byteQuadsCanonicalizer0._spilloverEnd = (-432858953);
        int int10 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-432235473));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName((-1960738167), (-432222507));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._secondaryStart = (-432231459);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.findName(87518895, 585142843, 585180040);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = byteQuadsCanonicalizer0.totalCount();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryStart = (-1070321381);
        int int4 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 770249287);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.calcHash((-432236713));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 502092519, 1869614560);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        byteQuadsCanonicalizer1._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer1.makeChild((-432234613));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer1.addName("", 586129180, (-1380866691));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._count = (-432230825);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1312822398);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("hi!", (-432218585), 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int4 = byteQuadsCanonicalizer3.hashSeed();
        byteQuadsCanonicalizer3._secondaryStart = (-1106296139);
        int int7 = byteQuadsCanonicalizer3.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer3.makeChild((-849208211));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432223365));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        int int14 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName(585128182, 1265837612, 585267187);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432218001));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        byteQuadsCanonicalizer0._hashSize = (-432218051);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.findName(442694019);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        int int13 = byteQuadsCanonicalizer0.bucketCount();
        int int14 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 1, (-432232881), 3782);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1427773297, (-432215125));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        int int19 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = byteQuadsCanonicalizer0.findName((-432217263), 726811690);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432219065));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer0._names;
        int int13 = byteQuadsCanonicalizer0.calcHash(1869614560);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName((-432214825), 726689353, 1072045803);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 348034165);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        byteQuadsCanonicalizer0._secondaryStart = (-580650583);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432216279), (-2056298817));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432218009));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-432215103));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 1797043;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1259152205);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._hashSize = (-2027202559);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-1011195396), 251560750, (-432224267));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (-432807676);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.toString();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9.hashSeed();
        int int11 = byteQuadsCanonicalizer9._secondaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        int int17 = byteQuadsCanonicalizer12.calcHash((-432857889), (-432802824), (-432235691));
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
        byteQuadsCanonicalizer12._hashArea = intArray56;
        int int62 = byteQuadsCanonicalizer12.calcHash(11880);
        int[] intArray63 = byteQuadsCanonicalizer12._hashArea;
        byteQuadsCanonicalizer9._hashArea = intArray63;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str66 = byteQuadsCanonicalizer0.findName(intArray63, (-1578295370));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 1797043;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer1._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 726690847, (-516659008), (-993311696));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(30103, 797281252);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        int int7 = byteQuadsCanonicalizer1.calcHash(586081183, (-432230393), 726700144);
        byteQuadsCanonicalizer1.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432229301), 851016242);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-432234527), (-432214805));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int int6 = byteQuadsCanonicalizer4._tertiaryShift;
        byteQuadsCanonicalizer4._secondaryStart = (-432857889);
        int int9 = byteQuadsCanonicalizer4.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer4.makeChild((-432818349));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432230989), 772206020, (-432234099));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean13 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432224589), 645666333, 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432232481);
        byteQuadsCanonicalizer0._intern = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName(0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (-432235313);
        byteQuadsCanonicalizer0._hashSize = (-432221419);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String[] strArray3 = byteQuadsCanonicalizer0._names;
        int int4 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", 1578834263, (-432230789));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726927871);
        int int2 = byteQuadsCanonicalizer1.totalCount();
        int int3 = byteQuadsCanonicalizer1._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432224835), 726764557, (-432228443));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-849222015), 726570796);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int4 = byteQuadsCanonicalizer1.calcHash((-432235817));
        int int5 = byteQuadsCanonicalizer1._spilloverEnd;
        int int6 = byteQuadsCanonicalizer1._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432227577), 586081183);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int10 = byteQuadsCanonicalizer0.calcHash(1809837904, 13759, 1596861526);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-432227559), 29365);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("hi!", 851030732, (-432228739), (-911155392));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432230393));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName(1673642827, (-432235313));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.hashSeed();
        int int15 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(850815938);
        int int2 = byteQuadsCanonicalizer1.primaryCount();
        int int3 = byteQuadsCanonicalizer1.spilloverCount();
        int int4 = byteQuadsCanonicalizer1._count;
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = byteQuadsCanonicalizer1.findName(intArray28, (-432234099));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0._count;
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        int int9 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-432227195), (-432237253));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = byteQuadsCanonicalizer0.totalCount();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 3846;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-879463196));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1794842379, (-432230789));
        byteQuadsCanonicalizer0._secondaryStart = (-432823952);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName(1387528274, (-432217595));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432801967));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName(2049222229, (-432228619));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._secondaryStart = (-432231459);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1520843152));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-432230027), 1587393582);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", 256, 7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._hashSize = (-1950679178);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = byteQuadsCanonicalizer0.totalCount();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432224191), (-432221561), (-432213691));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", 585157990, (-432216617));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(29929788);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName(27137223, (-432224267));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432220191), 586081183, (-432223437));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432226777), (-432211551), (-432219437));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1574754311));
        int[] intArray2 = byteQuadsCanonicalizer1._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432235673), (-432217537), (-432224125));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432214825));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        byteQuadsCanonicalizer1._hashSize = (-86011045);
        int int4 = byteQuadsCanonicalizer1.size();
        boolean boolean5 = byteQuadsCanonicalizer1._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.findName((-432824146));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-906078756));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        int int2 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._tertiaryShift = 1061208426;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(10532, 0, (-2130984887));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0._count;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._hashSize = (-555221619);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int11 = byteQuadsCanonicalizer10.hashSeed();
        int int15 = byteQuadsCanonicalizer10.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean16 = byteQuadsCanonicalizer10.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17._hashSize;
        byteQuadsCanonicalizer17._count = (byte) 100;
        java.lang.String[] strArray21 = byteQuadsCanonicalizer17._names;
        int[] intArray26 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int28 = byteQuadsCanonicalizer17.calcHash(intArray26, 4);
        byteQuadsCanonicalizer17._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31._hashSize;
        byteQuadsCanonicalizer31._count = (byte) 100;
        java.lang.String[] strArray35 = byteQuadsCanonicalizer31._names;
        int[] intArray40 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int42 = byteQuadsCanonicalizer31.calcHash(intArray40, 4);
        byteQuadsCanonicalizer17._hashArea = intArray40;
        byteQuadsCanonicalizer10._hashArea = intArray40;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = byteQuadsCanonicalizer0.findName(intArray40, (-1106296139));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash(726732643, 950858184);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._hashSize = (-432224883);
        int int14 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("hi!", 1763641886);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-1950606908), 616766233);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (-432235313);
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432216365), (-432220305));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash(726732643, 950858184);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int12 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432216249), (-432220611), 996863455);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash(726732643, 950858184);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432223331), (-1853997426));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("", 8570, 1153744878, (-432820422));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = 726703924;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(726679957);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 159921419, (-432213691), 726532465);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.calcHash((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-432819013), (-477386040));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        byteQuadsCanonicalizer1._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer1.makeChild((-432234613));
        byteQuadsCanonicalizer1._count = (-432227977);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer1.findName(797509309);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._tertiaryStart = 850855124;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName(1122220209, 851025305, 726594997);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        int int7 = byteQuadsCanonicalizer1.calcHash(586081183, (-432230393), 726700144);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int9 = byteQuadsCanonicalizer1._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 424071495, (-1761639208), 1200682433);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(726927673);
        java.lang.String str11 = byteQuadsCanonicalizer9.findName((-2105879442));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer9.makeChild((-1981207176));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
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
        int int44 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = byteQuadsCanonicalizer0.findName((-432222159));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int4 = byteQuadsCanonicalizer1.calcHash((-432235817));
        int int5 = byteQuadsCanonicalizer1._spilloverEnd;
        int int6 = byteQuadsCanonicalizer1._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer1.addName("", (-432818673), (-2056298817));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
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
        int int17 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray18 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.findName(850998197, 586121521);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.findName((-994698373));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._count = 595210654;
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7._hashSize;
        java.lang.String str9 = byteQuadsCanonicalizer7.toString();
        byteQuadsCanonicalizer7._tertiaryShift = 850855124;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._count = (byte) 100;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        int[] intArray21 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int23 = byteQuadsCanonicalizer12.calcHash(intArray21, 4);
        byteQuadsCanonicalizer7._hashArea = intArray21;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = byteQuadsCanonicalizer0.findName(intArray21, (-432224255));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._longNameOffset = (-693285981);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer0._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-432858561), (-1942409570));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432801967));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int6 = byteQuadsCanonicalizer2.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer2._hashSize = (-432857107);
        int int9 = byteQuadsCanonicalizer2._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._count = (byte) 100;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        int[] intArray21 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int23 = byteQuadsCanonicalizer12.calcHash(intArray21, 4);
        byteQuadsCanonicalizer10._hashArea = intArray21;
        byteQuadsCanonicalizer2._hashArea = intArray21;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = byteQuadsCanonicalizer1.findName(intArray21, (-697691890));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432214805));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean15 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-432227313);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-432238045), (-294983934), 15473);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int11 = byteQuadsCanonicalizer1.calcHash((-790193954), (-432802824));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer1.makeChild((-432231575));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer1.findName((-1574728945), (-432215695), (-432218033));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-2087094428));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._longNameOffset = (-693285981);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer0._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-1), (-432221601));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 3782, 0, 1780038292);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryStart = 1167071952;
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild((-432225713));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((int) (short) 1, (-432223685), (-863274960));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        byteQuadsCanonicalizer0._spilloverEnd = (-432858953);
        int int10 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-432229721), 1757305735);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        int int9 = byteQuadsCanonicalizer0._hashSize;
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        int[] intArray11 = byteQuadsCanonicalizer0._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 732044067);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        byteQuadsCanonicalizer1._hashSize = (-86011045);
        boolean boolean4 = byteQuadsCanonicalizer1._failOnDoS;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int6 = byteQuadsCanonicalizer5._hashSize;
        int int7 = byteQuadsCanonicalizer5._spilloverEnd;
        int int8 = byteQuadsCanonicalizer5._hashSize;
        byteQuadsCanonicalizer5._tertiaryShift = (-432857136);
        byteQuadsCanonicalizer5._reportTooManyCollisions();
        boolean boolean12 = byteQuadsCanonicalizer5._failOnDoS;
        int int13 = byteQuadsCanonicalizer5.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14.hashSeed();
        int int16 = byteQuadsCanonicalizer14._longNameOffset;
        int int17 = byteQuadsCanonicalizer14._longNameOffset;
        boolean boolean18 = byteQuadsCanonicalizer14._intern;
        int int19 = byteQuadsCanonicalizer14._secondaryStart;
        int int20 = byteQuadsCanonicalizer14._secondaryStart;
        int int21 = byteQuadsCanonicalizer14._tertiaryShift;
        byteQuadsCanonicalizer14.release();
        int int23 = byteQuadsCanonicalizer14._count;
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
        byteQuadsCanonicalizer14._hashArea = intArray39;
        byteQuadsCanonicalizer5._hashArea = intArray39;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = byteQuadsCanonicalizer1.findName(intArray39, (-432225195));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-1149712613), (-2057176286));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._intern = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1529115260));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName(2049222229);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432217417), (-432235021), (-1458255080));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.totalCount();
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-432233373), (-680473811));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432822468));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("hi!", (-432210821), (-1632569954));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._longNameOffset = 926034734;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName(1448096062, (-432214643), 726549088);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726927871);
        int int2 = byteQuadsCanonicalizer1.totalCount();
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("hi!", 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        boolean boolean14 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432231553), (-2095462044));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-636549936), 1609185535, 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
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
        byteQuadsCanonicalizer0._longNameOffset = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName(111435963, 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 3846;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432209729));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._secondaryStart = (-432236071);
        int int11 = byteQuadsCanonicalizer0.bucketCount();
        int int12 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1643625435), 255177100);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-669196780));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) '4');
        byteQuadsCanonicalizer1._tertiaryShift = (-432236143);
        int int4 = byteQuadsCanonicalizer1.size();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = byteQuadsCanonicalizer1.findName(intArray33, (-432208591));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1.secondaryCount();
        boolean boolean8 = byteQuadsCanonicalizer1._intern;
        byteQuadsCanonicalizer1._hashSize = (-910620441);
        int int11 = byteQuadsCanonicalizer1.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer1.addName("", 11130);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
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
        int int16 = byteQuadsCanonicalizer0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.findName((-432218033), 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int9 = byteQuadsCanonicalizer0.calcHash((-432228403), (-432229283), (-432226983));
        int int11 = byteQuadsCanonicalizer0.calcHash((-432219849));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (int) ' ', 227440015);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._spilloverEnd = (-432225395);
        byteQuadsCanonicalizer0._secondaryStart = (-432231765);
        byteQuadsCanonicalizer0._tertiaryShift = (-432227863);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName(726776806, 1660403783, (-787798675));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432209713), 1542357209, 1300450668);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.addName("", (-432208267));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int[] intArray9 = byteQuadsCanonicalizer0._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432221345));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432804524), (-432217951));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName(1409433411, (-432209823));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._count = 770249287;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432233131), 797503975, (-2020527241));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432230393));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 850640375, 1668900816);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._secondaryStart = (-432235313);
        int int6 = byteQuadsCanonicalizer1.totalCount();
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        int int8 = byteQuadsCanonicalizer1.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9.hashSeed();
        java.lang.String[] strArray11 = byteQuadsCanonicalizer9._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer9.makeChild(1081706716);
        int int14 = byteQuadsCanonicalizer13.primaryCount();
        int[] intArray15 = byteQuadsCanonicalizer13._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16.hashSeed();
        int int18 = byteQuadsCanonicalizer16._longNameOffset;
        int int19 = byteQuadsCanonicalizer16._longNameOffset;
        boolean boolean20 = byteQuadsCanonicalizer16._intern;
        int int21 = byteQuadsCanonicalizer16._secondaryStart;
        int int22 = byteQuadsCanonicalizer16._secondaryStart;
        int int23 = byteQuadsCanonicalizer16._tertiaryShift;
        byteQuadsCanonicalizer16.release();
        int int25 = byteQuadsCanonicalizer16._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int27 = byteQuadsCanonicalizer26._hashSize;
        byteQuadsCanonicalizer26._count = (byte) 100;
        java.lang.String[] strArray30 = byteQuadsCanonicalizer26._names;
        java.lang.String str31 = byteQuadsCanonicalizer26.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer32 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int33 = byteQuadsCanonicalizer32._hashSize;
        byteQuadsCanonicalizer32._count = (byte) 100;
        java.lang.String[] strArray36 = byteQuadsCanonicalizer32._names;
        int[] intArray41 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int43 = byteQuadsCanonicalizer32.calcHash(intArray41, 4);
        byteQuadsCanonicalizer26._hashArea = intArray41;
        byteQuadsCanonicalizer16._hashArea = intArray41;
        java.lang.String str47 = byteQuadsCanonicalizer13.findName(intArray41, (-2050116369));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = byteQuadsCanonicalizer1.findName(intArray41, (-2130984887));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._intern = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName(850824164);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        int int5 = byteQuadsCanonicalizer0._count;
        int int6 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._longNameOffset = (-1953084381);
        int int11 = byteQuadsCanonicalizer0.calcHash(1091455544, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1594155753, 726690136);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = byteQuadsCanonicalizer0.findName((-432225145), (-432227577));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._tertiaryShift = (-432233909);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432208457), 1065638299, (-432219769));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432208137), 2001209864, (-1446089868));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 2011571269, 622936314);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-2066636029);
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        boolean boolean9 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._longNameOffset = (-432218191);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("hi!", 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String[] strArray3 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432210075));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("", (-432225783), 726570796, 1368135619);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        int int5 = byteQuadsCanonicalizer0.hashSeed();
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-338453959), (-432224977), 10532);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str74 = byteQuadsCanonicalizer0.findName((-1122492433));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-432211959), (-432820169), 726926494);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1794842379, (-432230789));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        int int13 = byteQuadsCanonicalizer11._spilloverEnd;
        int int14 = byteQuadsCanonicalizer11._tertiaryShift;
        boolean boolean15 = byteQuadsCanonicalizer11._intern;
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
        byteQuadsCanonicalizer11._hashArea = intArray39;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = byteQuadsCanonicalizer0.findName(intArray39, (-1972511887));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(726599722, 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0.totalCount();
        int int9 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(10, (-2146747229), (-134850269));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.findName((-1887253739), (-432223031));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = byteQuadsCanonicalizer0.findName((-432228949), (-432210029), (-596429556));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-697691890));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._secondaryStart = (-432236017);
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._tertiaryShift = (-432227289);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-432220611), 1765870684);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-632185290), (-432210947), 584808079);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-2114373380));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(616766233);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-432232707), 42842510);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1531971694), (-432212461), 2068845497);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName(315497301, (-727677659), (-756167817));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        java.lang.String[] strArray7 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName(726739627, 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432234855));
        int int2 = byteQuadsCanonicalizer1._count;
        int int4 = byteQuadsCanonicalizer1.calcHash((-432212789));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.findName(11880);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int5 = byteQuadsCanonicalizer0.calcHash((-432230027));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName((-432220107));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432230393));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.addName("", (-432214287));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        boolean boolean3 = byteQuadsCanonicalizer1._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 797454223);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.toString();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName(64);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432216365), (-432232013));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        byteQuadsCanonicalizer0._spilloverEnd = (-432858953);
        int int10 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(584993128);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int4 = byteQuadsCanonicalizer1.hashSeed();
        int int5 = byteQuadsCanonicalizer1._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.findName(1745369958);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        java.lang.String[] strArray13 = byteQuadsCanonicalizer9._names;
        int[] intArray18 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int20 = byteQuadsCanonicalizer9.calcHash(intArray18, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = byteQuadsCanonicalizer0.findName(intArray18, (-261839189));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235137));
        byteQuadsCanonicalizer1._longNameOffset = 586092811;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.findName(726532465, (-432205383));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        int int8 = byteQuadsCanonicalizer0._count;
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432213595), 2026676831);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
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
        int int17 = byteQuadsCanonicalizer0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        byteQuadsCanonicalizer1._longNameOffset = (-432235879);
        int int9 = byteQuadsCanonicalizer1.spilloverCount();
        byteQuadsCanonicalizer1._hashSize = (-432228433);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer1.addName("", (-432221819), 1087550307, 585120136);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432232481);
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("", (-432226593), (-432828943));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432218231));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        int int19 = byteQuadsCanonicalizer0.bucketCount();
        boolean boolean20 = byteQuadsCanonicalizer0._failOnDoS;
        int int21 = byteQuadsCanonicalizer0.primaryCount();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = byteQuadsCanonicalizer0.findName(intArray37, (-1157391731));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432215849));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-1680917051), 726921751, (-432215125));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = 64;
        java.lang.String[] strArray7 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432216385), (-432224415), (-31329988));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.findName((-2050116369), (-432217417));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-915896330), 315497301, (-432830251));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int4 = byteQuadsCanonicalizer3.size();
        int int7 = byteQuadsCanonicalizer3.calcHash((-432807290), 1794842379);
        byteQuadsCanonicalizer3._hashSize = (-432233335);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer3._parent;
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
        byteQuadsCanonicalizer3._hashArea = intArray38;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer46 = byteQuadsCanonicalizer3.makeChild((-432212045));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        byteQuadsCanonicalizer0._spilloverEnd = (-432858953);
        int int10 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean11 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-269666549), (-1936853302), 1531874888);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        int int4 = byteQuadsCanonicalizer0._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int6 = byteQuadsCanonicalizer5._hashSize;
        byteQuadsCanonicalizer5._count = (byte) 100;
        java.lang.String[] strArray9 = byteQuadsCanonicalizer5._names;
        java.lang.String str10 = byteQuadsCanonicalizer5.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        byteQuadsCanonicalizer11._count = (byte) 100;
        java.lang.String[] strArray15 = byteQuadsCanonicalizer11._names;
        int[] intArray20 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int22 = byteQuadsCanonicalizer11.calcHash(intArray20, 4);
        byteQuadsCanonicalizer5._hashArea = intArray20;
        int int24 = byteQuadsCanonicalizer5._secondaryStart;
        byteQuadsCanonicalizer5._secondaryStart = (-1776808604);
        boolean boolean27 = byteQuadsCanonicalizer5.maybeDirty();
        int int28 = byteQuadsCanonicalizer5.hashSeed();
        byteQuadsCanonicalizer5._tertiaryStart = 1979216242;
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
        java.lang.String[] strArray64 = new java.lang.String[] {};
        byteQuadsCanonicalizer35._names = strArray64;
        byteQuadsCanonicalizer31._names = strArray64;
        byteQuadsCanonicalizer5._names = strArray64;
        byteQuadsCanonicalizer0._names = strArray64;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str72 = byteQuadsCanonicalizer0.findName((-432223235), 1921783281, 726553093);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726927871);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = byteQuadsCanonicalizer1.findName(27732);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432211485), (-432228739), (-1326098337));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        int int5 = byteQuadsCanonicalizer0.calcHash((-2023759883), 1073894391);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-432218575), (-1669855521), (-432218365));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName((-432235691), 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int4 = byteQuadsCanonicalizer1.calcHash((-432235817));
        byteQuadsCanonicalizer1._tertiaryStart = (-432225485);
        boolean boolean7 = byteQuadsCanonicalizer1._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-870022432), (-278392595), (-2143377652));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String[] strArray5 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName(2093132739, (-432234527), 0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash(726732643, 950858184);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-432827060));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0.makeChild(11880);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432204619), (-1913973304), (-432227725));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432220429), (-432208909));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-432211987));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0._count;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._tertiaryShift = 586080877;
        byteQuadsCanonicalizer0._spilloverEnd = (-1446089868);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("", (-432224873));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        byteQuadsCanonicalizer1._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer1.makeChild((-432234613));
        int[] intArray7 = byteQuadsCanonicalizer1._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.findName((-1888159813));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-2066636029);
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._secondaryStart = 1023311;
        byteQuadsCanonicalizer0._spilloverEnd = (-44895162);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-910725789), (-432809722));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._intern = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("", 1735340042, (-432235691));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
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
        int int18 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.totalCount();
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-1671554860));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-671599682), (-432225891), (-432210821));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 465607381);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName((-432206183));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-432221335);
        int int9 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-1070659241), (-432802824));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName(804928847);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = (-432235817);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-847585761));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 584826475);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 1218607115, 1365014251, (-432204903));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int5 = byteQuadsCanonicalizer0.calcHash((-432230027));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432817273), (-432234245), 1326984664);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        boolean boolean9 = byteQuadsCanonicalizer0._intern;
        int int10 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("", 595382131, 797273386);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._tertiaryShift = (-86011045);
        int int11 = byteQuadsCanonicalizer0.calcHash(726703924, (-432225817));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = byteQuadsCanonicalizer0.totalCount();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._secondaryStart = (-432235313);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer1.makeChild((-432811187));
        boolean boolean8 = byteQuadsCanonicalizer1._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-864572962), 424638906);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName(0, (-1850811634));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 726920401;
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(943890190, (-432217251), 726740779);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer32 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int33 = byteQuadsCanonicalizer32._hashSize;
        int int37 = byteQuadsCanonicalizer32.calcHash((-432857889), (-432802824), (-432235691));
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer67 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int68 = byteQuadsCanonicalizer67._hashSize;
        byteQuadsCanonicalizer67._count = (byte) 100;
        java.lang.String[] strArray71 = byteQuadsCanonicalizer67._names;
        int[] intArray76 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int78 = byteQuadsCanonicalizer67.calcHash(intArray76, 4);
        byteQuadsCanonicalizer38._hashArea = intArray76;
        byteQuadsCanonicalizer32._hashArea = intArray76;
        int int82 = byteQuadsCanonicalizer32.calcHash(11880);
        int[] intArray83 = byteQuadsCanonicalizer32._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str85 = byteQuadsCanonicalizer0.findName(intArray83, (-1510560183));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
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
        boolean boolean27 = byteQuadsCanonicalizer1.maybeDirty();
        byteQuadsCanonicalizer1._spilloverEnd = (-432802824);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432209881));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int[] intArray4 = byteQuadsCanonicalizer0._hashArea;
        int int5 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName(1306978773);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432207085), 0, (-432202215));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._hashSize = (-432231879);
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("", (-432218895));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName(68565890, (-432216211));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
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
        byteQuadsCanonicalizer0._spilloverEnd = (-129002493);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-1733437941), (-430186399));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
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
        java.lang.String str17 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.findName((-560778672), 850991528);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0._count;
        int int10 = byteQuadsCanonicalizer0.secondaryCount();
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432225647), 1122211699);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        java.lang.String[] strArray5 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._intern = false;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-432804398), 27838, (-991979449));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-1771429771));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer1.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", 1616355694, (-50074113), 8306058);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0._tertiaryStart = (-230468558);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-487681639));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0.makeChild((-432230027));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer12.makeChild(103800);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432208889));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.findName((-30472738), 0, (-432209699));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("hi!", (-432224159), (-432203749), 0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-432233909), (-1157391731));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-432830024));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1188658082, 2001209864, (-432204593));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-202237041);
        int int14 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName((-1663351150), (-202237041), 1803442217);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1979216242);
        boolean boolean2 = byteQuadsCanonicalizer1._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.findName((-2122789089), (-432826210));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (-432235313);
        byteQuadsCanonicalizer0._hashSize = (-432221419);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", 1115638795, 95461989);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._hashSize = (-432231821);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-75386827));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash((-432233131), (-432807676), (-1654346617));
        int int8 = byteQuadsCanonicalizer1.calcHash((-432236071));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer1.addName("hi!", (-432219949), 1869614560, 923333066);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
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
        int int14 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1453492822);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = byteQuadsCanonicalizer0.findName(1217271355);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._hashSize = (-202237041);
        int int11 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._spilloverEnd = 5951790;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 23273052, 2128668821);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName(95133932);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._tertiaryStart = 872635325;
        int int13 = byteQuadsCanonicalizer0.calcHash((-432238239), (-847585761), 726821041);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-1654346617));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857889);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName(584811148, 1797043, 1848632961);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.findName(726656782, (-432213723));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726927871);
        int int2 = byteQuadsCanonicalizer1.totalCount();
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        boolean boolean4 = byteQuadsCanonicalizer1.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-432227763));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._tertiaryShift = (-432233909);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-1163826865), (-432222139), (-432212507));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        byteQuadsCanonicalizer1._longNameOffset = (-432235879);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 2113033424, (-432227913));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName(726628117);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.calcHash((-432857889), (-432802824), (-432235691));
        boolean boolean6 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(124553896);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._hashSize = (-1529115260);
        byteQuadsCanonicalizer0._intern = true;
        int int15 = byteQuadsCanonicalizer0.calcHash((-432218869), (-108915153));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName(0, 726740410);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        int int3 = byteQuadsCanonicalizer0._tertiaryStart;
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._count = (-432220869);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-432221601), (-432210697));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(595702828, (-432215535), (-849195888));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._spilloverEnd = 0;
        int int8 = byteQuadsCanonicalizer0.calcHash(27004, (-1828636043));
        int int10 = byteQuadsCanonicalizer0.calcHash(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432210915), 1204971998, 526181792);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int3 = byteQuadsCanonicalizer1._hashSize;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer1._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.findName((-432811187));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        int int9 = byteQuadsCanonicalizer0.calcHash((-432232833), 726926494, (-432225587));
        byteQuadsCanonicalizer0._longNameOffset = (-432818871);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName(960860905, (-432217745), 928376625);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-432804524), (-2106830907));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = byteQuadsCanonicalizer0.findName((-432228391), (-847585761), (-1776808604));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 850855124;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName((-432209881), (-432234025));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._hashSize = 585058621;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(1715158130);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = byteQuadsCanonicalizer0.findName((-584220967), (-432200405), (-432200413));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("hi!", 726921598, (-432207085));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432205677));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean9 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432200149));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-432197761));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName(0, (-432213231), (-432202221));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", 1340628642);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        int int19 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._count = 382138366;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432200547));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1.release();
        byteQuadsCanonicalizer1.release();
        byteQuadsCanonicalizer1._secondaryStart = (-1930785656);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer1.findName(101091);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName(491500801, (-1341533946));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int5 = byteQuadsCanonicalizer0.calcHash(726927871);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432209417), (-577803365), 537730867);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
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
        int int15 = byteQuadsCanonicalizer0._secondaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16.hashSeed();
        int int18 = byteQuadsCanonicalizer16._longNameOffset;
        int int19 = byteQuadsCanonicalizer16._longNameOffset;
        boolean boolean20 = byteQuadsCanonicalizer16._intern;
        int int21 = byteQuadsCanonicalizer16._secondaryStart;
        int int22 = byteQuadsCanonicalizer16._spilloverEnd;
        byteQuadsCanonicalizer16._spilloverEnd = (-1776808604);
        byteQuadsCanonicalizer16._tertiaryStart = 851021273;
        int int29 = byteQuadsCanonicalizer16.calcHash((int) ' ', 0);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int31 = byteQuadsCanonicalizer30._hashSize;
        int int32 = byteQuadsCanonicalizer30._spilloverEnd;
        int int33 = byteQuadsCanonicalizer30._longNameOffset;
        byteQuadsCanonicalizer30._count = ' ';
        int int36 = byteQuadsCanonicalizer30.spilloverCount();
        int int37 = byteQuadsCanonicalizer30._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer39 = byteQuadsCanonicalizer30.makeChild(726927673);
        int[] intArray40 = byteQuadsCanonicalizer39._hashArea;
        byteQuadsCanonicalizer16._hashArea = intArray40;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str43 = byteQuadsCanonicalizer0.findName(intArray40, (-1394536301));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 797283853, 595963810);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        int int4 = byteQuadsCanonicalizer1._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.addName("", (-432200729), (-432237673));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int10 = byteQuadsCanonicalizer9.hashSeed();
        int int14 = byteQuadsCanonicalizer9.calcHash(0, (int) 'a', (int) (short) 100);
        int int15 = byteQuadsCanonicalizer9.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._hashSize;
        int int18 = byteQuadsCanonicalizer16._spilloverEnd;
        int int19 = byteQuadsCanonicalizer16._hashSize;
        byteQuadsCanonicalizer16._tertiaryShift = (-432857136);
        byteQuadsCanonicalizer16._reportTooManyCollisions();
        boolean boolean23 = byteQuadsCanonicalizer16._failOnDoS;
        int int24 = byteQuadsCanonicalizer16.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int26 = byteQuadsCanonicalizer25.hashSeed();
        int int27 = byteQuadsCanonicalizer25._longNameOffset;
        int int28 = byteQuadsCanonicalizer25._longNameOffset;
        boolean boolean29 = byteQuadsCanonicalizer25._intern;
        int int30 = byteQuadsCanonicalizer25._secondaryStart;
        int int31 = byteQuadsCanonicalizer25._secondaryStart;
        int int32 = byteQuadsCanonicalizer25._tertiaryShift;
        byteQuadsCanonicalizer25.release();
        int int34 = byteQuadsCanonicalizer25._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int36 = byteQuadsCanonicalizer35._hashSize;
        byteQuadsCanonicalizer35._count = (byte) 100;
        java.lang.String[] strArray39 = byteQuadsCanonicalizer35._names;
        java.lang.String str40 = byteQuadsCanonicalizer35.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer41 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int42 = byteQuadsCanonicalizer41._hashSize;
        byteQuadsCanonicalizer41._count = (byte) 100;
        java.lang.String[] strArray45 = byteQuadsCanonicalizer41._names;
        int[] intArray50 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int52 = byteQuadsCanonicalizer41.calcHash(intArray50, 4);
        byteQuadsCanonicalizer35._hashArea = intArray50;
        byteQuadsCanonicalizer25._hashArea = intArray50;
        byteQuadsCanonicalizer16._hashArea = intArray50;
        byteQuadsCanonicalizer9._hashArea = intArray50;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str58 = byteQuadsCanonicalizer1.findName(intArray50, (-432218585));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432801967), (-906537864));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6.hashSeed();
        int int8 = byteQuadsCanonicalizer6._longNameOffset;
        int int9 = byteQuadsCanonicalizer6.hashSeed();
        byteQuadsCanonicalizer6._longNameOffset = (short) 10;
        int int14 = byteQuadsCanonicalizer6.calcHash((int) '#', (int) (short) 10);
        int int15 = byteQuadsCanonicalizer6._secondaryStart;
        byteQuadsCanonicalizer6._tertiaryShift = (-432857889);
        boolean boolean18 = byteQuadsCanonicalizer6.maybeDirty();
        int int19 = byteQuadsCanonicalizer6._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20._hashSize;
        java.lang.String str22 = byteQuadsCanonicalizer20.toString();
        int[] intArray27 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer20._hashArea = intArray27;
        byteQuadsCanonicalizer6._hashArea = intArray27;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = byteQuadsCanonicalizer0.findName(intArray27, 0);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._longNameOffset = (-432237673);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(2132663244, 0);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1.release();
        int int9 = byteQuadsCanonicalizer1.spilloverCount();
        byteQuadsCanonicalizer1._hashSize = (-432212149);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer1.findName((-432231713), 1134348634, (-432219981));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0.size();
        int int8 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName(586136119);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0.primaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 2011316308, (-432215441));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-2093517626), (-98671543));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0._count;
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._count = 726921598;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("", (-992014084), 1031300074);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._longNameOffset = 726921751;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName(576393132, (-126403559));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 711999807);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-1776808604);
        byteQuadsCanonicalizer0._tertiaryStart = 851021273;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-432811330));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._spilloverEnd = (-432230449);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1005594936, 1484134292);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 1797043;
        byteQuadsCanonicalizer1._hashSize = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer1.findName(1257672196, (-432227607));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._secondaryStart;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-432223467), (-195863211), 1229295437);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = 64;
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int8 = byteQuadsCanonicalizer0._hashSize;
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432209039), (-432228391), (-432214381));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryStart = (-1070321381);
        int int4 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._intern = true;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432227577), (-432208087));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("hi!", 29365, (-148081990), 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        int int11 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12.hashSeed();
        int int14 = byteQuadsCanonicalizer12._longNameOffset;
        int int15 = byteQuadsCanonicalizer12.totalCount();
        boolean boolean16 = byteQuadsCanonicalizer12._intern;
        byteQuadsCanonicalizer12._tertiaryStart = 1167071952;
        int int19 = byteQuadsCanonicalizer12._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = byteQuadsCanonicalizer12._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = byteQuadsCanonicalizer12.makeChild((-432225713));
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
        byteQuadsCanonicalizer22._hashArea = intArray50;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str58 = byteQuadsCanonicalizer0.findName(intArray50, (-432197493));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName(889899169);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", 153089931, (-1859394453));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        boolean boolean14 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName((-433032668));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        int int9 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int int12 = byteQuadsCanonicalizer11._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        int int15 = byteQuadsCanonicalizer13._spilloverEnd;
        int int16 = byteQuadsCanonicalizer13._tertiaryShift;
        boolean boolean17 = byteQuadsCanonicalizer13._intern;
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
        byteQuadsCanonicalizer11._hashArea = intArray41;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = byteQuadsCanonicalizer0.findName(intArray41, (-33593767));
    }
}

