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
        java.lang.String str19 = byteQuadsCanonicalizer0.findName(1169358761, (-432128501), (-673866219));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int9 = byteQuadsCanonicalizer0.calcHash((-432135531), (-673933336), 0);
        int int10 = byteQuadsCanonicalizer0._secondaryStart;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        int int12 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName(221749187, (-674196789));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0.makeChild((-432132905));
        int int6 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.findName((-432107819), 725798785);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean5 = byteQuadsCanonicalizer0.maybeDirty();
        int int6 = byteQuadsCanonicalizer0.totalCount();
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-691618586), 480341998);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
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
        int int15 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.findName((-432122449), 725623249, 10514);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._intern = false;
        java.lang.String str10 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0.makeChild(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer0.findName((-409911232), 1644723155, 439949297);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1888459861), 1848248);
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        int int9 = byteQuadsCanonicalizer0.totalCount();
        int int10 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 725665207, (-673209263));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = 725993347;
        int int4 = byteQuadsCanonicalizer1._count;
        int int7 = byteQuadsCanonicalizer1.calcHash(1609565333, 725901070);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = byteQuadsCanonicalizer1.tertiaryCount();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        int[] intArray11 = byteQuadsCanonicalizer0._hashArea;
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", (-1133915680), (-432093383), (-650132939));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
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
        int int77 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str80 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-673795353));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436640 pri/sec/ter/spill (=0), total:-168436640]", 1414514020);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-2044706367);
        byteQuadsCanonicalizer0._secondaryStart = (-1100142565);
        int int11 = byteQuadsCanonicalizer0.size();
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = byteQuadsCanonicalizer0.addName("", 1889548666, 1024415174);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(914786180);
        byteQuadsCanonicalizer1._longNameOffset = (-432138111);
        byteQuadsCanonicalizer1._longNameOffset = 691534002;
        boolean boolean6 = byteQuadsCanonicalizer1._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.findName((-432095369), (-432102747));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-2044706367);
        int int11 = byteQuadsCanonicalizer0.calcHash(0, (-202387379));
        int int12 = byteQuadsCanonicalizer0.totalCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-1296843447), (-577758556));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = (-432139871);
        int int11 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-432103107));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._tertiaryStart = (-1878463180);
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._tertiaryStart = (-1602471359);
        byteQuadsCanonicalizer0._count = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-1499223049, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432101173), (-432104665), (-432135561));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int15 = byteQuadsCanonicalizer0.calcHash((-432142005));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = byteQuadsCanonicalizer0._parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = byteQuadsCanonicalizer0.findName((-432103613), (-413355502), 725878183);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '4');
        int int11 = byteQuadsCanonicalizer0.calcHash((int) '4', 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-1869392932), 725672020, (-432095005));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1099768828));
        int int2 = byteQuadsCanonicalizer1._count;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = byteQuadsCanonicalizer1.findName((-674176744), 725791414);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int6 = byteQuadsCanonicalizer0.calcHash((-432130869));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/8 pri/sec/ter/spill (=0), total:8]", 725864638, (-432134095), (-432121947));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
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
        java.lang.String str78 = byteQuadsCanonicalizer0.findName((-1410394962));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        int int4 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.totalCount();
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._spilloverEnd = (-867349418);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436640 pri/sec/ter/spill (=0), total:-168436640]", (-432135011));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432142439, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 1475113568, (-432134353), 1611214);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int10 = byteQuadsCanonicalizer0.calcHash((-432135661), (-936271351), (-673907845));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-674014097), 580808244, (-1297148566));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._hashSize = (-2034212398);
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432130787), (-432110209));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        int int19 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = byteQuadsCanonicalizer0.findName((-1096127663), 156127057);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7._hashSize;
        byteQuadsCanonicalizer7._count = (byte) 100;
        int int12 = byteQuadsCanonicalizer7.calcHash((int) (short) 1);
        java.lang.String str13 = byteQuadsCanonicalizer7.toString();
        int int15 = byteQuadsCanonicalizer7.calcHash((int) '4');
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._longNameOffset;
        byteQuadsCanonicalizer16._tertiaryStart = 0;
        boolean boolean20 = byteQuadsCanonicalizer16.maybeDirty();
        byteQuadsCanonicalizer16._spilloverEnd = '4';
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
        int[] intArray46 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int48 = byteQuadsCanonicalizer37.calcHash(intArray46, 4);
        java.lang.String[] strArray54 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer37._names = strArray54;
        byteQuadsCanonicalizer28._names = strArray54;
        byteQuadsCanonicalizer24._names = strArray54;
        byteQuadsCanonicalizer16._names = strArray54;
        byteQuadsCanonicalizer7._names = strArray54;
        byteQuadsCanonicalizer0._names = strArray54;
        byteQuadsCanonicalizer0._spilloverEnd = (-432130937);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str66 = byteQuadsCanonicalizer0.findName((-432130703), (-432105911), 725571832);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer0.findName((-410102698));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(413392058);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int4 = byteQuadsCanonicalizer3._hashSize;
        int int5 = byteQuadsCanonicalizer3.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int8 = byteQuadsCanonicalizer7.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray11 = byteQuadsCanonicalizer10._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._count = (byte) 100;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        int[] intArray21 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int23 = byteQuadsCanonicalizer12.calcHash(intArray21, 4);
        byteQuadsCanonicalizer12._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int27 = byteQuadsCanonicalizer26._hashSize;
        byteQuadsCanonicalizer26._count = (byte) 100;
        java.lang.String[] strArray30 = byteQuadsCanonicalizer26._names;
        int[] intArray35 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int37 = byteQuadsCanonicalizer26.calcHash(intArray35, 4);
        byteQuadsCanonicalizer12._hashArea = intArray35;
        byteQuadsCanonicalizer10._hashArea = intArray35;
        byteQuadsCanonicalizer7._hashArea = intArray35;
        byteQuadsCanonicalizer3._hashArea = intArray35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str43 = byteQuadsCanonicalizer1.findName(intArray35, (-623140359));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(914786180);
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((-432141375));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._secondaryStart = (-432144203);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.addName("", 1578619597, (-432111295), (-873192362));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
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
        java.lang.String str16 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/476445 pri/sec/ter/spill (=0), total:476445]", (-1099768828), 468430400, (-432122291));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        int int8 = byteQuadsCanonicalizer6._spilloverEnd;
        int int9 = byteQuadsCanonicalizer6._longNameOffset;
        int int10 = byteQuadsCanonicalizer6.totalCount();
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
        byteQuadsCanonicalizer6._names = strArray40;
        byteQuadsCanonicalizer0._names = strArray40;
        int int45 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer47 = byteQuadsCanonicalizer0.makeChild((-432138237));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str50 = byteQuadsCanonicalizer0.findName((-59469672), 1123321506);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0.release();
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432128073));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) 'a');
        byteQuadsCanonicalizer1.release();
        int int6 = byteQuadsCanonicalizer1.calcHash((-432137929), 1544900095, (-432134711));
        int int7 = byteQuadsCanonicalizer1._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        int int12 = byteQuadsCanonicalizer10._spilloverEnd;
        int int13 = byteQuadsCanonicalizer10._tertiaryShift;
        boolean boolean14 = byteQuadsCanonicalizer10._intern;
        boolean boolean15 = byteQuadsCanonicalizer10._intern;
        java.lang.String str16 = byteQuadsCanonicalizer10.toString();
        byteQuadsCanonicalizer10._tertiaryShift = 6000;
        int int19 = byteQuadsCanonicalizer10.bucketCount();
        int int20 = byteQuadsCanonicalizer10._count;
        byteQuadsCanonicalizer10._count = 725995156;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23.hashSeed();
        int int25 = byteQuadsCanonicalizer23._longNameOffset;
        int int26 = byteQuadsCanonicalizer23.hashSeed();
        byteQuadsCanonicalizer23._longNameOffset = (short) 10;
        int int31 = byteQuadsCanonicalizer23.calcHash((int) '#', (int) (short) 10);
        int int32 = byteQuadsCanonicalizer23._secondaryStart;
        byteQuadsCanonicalizer23._tertiaryShift = (-673757953);
        boolean boolean35 = byteQuadsCanonicalizer23.maybeDirty();
        int int36 = byteQuadsCanonicalizer23._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer37 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int38 = byteQuadsCanonicalizer37._hashSize;
        java.lang.String str39 = byteQuadsCanonicalizer37.toString();
        int[] intArray44 = new int[] { (-432144557), (-432145785), 725972989, 490519636 };
        byteQuadsCanonicalizer37._hashArea = intArray44;
        byteQuadsCanonicalizer23._hashArea = intArray44;
        byteQuadsCanonicalizer10._hashArea = intArray44;
        byteQuadsCanonicalizer9._hashArea = intArray44;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str50 = byteQuadsCanonicalizer1.findName(intArray44, (-432091725));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        boolean boolean4 = byteQuadsCanonicalizer1._intern;
        int int5 = byteQuadsCanonicalizer1.secondaryCount();
        boolean boolean6 = byteQuadsCanonicalizer1._failOnDoS;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer1.findName((-699411658));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        int int8 = byteQuadsCanonicalizer1.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer1.makeChild((-1806864732));
        int int11 = byteQuadsCanonicalizer1.secondaryCount();
        int int12 = byteQuadsCanonicalizer1.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = byteQuadsCanonicalizer1.findName(1193256131, (-432090653), (-1554695939));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int5 = byteQuadsCanonicalizer0.calcHash(1115466640, (-1921164701));
        int int6 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432122805));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(913883991);
        boolean boolean2 = byteQuadsCanonicalizer1._intern;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = byteQuadsCanonicalizer1.findName(725918890, (-432127373), (-623140359));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-673746378);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.addName("", (-432136271), (-367837109));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._count;
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer0.findName((-674137040), (-897527923));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._secondaryStart = (-2082658397);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName((-574004730), (-674029561));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        byteQuadsCanonicalizer0._count = 2430;
        byteQuadsCanonicalizer0._spilloverEnd = 703026763;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.findName((-1948602113), (-673992525), 0);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
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
        byteQuadsCanonicalizer0._tertiaryStart = 725872954;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0._tertiaryStart = (-432144783);
        int int11 = byteQuadsCanonicalizer0.tertiaryCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-432131899));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0.release();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(1755205238, (-432125031));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        byteQuadsCanonicalizer0._tertiaryStart = (-432129791);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-432125155), (-432096197));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1888459861), 1848248);
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        int int9 = byteQuadsCanonicalizer0.totalCount();
        int int10 = byteQuadsCanonicalizer0.spilloverCount();
        java.lang.String[] strArray11 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer0.findName((-432131805), 345556653, 0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 2045893375;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        boolean boolean9 = byteQuadsCanonicalizer8.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        byteQuadsCanonicalizer10._count = (byte) 100;
        int int14 = byteQuadsCanonicalizer10.bucketCount();
        int int15 = byteQuadsCanonicalizer10._tertiaryStart;
        int int16 = byteQuadsCanonicalizer10.primaryCount();
        int int17 = byteQuadsCanonicalizer10.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray20 = byteQuadsCanonicalizer19._hashArea;
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
        byteQuadsCanonicalizer19._hashArea = intArray44;
        byteQuadsCanonicalizer10._hashArea = intArray44;
        byteQuadsCanonicalizer8._hashArea = intArray44;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = byteQuadsCanonicalizer1.findName(intArray44, (-432101875));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int int2 = byteQuadsCanonicalizer1._spilloverEnd;
        byteQuadsCanonicalizer1._hashSize = (-432117015);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-15333463), (-432128343), (-432123877));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
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
        int int14 = byteQuadsCanonicalizer0.secondaryCount();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        java.lang.String[] strArray6 = byteQuadsCanonicalizer0._names;
        java.lang.String[] strArray7 = byteQuadsCanonicalizer0._names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName(725862307, (-432112717), (-1457886293));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryStart = (-432128595);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-432126637), 924952297, 16585418);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
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
        int int11 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-432105219));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1409413593));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = byteQuadsCanonicalizer1.findName((-432101549));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.totalCount();
        java.lang.String[] strArray5 = byteQuadsCanonicalizer0._names;
        int int9 = byteQuadsCanonicalizer0.calcHash((-1722154555), 930352461, (-432128655));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = byteQuadsCanonicalizer0.findName(232444269, 0);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        int int14 = byteQuadsCanonicalizer0.secondaryCount();
        int int15 = byteQuadsCanonicalizer0._longNameOffset;
        int int19 = byteQuadsCanonicalizer0.calcHash((-432127813), 1965586, (-432138537));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = byteQuadsCanonicalizer0.findName(725931760, (-432130269));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-2044706367);
        byteQuadsCanonicalizer0._secondaryStart = (-1100142565);
        int int11 = byteQuadsCanonicalizer0._longNameOffset;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 0);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", (-432137055));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1099768828));
        int int2 = byteQuadsCanonicalizer1._count;
        int[] intArray3 = byteQuadsCanonicalizer1._hashArea;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1404133737), 725810197);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._hashSize = 725972989;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = byteQuadsCanonicalizer0.totalCount();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = byteQuadsCanonicalizer1.addName("", 725695735, 0, (-674177924));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName((-1464847827), (-366686577));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = byteQuadsCanonicalizer0.findName(290074757, 1989723960, (-432129291));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._longNameOffset;
        boolean boolean8 = byteQuadsCanonicalizer1.maybeDirty();
        int int9 = byteQuadsCanonicalizer1._tertiaryStart;
        int int13 = byteQuadsCanonicalizer1.calcHash(725704951, 725925352, 725877427);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = byteQuadsCanonicalizer1.findName((-1761361661));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        byteQuadsCanonicalizer0._count = (byte) -1;
        int int9 = byteQuadsCanonicalizer0._tertiaryStart;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436640 pri/sec/ter/spill (=0), total:-168436640]", (-432108491), 726009970);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 2045893375;
        byteQuadsCanonicalizer1._spilloverEnd = 0;
        byteQuadsCanonicalizer1._longNameOffset = (-673909771);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436640 pri/sec/ter/spill (=0), total:-168436640]", (-432104281));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0._parent;
        int int6 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._longNameOffset = 1984414365;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.findName((-490776002));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._tertiaryStart = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", (-432121367), (-432090241), (-428860709));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        int int9 = byteQuadsCanonicalizer0.spilloverCount();
        int int11 = byteQuadsCanonicalizer0.calcHash((-527958288));
        int int12 = byteQuadsCanonicalizer0.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        int int15 = byteQuadsCanonicalizer13._spilloverEnd;
        int int16 = byteQuadsCanonicalizer13._hashSize;
        byteQuadsCanonicalizer13._tertiaryShift = (-673746557);
        boolean boolean19 = byteQuadsCanonicalizer13._failOnDoS;
        boolean boolean20 = byteQuadsCanonicalizer13.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int23 = byteQuadsCanonicalizer22.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray26 = byteQuadsCanonicalizer25._hashArea;
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
        byteQuadsCanonicalizer25._hashArea = intArray50;
        byteQuadsCanonicalizer22._hashArea = intArray50;
        byteQuadsCanonicalizer13._hashArea = intArray50;
        java.lang.String[] strArray61 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436640 pri/sec/ter/spill (=0), total:-168436640]" };
        byteQuadsCanonicalizer13._names = strArray61;
        byteQuadsCanonicalizer0._names = strArray61;
        int int64 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str69 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/8 pri/sec/ter/spill (=0), total:8]", 0, 701168463, (-432097893));
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer0._parent;
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = byteQuadsCanonicalizer0.findName((-432117377));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-432131891));
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        int int10 = byteQuadsCanonicalizer0._secondaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        int int13 = byteQuadsCanonicalizer11._spilloverEnd;
        int int14 = byteQuadsCanonicalizer11._tertiaryShift;
        int int18 = byteQuadsCanonicalizer11.calcHash(6000, (-432145171), 0);
        byteQuadsCanonicalizer11._reportTooManyCollisions();
        int int20 = byteQuadsCanonicalizer11.hashSeed();
        int[] intArray21 = byteQuadsCanonicalizer11._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._hashSize;
        byteQuadsCanonicalizer22._count = (byte) 100;
        java.lang.String[] strArray26 = byteQuadsCanonicalizer22._names;
        java.lang.String str27 = byteQuadsCanonicalizer22.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28._hashSize;
        byteQuadsCanonicalizer28._count = (byte) 100;
        java.lang.String[] strArray32 = byteQuadsCanonicalizer28._names;
        int[] intArray37 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int39 = byteQuadsCanonicalizer28.calcHash(intArray37, 4);
        byteQuadsCanonicalizer22._hashArea = intArray37;
        byteQuadsCanonicalizer11._hashArea = intArray37;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str43 = byteQuadsCanonicalizer0.findName(intArray37, 0);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136449));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = byteQuadsCanonicalizer1.findName((-432098323), (-432122283));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = byteQuadsCanonicalizer0.makeChild((-432140467));
        int int16 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._spilloverEnd = 57680;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = byteQuadsCanonicalizer0.findName(725528209, 0);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._longNameOffset = (-432146455);
        byteQuadsCanonicalizer0._count = 725993347;
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = byteQuadsCanonicalizer0.findName((-1558859980));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
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
        java.lang.String str20 = byteQuadsCanonicalizer0.findName(0, 913888761);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(48709);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        int int8 = byteQuadsCanonicalizer6._spilloverEnd;
        boolean boolean9 = byteQuadsCanonicalizer6.maybeDirty();
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
        int[] intArray28 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int30 = byteQuadsCanonicalizer19.calcHash(intArray28, 4);
        java.lang.String[] strArray36 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer19._names = strArray36;
        byteQuadsCanonicalizer10._names = strArray36;
        byteQuadsCanonicalizer6._names = strArray36;
        byteQuadsCanonicalizer5._names = strArray36;
        byteQuadsCanonicalizer0._names = strArray36;
        int int42 = byteQuadsCanonicalizer0._hashSize;
        int int43 = byteQuadsCanonicalizer0._tertiaryShift;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = byteQuadsCanonicalizer0.findName(1963917882, 1691981256, (-882928689));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryShift = 983577201;
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436737 pri/sec/ter/spill (=0), total:-168436737]", 725550421, 725502262);
    }
}

