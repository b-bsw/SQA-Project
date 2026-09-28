package com.fasterxml.jackson.core.sym;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = 27137223;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName(1586750149, 0, (-432197305));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        byteQuadsCanonicalizer0._longNameOffset = 586144840;
        boolean boolean10 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0._count;
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        int int9 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-631239760, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432222507), (-432205323));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 2068904296);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432232481);
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 800575783, 726740779, (-432234429));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._intern = false;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-1733437941), 0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-459564991), 424071495);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
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
        int int19 = byteQuadsCanonicalizer0.totalCount();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0._count;
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._count = 726921598;
        int int12 = byteQuadsCanonicalizer0.calcHash((-937635559));
        byteQuadsCanonicalizer0._count = (-432227577);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 726552202);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int16 = byteQuadsCanonicalizer0.calcHash(726927673, (-432806535));
        boolean boolean17 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.findName((-432201603));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(726927673);
        int int10 = byteQuadsCanonicalizer0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1031526, (-432209775), (-403081391));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int11 = byteQuadsCanonicalizer1.calcHash((-790193954), (-432802824));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer1.makeChild((-432231575));
        boolean boolean14 = byteQuadsCanonicalizer1.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 24193);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._intern = false;
        byteQuadsCanonicalizer0._secondaryStart = (-129002493);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-711127247));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        int int9 = byteQuadsCanonicalizer0._spilloverEnd;
        int int10 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 584796532, (-432809722));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean15 = byteQuadsCanonicalizer0.maybeDirty();
        int int17 = byteQuadsCanonicalizer0.calcHash((-432229107));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.findName((-1281769), (-432230989));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._tertiaryStart = 1217341024;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        byteQuadsCanonicalizer10._count = (byte) 100;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer10._names;
        int[] intArray19 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int21 = byteQuadsCanonicalizer10.calcHash(intArray19, 4);
        byteQuadsCanonicalizer10._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int25 = byteQuadsCanonicalizer24._hashSize;
        byteQuadsCanonicalizer24._count = (byte) 100;
        java.lang.String[] strArray28 = byteQuadsCanonicalizer24._names;
        int[] intArray33 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int35 = byteQuadsCanonicalizer24.calcHash(intArray33, 4);
        byteQuadsCanonicalizer10._hashArea = intArray33;
        int int37 = byteQuadsCanonicalizer10.hashSeed();
        java.lang.String[] strArray38 = byteQuadsCanonicalizer10._names;
        int int39 = byteQuadsCanonicalizer10._tertiaryShift;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer40 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int41 = byteQuadsCanonicalizer40._hashSize;
        int int42 = byteQuadsCanonicalizer40._spilloverEnd;
        int int43 = byteQuadsCanonicalizer40._longNameOffset;
        byteQuadsCanonicalizer40._count = ' ';
        int int46 = byteQuadsCanonicalizer40.spilloverCount();
        int int47 = byteQuadsCanonicalizer40._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer49 = byteQuadsCanonicalizer40.makeChild(726927673);
        java.lang.String str51 = byteQuadsCanonicalizer49.findName((-2105879442));
        int int52 = byteQuadsCanonicalizer49._count;
        byteQuadsCanonicalizer49._tertiaryStart = (-342801551);
        int[] intArray55 = byteQuadsCanonicalizer49._hashArea;
        byteQuadsCanonicalizer10._hashArea = intArray55;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str58 = byteQuadsCanonicalizer0.findName(intArray55, (-1312816649));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432205115), 130954);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432231821));
        java.lang.String str2 = byteQuadsCanonicalizer1.toString();
        int int3 = byteQuadsCanonicalizer1._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.findName(68923335);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("", (-432222021), (-906536298));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = byteQuadsCanonicalizer0.findName(726761650, 1308585500);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-432206819), (-432219723));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int11 = byteQuadsCanonicalizer1.calcHash((-790193954), (-432802824));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer1.makeChild((-432231575));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 0);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0._count;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        int int12 = byteQuadsCanonicalizer0.calcHash((-552967), (-1623339145), (-1669855521));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-631239760, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 212564846, (-432211785));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName((-432233611), (-432219747), (-432223195));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
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
        java.lang.String str19 = byteQuadsCanonicalizer0.findName((-432826002), 1871178543, (-627301160));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean6 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 462202842);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer0.findName((-432194779));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._longNameOffset = 726921751;
        int int8 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._secondaryStart = (-432858451);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(2001209864, (-432229837));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName(0, 2124256075, (-241748970));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._count = 595210654;
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432204619), 1122162970, 0);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-433043519));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        byteQuadsCanonicalizer0._tertiaryShift = 1763641886;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-816405005), (-1845231195), (-432203859));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._count = (-432214951);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-2080484815), 1869496390);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", 0);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        byteQuadsCanonicalizer6._spilloverEnd = (byte) 100;
        int int13 = byteQuadsCanonicalizer6._spilloverEnd;
        int int14 = byteQuadsCanonicalizer6.secondaryCount();
        java.lang.String[] strArray15 = byteQuadsCanonicalizer6._names;
        int int17 = byteQuadsCanonicalizer6.calcHash((int) (byte) 1);
        int int19 = byteQuadsCanonicalizer6.calcHash(726740779);
        int int20 = byteQuadsCanonicalizer6._count;
        int int21 = byteQuadsCanonicalizer6.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._hashSize;
        int int24 = byteQuadsCanonicalizer22._spilloverEnd;
        int int25 = byteQuadsCanonicalizer22._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int27 = byteQuadsCanonicalizer26._hashSize;
        int int28 = byteQuadsCanonicalizer26._spilloverEnd;
        int int29 = byteQuadsCanonicalizer26._tertiaryShift;
        int int33 = byteQuadsCanonicalizer26.calcHash(6000, (-432236993), 0);
        boolean boolean34 = byteQuadsCanonicalizer26._failOnDoS;
        int int35 = byteQuadsCanonicalizer26.hashSeed();
        byteQuadsCanonicalizer26._reportTooManyCollisions();
        byteQuadsCanonicalizer26._hashSize = (-1461335867);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer39 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int40 = byteQuadsCanonicalizer39._hashSize;
        byteQuadsCanonicalizer39._count = (byte) 100;
        java.lang.String[] strArray43 = byteQuadsCanonicalizer39._names;
        int[] intArray48 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int50 = byteQuadsCanonicalizer39.calcHash(intArray48, 4);
        byteQuadsCanonicalizer39._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer53 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int54 = byteQuadsCanonicalizer53._hashSize;
        byteQuadsCanonicalizer53._count = (byte) 100;
        java.lang.String[] strArray57 = byteQuadsCanonicalizer53._names;
        int[] intArray62 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int64 = byteQuadsCanonicalizer53.calcHash(intArray62, 4);
        byteQuadsCanonicalizer39._hashArea = intArray62;
        byteQuadsCanonicalizer26._hashArea = intArray62;
        byteQuadsCanonicalizer22._hashArea = intArray62;
        byteQuadsCanonicalizer6._hashArea = intArray62;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str70 = byteQuadsCanonicalizer0.findName(intArray62, (-1991951476));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName(726409813, (-432211799), (-432196163));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        byteQuadsCanonicalizer1._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer1.makeChild((-432234613));
        byteQuadsCanonicalizer1._count = (-432227977);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (int) (byte) 0, 2008674896, (-432193771));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 726920401;
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0.makeChild(1754387191);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("", 95461989, 572175652);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash((-432233131), (-432807676), (-1654346617));
        byteQuadsCanonicalizer1._tertiaryStart = (-231018909);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer1.findName((-433030706), 2087094377, (-432831159));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(1916149215, (-432209483), 1660350234);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432229301), (-432812218), (-1745938964));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
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
        byteQuadsCanonicalizer0._tertiaryShift = (-1881772604);
        byteQuadsCanonicalizer0._secondaryStart = 1388163119;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.addName("hi!", 586812148);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 2047601295, (-1397758209), (-580650583));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int8 = byteQuadsCanonicalizer0.calcHash(726812095, (-432228893));
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int11 = byteQuadsCanonicalizer0.calcHash((-1011409797));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432826554));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._intern = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-432236371));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.findName((-1222281454), (-432204697));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("", (-432208027), 726389113);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-906590991));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int3 = byteQuadsCanonicalizer1._hashSize;
        int int5 = byteQuadsCanonicalizer1.calcHash((-432823208));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.findName(1041850913, (-129002493));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 329628512, 0);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432223521));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.findName((-432199537), (-386639232), (-432211799));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-432210821));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        int int14 = byteQuadsCanonicalizer0.primaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName(586121521);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int14 = byteQuadsCanonicalizer0._count;
        java.lang.String str15 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName((-1901767430));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        boolean boolean3 = byteQuadsCanonicalizer1._failOnDoS;
        byteQuadsCanonicalizer1.release();
        int int5 = byteQuadsCanonicalizer1.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.findName(1200545804);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._hashSize = (-432227101);
        int int8 = byteQuadsCanonicalizer0.calcHash(726715588);
        int int10 = byteQuadsCanonicalizer0.calcHash((-1799852163));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1323122088), 427553816);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        int int7 = byteQuadsCanonicalizer0.calcHash((-432232075), (-432210793));
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = byteQuadsCanonicalizer0.totalCount();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._count = (-847585761);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.findName(726689353);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 117015, 1734984000, (-432231821));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0._count;
        int int11 = byteQuadsCanonicalizer0.calcHash(800588212);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1840309540, (-910744050), (-432202733));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("hi!", 2073176141);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1982014786);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-432201619), (-432229567), (-432210439));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int5 = byteQuadsCanonicalizer1.calcHash(726691972, (-1913973304));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.findName((-432201365), 1821297095, (-432215585));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-432230301), 16612);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432227873));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.findName((-432236747), 726804715, (-432195273));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 20474, (-991972663));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235137));
        byteQuadsCanonicalizer1._hashSize = 1;
        byteQuadsCanonicalizer1.release();
        int int5 = byteQuadsCanonicalizer1._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-631239760, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 947791857, (-31240258));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
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
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-432218585), 821504543);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(29365);
        boolean boolean10 = byteQuadsCanonicalizer9._failOnDoS;
        int int11 = byteQuadsCanonicalizer9.hashSeed();
        int int12 = byteQuadsCanonicalizer9.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer9.makeChild((-432811897));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(1144623545, (-1171302495), (-560426653));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 458289561, (-432224557));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._spilloverEnd = (-432237359);
        byteQuadsCanonicalizer0._secondaryStart = 726680614;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 1122164911, (-491095375), (-432825283));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432224835));
        int int2 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._tertiaryShift = (-1375823420);
        int int5 = byteQuadsCanonicalizer1.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.findName(584815432);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 512, 23675, (-433033298));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 726920401;
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0.makeChild(1754387191);
        byteQuadsCanonicalizer0._tertiaryShift = (-432198173);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName(656844436, 1542357209, (-432221003));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int4 = byteQuadsCanonicalizer1.calcHash((-432235817));
        byteQuadsCanonicalizer1._tertiaryStart = (-432225485);
        byteQuadsCanonicalizer1._secondaryStart = (-432204145);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-905743794), (-432813493), 797454223);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        int int10 = byteQuadsCanonicalizer0.calcHash((-1), (-432236713), 726739627);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("", 1122220209, 1513531684, (-432219887));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int5 = byteQuadsCanonicalizer0.calcHash((-432230027));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-631239760, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-433030891), (-432226187), (-1015725718));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer48 = byteQuadsCanonicalizer10.makeChild((-671136890));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-432231713), (-1149712613), 101091);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857889);
        int int12 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 0, 585148675);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName((-432215459), 28134, (-514782120));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 123859);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '4');
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._hashSize = (-1339528678);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName((-432212507), (-432207651), 1762361014);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._spilloverEnd = (-432230449);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        byteQuadsCanonicalizer11._count = (byte) 100;
        java.lang.String[] strArray15 = byteQuadsCanonicalizer11._names;
        int[] intArray20 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int22 = byteQuadsCanonicalizer11.calcHash(intArray20, 4);
        byteQuadsCanonicalizer9._hashArea = intArray20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = byteQuadsCanonicalizer0.findName(intArray20, (-432208909));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432206987));
        int int2 = byteQuadsCanonicalizer1.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.findName(800534482, 16790);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
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
        java.lang.String[] strArray17 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._hashSize = 1715158130;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.findName((-432201573));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName(632150373);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.calcHash((-432857889), (-432802824), (-432235691));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-626325193), 601554284);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        boolean boolean3 = byteQuadsCanonicalizer1._intern;
        int int4 = byteQuadsCanonicalizer1.bucketCount();
        java.lang.String[] strArray5 = byteQuadsCanonicalizer1._names;
        int int6 = byteQuadsCanonicalizer1._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.findName((-432189939));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432224873), 2061938941);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int[] intArray4 = byteQuadsCanonicalizer0._hashArea;
        int int5 = byteQuadsCanonicalizer0._hashSize;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-1446089868);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-432213961), 679678278);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(11012, 1771134369);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = 726703924;
        int int11 = byteQuadsCanonicalizer0._secondaryStart;
        int int12 = byteQuadsCanonicalizer0._spilloverEnd;
        int int13 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.findName((-849334570), (-432197731), 0);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 1797043;
        byteQuadsCanonicalizer1._hashSize = 0;
        int int9 = byteQuadsCanonicalizer1._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer1.findName(256, (-1375823420));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName(726540808, (-1761639208), (-432191389));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        java.lang.String[] strArray6 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 1780038292, (-432211831));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryStart = (-1070321381);
        byteQuadsCanonicalizer0._secondaryStart = (-584220967);
        int int7 = byteQuadsCanonicalizer0.calcHash((-1662223595));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432203147), (-433031383), (-432207471));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int[] intArray2 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._secondaryStart = (-2138635169);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName((-991979449));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/-108054598 pri/sec/ter/spill (=0), total:-108054598]", 726756709, (-1809449000), 263288576);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryStart = 1167071952;
        int int7 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName(912433031, 0);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432234709));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName(586121521, (-991979449));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-631239760, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 0);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
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
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-432215491), (-432192763));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/-108054598 pri/sec/ter/spill (=0), total:-108054598]", 584554765, (-1168058283));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-432211089), 16, (-1622024674));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        int int5 = byteQuadsCanonicalizer0.calcHash((-2023759883), 1073894391);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("", 227440015, 0, (-957684282));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName(1772192179, (-651026994), (-1019786497));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
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
        byteQuadsCanonicalizer0._hashSize = 1387562003;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName(1301187629, (-432192863));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        int int4 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.totalCount();
        int int6 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-432232833), 2099047958, (-432194675));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._spilloverEnd = (-432218391);
        java.lang.String str15 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.findName((-432196535), 0);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        byteQuadsCanonicalizer0._longNameOffset = (-432857107);
        byteQuadsCanonicalizer0._spilloverEnd = (-432226555);
        java.lang.String[] strArray10 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432217109));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726656782);
        byteQuadsCanonicalizer1._longNameOffset = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 1453492822, (-432219723));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 6000;
        int int9 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726921598, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-50976871), 60467625);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        java.lang.String[] strArray5 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._intern = false;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-432220603), (-432217545), (-432188037));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        byteQuadsCanonicalizer1._spilloverEnd = 851025305;
        byteQuadsCanonicalizer1._hashSize = 1608546598;
        int int8 = byteQuadsCanonicalizer1.totalCount();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str59 = byteQuadsCanonicalizer1.findName(intArray53, 0);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
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
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-433051735), 1142725301);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = byteQuadsCanonicalizer0.findName((-432210545));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        int int4 = byteQuadsCanonicalizer1.totalCount();
        int int5 = byteQuadsCanonicalizer1.tertiaryCount();
        int int6 = byteQuadsCanonicalizer1.tertiaryCount();
        int int7 = byteQuadsCanonicalizer1._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.findName(874974239);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 726920401;
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._longNameOffset = (-432225113);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-432229051), 726645739, 102976034);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._count = (-432220375);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName(104334, (-699886797), (-710490817));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (-432807676);
        int int6 = byteQuadsCanonicalizer1.calcHash(586131556, (-432227289));
        int int7 = byteQuadsCanonicalizer1.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.toString();
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._hashSize = (-202237041);
        int[] intArray11 = byteQuadsCanonicalizer0._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-432210215));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._secondaryStart = (-432229443);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-432221111), (-1136060744), 1473958722);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0._tertiaryStart = (-432235179);
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int15 = byteQuadsCanonicalizer0.calcHash((-1667734831), 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.findName((-432186421), (-847461248), 644441539);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432224835));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432192863));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        int int5 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._hashSize = (-432232235);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(460502028);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = byteQuadsCanonicalizer1.findName((-864851999));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
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
        java.lang.String str14 = byteQuadsCanonicalizer0.toString();
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._hashSize = (-432231879);
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._tertiaryShift = 1762920574;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName(622936314, (-954185593), 850962917);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("hi!", (-432215111));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName(1472002828, 1126420510);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (-432235313);
        byteQuadsCanonicalizer0._hashSize = (-432221419);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432213933), (-961434091));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        boolean boolean3 = byteQuadsCanonicalizer1._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.findName((-432235195), (-847378963));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) '4');
        boolean boolean2 = byteQuadsCanonicalizer1._intern;
        int int3 = byteQuadsCanonicalizer1._longNameOffset;
        int int5 = byteQuadsCanonicalizer1.calcHash((-432227853));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.findName((-432226741), 0, 462202842);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._hashSize = (-432227101);
        int int8 = byteQuadsCanonicalizer0.calcHash(726715588);
        int int10 = byteQuadsCanonicalizer0.calcHash((-1799852163));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = byteQuadsCanonicalizer0.totalCount();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._intern = false;
        byteQuadsCanonicalizer0._secondaryStart = (-129002493);
        int int9 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 800588149, (-432226777));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 585081256);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = byteQuadsCanonicalizer0.totalCount();
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-12896225));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(111461789);
        byteQuadsCanonicalizer1._secondaryStart = (-432217417);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1420518152), 1675945638);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("hi!", (-432205995));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int[] intArray2 = byteQuadsCanonicalizer0._hashArea;
        boolean boolean3 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-432225773);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-671599682), 27220);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._hashSize = (-2027202559);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-154121685), (-432181855));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432804524));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = byteQuadsCanonicalizer1.findName((-108915153));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
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
        boolean boolean16 = byteQuadsCanonicalizer0._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.toString();
    }
}

