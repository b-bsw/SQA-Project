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
        java.lang.String str5 = byteQuadsCanonicalizer1.addName("", (-432145879), (-1410847716));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("hi!", (int) (short) 1, (-432146083), (-673746378));
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
        java.lang.String str7 = byteQuadsCanonicalizer0.findName((int) (short) 100, (-432144585), (int) (byte) 100);
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
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-673751787));
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
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 10, (-432146111));
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
        java.lang.String str7 = byteQuadsCanonicalizer0.findName(725972008, 0);
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
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-673750975));
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
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 725972008, (int) (short) -1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(0, (-432144543));
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
        int[] intArray15 = new int[] { (-432144543), (-1888459861), (-432146083), 'a', (-1253791504) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName(intArray15, (-432144145));
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
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("", 1343294393, 68138809, (-432144033));
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
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("hi!", 68138809, (-673757953));
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
        java.lang.String str11 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-673766456), (-673766456));
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
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("hi!", (-432145333), (-432143211), (-432145209));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432143407));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432144635));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-209223870));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("", (-1410847716), (-432143325));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-922425077), (-673866219), (-432144915));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((int) ' ');
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("", (-432144003), (-432145333));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432142359));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.findName((-2134594281));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        int int4 = byteQuadsCanonicalizer1.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432146251), (-432144765));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName(1641269500, 6000);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = byteQuadsCanonicalizer0.findName(1250119432);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("", (-432145785));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.findName(1644723155, (int) (short) 100);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        byteQuadsCanonicalizer0._longNameOffset = (-673746378);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432144281), (-432144281), (-1864068861));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("", (-1100142565));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 725954260, (-432144635), 1564400970);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("hi!", (-673756043), (-432142113));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.calcHash((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName(0, (-432144281));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        int[] intArray15 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer4._hashArea = intArray15;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.findName(intArray15, (-432143255));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-673746557);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432141531), 133190806, 1848248);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-1404133737);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName((-673746557), (-673765784), (-1382949265));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild((-922425077));
        byteQuadsCanonicalizer0._secondaryStart = (-432144203);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(1399014416);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-673766386));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((-432144033), 13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432143237));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName(1742931497, (-673759171));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        int int12 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryStart = (-1989560847);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15._hashSize;
        byteQuadsCanonicalizer15._count = (byte) 100;
        java.lang.String[] strArray19 = byteQuadsCanonicalizer15._names;
        int[] intArray24 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int26 = byteQuadsCanonicalizer15.calcHash(intArray24, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = byteQuadsCanonicalizer0.findName(intArray24, (-432141963));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("", (-432144663), (-432144663), (-1409342043));
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
        java.lang.String str9 = byteQuadsCanonicalizer1.findName((-432142677));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._secondaryStart = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.addName("", 69583914, 725969029);
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
        int[] intArray15 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.findName(intArray15, (-432145171));
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
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("hi!", 0, 0, (-673760834));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1409333610), 0, (-673785726));
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
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("hi!", (-432143211), (-432143079), (-673757953));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-673754096), (-38977595), 1399014416);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("hi!", (-432139373), 1467313563);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = 725993347;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = byteQuadsCanonicalizer1.tertiaryCount();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432144783);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((int) (byte) 10, (-673796221), 725996119);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("", (-432142603), (-432143255), 1399014416);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432140179), (-432146251));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-2056698990));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._count = (byte) 100;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        java.lang.String str17 = byteQuadsCanonicalizer12.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        byteQuadsCanonicalizer18._count = (byte) 100;
        java.lang.String[] strArray22 = byteQuadsCanonicalizer18._names;
        int[] intArray27 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int29 = byteQuadsCanonicalizer18.calcHash(intArray27, 4);
        byteQuadsCanonicalizer12._hashArea = intArray27;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = byteQuadsCanonicalizer0.findName(intArray27, (-432143211));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int4 = byteQuadsCanonicalizer1.calcHash(1523833955);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.findName(725961361, 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer0.findName((-432142187));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-2044706367);
        byteQuadsCanonicalizer0._secondaryStart = (-1100142565);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("hi!", (-1409378835), (-432140007), 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int int2 = byteQuadsCanonicalizer1.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1870308865), 503511596);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-673746378);
        int int7 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("hi!", (-432144585), (-432142187), (-432138839));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-118405630), (-432144003), (-317493067));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._count = (-673785726);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 284244356);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        byteQuadsCanonicalizer0._count = 725995156;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("", (-432141007), (-673760834), 726008188);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432143815), (-673783304));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int15 = byteQuadsCanonicalizer14.hashSeed();
        int int19 = byteQuadsCanonicalizer14.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean20 = byteQuadsCanonicalizer14.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int22 = byteQuadsCanonicalizer21._hashSize;
        byteQuadsCanonicalizer21._count = (byte) 100;
        java.lang.String[] strArray25 = byteQuadsCanonicalizer21._names;
        int[] intArray30 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int32 = byteQuadsCanonicalizer21.calcHash(intArray30, 4);
        byteQuadsCanonicalizer21._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int36 = byteQuadsCanonicalizer35._hashSize;
        byteQuadsCanonicalizer35._count = (byte) 100;
        java.lang.String[] strArray39 = byteQuadsCanonicalizer35._names;
        int[] intArray44 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int46 = byteQuadsCanonicalizer35.calcHash(intArray44, 4);
        byteQuadsCanonicalizer21._hashArea = intArray44;
        byteQuadsCanonicalizer14._hashArea = intArray44;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str50 = byteQuadsCanonicalizer0.findName(intArray44, (-432143169));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-673746557);
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._spilloverEnd = (-2044706367);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432138881), (-432141249));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer1.findName((-432142925), (-432138361), 725906596);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = (-432142147);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("hi!", (-432144663), (-432141501));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        byteQuadsCanonicalizer1._longNameOffset = (-432144003);
        int int9 = byteQuadsCanonicalizer1.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer1.addName("hi!", 0, (-937951140), (-1989560847));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = byteQuadsCanonicalizer0.addName("", (-2133014159));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = byteQuadsCanonicalizer0.addName("", 725906596, 1583421697, 439949297);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._hashSize = (-2034212398);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432144281), (-1857547515));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._secondaryStart = 0;
        int[] intArray8 = byteQuadsCanonicalizer0._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1888459861), (-432139373), 12495515);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432138821), 725954260);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432144145), (-673804787), (-1814760150));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1888459861), 1848248);
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-673935579), (-673788291));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-2134594281));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._longNameOffset = (byte) 100;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName((-2034212398));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("", (-432137511), 2104408134);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        int int16 = byteQuadsCanonicalizer14._spilloverEnd;
        int int17 = byteQuadsCanonicalizer14._tertiaryShift;
        boolean boolean18 = byteQuadsCanonicalizer14._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        byteQuadsCanonicalizer19._count = (byte) 100;
        java.lang.String[] strArray23 = byteQuadsCanonicalizer19._names;
        int[] intArray28 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int30 = byteQuadsCanonicalizer19.calcHash(intArray28, 4);
        byteQuadsCanonicalizer19._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer33 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int34 = byteQuadsCanonicalizer33._hashSize;
        byteQuadsCanonicalizer33._count = (byte) 100;
        java.lang.String[] strArray37 = byteQuadsCanonicalizer33._names;
        int[] intArray42 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int44 = byteQuadsCanonicalizer33.calcHash(intArray42, 4);
        byteQuadsCanonicalizer19._hashArea = intArray42;
        byteQuadsCanonicalizer14._hashArea = intArray42;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = byteQuadsCanonicalizer0.findName(intArray42, 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-1409287638), (-1140108292));
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
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432138381), (-432143269), (-1409354625));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1._spilloverEnd = (-432142005);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.addName("hi!", (-432144145), (int) '#');
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._hashSize = (-1072272327);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-540718793), (-432138219), (-1404133737));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 284279915);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432141007), (-432136775), 30323224);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-673746378);
        int int9 = byteQuadsCanonicalizer0.calcHash((-410067625), (-432142511));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-673781396), 500074052);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432143211));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((-432144915), (-1542057529));
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        int int12 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-432140985));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = (-432142147);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-673933336));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-432136761), (-432138901), (-432140241));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("", (-1583542859), (-432138329), (-432143407));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("", (-418876003), (-432137055));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName(738849150, (-1814078453));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432138111));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = byteQuadsCanonicalizer1.findName(1583421697);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(443875710, (-432139185));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-1346506924), (-1242504663));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-432137967));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("hi!", (-1937877538));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        byteQuadsCanonicalizer0._count = 725995156;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("hi!", 627485498, (-1836488100));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._hashSize = (-2034212398);
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = byteQuadsCanonicalizer0.totalCount();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144543));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash((-922425077), (-1409375901));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("", 64);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._secondaryStart = (-432144203);
        int int11 = byteQuadsCanonicalizer0._tertiaryStart;
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
        int[] intArray30 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int32 = byteQuadsCanonicalizer21.calcHash(intArray30, 4);
        java.lang.String[] strArray38 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer21._names = strArray38;
        byteQuadsCanonicalizer12._names = strArray38;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer41 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int42 = byteQuadsCanonicalizer41._hashSize;
        byteQuadsCanonicalizer41._count = (byte) 100;
        java.lang.String[] strArray45 = byteQuadsCanonicalizer41._names;
        int[] intArray50 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int52 = byteQuadsCanonicalizer41.calcHash(intArray50, 4);
        byteQuadsCanonicalizer12._hashArea = intArray50;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str55 = byteQuadsCanonicalizer0.findName(intArray50, 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryStart = (-1409354625);
        byteQuadsCanonicalizer0._count = 725989756;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName(0, (-1442289836), (-1468138394));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7._hashSize;
        byteQuadsCanonicalizer7._count = (byte) 100;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer7._names;
        int[] intArray16 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int18 = byteQuadsCanonicalizer7.calcHash(intArray16, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.findName(intArray16, (-1402300982));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432136985), (-313722276));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0._tertiaryStart = (-432144783);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-432134039), (-432134251));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-734149582), (-432141467), (-2061310101));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._hashSize = 691534002;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-202387379), 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144281), (-432142395), 12495515);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8._hashSize;
        int int10 = byteQuadsCanonicalizer8._spilloverEnd;
        int int11 = byteQuadsCanonicalizer8._tertiaryShift;
        boolean boolean12 = byteQuadsCanonicalizer8._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        byteQuadsCanonicalizer13._count = (byte) 100;
        java.lang.String[] strArray17 = byteQuadsCanonicalizer13._names;
        int[] intArray22 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        byteQuadsCanonicalizer13._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27._hashSize;
        byteQuadsCanonicalizer27._count = (byte) 100;
        java.lang.String[] strArray31 = byteQuadsCanonicalizer27._names;
        int[] intArray36 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int38 = byteQuadsCanonicalizer27.calcHash(intArray36, 4);
        byteQuadsCanonicalizer13._hashArea = intArray36;
        byteQuadsCanonicalizer8._hashArea = intArray36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = byteQuadsCanonicalizer0.findName(intArray36, (-1332194793));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        int int12 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryStart = (-1989560847);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName((-673939402), 725908810);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-1602471359));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1888459861), 1848248);
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("", 87973, (-432136347), (-432138389));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 539181638);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        int[] intArray18 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int20 = byteQuadsCanonicalizer9.calcHash(intArray18, 4);
        java.lang.String[] strArray26 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer9._names = strArray26;
        byteQuadsCanonicalizer0._names = strArray26;
        java.lang.String[] strArray29 = new java.lang.String[] {};
        byteQuadsCanonicalizer0._names = strArray29;
        int int31 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = byteQuadsCanonicalizer0.findName((-432135281), (-432133571), 726002014);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._count = (byte) 100;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        int[] intArray21 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int23 = byteQuadsCanonicalizer12.calcHash(intArray21, 4);
        java.lang.String[] strArray29 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer12._names = strArray29;
        byteQuadsCanonicalizer0._names = strArray29;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = byteQuadsCanonicalizer0.findName((-432141207));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '4');
        int int11 = byteQuadsCanonicalizer0.calcHash((int) '4', 0);
        int[] intArray12 = byteQuadsCanonicalizer0._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("hi!", (-1409287638));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int int2 = byteQuadsCanonicalizer1._spilloverEnd;
        byteQuadsCanonicalizer1._spilloverEnd = (-673804787);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.findName((-432140955), (-432134575));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryStart = (-673776329);
        int int15 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._hashSize;
        byteQuadsCanonicalizer16._count = (byte) 100;
        java.lang.String[] strArray20 = byteQuadsCanonicalizer16._names;
        java.lang.String str21 = byteQuadsCanonicalizer16.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._hashSize;
        byteQuadsCanonicalizer22._count = (byte) 100;
        java.lang.String[] strArray26 = byteQuadsCanonicalizer22._names;
        int[] intArray31 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int33 = byteQuadsCanonicalizer22.calcHash(intArray31, 4);
        byteQuadsCanonicalizer16._hashArea = intArray31;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = byteQuadsCanonicalizer0.findName(intArray31, (-673900345));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-673746557);
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._spilloverEnd = (-2044706367);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-432144033), 468528113, (-533239739));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432134469), 503511596, (-673798814));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        int int4 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName(1640826319, (-432137215), 448);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = (-432142147);
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("", (-432144557), 337130694, (-1100142565));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-432138613), (-1470787311), 1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = (-432139871);
        boolean boolean11 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(725949283);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._secondaryStart = (-432144145);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432144783);
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-673766456);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432140859), (-673788291));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-673746378);
        int int7 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0._tertiaryStart = (-432138851);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-34572865), 1000243546, 603116786);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(48709);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((-432140985), (-432135175));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        int int8 = byteQuadsCanonicalizer1.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer1.findName((-432143255), 725940148, (-432142147));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._hashSize = 1343294393;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = byteQuadsCanonicalizer0.tertiaryCount();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432136801), 914164974);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-673746378);
        int int7 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryShift = (-1601321579);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", (-230492940), (-432135281));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-502302621));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", 1640826319);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._tertiaryStart = 1659689371;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int6 = byteQuadsCanonicalizer5._hashSize;
        byteQuadsCanonicalizer5._count = (byte) 100;
        java.lang.String[] strArray9 = byteQuadsCanonicalizer5._names;
        int[] intArray14 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int16 = byteQuadsCanonicalizer5.calcHash(intArray14, 4);
        byteQuadsCanonicalizer5._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        byteQuadsCanonicalizer19._count = (byte) 100;
        java.lang.String[] strArray23 = byteQuadsCanonicalizer19._names;
        int[] intArray28 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int30 = byteQuadsCanonicalizer19.calcHash(intArray28, 4);
        byteQuadsCanonicalizer5._hashArea = intArray28;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = byteQuadsCanonicalizer0.findName(intArray28, (-1442289836));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        int int19 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.findName((int) (byte) 0);
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
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._secondaryStart = 1343294393;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432140831), 1423676721);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-432144543), 221574612);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        int[] intArray22 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        java.lang.String[] strArray30 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer13._names = strArray30;
        byteQuadsCanonicalizer4._names = strArray30;
        byteQuadsCanonicalizer0._names = strArray30;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._intern = false;
        byteQuadsCanonicalizer0._tertiaryStart = (-432146455);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str43 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", (-432135985), 1384856357, 78499);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        int int13 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName(0, (-159454034));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        int int4 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 725914147, (int) (short) 1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0.makeChild((-432132905));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-1409414529), (int) (byte) 10, 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int12 = byteQuadsCanonicalizer0.calcHash((-432139271), (-2133014159), 914786180);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("hi!", (-432137715), 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0._parent;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-118405630), 691534002);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(914786180);
        byteQuadsCanonicalizer1._longNameOffset = (-432138111);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.findName((-432132555), 706888668, (-1409337966));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-673757953), (-432137985), (-432141577));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432133099), (-1409333610));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '4');
        byteQuadsCanonicalizer0._hashSize = 1916468422;
        int int11 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12.hashSeed();
        int int14 = byteQuadsCanonicalizer12._longNameOffset;
        int int15 = byteQuadsCanonicalizer12._longNameOffset;
        boolean boolean16 = byteQuadsCanonicalizer12._intern;
        int int17 = byteQuadsCanonicalizer12._secondaryStart;
        int int18 = byteQuadsCanonicalizer12._spilloverEnd;
        int int19 = byteQuadsCanonicalizer12.primaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20._hashSize;
        byteQuadsCanonicalizer20._count = (byte) 100;
        int int24 = byteQuadsCanonicalizer20.bucketCount();
        int int25 = byteQuadsCanonicalizer20._tertiaryStart;
        int int26 = byteQuadsCanonicalizer20.primaryCount();
        int int27 = byteQuadsCanonicalizer20.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer29 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray30 = byteQuadsCanonicalizer29._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31._hashSize;
        byteQuadsCanonicalizer31._count = (byte) 100;
        java.lang.String[] strArray35 = byteQuadsCanonicalizer31._names;
        int[] intArray40 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int42 = byteQuadsCanonicalizer31.calcHash(intArray40, 4);
        byteQuadsCanonicalizer31._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer45 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int46 = byteQuadsCanonicalizer45._hashSize;
        byteQuadsCanonicalizer45._count = (byte) 100;
        java.lang.String[] strArray49 = byteQuadsCanonicalizer45._names;
        int[] intArray54 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int56 = byteQuadsCanonicalizer45.calcHash(intArray54, 4);
        byteQuadsCanonicalizer31._hashArea = intArray54;
        byteQuadsCanonicalizer29._hashArea = intArray54;
        byteQuadsCanonicalizer20._hashArea = intArray54;
        byteQuadsCanonicalizer12._hashArea = intArray54;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str62 = byteQuadsCanonicalizer0.findName(intArray54, 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8._hashSize;
        byteQuadsCanonicalizer8._count = (byte) 100;
        java.lang.String[] strArray12 = byteQuadsCanonicalizer8._names;
        byteQuadsCanonicalizer8._spilloverEnd = (byte) 100;
        int int15 = byteQuadsCanonicalizer8._spilloverEnd;
        int int16 = byteQuadsCanonicalizer8.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17._hashSize;
        byteQuadsCanonicalizer17._count = (byte) 100;
        java.lang.String[] strArray21 = byteQuadsCanonicalizer17._names;
        int[] intArray26 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int28 = byteQuadsCanonicalizer17.calcHash(intArray26, 4);
        java.lang.String[] strArray34 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer17._names = strArray34;
        byteQuadsCanonicalizer8._names = strArray34;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer37 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int38 = byteQuadsCanonicalizer37._hashSize;
        byteQuadsCanonicalizer37._count = (byte) 100;
        java.lang.String[] strArray41 = byteQuadsCanonicalizer37._names;
        int[] intArray46 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int48 = byteQuadsCanonicalizer37.calcHash(intArray46, 4);
        byteQuadsCanonicalizer8._hashArea = intArray46;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = byteQuadsCanonicalizer0.findName(intArray46, (-673893773));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName((-673931294), (-432130603));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._tertiaryShift = (-432138445);
        byteQuadsCanonicalizer0._tertiaryStart = (-537590853);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName(726008305, 725900863);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-432137929));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        int int13 = byteQuadsCanonicalizer0.calcHash((-432142511));
        byteQuadsCanonicalizer0._secondaryStart = (-432136637);
        int int18 = byteQuadsCanonicalizer0.calcHash(1547696045, (-2136512287));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = byteQuadsCanonicalizer20.makeChild(802144728);
        byteQuadsCanonicalizer22._reportTooManyCollisions();
        int int24 = byteQuadsCanonicalizer22._count;
        byteQuadsCanonicalizer22._hashSize = (-432142511);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer29 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int30 = byteQuadsCanonicalizer29._hashSize;
        byteQuadsCanonicalizer29._count = (byte) 100;
        java.lang.String[] strArray33 = byteQuadsCanonicalizer29._names;
        int[] intArray38 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int40 = byteQuadsCanonicalizer29.calcHash(intArray38, 4);
        byteQuadsCanonicalizer27._hashArea = intArray38;
        byteQuadsCanonicalizer22._hashArea = intArray38;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = byteQuadsCanonicalizer0.findName(intArray38, (-567657864));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._count = 711100329;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-673923081), 725989756, 2045893375);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        boolean boolean19 = byteQuadsCanonicalizer0._intern;
        boolean boolean20 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = byteQuadsCanonicalizer0.findName(1900206, 0, (-432136801));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-673746557);
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._hashSize = (-432141479);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = byteQuadsCanonicalizer0.totalCount();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName(144894492, (-815134752));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild(30323224);
        byteQuadsCanonicalizer8._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer8.makeChild(914786180);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._count = (byte) 100;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        int[] intArray21 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int23 = byteQuadsCanonicalizer12.calcHash(intArray21, 4);
        java.lang.String[] strArray29 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer12._names = strArray29;
        byteQuadsCanonicalizer0._names = strArray29;
        int[] intArray32 = byteQuadsCanonicalizer0._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = byteQuadsCanonicalizer0.findName((-2133014159), 468528113, 725908810);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.findName((-1343006459), (-1633755790), 725940148);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        int[] intArray22 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        java.lang.String[] strArray30 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer13._names = strArray30;
        byteQuadsCanonicalizer4._names = strArray30;
        byteQuadsCanonicalizer0._names = strArray30;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int35 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean36 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = byteQuadsCanonicalizer0.findName(2106330168, (-432134177), (-432142005));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-1771536248), (-673759171));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._hashSize = 691534002;
        byteQuadsCanonicalizer0._longNameOffset = (-136442680);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int14 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName(725918890, (-1472414162));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 725896183, (-432136165), (-432131565));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = (-432142147);
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._spilloverEnd = 2043773923;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-1182425463));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        int int13 = byteQuadsCanonicalizer0.calcHash((-432142511));
        boolean boolean14 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName(0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild(30323224);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432130603), 1187557813, 725940148);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._hashSize = (-922425077);
        int int11 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(566754343);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = (-432142147);
        byteQuadsCanonicalizer0._longNameOffset = (-432142939);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-432140741), 1276793159, (-432131983));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("hi!", (-432140741));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        byteQuadsCanonicalizer1.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-2082658397), (-2092047994));
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
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer0._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-432140741), 1678385731);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName(725909656, 2104408134, (-432129919));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0._parent;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432130787));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-527959786), (-432133943));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-673933463), (-718682518));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144281), (-432142395), 12495515);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-891493693), (-673933336));
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
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(725969857);
        int int10 = byteQuadsCanonicalizer0.size();
        int int14 = byteQuadsCanonicalizer0.calcHash(0, (-432144145), (-432137257));
        boolean boolean15 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432137417), (-432138183));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(48709);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1072272327));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432139849);
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(0, (-432138183), 1542398884);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._secondaryStart = (-673910467);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", 725876932);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-673913700), (-432144281), 726009970);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432139871), 725842624, 284244356);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        int[] intArray18 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int20 = byteQuadsCanonicalizer9.calcHash(intArray18, 4);
        java.lang.String[] strArray26 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer9._names = strArray26;
        byteQuadsCanonicalizer0._names = strArray26;
        java.lang.String[] strArray29 = new java.lang.String[] {};
        byteQuadsCanonicalizer0._names = strArray29;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31._hashSize;
        byteQuadsCanonicalizer31._count = (byte) 100;
        java.lang.String[] strArray35 = byteQuadsCanonicalizer31._names;
        int[] intArray40 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int42 = byteQuadsCanonicalizer31.calcHash(intArray40, 4);
        byteQuadsCanonicalizer31._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer45 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int46 = byteQuadsCanonicalizer45._hashSize;
        byteQuadsCanonicalizer45._count = (byte) 100;
        java.lang.String[] strArray49 = byteQuadsCanonicalizer45._names;
        int[] intArray54 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int56 = byteQuadsCanonicalizer45.calcHash(intArray54, 4);
        byteQuadsCanonicalizer31._hashArea = intArray54;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str59 = byteQuadsCanonicalizer0.findName(intArray54, (-673866219));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        boolean boolean9 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean10 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 276134592, (-673931294), 1842026);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432140467));
        boolean boolean2 = byteQuadsCanonicalizer1.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((-432145879));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-673746378);
        int int7 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0._tertiaryStart = (-432138851);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-432135549));
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
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        int int14 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName((-481195759), 0, 725846764);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-673746557);
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._hashSize = (-432141479);
        int int9 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1903393270), (-432130573), (-432129277));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        byteQuadsCanonicalizer0._count = 2430;
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(285499017, (-1544296047), (-432129545));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        byteQuadsCanonicalizer10._count = (byte) 100;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer10._names;
        int[] intArray19 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int21 = byteQuadsCanonicalizer10.calcHash(intArray19, 4);
        byteQuadsCanonicalizer8._hashArea = intArray19;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = byteQuadsCanonicalizer0.findName(intArray19, (-432129269));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        int int6 = byteQuadsCanonicalizer3.calcHash((-432144557), (-432142345));
        java.lang.String str8 = byteQuadsCanonicalizer3.findName((-267819025));
        java.lang.String str13 = byteQuadsCanonicalizer3.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-1410847716), (-432134941), 725986678);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = byteQuadsCanonicalizer3.makeChild((-2653817));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        int int13 = byteQuadsCanonicalizer0.calcHash((-432142511));
        byteQuadsCanonicalizer0._secondaryStart = (-432136637);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.addName("hi!", (-1125391577), (-432128835));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild((-432144915));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(726013165);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("", (-673922276));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int[] intArray2 = byteQuadsCanonicalizer0._hashArea;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-673883155), 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int int2 = byteQuadsCanonicalizer1.size();
        int int3 = byteQuadsCanonicalizer1.size();
        boolean boolean4 = byteQuadsCanonicalizer1._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", (-432138613));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((-432137511));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = (-1425713151);
        int int14 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName(725949085, (-432139745), (-432127373));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._count = (-673785726);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("", 2098309377, (-1346506924));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", 626031149, (-432132005));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", 726004858);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._longNameOffset;
        boolean boolean8 = byteQuadsCanonicalizer1.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432130937), 1506600051);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432127303), (-1557235482));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = (-1425713151);
        int int14 = byteQuadsCanonicalizer0.size();
        int int15 = byteQuadsCanonicalizer0.size();
        int int17 = byteQuadsCanonicalizer0.calcHash((-432134461));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432130663));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        boolean boolean19 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", (-432137437), 725939653);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) 100);
        byteQuadsCanonicalizer1._hashSize = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.findName(924629957, 726014290, (-1405568282));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._intern = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-432132513), 546849782, (-1463503259));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144281), (-432142395), 12495515);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("hi!", (-1541197624));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int9 = byteQuadsCanonicalizer0.calcHash((-432135531), (-673933336), 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-432130177), 1307576732, 827583716);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        int[] intArray13 = byteQuadsCanonicalizer0._hashArea;
        int int14 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-673795353), (-432138983), (-673976455));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432128777), 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-1409337966);
        int int16 = byteQuadsCanonicalizer0.primaryCount();
        int int17 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", (-1536995760), (-673877917));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432140467));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName(725841778, (-432132457));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.primaryCount();
        int int4 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._hashSize = (-199154010);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-432138969), 725906119, (-432130565));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
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
        int[] intArray22 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        java.lang.String[] strArray30 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer13._names = strArray30;
        byteQuadsCanonicalizer4._names = strArray30;
        byteQuadsCanonicalizer0._names = strArray30;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int35 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean36 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = byteQuadsCanonicalizer0.addName("", (-432129099), (-1338553364), 284474144);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-673746557);
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-1499223049, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-313722276));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-527959786));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._tertiaryShift = (-432138445);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-432138537));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-432137357), (-432133181), 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = (-432142147);
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean9 = byteQuadsCanonicalizer0._intern;
        int int10 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", 913312044, (-432128237));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        boolean boolean3 = byteQuadsCanonicalizer1._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("", (-432127055));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._count = (-432140157);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 467276709);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._count = (-673785726);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-673915420), 121475, (-673973214));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.calcHash(726014974, 439949297, 1889548666);
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryStart = (-432128501);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9.hashSeed();
        int int11 = byteQuadsCanonicalizer9._longNameOffset;
        int int12 = byteQuadsCanonicalizer9.hashSeed();
        byteQuadsCanonicalizer9._longNameOffset = (short) 10;
        int int17 = byteQuadsCanonicalizer9.calcHash((int) '#', (int) (short) 10);
        int int18 = byteQuadsCanonicalizer9._secondaryStart;
        byteQuadsCanonicalizer9._tertiaryShift = (-673757953);
        int int21 = byteQuadsCanonicalizer9._count;
        byteQuadsCanonicalizer9._tertiaryStart = (-1989560847);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int25 = byteQuadsCanonicalizer24._hashSize;
        int int29 = byteQuadsCanonicalizer24.calcHash(726014974, 439949297, 1889548666);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        boolean boolean32 = byteQuadsCanonicalizer31.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer33 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int34 = byteQuadsCanonicalizer33._hashSize;
        byteQuadsCanonicalizer33._count = (byte) 100;
        int int37 = byteQuadsCanonicalizer33.bucketCount();
        int int38 = byteQuadsCanonicalizer33._tertiaryStart;
        int int39 = byteQuadsCanonicalizer33.primaryCount();
        int int40 = byteQuadsCanonicalizer33.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer42 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray43 = byteQuadsCanonicalizer42._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer44 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int45 = byteQuadsCanonicalizer44._hashSize;
        byteQuadsCanonicalizer44._count = (byte) 100;
        java.lang.String[] strArray48 = byteQuadsCanonicalizer44._names;
        int[] intArray53 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int55 = byteQuadsCanonicalizer44.calcHash(intArray53, 4);
        byteQuadsCanonicalizer44._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer58 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int59 = byteQuadsCanonicalizer58._hashSize;
        byteQuadsCanonicalizer58._count = (byte) 100;
        java.lang.String[] strArray62 = byteQuadsCanonicalizer58._names;
        int[] intArray67 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int69 = byteQuadsCanonicalizer58.calcHash(intArray67, 4);
        byteQuadsCanonicalizer44._hashArea = intArray67;
        byteQuadsCanonicalizer42._hashArea = intArray67;
        byteQuadsCanonicalizer33._hashArea = intArray67;
        byteQuadsCanonicalizer31._hashArea = intArray67;
        byteQuadsCanonicalizer24._hashArea = intArray67;
        byteQuadsCanonicalizer9._hashArea = intArray67;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str77 = byteQuadsCanonicalizer0.findName(intArray67, (-432134985));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(725969857);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432142439, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-673963754), (-331548329), (-1049211661));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName((-432134063), (-1878463180));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryStart = (-1409354625);
        byteQuadsCanonicalizer0._count = 725989756;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1499125179), (-1633755790));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int9 = byteQuadsCanonicalizer0.calcHash(725929726, (-209223870));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1946282133, (-432126507), (-432139765));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int5 = byteQuadsCanonicalizer0.calcHash((-432138839));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        java.lang.String str11 = byteQuadsCanonicalizer6.toString();
        byteQuadsCanonicalizer6._hashSize = (-432142147);
        int int14 = byteQuadsCanonicalizer6.spilloverCount();
        int int15 = byteQuadsCanonicalizer6.bucketCount();
        byteQuadsCanonicalizer6._spilloverEnd = 2043773923;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        int int20 = byteQuadsCanonicalizer18._spilloverEnd;
        int int21 = byteQuadsCanonicalizer18._tertiaryShift;
        boolean boolean22 = byteQuadsCanonicalizer18._intern;
        boolean boolean23 = byteQuadsCanonicalizer18._intern;
        java.lang.String str24 = byteQuadsCanonicalizer18.toString();
        byteQuadsCanonicalizer18._tertiaryShift = 6000;
        int int27 = byteQuadsCanonicalizer18.bucketCount();
        int int28 = byteQuadsCanonicalizer18._count;
        byteQuadsCanonicalizer18._count = 725995156;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31.hashSeed();
        int int33 = byteQuadsCanonicalizer31._longNameOffset;
        int int34 = byteQuadsCanonicalizer31.hashSeed();
        byteQuadsCanonicalizer31._longNameOffset = (short) 10;
        int int39 = byteQuadsCanonicalizer31.calcHash((int) '#', (int) (short) 10);
        int int40 = byteQuadsCanonicalizer31._secondaryStart;
        byteQuadsCanonicalizer31._tertiaryShift = (-673757953);
        boolean boolean43 = byteQuadsCanonicalizer31.maybeDirty();
        int int44 = byteQuadsCanonicalizer31._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer45 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int46 = byteQuadsCanonicalizer45._hashSize;
        java.lang.String str47 = byteQuadsCanonicalizer45.toString();
        int[] intArray52 = new int[] { (-432144557), (-432145785), 725972989, 490519636 };
        byteQuadsCanonicalizer45._hashArea = intArray52;
        byteQuadsCanonicalizer31._hashArea = intArray52;
        byteQuadsCanonicalizer18._hashArea = intArray52;
        byteQuadsCanonicalizer6._hashArea = intArray52;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str58 = byteQuadsCanonicalizer0.findName(intArray52, (-432133361));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-1140108292));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int3 = byteQuadsCanonicalizer1._tertiaryShift;
        byteQuadsCanonicalizer1._count = 1789058923;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.findName(913312044, 725868112, 1421574550);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._longNameOffset = (-1409414529);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._count = (byte) 100;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        java.lang.String str17 = byteQuadsCanonicalizer12.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        byteQuadsCanonicalizer18._count = (byte) 100;
        java.lang.String[] strArray22 = byteQuadsCanonicalizer18._names;
        int[] intArray27 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int29 = byteQuadsCanonicalizer18.calcHash(intArray27, 4);
        byteQuadsCanonicalizer12._hashArea = intArray27;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = byteQuadsCanonicalizer0.findName(intArray27, (-432127705));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        boolean boolean8 = byteQuadsCanonicalizer1._failOnDoS;
        int int9 = byteQuadsCanonicalizer1.size();
        int int10 = byteQuadsCanonicalizer1._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer1.findName((-432128801), (-432142359), 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-673765784), (-1499125179));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) 100);
        int int2 = byteQuadsCanonicalizer1.tertiaryCount();
        int int3 = byteQuadsCanonicalizer1._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int5 = byteQuadsCanonicalizer4.hashSeed();
        int int6 = byteQuadsCanonicalizer4._longNameOffset;
        int int7 = byteQuadsCanonicalizer4.hashSeed();
        byteQuadsCanonicalizer4._longNameOffset = (short) 10;
        int int12 = byteQuadsCanonicalizer4.calcHash((int) '#', (int) (short) 10);
        int int13 = byteQuadsCanonicalizer4._secondaryStart;
        byteQuadsCanonicalizer4._tertiaryShift = (-673757953);
        boolean boolean16 = byteQuadsCanonicalizer4.maybeDirty();
        int int17 = byteQuadsCanonicalizer4._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        java.lang.String str20 = byteQuadsCanonicalizer18.toString();
        int[] intArray25 = new int[] { (-432144557), (-432145785), 725972989, 490519636 };
        byteQuadsCanonicalizer18._hashArea = intArray25;
        byteQuadsCanonicalizer4._hashArea = intArray25;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = byteQuadsCanonicalizer1.findName(intArray25, (-1346506924));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.calcHash((-432144885));
        int[] intArray5 = byteQuadsCanonicalizer0._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432128695), 763360754, (-1055472513));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-217805254), (-1409333610));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._longNameOffset = (-201795637);
        int int12 = byteQuadsCanonicalizer0.calcHash((-432145171));
        int int13 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName((-432125303), 725984824);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-409896094), 725874484, (-1243533735));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432144783);
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(275793012, (-432141389));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        int int11 = byteQuadsCanonicalizer9._spilloverEnd;
        int int12 = byteQuadsCanonicalizer9._longNameOffset;
        int int13 = byteQuadsCanonicalizer9.hashSeed();
        int int16 = byteQuadsCanonicalizer9.calcHash((-1888459861), 1848248);
        int int17 = byteQuadsCanonicalizer9.secondaryCount();
        int int18 = byteQuadsCanonicalizer9._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19.hashSeed();
        int int21 = byteQuadsCanonicalizer19._longNameOffset;
        int int22 = byteQuadsCanonicalizer19.hashSeed();
        byteQuadsCanonicalizer19._longNameOffset = (short) 10;
        int int27 = byteQuadsCanonicalizer19.calcHash((int) '#', (int) (short) 10);
        int int28 = byteQuadsCanonicalizer19._secondaryStart;
        byteQuadsCanonicalizer19._tertiaryShift = (-673757953);
        int int31 = byteQuadsCanonicalizer19._count;
        byteQuadsCanonicalizer19._tertiaryStart = (-1989560847);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer34 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int35 = byteQuadsCanonicalizer34._hashSize;
        int int39 = byteQuadsCanonicalizer34.calcHash(726014974, 439949297, 1889548666);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer41 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        boolean boolean42 = byteQuadsCanonicalizer41.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer43 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int44 = byteQuadsCanonicalizer43._hashSize;
        byteQuadsCanonicalizer43._count = (byte) 100;
        int int47 = byteQuadsCanonicalizer43.bucketCount();
        int int48 = byteQuadsCanonicalizer43._tertiaryStart;
        int int49 = byteQuadsCanonicalizer43.primaryCount();
        int int50 = byteQuadsCanonicalizer43.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer52 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray53 = byteQuadsCanonicalizer52._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer54 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int55 = byteQuadsCanonicalizer54._hashSize;
        byteQuadsCanonicalizer54._count = (byte) 100;
        java.lang.String[] strArray58 = byteQuadsCanonicalizer54._names;
        int[] intArray63 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int65 = byteQuadsCanonicalizer54.calcHash(intArray63, 4);
        byteQuadsCanonicalizer54._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer68 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int69 = byteQuadsCanonicalizer68._hashSize;
        byteQuadsCanonicalizer68._count = (byte) 100;
        java.lang.String[] strArray72 = byteQuadsCanonicalizer68._names;
        int[] intArray77 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int79 = byteQuadsCanonicalizer68.calcHash(intArray77, 4);
        byteQuadsCanonicalizer54._hashArea = intArray77;
        byteQuadsCanonicalizer52._hashArea = intArray77;
        byteQuadsCanonicalizer43._hashArea = intArray77;
        byteQuadsCanonicalizer41._hashArea = intArray77;
        byteQuadsCanonicalizer34._hashArea = intArray77;
        byteQuadsCanonicalizer19._hashArea = intArray77;
        byteQuadsCanonicalizer9._hashArea = intArray77;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str88 = byteQuadsCanonicalizer0.findName(intArray77, (-432128857));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-1409337966);
        int int16 = byteQuadsCanonicalizer0.primaryCount();
        int int17 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432132975), (-432144663), 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        boolean boolean19 = byteQuadsCanonicalizer0._intern;
        boolean boolean20 = byteQuadsCanonicalizer0._intern;
        boolean boolean21 = byteQuadsCanonicalizer0.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray24 = byteQuadsCanonicalizer23._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int26 = byteQuadsCanonicalizer25._hashSize;
        byteQuadsCanonicalizer25._count = (byte) 100;
        java.lang.String[] strArray29 = byteQuadsCanonicalizer25._names;
        int[] intArray34 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int36 = byteQuadsCanonicalizer25.calcHash(intArray34, 4);
        byteQuadsCanonicalizer25._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer39 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int40 = byteQuadsCanonicalizer39._hashSize;
        byteQuadsCanonicalizer39._count = (byte) 100;
        java.lang.String[] strArray43 = byteQuadsCanonicalizer39._names;
        int[] intArray48 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int50 = byteQuadsCanonicalizer39.calcHash(intArray48, 4);
        byteQuadsCanonicalizer25._hashArea = intArray48;
        byteQuadsCanonicalizer23._hashArea = intArray48;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str54 = byteQuadsCanonicalizer0.findName(intArray48, (-432136225));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432145785));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2.hashSeed();
        int int4 = byteQuadsCanonicalizer2._longNameOffset;
        int int5 = byteQuadsCanonicalizer2.hashSeed();
        byteQuadsCanonicalizer2._longNameOffset = (short) 10;
        int int10 = byteQuadsCanonicalizer2.calcHash((int) '#', (int) (short) 10);
        int int11 = byteQuadsCanonicalizer2._secondaryStart;
        byteQuadsCanonicalizer2._tertiaryShift = (-673757953);
        boolean boolean14 = byteQuadsCanonicalizer2.maybeDirty();
        int int15 = byteQuadsCanonicalizer2._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._hashSize;
        java.lang.String str18 = byteQuadsCanonicalizer16.toString();
        int[] intArray23 = new int[] { (-432144557), (-432145785), 725972989, 490519636 };
        byteQuadsCanonicalizer16._hashArea = intArray23;
        byteQuadsCanonicalizer2._hashArea = intArray23;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = byteQuadsCanonicalizer1.findName(intArray23, (-1542174682));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432143237));
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        java.lang.String str3 = byteQuadsCanonicalizer1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432122987), (-432141249));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-673746378);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-1753259044), (-432128357));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
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
        int[] intArray22 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        java.lang.String[] strArray30 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer13._names = strArray30;
        byteQuadsCanonicalizer4._names = strArray30;
        byteQuadsCanonicalizer0._names = strArray30;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._intern = false;
        int int37 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean38 = byteQuadsCanonicalizer0._failOnDoS;
        int int40 = byteQuadsCanonicalizer0.calcHash(0);
        boolean boolean41 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = byteQuadsCanonicalizer0.findName(1284702313, 725900350);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._secondaryStart = (-432144203);
        int int11 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432136225));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._longNameOffset;
        boolean boolean8 = byteQuadsCanonicalizer1.maybeDirty();
        int int9 = byteQuadsCanonicalizer1._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", (int) (byte) 10, 725795419);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.findName(0, 725885914);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        int int6 = byteQuadsCanonicalizer0._count;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432136637), (-1067208566));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        int int6 = byteQuadsCanonicalizer3.calcHash((-432144557), (-432142345));
        byteQuadsCanonicalizer3.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer3._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer8.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-1499223049, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1561654482), (-129686929));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean9 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.secondaryCount();
        int int11 = byteQuadsCanonicalizer0.primaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(1343135218);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int6 = byteQuadsCanonicalizer5.hashSeed();
        int int7 = byteQuadsCanonicalizer5._longNameOffset;
        int int8 = byteQuadsCanonicalizer5.hashSeed();
        byteQuadsCanonicalizer5._longNameOffset = (short) 10;
        int int13 = byteQuadsCanonicalizer5.calcHash((int) '#', (int) (short) 10);
        int int14 = byteQuadsCanonicalizer5._secondaryStart;
        byteQuadsCanonicalizer5._tertiaryShift = (-673757953);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17._hashSize;
        byteQuadsCanonicalizer17._count = (byte) 100;
        java.lang.String[] strArray21 = byteQuadsCanonicalizer17._names;
        int[] intArray26 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int28 = byteQuadsCanonicalizer17.calcHash(intArray26, 4);
        java.lang.String[] strArray34 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer17._names = strArray34;
        byteQuadsCanonicalizer5._names = strArray34;
        byteQuadsCanonicalizer0._names = strArray34;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = byteQuadsCanonicalizer0.addName("hi!", (-432130573), (-481636026), 665458054);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432143269));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        int int4 = byteQuadsCanonicalizer0._tertiaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int7 = byteQuadsCanonicalizer6.hashSeed();
        int int11 = byteQuadsCanonicalizer6.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean12 = byteQuadsCanonicalizer6.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        byteQuadsCanonicalizer13._count = (byte) 100;
        java.lang.String[] strArray17 = byteQuadsCanonicalizer13._names;
        int[] intArray22 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        byteQuadsCanonicalizer13._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27._hashSize;
        byteQuadsCanonicalizer27._count = (byte) 100;
        java.lang.String[] strArray31 = byteQuadsCanonicalizer27._names;
        int[] intArray36 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int38 = byteQuadsCanonicalizer27.calcHash(intArray36, 4);
        byteQuadsCanonicalizer13._hashArea = intArray36;
        byteQuadsCanonicalizer6._hashArea = intArray36;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = byteQuadsCanonicalizer0.findName(intArray36, (-432122597));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._tertiaryStart = (-1906128232);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", (-2082658397), (-432126183), (-80192477));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        int int6 = byteQuadsCanonicalizer3.calcHash((-432144557), (-432142345));
        java.lang.String str8 = byteQuadsCanonicalizer3.findName((-267819025));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer3.makeChild((-2109007716));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        int int6 = byteQuadsCanonicalizer3.calcHash((-432144557), (-432142345));
        byteQuadsCanonicalizer3.release();
        int int8 = byteQuadsCanonicalizer3._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer3.makeChild(221574612);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._longNameOffset = (-432132939);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432129537), (-432131637), (-1557235482));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._intern = false;
        java.lang.String str10 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer11._parent;
        int int14 = byteQuadsCanonicalizer11.hashSeed();
        boolean boolean15 = byteQuadsCanonicalizer11._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = byteQuadsCanonicalizer11.makeChild(1547696045);
        int int18 = byteQuadsCanonicalizer17.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int21 = byteQuadsCanonicalizer20.hashSeed();
        int int25 = byteQuadsCanonicalizer20.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean26 = byteQuadsCanonicalizer20.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27._hashSize;
        byteQuadsCanonicalizer27._count = (byte) 100;
        java.lang.String[] strArray31 = byteQuadsCanonicalizer27._names;
        int[] intArray36 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int38 = byteQuadsCanonicalizer27.calcHash(intArray36, 4);
        byteQuadsCanonicalizer27._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer41 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int42 = byteQuadsCanonicalizer41._hashSize;
        byteQuadsCanonicalizer41._count = (byte) 100;
        java.lang.String[] strArray45 = byteQuadsCanonicalizer41._names;
        int[] intArray50 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int52 = byteQuadsCanonicalizer41.calcHash(intArray50, 4);
        byteQuadsCanonicalizer27._hashArea = intArray50;
        byteQuadsCanonicalizer20._hashArea = intArray50;
        java.lang.String str56 = byteQuadsCanonicalizer17.findName(intArray50, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str58 = byteQuadsCanonicalizer0.findName(intArray50, (-1409437389));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName(1490475275);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-1404133737);
        int int14 = byteQuadsCanonicalizer0.primaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName((-1606307428), 725949283, (-1));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._tertiaryStart = (-673785726);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-1178932564), 1266587197, (-804207314));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer0.findName(284279915);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
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
        int[] intArray22 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        java.lang.String[] strArray30 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer13._names = strArray30;
        byteQuadsCanonicalizer4._names = strArray30;
        byteQuadsCanonicalizer0._names = strArray30;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._intern = false;
        int int37 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-673993658), (-435212456), (-432145333));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        int[] intArray18 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int20 = byteQuadsCanonicalizer9.calcHash(intArray18, 4);
        java.lang.String[] strArray26 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer9._names = strArray26;
        byteQuadsCanonicalizer0._names = strArray26;
        java.lang.String[] strArray29 = new java.lang.String[] {};
        byteQuadsCanonicalizer0._names = strArray29;
        int int31 = byteQuadsCanonicalizer0.secondaryCount();
        int int32 = byteQuadsCanonicalizer0.size();
        int int33 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = byteQuadsCanonicalizer0.makeChild((-432138111));
        int int36 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = byteQuadsCanonicalizer0.findName((-432126085), 1514401315);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._secondaryStart;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean5 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432136545), (-2047302504));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = (-1425713151);
        java.lang.String str14 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName((-432126115), (-394336252));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1888459861), 1848248);
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._count = 330386728;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(180456);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._secondaryStart = 1343294393;
        int int16 = byteQuadsCanonicalizer0.calcHash(725941678, 1035967592);
        byteQuadsCanonicalizer0._secondaryStart = (-174417062);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432129071), 725981350);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._count = (-432136299);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432142439, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432129919), (-432132029), 725865106);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 2045893375;
        boolean boolean7 = byteQuadsCanonicalizer1._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.findName(232444269);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = '4';
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
        int[] intArray30 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
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
        int[] intArray61 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int63 = byteQuadsCanonicalizer52.calcHash(intArray61, 4);
        java.lang.String[] strArray69 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer52._names = strArray69;
        byteQuadsCanonicalizer43._names = strArray69;
        byteQuadsCanonicalizer0._names = strArray69;
        int int73 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._count = (-1915854326);
        boolean boolean76 = byteQuadsCanonicalizer0.maybeDirty();
        int int77 = byteQuadsCanonicalizer0.primaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str81 = byteQuadsCanonicalizer0.findName(895752321, (-432125445), (-432139849));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-1404133737);
        int int14 = byteQuadsCanonicalizer0.primaryCount();
        int int15 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName(898296528);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._secondaryStart;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean5 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-1544296047), (-432134063));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int6 = byteQuadsCanonicalizer5.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7._hashSize;
        byteQuadsCanonicalizer7._count = (byte) 100;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer7._names;
        int[] intArray16 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int18 = byteQuadsCanonicalizer7.calcHash(intArray16, 4);
        byteQuadsCanonicalizer5._hashArea = intArray16;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.findName(intArray16, (-674046600));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-673746557);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("hi!", (-1603253986), (-367184222), (-432119179));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer0.findName(725869894, 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        int int9 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-432131131), (-1190015669));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._longNameOffset = (-201795637);
        int int12 = byteQuadsCanonicalizer0.calcHash((-432145171));
        byteQuadsCanonicalizer0._intern = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 983577201, 725844010, (-432143093));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        int int9 = byteQuadsCanonicalizer0.calcHash(0, 551623854, (-432135549));
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray14 = byteQuadsCanonicalizer13._hashArea;
        int int15 = byteQuadsCanonicalizer13.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16.hashSeed();
        int int18 = byteQuadsCanonicalizer16._longNameOffset;
        int int19 = byteQuadsCanonicalizer16.hashSeed();
        byteQuadsCanonicalizer16._longNameOffset = (-1677284569);
        int int25 = byteQuadsCanonicalizer16.calcHash(0, 551623854, (-432135549));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer29 = byteQuadsCanonicalizer27.makeChild(802144728);
        byteQuadsCanonicalizer29._reportTooManyCollisions();
        int int31 = byteQuadsCanonicalizer29._count;
        byteQuadsCanonicalizer29._hashSize = (-432142511);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer34 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int35 = byteQuadsCanonicalizer34.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer36 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int37 = byteQuadsCanonicalizer36._hashSize;
        byteQuadsCanonicalizer36._count = (byte) 100;
        java.lang.String[] strArray40 = byteQuadsCanonicalizer36._names;
        int[] intArray45 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int47 = byteQuadsCanonicalizer36.calcHash(intArray45, 4);
        byteQuadsCanonicalizer34._hashArea = intArray45;
        byteQuadsCanonicalizer29._hashArea = intArray45;
        byteQuadsCanonicalizer16._hashArea = intArray45;
        byteQuadsCanonicalizer13._hashArea = intArray45;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str53 = byteQuadsCanonicalizer0.findName(intArray45, (-196746534));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-673746378);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-2130043145), 1763073338);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName(1117432984, (-432120613), (-432124875));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = '#';
        int int14 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName(829483919, (-673997546));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = (-1425713151);
        int int14 = byteQuadsCanonicalizer0.tertiaryCount();
        int[] intArray15 = byteQuadsCanonicalizer0._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/8 pri/sec/ter/spill (=0), total:8]", (-432126077));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1._spilloverEnd = (-432142005);
        java.lang.String[] strArray5 = byteQuadsCanonicalizer1._names;
        byteQuadsCanonicalizer1._secondaryStart = (-673888554);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer1.addName("hi!", 726014974, (-487405686), 1997908109);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        int int13 = byteQuadsCanonicalizer0.calcHash((-432142511));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-432122357));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._longNameOffset = (-1409414529);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName(339878723, 119367);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0.calcHash(222518211);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-673766386), (-565847607));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        int int12 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("", 725768761);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1409413593));
        int int2 = byteQuadsCanonicalizer1.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-673788291), (-432129515));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = 725993347;
        int int4 = byteQuadsCanonicalizer1._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.findName((-686735368), 1919892555, (-432140831));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136449));
        int int3 = byteQuadsCanonicalizer1.calcHash((-432129783));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.findName((-1629797500));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(492187041);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        java.lang.String[] strArray3 = byteQuadsCanonicalizer1._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-673912084), (-575074702));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int[] intArray3 = byteQuadsCanonicalizer1._hashArea;
        boolean boolean4 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer1.makeChild((-432132235));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 567190118);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        int int19 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = (-432140955);
        int int22 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432137819));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = byteQuadsCanonicalizer1._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.findName(725824138, 551534721);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash((-537590853), (-432140401), 726013822);
        int int7 = byteQuadsCanonicalizer1.primaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8._hashSize;
        int int10 = byteQuadsCanonicalizer8._spilloverEnd;
        int int11 = byteQuadsCanonicalizer8._tertiaryShift;
        boolean boolean12 = byteQuadsCanonicalizer8._intern;
        boolean boolean13 = byteQuadsCanonicalizer8._intern;
        java.lang.String str14 = byteQuadsCanonicalizer8.toString();
        byteQuadsCanonicalizer8._tertiaryShift = 6000;
        int int17 = byteQuadsCanonicalizer8.bucketCount();
        int int18 = byteQuadsCanonicalizer8._count;
        byteQuadsCanonicalizer8._count = 725995156;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int22 = byteQuadsCanonicalizer21.hashSeed();
        int int23 = byteQuadsCanonicalizer21._longNameOffset;
        int int24 = byteQuadsCanonicalizer21.hashSeed();
        byteQuadsCanonicalizer21._longNameOffset = (short) 10;
        int int29 = byteQuadsCanonicalizer21.calcHash((int) '#', (int) (short) 10);
        int int30 = byteQuadsCanonicalizer21._secondaryStart;
        byteQuadsCanonicalizer21._tertiaryShift = (-673757953);
        boolean boolean33 = byteQuadsCanonicalizer21.maybeDirty();
        int int34 = byteQuadsCanonicalizer21._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int36 = byteQuadsCanonicalizer35._hashSize;
        java.lang.String str37 = byteQuadsCanonicalizer35.toString();
        int[] intArray42 = new int[] { (-432144557), (-432145785), 725972989, 490519636 };
        byteQuadsCanonicalizer35._hashArea = intArray42;
        byteQuadsCanonicalizer21._hashArea = intArray42;
        byteQuadsCanonicalizer8._hashArea = intArray42;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = byteQuadsCanonicalizer1.findName(intArray42, (-673900579));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 6000;
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = 133190806;
        byteQuadsCanonicalizer0._intern = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName((-1814915427), 929652350, (-673785321));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        int int14 = byteQuadsCanonicalizer0.secondaryCount();
        int int15 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._hashSize = (-1464944295);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/8 pri/sec/ter/spill (=0), total:8]", (-432126413), (-432132099));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int3 = byteQuadsCanonicalizer1._tertiaryShift;
        java.lang.String str4 = byteQuadsCanonicalizer1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.findName((-567657864), (-432134095));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        int int5 = byteQuadsCanonicalizer0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(1916468422, (-673910934));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        byteQuadsCanonicalizer0._count = 2430;
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-891493693), (-432131891));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer3._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer5.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-2079491538));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-432139745), (-1409442222));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        byteQuadsCanonicalizer0._count = 2430;
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        byteQuadsCanonicalizer10._count = (byte) 100;
        int int15 = byteQuadsCanonicalizer10.calcHash((int) (short) 1);
        java.lang.String str16 = byteQuadsCanonicalizer10.toString();
        int int17 = byteQuadsCanonicalizer10._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        int int20 = byteQuadsCanonicalizer18._spilloverEnd;
        int int21 = byteQuadsCanonicalizer18._longNameOffset;
        int int22 = byteQuadsCanonicalizer18.hashSeed();
        int int25 = byteQuadsCanonicalizer18.calcHash((-1888459861), 1848248);
        int int26 = byteQuadsCanonicalizer18.secondaryCount();
        int int27 = byteQuadsCanonicalizer18._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28.hashSeed();
        int int30 = byteQuadsCanonicalizer28._longNameOffset;
        int int31 = byteQuadsCanonicalizer28.hashSeed();
        byteQuadsCanonicalizer28._longNameOffset = (short) 10;
        int int36 = byteQuadsCanonicalizer28.calcHash((int) '#', (int) (short) 10);
        int int37 = byteQuadsCanonicalizer28._secondaryStart;
        byteQuadsCanonicalizer28._tertiaryShift = (-673757953);
        int int40 = byteQuadsCanonicalizer28._count;
        byteQuadsCanonicalizer28._tertiaryStart = (-1989560847);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer43 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int44 = byteQuadsCanonicalizer43._hashSize;
        int int48 = byteQuadsCanonicalizer43.calcHash(726014974, 439949297, 1889548666);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer50 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        boolean boolean51 = byteQuadsCanonicalizer50.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer52 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int53 = byteQuadsCanonicalizer52._hashSize;
        byteQuadsCanonicalizer52._count = (byte) 100;
        int int56 = byteQuadsCanonicalizer52.bucketCount();
        int int57 = byteQuadsCanonicalizer52._tertiaryStart;
        int int58 = byteQuadsCanonicalizer52.primaryCount();
        int int59 = byteQuadsCanonicalizer52.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer61 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray62 = byteQuadsCanonicalizer61._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer63 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int64 = byteQuadsCanonicalizer63._hashSize;
        byteQuadsCanonicalizer63._count = (byte) 100;
        java.lang.String[] strArray67 = byteQuadsCanonicalizer63._names;
        int[] intArray72 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int74 = byteQuadsCanonicalizer63.calcHash(intArray72, 4);
        byteQuadsCanonicalizer63._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer77 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int78 = byteQuadsCanonicalizer77._hashSize;
        byteQuadsCanonicalizer77._count = (byte) 100;
        java.lang.String[] strArray81 = byteQuadsCanonicalizer77._names;
        int[] intArray86 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int88 = byteQuadsCanonicalizer77.calcHash(intArray86, 4);
        byteQuadsCanonicalizer63._hashArea = intArray86;
        byteQuadsCanonicalizer61._hashArea = intArray86;
        byteQuadsCanonicalizer52._hashArea = intArray86;
        byteQuadsCanonicalizer50._hashArea = intArray86;
        byteQuadsCanonicalizer43._hashArea = intArray86;
        byteQuadsCanonicalizer28._hashArea = intArray86;
        byteQuadsCanonicalizer18._hashArea = intArray86;
        byteQuadsCanonicalizer10._hashArea = intArray86;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str98 = byteQuadsCanonicalizer0.findName(intArray86, (-673997429));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0.release();
        int int15 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432142439, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 929652350);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
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
        int[] intArray22 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        java.lang.String[] strArray30 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer13._names = strArray30;
        byteQuadsCanonicalizer4._names = strArray30;
        byteQuadsCanonicalizer0._names = strArray30;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._intern = false;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str40 = byteQuadsCanonicalizer0.addName("", 1286713498);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(492187041);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        java.lang.String[] strArray3 = byteQuadsCanonicalizer1._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.findName((-432132975), (-316270904));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = (-370300953);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("hi!", (-25332197), (-432128747), 782441171);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        int int13 = byteQuadsCanonicalizer0.calcHash((-2103977253), (-432141805), (-432141531));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", 1905780, (-432124671));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        java.lang.String[] strArray14 = byteQuadsCanonicalizer0._names;
        int int15 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0.release();
        java.lang.String[] strArray17 = byteQuadsCanonicalizer0._names;
        boolean boolean18 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.findName((-1470787311), (-432124185));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        int int14 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (int) (short) 100, 725780092, (-432141577));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int16 = byteQuadsCanonicalizer0.calcHash(725969857, (-673776329));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName(1791577018);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._count = (-432134333);
        int int12 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName(1586482850);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432125135), (-674062752), (-432127303));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int11 = byteQuadsCanonicalizer1.calcHash((-673923081), (-937951140));
        int int12 = byteQuadsCanonicalizer1._tertiaryStart;
        int int13 = byteQuadsCanonicalizer1.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer1.findName(283989980, 975991573);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        int int9 = byteQuadsCanonicalizer0.spilloverCount();
        int int10 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432142439, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 725897965, (-1332194793), (-524960959));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144543));
        int int7 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-291303166), (-1724266830), (-1857710296));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._secondaryStart = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName(1897190);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7._hashSize;
        byteQuadsCanonicalizer7._count = (byte) 100;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer7._names;
        int[] intArray16 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int18 = byteQuadsCanonicalizer7.calcHash(intArray16, 4);
        java.lang.String[] strArray24 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer7._names = strArray24;
        byteQuadsCanonicalizer1._names = strArray24;
        byteQuadsCanonicalizer1._hashSize = (-432138361);
        byteQuadsCanonicalizer1._spilloverEnd = 1903921447;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = byteQuadsCanonicalizer1.addName("", (-486826289), 725872954, (-1464730446));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = (-370300953);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432122283), (-38977595));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", (-1992874247), (-673902037), 725787130);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int14 = byteQuadsCanonicalizer0._tertiaryStart;
        int int16 = byteQuadsCanonicalizer0.calcHash(1905780);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-1499223049, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1553702237));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        byteQuadsCanonicalizer0._count = 2430;
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/8 pri/sec/ter/spill (=0), total:8]", (-432115163), (-432118951), 1902780979);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436640 pri/sec/ter/spill (=0), total:-168436640]", 431371715, 725784781, (-673893548));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        boolean boolean8 = byteQuadsCanonicalizer1._failOnDoS;
        int int9 = byteQuadsCanonicalizer1.size();
        int int13 = byteQuadsCanonicalizer1.calcHash((-1470787311), 309577913, (-432126681));
        int int14 = byteQuadsCanonicalizer1._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer1.addName("hi!", (-351419837), 1919867, (-199154010));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._tertiaryShift = 443875710;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int10 = byteQuadsCanonicalizer0.calcHash(751624935, (-432139505), (-432130703));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-432132029), 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-673746557);
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._hashSize = (-432141479);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/8 pri/sec/ter/spill (=0), total:8]", 0, (-432133855));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-1499223049, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1409394459), 533439314, 725876680);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        int int14 = byteQuadsCanonicalizer0.calcHash(725896183, 726013822, (-432128617));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-1499223049, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-362821554));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._hashSize = 725972008;
        int int11 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-432124617));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
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
        int[] intArray22 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        java.lang.String[] strArray30 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer13._names = strArray30;
        byteQuadsCanonicalizer4._names = strArray30;
        byteQuadsCanonicalizer0._names = strArray30;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 725824138, (-432126243), (-674059464));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-673746557);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("hi!", 651592067);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
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
        int[] intArray18 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int20 = byteQuadsCanonicalizer9.calcHash(intArray18, 4);
        java.lang.String[] strArray26 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer9._names = strArray26;
        byteQuadsCanonicalizer0._names = strArray26;
        java.lang.String[] strArray29 = new java.lang.String[] {};
        byteQuadsCanonicalizer0._names = strArray29;
        int int31 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer33 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray34 = byteQuadsCanonicalizer33._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int36 = byteQuadsCanonicalizer35._hashSize;
        byteQuadsCanonicalizer35._count = (byte) 100;
        java.lang.String[] strArray39 = byteQuadsCanonicalizer35._names;
        int[] intArray44 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int46 = byteQuadsCanonicalizer35.calcHash(intArray44, 4);
        byteQuadsCanonicalizer35._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer49 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int50 = byteQuadsCanonicalizer49._hashSize;
        byteQuadsCanonicalizer49._count = (byte) 100;
        java.lang.String[] strArray53 = byteQuadsCanonicalizer49._names;
        int[] intArray58 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int60 = byteQuadsCanonicalizer49.calcHash(intArray58, 4);
        byteQuadsCanonicalizer35._hashArea = intArray58;
        byteQuadsCanonicalizer33._hashArea = intArray58;
        int int63 = byteQuadsCanonicalizer33.spilloverCount();
        int[] intArray64 = byteQuadsCanonicalizer33._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str66 = byteQuadsCanonicalizer0.findName(intArray64, (-277726379));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._intern = false;
        boolean boolean10 = byteQuadsCanonicalizer0.maybeDirty();
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
        int int12 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName((-673943111), (-674011908), 1631140555);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(2044597701, (-432124915));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._longNameOffset = 627485498;
        int int8 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432142439, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432132855), (-674045516));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        int int12 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-1368430203), 725847250);
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
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._intern = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("hi!", (-910323951), 618723056, (-574004730));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        int int11 = byteQuadsCanonicalizer0._count;
        boolean boolean12 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer0.makeChild((-432146455));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.addName("hi!", 725834335, (-1095770352), (-1814760150));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-1338553364), 622186246);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean14 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.addName("hi!", (-1837734148), 46973, (-432130603));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._tertiaryShift = 725949085;
        boolean boolean10 = byteQuadsCanonicalizer0._failOnDoS;
        int int11 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1824451783), 863564615, (-432138537));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1099768828));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((-432114581), 284453435);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._intern = false;
        int int10 = byteQuadsCanonicalizer0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(958023374, 356751186);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 1;
        int int11 = byteQuadsCanonicalizer0.calcHash(725986813, 725970658, 726014290);
        int int12 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName(2005781160, 179041710, 546235753);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0._tertiaryStart;
        int int12 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432123137), (-1470787311), (-432138743));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int5 = byteQuadsCanonicalizer0.calcHash((-432138839));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432131799), 1330905141, 2021935520);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = '4';
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
        int[] intArray30 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
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
        int[] intArray61 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int63 = byteQuadsCanonicalizer52.calcHash(intArray61, 4);
        java.lang.String[] strArray69 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer52._names = strArray69;
        byteQuadsCanonicalizer43._names = strArray69;
        byteQuadsCanonicalizer0._names = strArray69;
        int int73 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._count = (-1915854326);
        boolean boolean76 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str78 = byteQuadsCanonicalizer0.findName(726004858);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._secondaryStart = (-432144203);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-2044706367);
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0._hashSize;
        boolean boolean11 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", 260, (-1387883022), 587436440);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int[] intArray7 = byteQuadsCanonicalizer0._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-1499223049, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 2110312026, 725957455, (-1141188379));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._count = (-2136512287);
        int int13 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 725846152, (-1163817760), (-432143093));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = byteQuadsCanonicalizer0._hashArea;
        int int10 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer12.makeChild(802144728);
        boolean boolean15 = byteQuadsCanonicalizer12._intern;
        int int16 = byteQuadsCanonicalizer12.totalCount();
        int[] intArray21 = new int[] { 725885914, 725931445, 827583716, (-432133407) };
        byteQuadsCanonicalizer12._hashArea = intArray21;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = byteQuadsCanonicalizer0.findName(intArray21, (-1377564977));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) 'a');
        byteQuadsCanonicalizer1.release();
        int int4 = byteQuadsCanonicalizer1.calcHash((-1814760150));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.findName(1354164575, (-432126243));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        int int9 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(1763073338, (-432126787), 40494483);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.hashSeed();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int int11 = byteQuadsCanonicalizer0.calcHash(717585690, (-432137177));
        int int12 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        byteQuadsCanonicalizer13._count = (byte) 100;
        java.lang.String[] strArray17 = byteQuadsCanonicalizer13._names;
        byteQuadsCanonicalizer13._spilloverEnd = (byte) 100;
        int int20 = byteQuadsCanonicalizer13._spilloverEnd;
        int int21 = byteQuadsCanonicalizer13.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._hashSize;
        byteQuadsCanonicalizer22._count = (byte) 100;
        java.lang.String[] strArray26 = byteQuadsCanonicalizer22._names;
        int[] intArray31 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int33 = byteQuadsCanonicalizer22.calcHash(intArray31, 4);
        java.lang.String[] strArray39 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer22._names = strArray39;
        byteQuadsCanonicalizer13._names = strArray39;
        java.lang.String[] strArray42 = new java.lang.String[] {};
        byteQuadsCanonicalizer13._names = strArray42;
        int int44 = byteQuadsCanonicalizer13._secondaryStart;
        java.lang.String[] strArray45 = byteQuadsCanonicalizer13._names;
        byteQuadsCanonicalizer0._names = strArray45;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str50 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-432138193), (-432141779));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        int int5 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._secondaryStart = (-432133149);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._tertiaryShift = (-432134353);
        byteQuadsCanonicalizer0._hashSize = 1421490513;
        int int16 = byteQuadsCanonicalizer0.calcHash(1788563953);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17.hashSeed();
        int int19 = byteQuadsCanonicalizer17._longNameOffset;
        int int20 = byteQuadsCanonicalizer17.hashSeed();
        byteQuadsCanonicalizer17._longNameOffset = (short) 10;
        int int25 = byteQuadsCanonicalizer17.calcHash((int) '#', (int) (short) 10);
        int int26 = byteQuadsCanonicalizer17._secondaryStart;
        byteQuadsCanonicalizer17._tertiaryShift = (-673757953);
        boolean boolean29 = byteQuadsCanonicalizer17.maybeDirty();
        int[] intArray33 = new int[] { 133190806, (-432144885), 209767541 };
        byteQuadsCanonicalizer17._hashArea = intArray33;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = byteQuadsCanonicalizer0.findName(intArray33, (-1541993017));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.hashSeed();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int int11 = byteQuadsCanonicalizer0.calcHash(717585690, (-432137177));
        int int12 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._tertiaryStart = 725909656;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName(763360754);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
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
        int[] intArray22 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        java.lang.String[] strArray30 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer13._names = strArray30;
        byteQuadsCanonicalizer4._names = strArray30;
        byteQuadsCanonicalizer0._names = strArray30;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._intern = false;
        int int37 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = byteQuadsCanonicalizer0.findName((-432132737));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._secondaryStart = (-673910467);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-432112189), (-432137427), (-1677159173));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1._spilloverEnd = (-432142005);
        java.lang.String[] strArray5 = byteQuadsCanonicalizer1._names;
        byteQuadsCanonicalizer1._secondaryStart = (-673888554);
        int int8 = byteQuadsCanonicalizer1._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", 725735470, (-432115607), (-542350811));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (-432118379);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-897527923), 725898370, 1181388153);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean5 = byteQuadsCanonicalizer0.maybeDirty();
        int int6 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-523163223));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-673746557);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0._count;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-1544296047));
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
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-1404133737);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-432141531));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432140955));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._tertiaryStart = (-1878463180);
        byteQuadsCanonicalizer0._tertiaryShift = 725873197;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-432115895), (-432141531), 630056645);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 1;
        int int11 = byteQuadsCanonicalizer0.calcHash(725986813, 725970658, 726014290);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-432111511));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0._parent;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._tertiaryStart = (-432136895);
        byteQuadsCanonicalizer0._hashSize = 1421490513;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", (-1275945339), (-432112855));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._tertiaryStart = 725983222;
        int int10 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("", (-674016298), (-2082738723));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        int int13 = byteQuadsCanonicalizer0.calcHash((-432142511));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-1499223049, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432127427), (-749912128));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432139849);
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-674075309), (-2082738723), (-432109113));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0._count;
        int[] intArray8 = byteQuadsCanonicalizer0._hashArea;
        int int12 = byteQuadsCanonicalizer0.calcHash(559980725, 1424901064, (-432137215));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-432109525), (-432123987));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0._parent;
        int int12 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._longNameOffset = (-432116099);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName((-1385389890), (-432121355));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
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
        int[] intArray22 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        java.lang.String[] strArray30 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer13._names = strArray30;
        byteQuadsCanonicalizer4._names = strArray30;
        byteQuadsCanonicalizer0._names = strArray30;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._intern = false;
        int int37 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean38 = byteQuadsCanonicalizer0._failOnDoS;
        int int40 = byteQuadsCanonicalizer0.calcHash(0);
        boolean boolean41 = byteQuadsCanonicalizer0._intern;
        int int42 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = byteQuadsCanonicalizer0.findName((-432134047));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int13 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-673986856), 726008305);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._secondaryStart;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._hashSize = 502809116;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("", (-1465004681));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int10 = byteQuadsCanonicalizer0.calcHash((-804207314), 846943582, 725848816);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("hi!", 526616249);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(492187041);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        java.lang.String[] strArray3 = byteQuadsCanonicalizer1._names;
        boolean boolean4 = byteQuadsCanonicalizer1._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.addName("", (-1368430203), (-878316976));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = 725993347;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1095360826, 0, 221574612);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '4');
        int int9 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-432129841), (-432114319));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        byteQuadsCanonicalizer0._count = 2430;
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int int12 = byteQuadsCanonicalizer0.calcHash((-432126883), (-432124843), 45638241);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/8 pri/sec/ter/spill (=0), total:8]", 701168463);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0.release();
        int int13 = byteQuadsCanonicalizer0._hashSize;
        int int16 = byteQuadsCanonicalizer0.calcHash((-432125149), (-673976455));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.addName("hi!", 0, 1946031030, (-432116913));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-1499223049, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432144885), (-673952091));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean2 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer0.findName(100, (-432112985));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._intern = true;
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(1147813709, (-1409305953), (-432137747));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._count = (-673785726);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(670683208, (-432110171), 697911168);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        java.lang.String[] strArray6 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-673939682));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144281), (-432142395), 12495515);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._secondaryStart = 1797043;
        boolean boolean11 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/476445 pri/sec/ter/spill (=0), total:476445]", (-948316301), (-432136761), 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144543));
        int int7 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432126321), (-1975090639));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        byteQuadsCanonicalizer0._hashSize = (-432138931);
        int int8 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432127245), 913883991);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        int int9 = byteQuadsCanonicalizer0.spilloverCount();
        int int10 = byteQuadsCanonicalizer0.spilloverCount();
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        int[] intArray12 = byteQuadsCanonicalizer0._hashArea;
        int int13 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("", 1856027716, (-432134251));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        byteQuadsCanonicalizer0._count = 2430;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8._longNameOffset;
        int int10 = byteQuadsCanonicalizer8._longNameOffset;
        int int11 = byteQuadsCanonicalizer8.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        int int14 = byteQuadsCanonicalizer12._spilloverEnd;
        int int15 = byteQuadsCanonicalizer12._tertiaryShift;
        boolean boolean16 = byteQuadsCanonicalizer12._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17._hashSize;
        byteQuadsCanonicalizer17._count = (byte) 100;
        java.lang.String[] strArray21 = byteQuadsCanonicalizer17._names;
        int[] intArray26 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int28 = byteQuadsCanonicalizer17.calcHash(intArray26, 4);
        byteQuadsCanonicalizer17._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31._hashSize;
        byteQuadsCanonicalizer31._count = (byte) 100;
        java.lang.String[] strArray35 = byteQuadsCanonicalizer31._names;
        int[] intArray40 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int42 = byteQuadsCanonicalizer31.calcHash(intArray40, 4);
        byteQuadsCanonicalizer17._hashArea = intArray40;
        byteQuadsCanonicalizer12._hashArea = intArray40;
        byteQuadsCanonicalizer8._hashArea = intArray40;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = byteQuadsCanonicalizer0.findName(intArray40, 0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        int int11 = byteQuadsCanonicalizer0._count;
        boolean boolean12 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._hashSize = (-1292596306);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-1499223049, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1424901064);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0.release();
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._secondaryStart = (-173279133);
        int int10 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11.hashSeed();
        int int13 = byteQuadsCanonicalizer11._longNameOffset;
        int int14 = byteQuadsCanonicalizer11.hashSeed();
        byteQuadsCanonicalizer11._longNameOffset = (short) 10;
        int int19 = byteQuadsCanonicalizer11.calcHash((int) '#', (int) (short) 10);
        int int20 = byteQuadsCanonicalizer11._secondaryStart;
        byteQuadsCanonicalizer11._tertiaryShift = (-673757953);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        byteQuadsCanonicalizer23._count = (byte) 100;
        java.lang.String[] strArray27 = byteQuadsCanonicalizer23._names;
        int[] intArray32 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int34 = byteQuadsCanonicalizer23.calcHash(intArray32, 4);
        java.lang.String[] strArray40 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer23._names = strArray40;
        byteQuadsCanonicalizer11._names = strArray40;
        byteQuadsCanonicalizer0._names = strArray40;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 2028066, (-1410182544), 902834817);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        int int5 = byteQuadsCanonicalizer3._count;
        byteQuadsCanonicalizer3._spilloverEnd = 0;
        byteQuadsCanonicalizer3._spilloverEnd = 721691021;
        int int10 = byteQuadsCanonicalizer3.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer3.makeChild(0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144543));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash((-922425077), (-1409375901));
        byteQuadsCanonicalizer0._longNameOffset = 913312044;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436640 pri/sec/ter/spill (=0), total:-168436640]", 1203445411, 725939563);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144281), (-432142395), 12495515);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        int int9 = byteQuadsCanonicalizer0.size();
        int int10 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436640 pri/sec/ter/spill (=0), total:-168436640]", 725828899);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._hashSize = (-922425077);
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        int int12 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer0.makeChild((-432136895));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", 751231684, (-432107051), 170543635);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        int int6 = byteQuadsCanonicalizer3.calcHash((-432144557), (-432142345));
        int int7 = byteQuadsCanonicalizer3.size();
        byteQuadsCanonicalizer3._longNameOffset = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer3.makeChild((-432129847));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432139495));
        int int2 = byteQuadsCanonicalizer1.primaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.findName(1783294531, (-985094157));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        int int4 = byteQuadsCanonicalizer1.calcHash(0, (-432146251));
        int int5 = byteQuadsCanonicalizer1.tertiaryCount();
        int int6 = byteQuadsCanonicalizer1.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432113115));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._secondaryStart = (-2082658397);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(45638241, (-2106435429), (-432133631));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int int9 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-1499223049, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1383644171), (-432134985));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        int int9 = byteQuadsCanonicalizer0._hashSize;
        int int10 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432142439, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1889548666, (-432123957));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._secondaryStart = (-2082658397);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(1421574550);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432107051), (-1774165300));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144281), (-432142395), 12495515);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName(0, (-432139185));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        int int9 = byteQuadsCanonicalizer0.spilloverCount();
        int int10 = byteQuadsCanonicalizer0.spilloverCount();
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        int[] intArray12 = byteQuadsCanonicalizer0._hashArea;
        int int13 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean14 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.addName("hi!", 1307576732, (-432135399), 0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._count = (byte) 100;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        int[] intArray21 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int23 = byteQuadsCanonicalizer12.calcHash(intArray21, 4);
        java.lang.String[] strArray29 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer12._names = strArray29;
        byteQuadsCanonicalizer0._names = strArray29;
        int[] intArray32 = byteQuadsCanonicalizer0._hashArea;
        int int33 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean34 = byteQuadsCanonicalizer0.maybeDirty();
        int int35 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = byteQuadsCanonicalizer0.findName(725689498, 666595302);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._hashSize = 1343294393;
        int int11 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryStart = 725901070;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName((-432128467), 1642005625, (-1190015669));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        int[] intArray13 = byteQuadsCanonicalizer0._hashArea;
        int int14 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-2145307053), (-432137189));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._count = (-673933463);
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(623004337, (-125031787), (-1409457135));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryStart = (-673785321);
        boolean boolean4 = byteQuadsCanonicalizer0._failOnDoS;
        java.lang.String[] strArray5 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(787513021, (-432132055));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._secondaryStart = 1343294393;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer0._names;
        int int15 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = (-432142147);
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        int int11 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-432129679), (-38977595));
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
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0.release();
        int int10 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._spilloverEnd = (-432140279);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName(2011582632);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._spilloverEnd = (-432146455);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-673920892), (-432124915));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 6000;
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = 133190806;
        byteQuadsCanonicalizer0._intern = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-432125199));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432125517));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName(2078384, 807352821);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-948550211), 725890216, (-674061702));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild((-922425077));
        byteQuadsCanonicalizer0._secondaryStart = (-432144203);
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(0, (-432128073), (-1072272327));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        int int13 = byteQuadsCanonicalizer0.calcHash((-432142511));
        boolean boolean14 = byteQuadsCanonicalizer0._intern;
        int int17 = byteQuadsCanonicalizer0.calcHash(2138380318, 1307576732);
        int int18 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.addName("hi!", (-1409378565));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._secondaryStart = 1343294393;
        int int16 = byteQuadsCanonicalizer0.calcHash(725941678, 1035967592);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 725807731);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = byteQuadsCanonicalizer0.makeChild((-432140467));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.addName("", (-432142395), (-432132681));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._intern = true;
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432104847), 725972008);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        int int13 = byteQuadsCanonicalizer0.calcHash((-432142511));
        boolean boolean14 = byteQuadsCanonicalizer0._intern;
        int int15 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName((-432137649), 725653813);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = (-1425713151);
        int int14 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean15 = byteQuadsCanonicalizer0.maybeDirty();
        int int17 = byteQuadsCanonicalizer0.calcHash(492187041);
        int int19 = byteQuadsCanonicalizer0.calcHash(590831140);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = byteQuadsCanonicalizer0.findName((-1464944295), (-747023571), (-432121307));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.hashSeed();
        int int8 = byteQuadsCanonicalizer0._hashSize;
        int int9 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._hashSize = (-432109113);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-396724844), 725912347);
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
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        int int14 = byteQuadsCanonicalizer0._tertiaryStart;
        int int15 = byteQuadsCanonicalizer0._tertiaryStart;
        int int16 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.addName("hi!", 1544454825, 171171961);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._secondaryStart;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._hashSize = 502809116;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-772346201));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.primaryCount();
        int int4 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._hashSize = (-199154010);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432131701), 256);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 1;
        int int11 = byteQuadsCanonicalizer0.calcHash(725986813, 725970658, 726014290);
        int int12 = byteQuadsCanonicalizer0.secondaryCount();
        int int13 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        byteQuadsCanonicalizer14._count = (byte) 100;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer14._names;
        java.lang.String str19 = byteQuadsCanonicalizer14.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20._hashSize;
        byteQuadsCanonicalizer20._count = (byte) 100;
        java.lang.String[] strArray24 = byteQuadsCanonicalizer20._names;
        int[] intArray29 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int31 = byteQuadsCanonicalizer20.calcHash(intArray29, 4);
        byteQuadsCanonicalizer14._hashArea = intArray29;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer33 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int34 = byteQuadsCanonicalizer33._longNameOffset;
        byteQuadsCanonicalizer33._tertiaryStart = 0;
        boolean boolean37 = byteQuadsCanonicalizer33.maybeDirty();
        byteQuadsCanonicalizer33._spilloverEnd = '4';
        int int40 = byteQuadsCanonicalizer33.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer41 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int42 = byteQuadsCanonicalizer41.hashSeed();
        int int43 = byteQuadsCanonicalizer41._longNameOffset;
        int int44 = byteQuadsCanonicalizer41.totalCount();
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
        int[] intArray63 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int65 = byteQuadsCanonicalizer54.calcHash(intArray63, 4);
        java.lang.String[] strArray71 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer54._names = strArray71;
        byteQuadsCanonicalizer45._names = strArray71;
        byteQuadsCanonicalizer41._names = strArray71;
        byteQuadsCanonicalizer33._names = strArray71;
        byteQuadsCanonicalizer14._names = strArray71;
        int int77 = byteQuadsCanonicalizer14._spilloverEnd;
        int int78 = byteQuadsCanonicalizer14.primaryCount();
        int int79 = byteQuadsCanonicalizer14.primaryCount();
        int[] intArray80 = byteQuadsCanonicalizer14._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str82 = byteQuadsCanonicalizer0.findName(intArray80, (-1915854326));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._spilloverEnd = (-673746947);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("hi!", (-1098131935), (-1831695412));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-2044706367);
        byteQuadsCanonicalizer0._intern = true;
        int int11 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-1045926005), 1198725056, 725783512);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-2044706367);
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-432117389), 1544454825, 725680561);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName((-1013293721), (-910323951), 284269106);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7._hashSize;
        byteQuadsCanonicalizer7._count = (byte) 100;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer7._names;
        int[] intArray16 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int18 = byteQuadsCanonicalizer7.calcHash(intArray16, 4);
        java.lang.String[] strArray24 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer7._names = strArray24;
        byteQuadsCanonicalizer1._names = strArray24;
        byteQuadsCanonicalizer1._count = (-432140831);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = byteQuadsCanonicalizer1.findName((-1414777092), 725652643);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        byteQuadsCanonicalizer1._longNameOffset = (-432144003);
        byteQuadsCanonicalizer1._spilloverEnd = 1209132704;
        byteQuadsCanonicalizer1._tertiaryStart = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer1.findName((-425231612), (-673759171));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        byteQuadsCanonicalizer0._count = 2430;
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(738849150);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) 100);
        byteQuadsCanonicalizer1._hashSize = 100;
        byteQuadsCanonicalizer1._tertiaryStart = 841774826;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.addName("hi!", (-674073987));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        int int11 = byteQuadsCanonicalizer9._spilloverEnd;
        int int12 = byteQuadsCanonicalizer9._tertiaryShift;
        boolean boolean13 = byteQuadsCanonicalizer9._intern;
        byteQuadsCanonicalizer9.release();
        boolean boolean15 = byteQuadsCanonicalizer9._intern;
        int int16 = byteQuadsCanonicalizer9.hashSeed();
        int int17 = byteQuadsCanonicalizer9.bucketCount();
        int int20 = byteQuadsCanonicalizer9.calcHash(717585690, (-432137177));
        int int21 = byteQuadsCanonicalizer9.spilloverCount();
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
        int[] intArray40 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int42 = byteQuadsCanonicalizer31.calcHash(intArray40, 4);
        java.lang.String[] strArray48 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer31._names = strArray48;
        byteQuadsCanonicalizer22._names = strArray48;
        java.lang.String[] strArray51 = new java.lang.String[] {};
        byteQuadsCanonicalizer22._names = strArray51;
        int int53 = byteQuadsCanonicalizer22._secondaryStart;
        java.lang.String[] strArray54 = byteQuadsCanonicalizer22._names;
        byteQuadsCanonicalizer9._names = strArray54;
        byteQuadsCanonicalizer0._names = strArray54;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str61 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=725993347, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-674105466), 0, (-432125533));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0.calcHash(68327298, (-1870308865), (-432130937));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 902834817, (-432133989), 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = '4';
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
        int[] intArray30 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
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
        int[] intArray61 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int63 = byteQuadsCanonicalizer52.calcHash(intArray61, 4);
        java.lang.String[] strArray69 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer52._names = strArray69;
        byteQuadsCanonicalizer43._names = strArray69;
        byteQuadsCanonicalizer0._names = strArray69;
        int int73 = byteQuadsCanonicalizer0.totalCount();
        int int74 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._count = (-607264735);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str78 = byteQuadsCanonicalizer0.findName((-1973642351));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.totalCount();
        java.lang.String[] strArray5 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName(725972989);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._count = (-673785726);
        int int5 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1055472513), (-432138729));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int5 = byteQuadsCanonicalizer4.hashSeed();
        int int6 = byteQuadsCanonicalizer4._longNameOffset;
        int int7 = byteQuadsCanonicalizer4.hashSeed();
        byteQuadsCanonicalizer4._longNameOffset = (short) 10;
        int int12 = byteQuadsCanonicalizer4.calcHash((int) '#', (int) (short) 10);
        int int13 = byteQuadsCanonicalizer4._tertiaryShift;
        boolean boolean14 = byteQuadsCanonicalizer4._intern;
        int int15 = byteQuadsCanonicalizer4.spilloverCount();
        byteQuadsCanonicalizer4.release();
        java.lang.String str17 = byteQuadsCanonicalizer4.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = byteQuadsCanonicalizer4.makeChild(756548098);
        java.lang.String[] strArray20 = byteQuadsCanonicalizer19._names;
        byteQuadsCanonicalizer0._names = strArray20;
        int int22 = byteQuadsCanonicalizer0._secondaryStart;
        int int23 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-1499223049, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432119759), (-674003675), 1507620431);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._count = (byte) 100;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        int[] intArray21 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int23 = byteQuadsCanonicalizer12.calcHash(intArray21, 4);
        java.lang.String[] strArray29 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer12._names = strArray29;
        byteQuadsCanonicalizer0._names = strArray29;
        int[] intArray32 = byteQuadsCanonicalizer0._hashArea;
        int int33 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._longNameOffset = (-313722276);
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 546849782, 725736775, 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int7 = byteQuadsCanonicalizer1.calcHash((-1409403387), (int) '#', (-432133903));
        int int8 = byteQuadsCanonicalizer1._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432144885));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-673746378);
        int int7 = byteQuadsCanonicalizer0._count;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-1437505196));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = (-432142147);
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-988628494));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 2045893375;
        int[] intArray7 = byteQuadsCanonicalizer1._hashArea;
        byteQuadsCanonicalizer1._intern = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", (-1927111302));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName(734525512, 0, (-172220579));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-2044706367);
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(0);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._intern = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1457886293));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        byteQuadsCanonicalizer0._count = 2430;
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int int12 = byteQuadsCanonicalizer0.calcHash((-432126883), (-432124843), 45638241);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-673888554));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1888459861), 1848248);
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/8 pri/sec/ter/spill (=0), total:8]", (-432100623), 0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-673746557);
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._hashSize = (-432141479);
        int int9 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = byteQuadsCanonicalizer0.totalCount();
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 2045893375;
        int[] intArray7 = byteQuadsCanonicalizer1._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436640 pri/sec/ter/spill (=0), total:-168436640]", 213744503);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=725993347, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 699573892);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-432132005));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1888459861), 1848248);
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((-432141389), 1804820272);
        int int12 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("hi!", 885981564);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432142439, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-686609167), 0, (-432096225));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        int int14 = byteQuadsCanonicalizer9.calcHash((int) (short) 1);
        java.lang.String str15 = byteQuadsCanonicalizer9.toString();
        int int16 = byteQuadsCanonicalizer9.tertiaryCount();
        int int17 = byteQuadsCanonicalizer9._tertiaryShift;
        int int18 = byteQuadsCanonicalizer9.spilloverCount();
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
        int[] intArray37 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int39 = byteQuadsCanonicalizer28.calcHash(intArray37, 4);
        java.lang.String[] strArray45 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer28._names = strArray45;
        byteQuadsCanonicalizer19._names = strArray45;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer48 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int49 = byteQuadsCanonicalizer48._hashSize;
        byteQuadsCanonicalizer48._count = (byte) 100;
        java.lang.String[] strArray52 = byteQuadsCanonicalizer48._names;
        int[] intArray57 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int59 = byteQuadsCanonicalizer48.calcHash(intArray57, 4);
        byteQuadsCanonicalizer19._hashArea = intArray57;
        byteQuadsCanonicalizer9._hashArea = intArray57;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str63 = byteQuadsCanonicalizer0.findName(intArray57, (-432102407));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._spilloverEnd = (-673746947);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-432103897), (-432107599));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        byteQuadsCanonicalizer0._count = 2430;
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int10 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436640 pri/sec/ter/spill (=0), total:-168436640]", 158932168);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.hashSeed();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436640 pri/sec/ter/spill (=0), total:-168436640]", (-432095995), (-432119243));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._tertiaryShift = (-432134353);
        byteQuadsCanonicalizer0._tertiaryShift = (-432115895);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName(725993347, (-603903907));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = (-1253791504);
        byteQuadsCanonicalizer0._intern = true;
        int int13 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName(158932168, (-1781071616));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("", 2086908, (-432119719), 725762902);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = (-432142147);
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._spilloverEnd = 2043773923;
        int int12 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer0.makeChild((-432129633));
        java.lang.String[] strArray15 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.addName("", 8, 725641294, (-674092568));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0._parent;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._longNameOffset = 1536105120;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432142439, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 170731, (-442150529), (-432123097));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-1385212522), (-432113575), (-632636231));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-1225261097));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int int10 = byteQuadsCanonicalizer0.spilloverCount();
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName(222518211, 803004176, 309577913);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        boolean boolean8 = byteQuadsCanonicalizer1._failOnDoS;
        boolean boolean9 = byteQuadsCanonicalizer1.maybeDirty();
        int int12 = byteQuadsCanonicalizer1.calcHash(1586482850, (-432135615));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer1.findName(0, (-1889395546), 725894689);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        boolean boolean3 = byteQuadsCanonicalizer1._intern;
        boolean boolean4 = byteQuadsCanonicalizer1.maybeDirty();
        int int5 = byteQuadsCanonicalizer1.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.findName(725735497);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int[] intArray11 = byteQuadsCanonicalizer0._hashArea;
        int int12 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        int int15 = byteQuadsCanonicalizer13._spilloverEnd;
        int int16 = byteQuadsCanonicalizer13._tertiaryShift;
        int int20 = byteQuadsCanonicalizer13.calcHash(6000, (-432145171), 0);
        boolean boolean21 = byteQuadsCanonicalizer13._failOnDoS;
        int int22 = byteQuadsCanonicalizer13.hashSeed();
        int[] intArray23 = byteQuadsCanonicalizer13._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int25 = byteQuadsCanonicalizer24._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = byteQuadsCanonicalizer24._parent;
        int int27 = byteQuadsCanonicalizer24.hashSeed();
        boolean boolean28 = byteQuadsCanonicalizer24._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = byteQuadsCanonicalizer24.makeChild(1547696045);
        int int31 = byteQuadsCanonicalizer30.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer33 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int34 = byteQuadsCanonicalizer33.hashSeed();
        int int38 = byteQuadsCanonicalizer33.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean39 = byteQuadsCanonicalizer33.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer40 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int41 = byteQuadsCanonicalizer40._hashSize;
        byteQuadsCanonicalizer40._count = (byte) 100;
        java.lang.String[] strArray44 = byteQuadsCanonicalizer40._names;
        int[] intArray49 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int51 = byteQuadsCanonicalizer40.calcHash(intArray49, 4);
        byteQuadsCanonicalizer40._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer54 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int55 = byteQuadsCanonicalizer54._hashSize;
        byteQuadsCanonicalizer54._count = (byte) 100;
        java.lang.String[] strArray58 = byteQuadsCanonicalizer54._names;
        int[] intArray63 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int65 = byteQuadsCanonicalizer54.calcHash(intArray63, 4);
        byteQuadsCanonicalizer40._hashArea = intArray63;
        byteQuadsCanonicalizer33._hashArea = intArray63;
        java.lang.String str69 = byteQuadsCanonicalizer30.findName(intArray63, 0);
        byteQuadsCanonicalizer13._hashArea = intArray63;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str72 = byteQuadsCanonicalizer0.findName(intArray63, (-1992866175));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0.release();
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int8 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/8 pri/sec/ter/spill (=0), total:8]", (-432094645), (-2019354067), 0);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        int int13 = byteQuadsCanonicalizer0.calcHash((-432142511));
        boolean boolean14 = byteQuadsCanonicalizer0._intern;
        int int15 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._hashSize = 725842624;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/476445 pri/sec/ter/spill (=0), total:476445]", (-432143079), 73310343);
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
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-542350811));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-1404133737);
        byteQuadsCanonicalizer0._hashSize = (-1677284569);
        int int16 = byteQuadsCanonicalizer0._tertiaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17._hashSize;
        byteQuadsCanonicalizer17._count = (byte) 100;
        java.lang.String[] strArray21 = byteQuadsCanonicalizer17._names;
        int[] intArray26 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int28 = byteQuadsCanonicalizer17.calcHash(intArray26, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = byteQuadsCanonicalizer0.findName(intArray26, (-1587642152));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String[] strArray5 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1564400970, (-432131185));
    }
}

