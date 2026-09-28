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
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._spilloverEnd = 725989756;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8._hashSize;
        byteQuadsCanonicalizer8._count = (byte) 100;
        java.lang.String[] strArray12 = byteQuadsCanonicalizer8._names;
        int[] intArray17 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int19 = byteQuadsCanonicalizer8.calcHash(intArray17, 4);
        byteQuadsCanonicalizer8._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._hashSize;
        byteQuadsCanonicalizer22._count = (byte) 100;
        java.lang.String[] strArray26 = byteQuadsCanonicalizer22._names;
        int[] intArray31 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int33 = byteQuadsCanonicalizer22.calcHash(intArray31, 4);
        byteQuadsCanonicalizer8._hashArea = intArray31;
        int int35 = byteQuadsCanonicalizer8.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer36 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int37 = byteQuadsCanonicalizer36._longNameOffset;
        byteQuadsCanonicalizer36._tertiaryStart = 0;
        int int40 = byteQuadsCanonicalizer36._tertiaryShift;
        int int41 = byteQuadsCanonicalizer36.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer42 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int43 = byteQuadsCanonicalizer42._hashSize;
        int int44 = byteQuadsCanonicalizer42._spilloverEnd;
        int int45 = byteQuadsCanonicalizer42._longNameOffset;
        int int46 = byteQuadsCanonicalizer42.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer47 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int48 = byteQuadsCanonicalizer47.hashSeed();
        int int49 = byteQuadsCanonicalizer47._longNameOffset;
        int int50 = byteQuadsCanonicalizer47.hashSeed();
        byteQuadsCanonicalizer47._longNameOffset = (short) 10;
        int int55 = byteQuadsCanonicalizer47.calcHash((int) '#', (int) (short) 10);
        int int56 = byteQuadsCanonicalizer47._secondaryStart;
        byteQuadsCanonicalizer47._tertiaryShift = (-673757953);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer59 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int60 = byteQuadsCanonicalizer59._hashSize;
        byteQuadsCanonicalizer59._count = (byte) 100;
        java.lang.String[] strArray63 = byteQuadsCanonicalizer59._names;
        int[] intArray68 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int70 = byteQuadsCanonicalizer59.calcHash(intArray68, 4);
        java.lang.String[] strArray76 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer59._names = strArray76;
        byteQuadsCanonicalizer47._names = strArray76;
        byteQuadsCanonicalizer42._names = strArray76;
        byteQuadsCanonicalizer36._names = strArray76;
        byteQuadsCanonicalizer8._names = strArray76;
        byteQuadsCanonicalizer0._names = strArray76;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "1) test2001(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432091479) + "'", int1 == (-432091479));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "1) test2001(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1892154496 + "'", int19 == 1892154496);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "1) test2001(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1892154496 + "'", int33 == 1892154496);
// flaky "1) test2001(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-432091479) + "'", int35 == (-432091479));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
// flaky "1) test2001(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-432091479) + "'", int41 == (-432091479));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer47);
// flaky "1) test2001(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-432091479) + "'", int48 == (-432091479));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
// flaky "1) test2001(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-432091479) + "'", int50 == (-432091479));
// flaky "1) test2001(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 725530738 + "'", int55 == 725530738);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(strArray63);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "1) test2001(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1892154496 + "'", int70 == 1892154496);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(725879344);
        int int13 = byteQuadsCanonicalizer0.calcHash(0, (-432143093), (-19267085));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "2) test2002(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-745756482) + "'", int7 == (-745756482));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
// flaky "2) test2002(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1896471918) + "'", int13 == (-1896471918));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._tertiaryStart = 'a';
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        int[] intArray16 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int18 = byteQuadsCanonicalizer7.calcHash(intArray16, 4);
        java.lang.String[] strArray24 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer7._names = strArray24;
        byteQuadsCanonicalizer0._names = strArray24;
        int int28 = byteQuadsCanonicalizer0.calcHash((-673998433));
        byteQuadsCanonicalizer0._tertiaryShift = (-432121731);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31._hashSize;
        int int33 = byteQuadsCanonicalizer31._spilloverEnd;
        int int34 = byteQuadsCanonicalizer31._tertiaryShift;
        int int38 = byteQuadsCanonicalizer31.calcHash(6000, (-432145171), 0);
        byteQuadsCanonicalizer31._reportTooManyCollisions();
        int int40 = byteQuadsCanonicalizer31.hashSeed();
        int[] intArray41 = byteQuadsCanonicalizer31._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer42 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int43 = byteQuadsCanonicalizer42._hashSize;
        byteQuadsCanonicalizer42._count = (byte) 100;
        java.lang.String[] strArray46 = byteQuadsCanonicalizer42._names;
        java.lang.String str47 = byteQuadsCanonicalizer42.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer48 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int49 = byteQuadsCanonicalizer48._hashSize;
        byteQuadsCanonicalizer48._count = (byte) 100;
        java.lang.String[] strArray52 = byteQuadsCanonicalizer48._names;
        int[] intArray57 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int59 = byteQuadsCanonicalizer48.calcHash(intArray57, 4);
        byteQuadsCanonicalizer42._hashArea = intArray57;
        byteQuadsCanonicalizer31._hashArea = intArray57;
        // The following exception was thrown during execution in test generation
        try {
            int int63 = byteQuadsCanonicalizer0.calcHash(intArray57, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "3) test2004(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432091449) + "'", int1 == (-432091449));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "3) test2004(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 868022664 + "'", int18 == 868022664);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
// flaky "2) test2004(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1098011767) + "'", int28 == (-1098011767));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
// flaky "2) test2004(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-754709298) + "'", int38 == (-754709298));
// flaky "2) test2004(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-432091449) + "'", int40 == (-432091449));
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str47, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "2) test2004(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 868022664 + "'", int59 == 868022664);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(492187041);
        java.lang.String str2 = byteQuadsCanonicalizer1.toString();
        java.lang.String str3 = byteQuadsCanonicalizer1.toString();
        int int4 = byteQuadsCanonicalizer1.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str2, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        int int13 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "4) test2006(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674260487) + "'", int5 == (-674260487));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "4) test2006(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 863221964 + "'", int11 == 863221964);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild(30323224);
        byteQuadsCanonicalizer8._reportTooManyCollisions();
        int int12 = byteQuadsCanonicalizer8.calcHash((-673962205), (-2101935197));
        byteQuadsCanonicalizer8._secondaryStart = '4';
        int int15 = byteQuadsCanonicalizer8._tertiaryStart;
        int int16 = byteQuadsCanonicalizer8.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "5) test2007(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-485955759) + "'", int12 == (-485955759));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 384 + "'", int15 == 384);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0.release();
        int int5 = byteQuadsCanonicalizer0.tertiaryCount();
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "6) test2008(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432091413) + "'", int1 == (-432091413));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "5) test2008(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432091413) + "'", int6 == (-432091413));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1409413593));
        byteQuadsCanonicalizer1._tertiaryStart = (-432122581);
        byteQuadsCanonicalizer1._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String[] strArray3 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._intern = false;
        int int6 = byteQuadsCanonicalizer0._tertiaryStart;
        java.lang.String[] strArray7 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        byteQuadsCanonicalizer14._count = (byte) 100;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer14._names;
        int[] intArray23 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int25 = byteQuadsCanonicalizer14.calcHash(intArray23, 4);
        byteQuadsCanonicalizer0._hashArea = intArray23;
        int int27 = byteQuadsCanonicalizer0.primaryCount();
        int int28 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "7) test2011(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1125909091 + "'", int11 == 1125909091);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "6) test2011(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1125909091 + "'", int25 == 1125909091);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        java.lang.Class<?> wildcardClass8 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "8) test2012(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432091363) + "'", int1 == (-432091363));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer3._parent;
        int int8 = byteQuadsCanonicalizer3.calcHash((-673963519), (-432124433));
        int int9 = byteQuadsCanonicalizer3._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 280252815 + "'", int8 == 280252815);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 384 + "'", int9 == 384);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144281), (-432142395), 12495515);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean8 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryStart = (-673998433);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        byteQuadsCanonicalizer11._tertiaryStart = (-673785321);
        boolean boolean15 = byteQuadsCanonicalizer11._failOnDoS;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer11._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(48709);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        int int21 = byteQuadsCanonicalizer19._spilloverEnd;
        boolean boolean22 = byteQuadsCanonicalizer19.maybeDirty();
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
        int[] intArray41 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int43 = byteQuadsCanonicalizer32.calcHash(intArray41, 4);
        java.lang.String[] strArray49 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer32._names = strArray49;
        byteQuadsCanonicalizer23._names = strArray49;
        byteQuadsCanonicalizer19._names = strArray49;
        byteQuadsCanonicalizer18._names = strArray49;
        byteQuadsCanonicalizer11._names = strArray49;
        byteQuadsCanonicalizer0._names = strArray49;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "9) test2014(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1986592573) + "'", int6 == (-1986592573));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "7) test2014(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1060946448) + "'", int43 == (-1060946448));
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryStart = (-673788291);
        int int14 = byteQuadsCanonicalizer0.tertiaryCount();
        java.lang.String[] strArray15 = null;
        byteQuadsCanonicalizer0._names = strArray15;
        byteQuadsCanonicalizer0.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._longNameOffset;
        byteQuadsCanonicalizer18._tertiaryStart = 0;
        boolean boolean22 = byteQuadsCanonicalizer18.maybeDirty();
        byteQuadsCanonicalizer18._spilloverEnd = '4';
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
        int[] intArray48 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
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
        int[] intArray79 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int81 = byteQuadsCanonicalizer70.calcHash(intArray79, 4);
        java.lang.String[] strArray87 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer70._names = strArray87;
        byteQuadsCanonicalizer61._names = strArray87;
        byteQuadsCanonicalizer18._names = strArray87;
        byteQuadsCanonicalizer0._names = strArray87;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "10) test2015(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432091337) + "'", int1 == (-432091337));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "8) test2015(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432091337) + "'", int3 == (-432091337));
// flaky "3) test2015(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725536345 + "'", int8 == 725536345);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 13 + "'", int25 == 13);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
// flaky "3) test2015(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-432091337) + "'", int27 == (-432091337));
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
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "3) test2015(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-882928689) + "'", int50 == (-882928689));
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
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "3) test2015(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-882928689) + "'", int81 == (-882928689));
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(914786180);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int5 = byteQuadsCanonicalizer4._hashSize;
        int int6 = byteQuadsCanonicalizer4._spilloverEnd;
        int int7 = byteQuadsCanonicalizer4._tertiaryShift;
        boolean boolean8 = byteQuadsCanonicalizer4._intern;
        boolean boolean9 = byteQuadsCanonicalizer4._intern;
        java.lang.String str10 = byteQuadsCanonicalizer4.toString();
        byteQuadsCanonicalizer4._tertiaryShift = 6000;
        int int13 = byteQuadsCanonicalizer4.bucketCount();
        int int14 = byteQuadsCanonicalizer4._count;
        byteQuadsCanonicalizer4._count = 725995156;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17.hashSeed();
        int int19 = byteQuadsCanonicalizer17._longNameOffset;
        int int20 = byteQuadsCanonicalizer17.hashSeed();
        byteQuadsCanonicalizer17._longNameOffset = (short) 10;
        int int25 = byteQuadsCanonicalizer17.calcHash((int) '#', (int) (short) 10);
        int int26 = byteQuadsCanonicalizer17._secondaryStart;
        byteQuadsCanonicalizer17._tertiaryShift = (-673757953);
        boolean boolean29 = byteQuadsCanonicalizer17.maybeDirty();
        int int30 = byteQuadsCanonicalizer17._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31._hashSize;
        java.lang.String str33 = byteQuadsCanonicalizer31.toString();
        int[] intArray38 = new int[] { (-432144557), (-432145785), 725972989, 490519636 };
        byteQuadsCanonicalizer31._hashArea = intArray38;
        byteQuadsCanonicalizer17._hashArea = intArray38;
        byteQuadsCanonicalizer4._hashArea = intArray38;
        byteQuadsCanonicalizer3._hashArea = intArray38;
        byteQuadsCanonicalizer1._hashArea = intArray38;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str10, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
// flaky "11) test2016(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-432091323) + "'", int18 == (-432091323));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky "9) test2016(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-432091323) + "'", int20 == (-432091323));
// flaky "4) test2016(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 725534752 + "'", int25 == 725534752);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str33, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-432144557), (-432145785), 725972989, 490519636 });
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        byteQuadsCanonicalizer0._tertiaryShift = 924629957;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17.hashSeed();
        int int19 = byteQuadsCanonicalizer17._longNameOffset;
        int int20 = byteQuadsCanonicalizer17.hashSeed();
        byteQuadsCanonicalizer17._longNameOffset = (-1677284569);
        byteQuadsCanonicalizer17._count = 2430;
        byteQuadsCanonicalizer17._spilloverEnd = 703026763;
        byteQuadsCanonicalizer17._count = (-432137405);
        int int29 = byteQuadsCanonicalizer17.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int31 = byteQuadsCanonicalizer30.hashSeed();
        int int32 = byteQuadsCanonicalizer30._longNameOffset;
        int int33 = byteQuadsCanonicalizer30.hashSeed();
        byteQuadsCanonicalizer30._longNameOffset = (short) 10;
        int int38 = byteQuadsCanonicalizer30.calcHash((int) '#', (int) (short) 10);
        int int39 = byteQuadsCanonicalizer30._secondaryStart;
        byteQuadsCanonicalizer30._tertiaryShift = (-673757953);
        int int42 = byteQuadsCanonicalizer30._count;
        byteQuadsCanonicalizer30._tertiaryStart = (-1989560847);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer45 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int46 = byteQuadsCanonicalizer45._hashSize;
        int int50 = byteQuadsCanonicalizer45.calcHash(726014974, 439949297, 1889548666);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer52 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        boolean boolean53 = byteQuadsCanonicalizer52.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer54 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int55 = byteQuadsCanonicalizer54._hashSize;
        byteQuadsCanonicalizer54._count = (byte) 100;
        int int58 = byteQuadsCanonicalizer54.bucketCount();
        int int59 = byteQuadsCanonicalizer54._tertiaryStart;
        int int60 = byteQuadsCanonicalizer54.primaryCount();
        int int61 = byteQuadsCanonicalizer54.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer63 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray64 = byteQuadsCanonicalizer63._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer65 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int66 = byteQuadsCanonicalizer65._hashSize;
        byteQuadsCanonicalizer65._count = (byte) 100;
        java.lang.String[] strArray69 = byteQuadsCanonicalizer65._names;
        int[] intArray74 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int76 = byteQuadsCanonicalizer65.calcHash(intArray74, 4);
        byteQuadsCanonicalizer65._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer79 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int80 = byteQuadsCanonicalizer79._hashSize;
        byteQuadsCanonicalizer79._count = (byte) 100;
        java.lang.String[] strArray83 = byteQuadsCanonicalizer79._names;
        int[] intArray88 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int90 = byteQuadsCanonicalizer79.calcHash(intArray88, 4);
        byteQuadsCanonicalizer65._hashArea = intArray88;
        byteQuadsCanonicalizer63._hashArea = intArray88;
        byteQuadsCanonicalizer54._hashArea = intArray88;
        byteQuadsCanonicalizer52._hashArea = intArray88;
        byteQuadsCanonicalizer45._hashArea = intArray88;
        byteQuadsCanonicalizer30._hashArea = intArray88;
        byteQuadsCanonicalizer17._hashArea = intArray88;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str99 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-1499223049, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray88, 725746585);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "12) test2017(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432091311) + "'", int1 == (-432091311));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "10) test2017(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432091311) + "'", int3 == (-432091311));
// flaky "5) test2017(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725535013 + "'", int8 == 725535013);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
// flaky "4) test2017(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-432091311) + "'", int18 == (-432091311));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky "4) test2017(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-432091311) + "'", int20 == (-432091311));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer30);
// flaky "4) test2017(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-432091311) + "'", int31 == (-432091311));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
// flaky "2) test2017(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-432091311) + "'", int33 == (-432091311));
// flaky "2) test2017(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 725535013 + "'", int38 == 725535013);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
// flaky "2) test2017(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1755933375) + "'", int50 == (-1755933375));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer63);
        org.junit.Assert.assertNull(intArray64);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(strArray69);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "1) test2017(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int76 + "' != '" + 397607117 + "'", int76 == 397607117);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNull(strArray83);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "1) test2017(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int90 + "' != '" + 397607117 + "'", int90 == 397607117);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int15 = byteQuadsCanonicalizer14.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray18 = byteQuadsCanonicalizer17._hashArea;
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
        byteQuadsCanonicalizer17._hashArea = intArray42;
        byteQuadsCanonicalizer14._hashArea = intArray42;
        byteQuadsCanonicalizer0._hashArea = intArray42;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "13) test2018(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432091283) + "'", int1 == (-432091283));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "11) test2018(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432091283) + "'", int3 == (-432091283));
// flaky "6) test2018(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725535589 + "'", int8 == 725535589);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "5) test2018(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1061143492) + "'", int30 == (-1061143492));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "5) test2018(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1061143492) + "'", int44 == (-1061143492));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._tertiaryShift = 443875710;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int10 = byteQuadsCanonicalizer0.calcHash(751624935, (-432139505), (-432130703));
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "14) test2019(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1606948740 + "'", int10 == 1606948740);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int[] intArray3 = byteQuadsCanonicalizer1._hashArea;
        boolean boolean4 = byteQuadsCanonicalizer1.maybeDirty();
        byteQuadsCanonicalizer1._intern = false;
        int int8 = byteQuadsCanonicalizer1.calcHash((-1689882502));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1099132341 + "'", int8 == 1099132341);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int10 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        int int14 = byteQuadsCanonicalizer0.secondaryCount();
        boolean boolean15 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "15) test2022(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1626997881 + "'", int11 == 1626997881);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer16);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._intern = false;
        boolean boolean13 = byteQuadsCanonicalizer0._intern;
        int int14 = byteQuadsCanonicalizer0.primaryCount();
        boolean boolean15 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "16) test2023(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-598997224) + "'", int7 == (-598997224));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "12) test2023(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432091235) + "'", int9 == (-432091235));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        byteQuadsCanonicalizer0._longNameOffset = (-432142603);
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-432119881));
        int int12 = byteQuadsCanonicalizer8.calcHash((-1240129817), (-432127947), (-791893507));
        boolean boolean13 = byteQuadsCanonicalizer8._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "17) test2024(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1802820589 + "'", int12 == 1802820589);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        boolean boolean34 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._longNameOffset = (-432122419);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "18) test2025(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432091201) + "'", int1 == (-432091201));
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
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "13) test2025(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-708095280) + "'", int24 == (-708095280));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._count;
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
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
        int[] intArray24 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int26 = byteQuadsCanonicalizer15.calcHash(intArray24, 4);
        java.lang.String[] strArray32 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer15._names = strArray32;
        byteQuadsCanonicalizer6._names = strArray32;
        java.lang.String[] strArray35 = new java.lang.String[] {};
        byteQuadsCanonicalizer6._names = strArray35;
        int int37 = byteQuadsCanonicalizer6._secondaryStart;
        java.lang.String[] strArray38 = byteQuadsCanonicalizer6._names;
        byteQuadsCanonicalizer0._names = strArray38;
        int int40 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "19) test2026(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1887478425 + "'", int26 == 1887478425);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1421574550);
        int int2 = byteQuadsCanonicalizer1.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int int2 = byteQuadsCanonicalizer1.size();
        int int3 = byteQuadsCanonicalizer1.size();
        boolean boolean4 = byteQuadsCanonicalizer1._failOnDoS;
        boolean boolean5 = byteQuadsCanonicalizer1._failOnDoS;
        int int6 = byteQuadsCanonicalizer1.tertiaryCount();
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._longNameOffset = (-432146455);
        int int9 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "20) test2029(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432091167) + "'", int1 == (-432091167));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0.primaryCount();
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
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
        byteQuadsCanonicalizer0._hashArea = intArray28;
        int int33 = byteQuadsCanonicalizer0._longNameOffset;
        int int34 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer36 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int37 = byteQuadsCanonicalizer36._hashSize;
        int int38 = byteQuadsCanonicalizer36.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer40 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int41 = byteQuadsCanonicalizer40.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer43 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray44 = byteQuadsCanonicalizer43._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer45 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int46 = byteQuadsCanonicalizer45._hashSize;
        byteQuadsCanonicalizer45._count = (byte) 100;
        java.lang.String[] strArray49 = byteQuadsCanonicalizer45._names;
        int[] intArray54 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int56 = byteQuadsCanonicalizer45.calcHash(intArray54, 4);
        byteQuadsCanonicalizer45._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer59 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int60 = byteQuadsCanonicalizer59._hashSize;
        byteQuadsCanonicalizer59._count = (byte) 100;
        java.lang.String[] strArray63 = byteQuadsCanonicalizer59._names;
        int[] intArray68 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int70 = byteQuadsCanonicalizer59.calcHash(intArray68, 4);
        byteQuadsCanonicalizer45._hashArea = intArray68;
        byteQuadsCanonicalizer43._hashArea = intArray68;
        byteQuadsCanonicalizer40._hashArea = intArray68;
        byteQuadsCanonicalizer36._hashArea = intArray68;
        // The following exception was thrown during execution in test generation
        try {
            int int76 = byteQuadsCanonicalizer0.calcHash(intArray68, (-432116819));
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
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "21) test2032(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1907532856 + "'", int16 == 1907532856);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "14) test2032(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1907532856 + "'", int30 == 1907532856);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer43);
        org.junit.Assert.assertNull(intArray44);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "7) test2032(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1907532856 + "'", int56 == 1907532856);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(strArray63);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "6) test2032(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1907532856 + "'", int70 == 1907532856);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1409413593));
        byteQuadsCanonicalizer1._count = 706888668;
        int[] intArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = byteQuadsCanonicalizer1.calcHash(intArray4, (-432116021));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild((-922425077));
        int int5 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "22) test2034(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432091111) + "'", int1 == (-432091111));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild(0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        int int14 = byteQuadsCanonicalizer12._spilloverEnd;
        int int15 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._tertiaryShift = (-673746557);
        boolean boolean18 = byteQuadsCanonicalizer12._failOnDoS;
        boolean boolean19 = byteQuadsCanonicalizer12.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int22 = byteQuadsCanonicalizer21.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray25 = byteQuadsCanonicalizer24._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int27 = byteQuadsCanonicalizer26._hashSize;
        byteQuadsCanonicalizer26._count = (byte) 100;
        java.lang.String[] strArray30 = byteQuadsCanonicalizer26._names;
        int[] intArray35 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int37 = byteQuadsCanonicalizer26.calcHash(intArray35, 4);
        byteQuadsCanonicalizer26._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer40 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int41 = byteQuadsCanonicalizer40._hashSize;
        byteQuadsCanonicalizer40._count = (byte) 100;
        java.lang.String[] strArray44 = byteQuadsCanonicalizer40._names;
        int[] intArray49 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int51 = byteQuadsCanonicalizer40.calcHash(intArray49, 4);
        byteQuadsCanonicalizer26._hashArea = intArray49;
        byteQuadsCanonicalizer24._hashArea = intArray49;
        byteQuadsCanonicalizer21._hashArea = intArray49;
        byteQuadsCanonicalizer12._hashArea = intArray49;
        byteQuadsCanonicalizer0._hashArea = intArray49;
        int int57 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "23) test2035(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674266762) + "'", int5 == (-674266762));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "15) test2035(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1492589681) + "'", int37 == (-1492589681));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "8) test2035(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1492589681) + "'", int51 == (-1492589681));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._spilloverEnd = 1905780;
        int[] intArray8 = byteQuadsCanonicalizer0._hashArea;
        int int9 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        int int15 = byteQuadsCanonicalizer10.calcHash(726014974, 439949297, 1889548666);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        boolean boolean18 = byteQuadsCanonicalizer17.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        byteQuadsCanonicalizer19._count = (byte) 100;
        int int23 = byteQuadsCanonicalizer19.bucketCount();
        int int24 = byteQuadsCanonicalizer19._tertiaryStart;
        int int25 = byteQuadsCanonicalizer19.primaryCount();
        int int26 = byteQuadsCanonicalizer19.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray29 = byteQuadsCanonicalizer28._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int31 = byteQuadsCanonicalizer30._hashSize;
        byteQuadsCanonicalizer30._count = (byte) 100;
        java.lang.String[] strArray34 = byteQuadsCanonicalizer30._names;
        int[] intArray39 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int41 = byteQuadsCanonicalizer30.calcHash(intArray39, 4);
        byteQuadsCanonicalizer30._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer44 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int45 = byteQuadsCanonicalizer44._hashSize;
        byteQuadsCanonicalizer44._count = (byte) 100;
        java.lang.String[] strArray48 = byteQuadsCanonicalizer44._names;
        int[] intArray53 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int55 = byteQuadsCanonicalizer44.calcHash(intArray53, 4);
        byteQuadsCanonicalizer30._hashArea = intArray53;
        byteQuadsCanonicalizer28._hashArea = intArray53;
        byteQuadsCanonicalizer19._hashArea = intArray53;
        byteQuadsCanonicalizer17._hashArea = intArray53;
        byteQuadsCanonicalizer10._hashArea = intArray53;
        byteQuadsCanonicalizer0._hashArea = intArray53;
        java.lang.Class<?> wildcardClass62 = intArray53.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "24) test2036(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-674267369) + "'", int3 == (-674267369));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 476445 + "'", int9 == 476445);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "16) test2036(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-997787255) + "'", int15 == (-997787255));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "9) test2036(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1793552004) + "'", int41 == (-1793552004));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "7) test2036(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1793552004) + "'", int55 == (-1793552004));
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._secondaryStart;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._hashSize = 284274137;
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        int int9 = byteQuadsCanonicalizer0.calcHash((-673759171));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) 100);
        byteQuadsCanonicalizer11._hashSize = 100;
        byteQuadsCanonicalizer11._tertiaryStart = 841774826;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        boolean boolean18 = byteQuadsCanonicalizer17.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        byteQuadsCanonicalizer19._count = (byte) 100;
        int int23 = byteQuadsCanonicalizer19.bucketCount();
        int int24 = byteQuadsCanonicalizer19._tertiaryStart;
        int int25 = byteQuadsCanonicalizer19.primaryCount();
        int int26 = byteQuadsCanonicalizer19.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray29 = byteQuadsCanonicalizer28._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int31 = byteQuadsCanonicalizer30._hashSize;
        byteQuadsCanonicalizer30._count = (byte) 100;
        java.lang.String[] strArray34 = byteQuadsCanonicalizer30._names;
        int[] intArray39 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int41 = byteQuadsCanonicalizer30.calcHash(intArray39, 4);
        byteQuadsCanonicalizer30._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer44 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int45 = byteQuadsCanonicalizer44._hashSize;
        byteQuadsCanonicalizer44._count = (byte) 100;
        java.lang.String[] strArray48 = byteQuadsCanonicalizer44._names;
        int[] intArray53 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int55 = byteQuadsCanonicalizer44.calcHash(intArray53, 4);
        byteQuadsCanonicalizer30._hashArea = intArray53;
        byteQuadsCanonicalizer28._hashArea = intArray53;
        byteQuadsCanonicalizer19._hashArea = intArray53;
        byteQuadsCanonicalizer17._hashArea = intArray53;
        byteQuadsCanonicalizer11._hashArea = intArray53;
        // The following exception was thrown during execution in test generation
        try {
            int int62 = byteQuadsCanonicalizer0.calcHash(intArray53, (-432108469));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "25) test2037(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432091071) + "'", int1 == (-432091071));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-497479740) + "'", int7 == (-497479740));
// flaky "17) test2037(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1095517238) + "'", int9 == (-1095517238));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "10) test2037(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1260995631 + "'", int41 == 1260995631);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "8) test2037(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1260995631 + "'", int55 == 1260995631);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(725989756);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = byteQuadsCanonicalizer1._parent;
        int int4 = byteQuadsCanonicalizer1.calcHash((-1937877538));
        byteQuadsCanonicalizer1._hashSize = (-432140467);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1629357387) + "'", int4 == (-1629357387));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0._parent;
        int int6 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._count = (-432140467);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "26) test2039(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432091053) + "'", int1 == (-432091053));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int16 = byteQuadsCanonicalizer0.calcHash(725969857, (-673776329));
        java.lang.String[] strArray17 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0.release();
        int int19 = byteQuadsCanonicalizer0.hashSeed();
        int int20 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "27) test2040(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1462359703) + "'", int11 == (-1462359703));
// flaky "18) test2040(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-410123632) + "'", int16 == (-410123632));
        org.junit.Assert.assertNull(strArray17);
// flaky "11) test2040(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-432091035) + "'", int19 == (-432091035));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1581548825);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int16 = byteQuadsCanonicalizer0._secondaryStart;
        int int17 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "28) test2041(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1410145419) + "'", int10 == (-1410145419));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "19) test2041(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432091019) + "'", int12 == (-432091019));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-432146111) + "'", int16 == (-432146111));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-432146111) + "'", int17 == (-432146111));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-673746378);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "29) test2042(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1364010834 + "'", int4 == 1364010834);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-673746378) + "'", int7 == (-673746378));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._count;
        int int4 = byteQuadsCanonicalizer0._tertiaryStart;
        boolean boolean5 = byteQuadsCanonicalizer0._failOnDoS;
        int int6 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-1806864732);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        int[] intArray16 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int18 = byteQuadsCanonicalizer7.calcHash(intArray16, 4);
        java.lang.String[] strArray24 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer7._names = strArray24;
        byteQuadsCanonicalizer0._names = strArray24;
        byteQuadsCanonicalizer0._hashSize = 991858906;
        int int32 = byteQuadsCanonicalizer0.calcHash((-683082728), 0, (-674209055));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "30) test2044(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090987) + "'", int1 == (-432090987));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "20) test2044(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1832580588 + "'", int18 == 1832580588);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
// flaky "12) test2044(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1797247551) + "'", int32 == (-1797247551));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryStart = 1703952960;
        byteQuadsCanonicalizer0._secondaryStart = 960717211;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "31) test2045(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090957) + "'", int1 == (-432090957));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        byteQuadsCanonicalizer14._count = (byte) 100;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer14._names;
        int[] intArray23 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int25 = byteQuadsCanonicalizer14.calcHash(intArray23, 4);
        byteQuadsCanonicalizer0._hashArea = intArray23;
        int int27 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28._longNameOffset;
        byteQuadsCanonicalizer28._tertiaryStart = 0;
        int int32 = byteQuadsCanonicalizer28._tertiaryShift;
        int int33 = byteQuadsCanonicalizer28.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer34 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int35 = byteQuadsCanonicalizer34._hashSize;
        int int36 = byteQuadsCanonicalizer34._spilloverEnd;
        int int37 = byteQuadsCanonicalizer34._longNameOffset;
        int int38 = byteQuadsCanonicalizer34.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer39 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int40 = byteQuadsCanonicalizer39.hashSeed();
        int int41 = byteQuadsCanonicalizer39._longNameOffset;
        int int42 = byteQuadsCanonicalizer39.hashSeed();
        byteQuadsCanonicalizer39._longNameOffset = (short) 10;
        int int47 = byteQuadsCanonicalizer39.calcHash((int) '#', (int) (short) 10);
        int int48 = byteQuadsCanonicalizer39._secondaryStart;
        byteQuadsCanonicalizer39._tertiaryShift = (-673757953);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer51 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int52 = byteQuadsCanonicalizer51._hashSize;
        byteQuadsCanonicalizer51._count = (byte) 100;
        java.lang.String[] strArray55 = byteQuadsCanonicalizer51._names;
        int[] intArray60 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int62 = byteQuadsCanonicalizer51.calcHash(intArray60, 4);
        java.lang.String[] strArray68 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer51._names = strArray68;
        byteQuadsCanonicalizer39._names = strArray68;
        byteQuadsCanonicalizer34._names = strArray68;
        byteQuadsCanonicalizer28._names = strArray68;
        byteQuadsCanonicalizer0._names = strArray68;
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "32) test2046(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1860519359) + "'", int11 == (-1860519359));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "21) test2046(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1860519359) + "'", int25 == (-1860519359));
// flaky "13) test2046(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-432090949) + "'", int27 == (-432090949));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
// flaky "9) test2046(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-432090949) + "'", int33 == (-432090949));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer39);
// flaky "6) test2046(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-432090949) + "'", int40 == (-432090949));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
// flaky "5) test2046(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-432090949) + "'", int42 == (-432090949));
// flaky "3) test2046(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 725508157 + "'", int47 == 725508157);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "3) test2046(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1860519359) + "'", int62 == (-1860519359));
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        int int19 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._secondaryStart = (-432141389);
        byteQuadsCanonicalizer0._longNameOffset = 181199779;
        byteQuadsCanonicalizer0._secondaryStart = (-370300953);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = byteQuadsCanonicalizer0.findName((-432117015));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1421627 out of bounds for length 4");
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "33) test2047(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 174366441 + "'", int17 == 174366441);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._tertiaryStart = 725983222;
        int int10 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "34) test2048(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090919) + "'", int1 == (-432090919));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "22) test2048(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432090919) + "'", int10 == (-432090919));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String[] strArray3 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._intern = false;
        int int6 = byteQuadsCanonicalizer0._tertiaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-254421924));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._hashSize = (-432136637);
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "35) test2050(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090895) + "'", int1 == (-432090895));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        int int4 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.totalCount();
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._spilloverEnd = (-867349418);
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int int10 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "36) test2052(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432090873) + "'", int6 == (-432090873));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int int5 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "37) test2053(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-674265469) + "'", int3 == (-674265469));
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0.release();
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int8 = byteQuadsCanonicalizer0._hashSize;
        int int9 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "38) test2054(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090841) + "'", int1 == (-432090841));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "39) test2055(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-432090825) + "'", int7 == (-432090825));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1099768828));
        int int2 = byteQuadsCanonicalizer1._count;
        int[] intArray3 = byteQuadsCanonicalizer1._hashArea;
        byteQuadsCanonicalizer1._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(intArray3);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0._parent;
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "40) test2057(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432090809) + "'", int4 == (-432090809));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertNull(intArray6);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._tertiaryShift = (-432138445);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.Class<?> wildcardClass7 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        byteQuadsCanonicalizer0._spilloverEnd = (-432130945);
        byteQuadsCanonicalizer0._spilloverEnd = (-1263923587);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "41) test2059(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090775) + "'", int1 == (-432090775));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "23) test2059(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432090775) + "'", int3 == (-432090775));
// flaky "14) test2059(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725530198 + "'", int8 == 725530198);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-674004311));
        byteQuadsCanonicalizer1._longNameOffset = (-673985043);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (short) -1);
        int[] intArray2 = byteQuadsCanonicalizer1._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryShift = 983577201;
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "42) test2062(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432090753) + "'", int6 == (-432090753));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        int int19 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = 356751186;
        byteQuadsCanonicalizer0._tertiaryShift = (-1409375901);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=-673796221, 0/0/0/105401562 pri/sec/ter/spill (=0), total:105401562]", 1214251459, (-415407954), 725723599);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -170748781 out of bounds for length 4");
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
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "43) test2063(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1395854862 + "'", int17 == 1395854862);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        int int31 = byteQuadsCanonicalizer0._secondaryStart;
        int int32 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryStart = (-432119637);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "44) test2064(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2002888697 + "'", int20 == 2002888697);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
// flaky "24) test2064(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-432090717) + "'", int32 == (-432090717));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432097439));
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2._hashSize;
        byteQuadsCanonicalizer2._count = (byte) 100;
        java.lang.String[] strArray6 = byteQuadsCanonicalizer2._names;
        int[] intArray11 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int13 = byteQuadsCanonicalizer2.calcHash(intArray11, 4);
        byteQuadsCanonicalizer0._hashArea = intArray11;
        int int15 = byteQuadsCanonicalizer0.spilloverCount();
        int int16 = byteQuadsCanonicalizer0._spilloverEnd;
        int int17 = byteQuadsCanonicalizer0._longNameOffset;
        int int18 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str19 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "45) test2066(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-991098826) + "'", int13 == (-991098826));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str19, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild(30323224);
        byteQuadsCanonicalizer8._reportTooManyCollisions();
        int int12 = byteQuadsCanonicalizer8.calcHash((-673962205), (-2101935197));
        int[] intArray13 = byteQuadsCanonicalizer8._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "46) test2067(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-486196608) + "'", int12 == (-486196608));
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        int[] intArray11 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._spilloverEnd = 930352461;
        int int16 = byteQuadsCanonicalizer0.calcHash((-432106235), (-673388977));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "47) test2068(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1058297371 + "'", int7 == 1058297371);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "25) test2068(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432090671) + "'", int9 == (-432090671));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNull(intArray11);
// flaky "15) test2068(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 767957550 + "'", int16 == 767957550);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-2044706367);
        byteQuadsCanonicalizer0._intern = true;
        int int11 = byteQuadsCanonicalizer0._longNameOffset;
        int int12 = byteQuadsCanonicalizer0._longNameOffset;
        int int13 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryStart = (-674077174);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "48) test2069(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090653) + "'", int1 == (-432090653));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        boolean boolean14 = byteQuadsCanonicalizer0.maybeDirty();
        int int15 = byteQuadsCanonicalizer0.tertiaryCount();
        int int16 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "49) test2070(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090645) + "'", int1 == (-432090645));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "26) test2070(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432090645) + "'", int3 == (-432090645));
// flaky "16) test2070(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725531368 + "'", int8 == 725531368);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._longNameOffset = (-1409414529);
        java.lang.Class<?> wildcardClass12 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "50) test2071(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090635) + "'", int1 == (-432090635));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "27) test2071(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432090635) + "'", int3 == (-432090635));
// flaky "17) test2071(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725531539 + "'", int8 == 725531539);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean7 = byteQuadsCanonicalizer0._intern;
        int int8 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild((-432137437));
        int int11 = byteQuadsCanonicalizer0.primaryCount();
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "51) test2072(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432090613) + "'", int12 == (-432090613));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = (-1253791504);
        byteQuadsCanonicalizer0._intern = true;
        int int13 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = (-432092317);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "52) test2073(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 17787606 + "'", int6 == 17787606);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        int int16 = byteQuadsCanonicalizer0.spilloverCount();
        int int17 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "53) test2074(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 758198797 + "'", int11 == 758198797);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19.hashSeed();
        int int21 = byteQuadsCanonicalizer19._longNameOffset;
        int int22 = byteQuadsCanonicalizer19.hashSeed();
        byteQuadsCanonicalizer19._longNameOffset = (short) 10;
        int int27 = byteQuadsCanonicalizer19.calcHash((int) '#', (int) (short) 10);
        int int28 = byteQuadsCanonicalizer19._secondaryStart;
        byteQuadsCanonicalizer19._tertiaryShift = (-673757953);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31._hashSize;
        byteQuadsCanonicalizer31._count = (byte) 100;
        java.lang.String[] strArray35 = byteQuadsCanonicalizer31._names;
        int[] intArray40 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int42 = byteQuadsCanonicalizer31.calcHash(intArray40, 4);
        java.lang.String[] strArray48 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer31._names = strArray48;
        byteQuadsCanonicalizer19._names = strArray48;
        byteQuadsCanonicalizer0._names = strArray48;
        byteQuadsCanonicalizer0._longNameOffset = 0;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "54) test2075(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 269014980 + "'", int17 == 269014980);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
// flaky "28) test2075(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-432090573) + "'", int20 == (-432090573));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
// flaky "18) test2075(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-432090573) + "'", int22 == (-432090573));
// flaky "10) test2075(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 725504557 + "'", int27 == 725504557);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "7) test2075(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 269014980 + "'", int42 == 269014980);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = byteQuadsCanonicalizer0._parent;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1547696045);
        int int7 = byteQuadsCanonicalizer6._spilloverEnd;
        int[] intArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = byteQuadsCanonicalizer6.calcHash(intArray8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer2);
// flaky "55) test2076(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432090563) + "'", int3 == (-432090563));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 448 + "'", int7 == 448);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        int int5 = byteQuadsCanonicalizer3._count;
        int int8 = byteQuadsCanonicalizer3.calcHash(738849150, (-432092749));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1999020060 + "'", int8 == 1999020060);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = byteQuadsCanonicalizer9.bucketCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "56) test2078(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090547) + "'", int1 == (-432090547));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "29) test2078(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432090547) + "'", int3 == (-432090547));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer9);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2._hashSize;
        byteQuadsCanonicalizer2._count = (byte) 100;
        java.lang.String[] strArray6 = byteQuadsCanonicalizer2._names;
        int[] intArray11 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int13 = byteQuadsCanonicalizer2.calcHash(intArray11, 4);
        byteQuadsCanonicalizer0._hashArea = intArray11;
        boolean boolean15 = byteQuadsCanonicalizer0.maybeDirty();
        int int16 = byteQuadsCanonicalizer0._tertiaryStart;
        int int17 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "57) test2079(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-112003030) + "'", int13 == (-112003030));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer29 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int30 = byteQuadsCanonicalizer29._hashSize;
        byteQuadsCanonicalizer29._count = (byte) 100;
        java.lang.String[] strArray33 = byteQuadsCanonicalizer29._names;
        int[] intArray38 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int40 = byteQuadsCanonicalizer29.calcHash(intArray38, 4);
        byteQuadsCanonicalizer0._hashArea = intArray38;
        byteQuadsCanonicalizer0._count = 408102121;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "58) test2080(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 632432735 + "'", int20 == 632432735);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "30) test2080(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 632432735 + "'", int40 == 632432735);
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
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        int int9 = byteQuadsCanonicalizer0.spilloverCount();
        int int10 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._count = 725869894;
        byteQuadsCanonicalizer0._longNameOffset = (-432131671);
        int int15 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "59) test2081(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674236015) + "'", int5 == (-674236015));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0._parent;
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0._count;
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "60) test2082(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090465) + "'", int1 == (-432090465));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        int int4 = byteQuadsCanonicalizer1.calcHash(0, (-432146251));
        java.lang.String[] strArray5 = byteQuadsCanonicalizer1._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-881145363) + "'", int4 == (-881145363));
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean5 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._secondaryStart = 1742931497;
        boolean boolean8 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        int int6 = byteQuadsCanonicalizer3.calcHash((-432144557), (-432142345));
        byteQuadsCanonicalizer3.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer3._parent;
        byteQuadsCanonicalizer8._longNameOffset = (-1660624613);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2066928024) + "'", int6 == (-2066928024));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int8 = byteQuadsCanonicalizer0.calcHash((-432136545), 1649719322);
        int int12 = byteQuadsCanonicalizer0.calcHash((-432132249), 630157922, (-432140985));
        byteQuadsCanonicalizer0._spilloverEnd = (-432128127);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "61) test2086(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 84709946 + "'", int8 == 84709946);
// flaky "31) test2086(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2097552392 + "'", int12 == 2097552392);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        int int5 = byteQuadsCanonicalizer3._count;
        int int6 = byteQuadsCanonicalizer3._spilloverEnd;
        java.lang.String str11 = byteQuadsCanonicalizer3.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-201795637), 68138809, 0);
        int int12 = byteQuadsCanonicalizer3._hashSize;
        int int13 = byteQuadsCanonicalizer3._tertiaryStart;
        int int14 = byteQuadsCanonicalizer3.totalCount();
        java.lang.String[] strArray15 = byteQuadsCanonicalizer3._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = byteQuadsCanonicalizer3._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 448 + "'", int6 == 448);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 384 + "'", int13 == 384);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "62) test2088(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674238991) + "'", int5 == (-674238991));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "32) test2088(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 863231200 + "'", int11 == 863231200);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "19) test2088(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1186178368) + "'", int38 == (-1186178368));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(strArray45);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "11) test2088(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1186178368) + "'", int52 == (-1186178368));
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-168436640 pri/sec/ter/spill (=0), total:-168436640]" });
// flaky "8) test2088(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-432090403) + "'", int64 == (-432090403));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-585738885));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        boolean boolean8 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild((-432117579));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "63) test2090(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674238451) + "'", int5 == (-674238451));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
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
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        int int14 = byteQuadsCanonicalizer0.calcHash(725896183, 726013822, (-432128617));
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._count = 85985954;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "64) test2091(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090319) + "'", int1 == (-432090319));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "33) test2091(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432090319) + "'", int3 == (-432090319));
// flaky "20) test2091(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725506987 + "'", int8 == 725506987);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "12) test2091(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2138074676) + "'", int14 == (-2138074676));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        int int21 = byteQuadsCanonicalizer0.calcHash((-674011908), 725578996, (-1499223049));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "65) test2092(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-674238753) + "'", int11 == (-674238753));
// flaky "34) test2092(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 423841 + "'", int13 == 423841);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky "21) test2092(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-983417214) + "'", int21 == (-983417214));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0.release();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        int int11 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        int[] intArray11 = byteQuadsCanonicalizer0._hashArea;
        boolean boolean12 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "66) test2094(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70938058 + "'", int7 == 70938058);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "35) test2094(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432090273) + "'", int9 == (-432090273));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        int int4 = byteQuadsCanonicalizer1.calcHash(0, (-432146251));
        int int5 = byteQuadsCanonicalizer1.tertiaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer1.makeChild((-482242247));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-881145363) + "'", int4 == (-881145363));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild(0);
        byteQuadsCanonicalizer10._count = 1306230592;
        byteQuadsCanonicalizer10._secondaryStart = (-1899656305);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "67) test2096(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674238221) + "'", int5 == (-674238221));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._count = (-673933463);
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        int int10 = byteQuadsCanonicalizer0.calcHash((-432125533));
        int int11 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "68) test2097(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090249) + "'", int1 == (-432090249));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "36) test2097(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 281784 + "'", int10 == 281784);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.calcHash((-432144885));
        int[] intArray5 = byteQuadsCanonicalizer0._hashArea;
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
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
        byteQuadsCanonicalizer0._hashArea = intArray44;
        int int52 = byteQuadsCanonicalizer0.spilloverCount();
        int int53 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "69) test2098(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090235) + "'", int1 == (-432090235));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "37) test2098(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1721021 + "'", int4 == 1721021);
        org.junit.Assert.assertNull(intArray5);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "22) test2098(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1396911060) + "'", int32 == (-1396911060));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "13) test2098(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1396911060) + "'", int46 == (-1396911060));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "70) test2099(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 236444058 + "'", int7 == 236444058);
// flaky "38) test2099(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432090223) + "'", int8 == (-432090223));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        int int15 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "71) test2100(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 231878033 + "'", int7 == 231878033);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "39) test2100(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432090215) + "'", int9 == (-432090215));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        int int5 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "72) test2101(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090207) + "'", int1 == (-432090207));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        int int16 = byteQuadsCanonicalizer0.primaryCount();
        int[] intArray17 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "73) test2102(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-674237699) + "'", int11 == (-674237699));
// flaky "40) test2102(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 422815 + "'", int13 == 422815);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        int int5 = byteQuadsCanonicalizer3._count;
        int int6 = byteQuadsCanonicalizer3._spilloverEnd;
        java.lang.String str11 = byteQuadsCanonicalizer3.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-201795637), 68138809, 0);
        int int12 = byteQuadsCanonicalizer3._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer3._parent;
        int int16 = byteQuadsCanonicalizer3.calcHash((-409931176), (-432132645));
        boolean boolean17 = byteQuadsCanonicalizer3.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 448 + "'", int6 == 448);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1989629227 + "'", int16 == 1989629227);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        int int9 = byteQuadsCanonicalizer0.calcHash(0, 551623854, (-432135549));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer11.makeChild(802144728);
        byteQuadsCanonicalizer13._reportTooManyCollisions();
        int int15 = byteQuadsCanonicalizer13._count;
        byteQuadsCanonicalizer13._hashSize = (-432142511);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20._hashSize;
        byteQuadsCanonicalizer20._count = (byte) 100;
        java.lang.String[] strArray24 = byteQuadsCanonicalizer20._names;
        int[] intArray29 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int31 = byteQuadsCanonicalizer20.calcHash(intArray29, 4);
        byteQuadsCanonicalizer18._hashArea = intArray29;
        byteQuadsCanonicalizer13._hashArea = intArray29;
        byteQuadsCanonicalizer0._hashArea = intArray29;
        byteQuadsCanonicalizer0._tertiaryStart = (-1765857076);
        int int38 = byteQuadsCanonicalizer0.calcHash(293359627);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = byteQuadsCanonicalizer0.findName((-432130177));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2033275 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "74) test2104(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090163) + "'", int1 == (-432090163));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "41) test2104(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432090163) + "'", int3 == (-432090163));
// flaky "23) test2104(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1340380763 + "'", int9 == 1340380763);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "14) test2104(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-15532350) + "'", int31 == (-15532350));
// flaky "9) test2104(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1297971410 + "'", int38 == 1297971410);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144281), (-432142395), 12495515);
        int int9 = byteQuadsCanonicalizer0.calcHash((-432140607), 870084578);
        int int10 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._longNameOffset = (-1409413917);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "75) test2105(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1631462887) + "'", int6 == (-1631462887));
// flaky "42) test2105(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 441094628 + "'", int9 == 441094628);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        byteQuadsCanonicalizer0._hashSize = (-432145551);
        byteQuadsCanonicalizer0._spilloverEnd = (-1945587931);
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "76) test2106(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2010131036 + "'", int11 == 2010131036);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int9 = byteQuadsCanonicalizer0.calcHash((-432135531), (-673933336), 0);
        int int10 = byteQuadsCanonicalizer0.bucketCount();
        int int11 = byteQuadsCanonicalizer0.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = byteQuadsCanonicalizer12.findName((-673920892), (-674203577), (-432128655));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "77) test2107(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090135) + "'", int1 == (-432090135));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "43) test2107(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-901497237) + "'", int9 == (-901497237));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        byteQuadsCanonicalizer1.release();
        int int3 = byteQuadsCanonicalizer1._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer1.makeChild((-2019354067));
        byteQuadsCanonicalizer1._spilloverEnd = (-1621512244);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-2044706367);
        byteQuadsCanonicalizer0._secondaryStart = (-1100142565);
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "78) test2109(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090113) + "'", int1 == (-432090113));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-511176592) + "'", int11 == (-511176592));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild((-922425077));
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int int6 = byteQuadsCanonicalizer4._tertiaryShift;
        byteQuadsCanonicalizer4._intern = true;
        int int9 = byteQuadsCanonicalizer4._hashSize;
        int int10 = byteQuadsCanonicalizer4.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "79) test2110(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090105) + "'", int1 == (-432090105));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._hashSize = (-673796221);
        byteQuadsCanonicalizer0._count = 285499017;
        int int8 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1908676);
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        byteQuadsCanonicalizer1._secondaryStart = 1132524070;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0.primaryCount();
        int int6 = byteQuadsCanonicalizer0.totalCount();
        int[] intArray7 = byteQuadsCanonicalizer0._hashArea;
        int int8 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._count = (-432134333);
        int int12 = byteQuadsCanonicalizer0._tertiaryStart;
        int int13 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "80) test2114(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 458792808 + "'", int7 == 458792808);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str9, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int[] intArray8 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "81) test2115(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1329658845) + "'", int4 == (-1329658845));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int3 = byteQuadsCanonicalizer1.hashSeed();
        int int4 = byteQuadsCanonicalizer1.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0.tertiaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0.makeChild(725868949);
        boolean boolean13 = byteQuadsCanonicalizer0.maybeDirty();
        int int14 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "82) test2117(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432090055) + "'", int1 == (-432090055));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "44) test2117(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432090055) + "'", int3 == (-432090055));
// flaky "24) test2117(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725500291 + "'", int8 == 725500291);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-1404133737);
        byteQuadsCanonicalizer0._intern = true;
        int int16 = byteQuadsCanonicalizer0._count;
        int int17 = byteQuadsCanonicalizer0._hashSize;
        int int18 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "83) test2118(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1410141684) + "'", int10 == (-1410141684));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-351033435) + "'", int18 == (-351033435));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(482510384);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        int int6 = byteQuadsCanonicalizer3.calcHash((-432144557), (-432142345));
        byteQuadsCanonicalizer3._tertiaryStart = (-2061310101);
        int int9 = byteQuadsCanonicalizer3.secondaryCount();
        int int10 = byteQuadsCanonicalizer3.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2066928024) + "'", int6 == (-2066928024));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = (-1253791504);
        byteQuadsCanonicalizer0._tertiaryShift = 725961361;
        byteQuadsCanonicalizer0._spilloverEnd = (-712698282);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "84) test2121(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-876667784) + "'", int6 == (-876667784));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild(247548150);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        int int19 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._secondaryStart = (-432141389);
        int int22 = byteQuadsCanonicalizer0._count;
        int int23 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer25._hashSize = (short) 10;
        int int28 = byteQuadsCanonicalizer25._hashSize;
        byteQuadsCanonicalizer25._hashSize = 2045893375;
        boolean boolean31 = byteQuadsCanonicalizer25._failOnDoS;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer32 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int33 = byteQuadsCanonicalizer32.hashSeed();
        int int34 = byteQuadsCanonicalizer32._longNameOffset;
        int int35 = byteQuadsCanonicalizer32._longNameOffset;
        boolean boolean36 = byteQuadsCanonicalizer32._intern;
        int int37 = byteQuadsCanonicalizer32._secondaryStart;
        int int38 = byteQuadsCanonicalizer32._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer39 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int40 = byteQuadsCanonicalizer39._hashSize;
        byteQuadsCanonicalizer39._count = (byte) 100;
        java.lang.String[] strArray43 = byteQuadsCanonicalizer39._names;
        int[] intArray48 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int50 = byteQuadsCanonicalizer39.calcHash(intArray48, 4);
        java.lang.String[] strArray56 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer39._names = strArray56;
        byteQuadsCanonicalizer32._names = strArray56;
        byteQuadsCanonicalizer25._names = strArray56;
        byteQuadsCanonicalizer0._names = strArray56;
        java.lang.Class<?> wildcardClass61 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "85) test2123(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1612947781) + "'", int17 == (-1612947781));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer32);
// flaky "45) test2123(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-432089979) + "'", int33 == (-432089979));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "25) test2123(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1612947781) + "'", int50 == (-1612947781));
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        java.lang.String str9 = byteQuadsCanonicalizer6.findName((-432138613), (-432138801));
        byteQuadsCanonicalizer6._spilloverEnd = 0;
        byteQuadsCanonicalizer6._secondaryStart = 1450717171;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer6._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        byteQuadsCanonicalizer14._count = (byte) 100;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer14._names;
        int[] intArray23 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int25 = byteQuadsCanonicalizer14.calcHash(intArray23, 4);
        byteQuadsCanonicalizer0._hashArea = intArray23;
        int int27 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "86) test2125(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2091312912) + "'", int11 == (-2091312912));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "46) test2125(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2091312912) + "'", int25 == (-2091312912));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        byteQuadsCanonicalizer14._count = (byte) 100;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer14._names;
        int[] intArray23 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int25 = byteQuadsCanonicalizer14.calcHash(intArray23, 4);
        byteQuadsCanonicalizer0._hashArea = intArray23;
        int int27 = byteQuadsCanonicalizer0.hashSeed();
        int int28 = byteQuadsCanonicalizer0.spilloverCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-1499223049, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432110095), (-432131799), 219158372);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1609873113 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "87) test2126(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2132446074 + "'", int11 == 2132446074);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "47) test2126(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2132446074 + "'", int25 == 2132446074);
// flaky "26) test2126(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-432089927) + "'", int27 == (-432089927));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = byteQuadsCanonicalizer0._parent;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1547696045);
        int int10 = byteQuadsCanonicalizer0.calcHash(2107069858, (-1911591496), (-432127813));
        byteQuadsCanonicalizer0._tertiaryShift = 725850841;
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer2);
// flaky "88) test2127(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432089909) + "'", int3 == (-432089909));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
// flaky "48) test2127(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-818344706) + "'", int10 == (-818344706));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = (-432139871);
        int int11 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String[] strArray12 = null;
        byteQuadsCanonicalizer0._names = strArray12;
        int int14 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "89) test2128(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-685613572) + "'", int6 == (-685613572));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-317497050) + "'", int14 == (-317497050));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        boolean boolean9 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean10 = byteQuadsCanonicalizer0.maybeDirty();
        boolean boolean11 = byteQuadsCanonicalizer0.maybeDirty();
        int int12 = byteQuadsCanonicalizer0._secondaryStart;
        int int13 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "90) test2129(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 427364136 + "'", int7 == 427364136);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        int int6 = byteQuadsCanonicalizer3.calcHash(32, 0);
        int int7 = byteQuadsCanonicalizer3.totalCount();
        byteQuadsCanonicalizer3._tertiaryShift = (-674171987);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1345099460) + "'", int6 == (-1345099460));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        int int19 = byteQuadsCanonicalizer0._tertiaryStart;
        int int20 = byteQuadsCanonicalizer0._hashSize;
        int int21 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "91) test2131(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2073683493) + "'", int17 == (-2073683493));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        int int21 = byteQuadsCanonicalizer0.calcHash((-432123831), (-574004730), (-540718793));
        byteQuadsCanonicalizer0._tertiaryStart = (-432138537);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int25 = byteQuadsCanonicalizer24._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int27 = byteQuadsCanonicalizer26._hashSize;
        byteQuadsCanonicalizer26._count = (byte) 100;
        java.lang.String[] strArray30 = byteQuadsCanonicalizer26._names;
        int[] intArray35 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int37 = byteQuadsCanonicalizer26.calcHash(intArray35, 4);
        java.lang.String[] strArray43 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer26._names = strArray43;
        byteQuadsCanonicalizer24._names = strArray43;
        byteQuadsCanonicalizer0._names = strArray43;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "92) test2132(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1872467142 + "'", int11 == 1872467142);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky "49) test2132(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 854230327 + "'", int21 == 854230327);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "27) test2132(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1872467142 + "'", int37 == 1872467142);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        int int12 = byteQuadsCanonicalizer0._count;
        int int14 = byteQuadsCanonicalizer0.calcHash(234343);
        byteQuadsCanonicalizer0._tertiaryStart = (-317493067);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "93) test2133(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432089853) + "'", int1 == (-432089853));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "50) test2133(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432089853) + "'", int3 == (-432089853));
// flaky "28) test2133(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725502262 + "'", int8 == 725502262);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "15) test2133(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-673397091) + "'", int14 == (-673397091));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = (-1253791504);
        byteQuadsCanonicalizer0._intern = true;
        int int13 = byteQuadsCanonicalizer0.secondaryCount();
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
        int int33 = byteQuadsCanonicalizer14._secondaryStart;
        byteQuadsCanonicalizer14._tertiaryShift = 356751186;
        int[] intArray36 = byteQuadsCanonicalizer14._hashArea;
        // The following exception was thrown during execution in test generation
        try {
            int int38 = byteQuadsCanonicalizer0.calcHash(intArray36, (-432104487));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "94) test2134(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-577537086) + "'", int6 == (-577537086));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str19, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "51) test2134(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1461844111 + "'", int31 == 1461844111);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-432145785), (-432146083), 100, (-1) });
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        boolean boolean14 = byteQuadsCanonicalizer0._failOnDoS;
        int int15 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "95) test2135(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1796272832 + "'", int11 == 1796272832);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
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
        int int9 = byteQuadsCanonicalizer0.calcHash((-432135531), (-673933336), 0);
        int int10 = byteQuadsCanonicalizer0.bucketCount();
        int int11 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._count = (-1406482048);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "96) test2136(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432089815) + "'", int1 == (-432089815));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "52) test2136(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1118657299) + "'", int9 == (-1118657299));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        boolean boolean14 = byteQuadsCanonicalizer0.maybeDirty();
        int int15 = byteQuadsCanonicalizer0.tertiaryCount();
        int int16 = byteQuadsCanonicalizer0.secondaryCount();
        int int17 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "97) test2137(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432089799) + "'", int1 == (-432089799));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "53) test2137(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432089799) + "'", int3 == (-432089799));
// flaky "29) test2137(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725502739 + "'", int8 == 725502739);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        int int14 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15._hashSize;
        byteQuadsCanonicalizer15._count = (byte) 100;
        java.lang.String[] strArray19 = byteQuadsCanonicalizer15._names;
        java.lang.String str20 = byteQuadsCanonicalizer15.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int22 = byteQuadsCanonicalizer21._hashSize;
        byteQuadsCanonicalizer21._count = (byte) 100;
        java.lang.String[] strArray25 = byteQuadsCanonicalizer21._names;
        int[] intArray30 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int32 = byteQuadsCanonicalizer21.calcHash(intArray30, 4);
        byteQuadsCanonicalizer15._hashArea = intArray30;
        byteQuadsCanonicalizer0._hashArea = intArray30;
        int int35 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "98) test2138(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1630626050 + "'", int11 == 1630626050);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str20, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "54) test2138(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1630626050 + "'", int32 == 1630626050);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 2045893375;
        boolean boolean7 = byteQuadsCanonicalizer1._failOnDoS;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8.hashSeed();
        int int10 = byteQuadsCanonicalizer8._longNameOffset;
        int int11 = byteQuadsCanonicalizer8._longNameOffset;
        boolean boolean12 = byteQuadsCanonicalizer8._intern;
        int int13 = byteQuadsCanonicalizer8._secondaryStart;
        int int14 = byteQuadsCanonicalizer8._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15._hashSize;
        byteQuadsCanonicalizer15._count = (byte) 100;
        java.lang.String[] strArray19 = byteQuadsCanonicalizer15._names;
        int[] intArray24 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int26 = byteQuadsCanonicalizer15.calcHash(intArray24, 4);
        java.lang.String[] strArray32 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer15._names = strArray32;
        byteQuadsCanonicalizer8._names = strArray32;
        byteQuadsCanonicalizer1._names = strArray32;
        byteQuadsCanonicalizer1._spilloverEnd = (-922425077);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "99) test2139(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432089781) + "'", int9 == (-432089781));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "55) test2139(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1302696134 + "'", int26 == 1302696134);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray10 = byteQuadsCanonicalizer9._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        byteQuadsCanonicalizer11._count = (byte) 100;
        java.lang.String[] strArray15 = byteQuadsCanonicalizer11._names;
        int[] intArray20 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int22 = byteQuadsCanonicalizer11.calcHash(intArray20, 4);
        byteQuadsCanonicalizer11._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int26 = byteQuadsCanonicalizer25._hashSize;
        byteQuadsCanonicalizer25._count = (byte) 100;
        java.lang.String[] strArray29 = byteQuadsCanonicalizer25._names;
        int[] intArray34 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int36 = byteQuadsCanonicalizer25.calcHash(intArray34, 4);
        byteQuadsCanonicalizer11._hashArea = intArray34;
        byteQuadsCanonicalizer9._hashArea = intArray34;
        byteQuadsCanonicalizer0._hashArea = intArray34;
        int int40 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "100) test2140(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1075440240) + "'", int22 == (-1075440240));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "56) test2140(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1075440240) + "'", int36 == (-1075440240));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-674034836));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        byteQuadsCanonicalizer0._longNameOffset = (-415407954);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "101) test2142(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-726910119) + "'", int30 == (-726910119));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(914786180);
        byteQuadsCanonicalizer1._longNameOffset = (-432138111);
        byteQuadsCanonicalizer1._longNameOffset = 691534002;
        byteQuadsCanonicalizer1._count = (-432135623);
        int int8 = byteQuadsCanonicalizer1._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432135623) + "'", int8 == (-432135623));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = (-432139871);
        int int11 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String[] strArray12 = null;
        byteQuadsCanonicalizer0._names = strArray12;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = byteQuadsCanonicalizer0.findName((-1187856229));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "102) test2144(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-652472485) + "'", int6 == (-652472485));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432140467));
        java.lang.Class<?> wildcardClass2 = byteQuadsCanonicalizer1.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._count;
        int int4 = byteQuadsCanonicalizer0._tertiaryStart;
        boolean boolean5 = byteQuadsCanonicalizer0._failOnDoS;
        int int6 = byteQuadsCanonicalizer0._tertiaryStart;
        int int7 = byteQuadsCanonicalizer0.totalCount();
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
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        int int6 = byteQuadsCanonicalizer3.calcHash((-432144557), (-432142345));
        byteQuadsCanonicalizer3.release();
        int int8 = byteQuadsCanonicalizer3._longNameOffset;
        byteQuadsCanonicalizer3._spilloverEnd = (-2056698990);
        boolean boolean11 = byteQuadsCanonicalizer3.maybeDirty();
        java.lang.String[] strArray12 = byteQuadsCanonicalizer3._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2066928024) + "'", int6 == (-2066928024));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash((-537590853), (-432140401), 726013822);
        int int8 = byteQuadsCanonicalizer1.calcHash((-1814078453));
        int int9 = byteQuadsCanonicalizer1._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1330905141 + "'", int6 == 1330905141);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 220291779 + "'", int8 == 220291779);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144281), (-432142395), 12495515);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._secondaryStart = 1797043;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "103) test2149(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1342620638) + "'", int6 == (-1342620638));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(725969857);
        int int10 = byteQuadsCanonicalizer9._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer9._parent;
        byteQuadsCanonicalizer11._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        int int16 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "104) test2151(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1410141333) + "'", int10 == (-1410141333));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "57) test2151(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-432089647) + "'", int16 == (-432089647));
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = byteQuadsCanonicalizer0.makeChild((-432140467));
        int int16 = byteQuadsCanonicalizer15.size();
        java.lang.String str20 = byteQuadsCanonicalizer15.findName(1792538395, (-432133855), (-432093115));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "105) test2152(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1868699695) + "'", int11 == (-1868699695));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._count = (-673785726);
        boolean boolean5 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        byteQuadsCanonicalizer1.release();
        int int3 = byteQuadsCanonicalizer1.secondaryCount();
        byteQuadsCanonicalizer1._hashSize = (-432136299);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (-432118379);
        int int11 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "106) test2155(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674243941) + "'", int5 == (-674243941));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-2044706367);
        byteQuadsCanonicalizer0._intern = true;
        int int11 = byteQuadsCanonicalizer0._longNameOffset;
        int int12 = byteQuadsCanonicalizer0._longNameOffset;
        int int13 = byteQuadsCanonicalizer0.bucketCount();
        int int17 = byteQuadsCanonicalizer0.calcHash(2048136, 42290, (-712698282));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "107) test2156(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432089561) + "'", int1 == (-432089561));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "58) test2156(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1368243727) + "'", int17 == (-1368243727));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1409413593));
        int int2 = byteQuadsCanonicalizer1._secondaryStart;
        int int4 = byteQuadsCanonicalizer1.calcHash((-432140401));
        byteQuadsCanonicalizer1._spilloverEnd = (-1444451587);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8._hashSize;
        int int10 = byteQuadsCanonicalizer8._spilloverEnd;
        int int11 = byteQuadsCanonicalizer8._longNameOffset;
        byteQuadsCanonicalizer8._count = ' ';
        byteQuadsCanonicalizer8._secondaryStart = (-432146111);
        int int18 = byteQuadsCanonicalizer8.calcHash((-432146367), (-1072272327));
        boolean boolean19 = byteQuadsCanonicalizer8._failOnDoS;
        byteQuadsCanonicalizer8._spilloverEnd = (-1404133737);
        int int22 = byteQuadsCanonicalizer8.primaryCount();
        int int23 = byteQuadsCanonicalizer8._hashSize;
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
        int int55 = byteQuadsCanonicalizer25.spilloverCount();
        int[] intArray56 = byteQuadsCanonicalizer25._hashArea;
        byteQuadsCanonicalizer8._hashArea = intArray56;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=725993347, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray56, (-291303166));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 600076363 + "'", int4 == 600076363);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "108) test2157(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1410166596) + "'", int18 == (-1410166596));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "59) test2157(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 761785055 + "'", int38 == 761785055);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(strArray45);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "30) test2157(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 761785055 + "'", int52 == 761785055);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-432145785), (-432146083), 100, (-1) });
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        java.lang.String str9 = byteQuadsCanonicalizer6.findName((-432138613), (-432138801));
        byteQuadsCanonicalizer6.release();
        java.lang.String[] strArray11 = byteQuadsCanonicalizer6._names;
        byteQuadsCanonicalizer6._count = (-674183816);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-674233037));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
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
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0._tertiaryStart = (-432144783);
        int int11 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String[] strArray12 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        byteQuadsCanonicalizer0._longNameOffset = 725791414;
        byteQuadsCanonicalizer0._tertiaryShift = (-897527923);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "109) test2161(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1980616501) + "'", int11 == (-1980616501));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky "60) test2161(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 488619 + "'", int17 == 488619);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432118655));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._spilloverEnd;
        int int3 = byteQuadsCanonicalizer1.hashSeed();
        int int4 = byteQuadsCanonicalizer1._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int14 = byteQuadsCanonicalizer0._secondaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "110) test2164(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 347900607 + "'", int11 == 347900607);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer15);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(48709);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2._hashSize;
        int int4 = byteQuadsCanonicalizer2._spilloverEnd;
        boolean boolean5 = byteQuadsCanonicalizer2.maybeDirty();
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
        int[] intArray24 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int26 = byteQuadsCanonicalizer15.calcHash(intArray24, 4);
        java.lang.String[] strArray32 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer15._names = strArray32;
        byteQuadsCanonicalizer6._names = strArray32;
        byteQuadsCanonicalizer2._names = strArray32;
        byteQuadsCanonicalizer1._names = strArray32;
        int int37 = byteQuadsCanonicalizer1._count;
        int[] intArray44 = new int[] { 918299778, 1189093880, (-699411658), 725731366, (-432111999), 336220326 };
        byteQuadsCanonicalizer1._hashArea = intArray44;
        boolean boolean46 = byteQuadsCanonicalizer1._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "111) test2165(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2061249322 + "'", int26 == 2061249322);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 918299778, 1189093880, (-699411658), 725731366, (-432111999), 336220326 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        boolean boolean8 = byteQuadsCanonicalizer1._failOnDoS;
        boolean boolean9 = byteQuadsCanonicalizer1.maybeDirty();
        int int12 = byteQuadsCanonicalizer1.calcHash(1586482850, (-432135615));
        int int13 = byteQuadsCanonicalizer1._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1820254581 + "'", int12 == 1820254581);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "112) test2167(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1157728159) + "'", int30 == (-1157728159));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        int int36 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "113) test2168(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432089423) + "'", int1 == (-432089423));
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
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "61) test2168(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40454822 + "'", int24 == 40454822);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._hashSize = (-673796221);
        int int6 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        java.lang.String[] strArray13 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "114) test2170(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432089407) + "'", int1 == (-432089407));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "62) test2170(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432089407) + "'", int3 == (-432089407));
// flaky "31) test2170(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725514196 + "'", int8 == 725514196);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        boolean boolean9 = byteQuadsCanonicalizer0._failOnDoS;
        int int10 = byteQuadsCanonicalizer0._spilloverEnd;
        int int11 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "115) test2171(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-381420479) + "'", int7 == (-381420479));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(32);
        byteQuadsCanonicalizer1._count = 284519333;
        int int4 = byteQuadsCanonicalizer1.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._count = 579472989;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "116) test2173(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-674244792) + "'", int3 == (-674244792));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = 725993347;
        int int4 = byteQuadsCanonicalizer1._spilloverEnd;
        int int5 = byteQuadsCanonicalizer1.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432131185));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        byteQuadsCanonicalizer0._tertiaryShift = 1871853;
        byteQuadsCanonicalizer0._tertiaryStart = (-673903189);
        int int18 = byteQuadsCanonicalizer0._tertiaryShift;
        int int19 = byteQuadsCanonicalizer0.totalCount();
        int int20 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "117) test2176(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432089355) + "'", int1 == (-432089355));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "63) test2176(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432089355) + "'", int3 == (-432089355));
// flaky "32) test2176(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725513827 + "'", int8 == 725513827);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1871853 + "'", int18 == 1871853);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int[] intArray8 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer9);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._longNameOffset = (-1409414529);
        int int12 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "118) test2178(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432089341) + "'", int1 == (-432089341));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "64) test2178(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432089341) + "'", int3 == (-432089341));
// flaky "33) test2178(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725516950 + "'", int8 == 725516950);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild((-922425077));
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int int6 = byteQuadsCanonicalizer4._tertiaryShift;
        byteQuadsCanonicalizer4._tertiaryShift = (-432128335);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "119) test2179(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432089317) + "'", int1 == (-432089317));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        int int4 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1._spilloverEnd = 1564400970;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1.makeChild((-673922276));
        byteQuadsCanonicalizer8._longNameOffset = (-1294147364);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        int int5 = byteQuadsCanonicalizer3._count;
        int int6 = byteQuadsCanonicalizer3._spilloverEnd;
        java.lang.String str11 = byteQuadsCanonicalizer3.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-201795637), 68138809, 0);
        int int12 = byteQuadsCanonicalizer3._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer3._parent;
        int int14 = byteQuadsCanonicalizer13.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 448 + "'", int6 == 448);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        int int3 = byteQuadsCanonicalizer0._tertiaryStart;
        int int4 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._count = 725762902;
        int int9 = byteQuadsCanonicalizer0.calcHash((-876667784), (-673785726));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "120) test2182(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432089275) + "'", int1 == (-432089275));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "65) test2182(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2136142532 + "'", int9 == 2136142532);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        int int19 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._secondaryStart = (-432141389);
        int int22 = byteQuadsCanonicalizer0._count;
        int int23 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._tertiaryStart = (-432141543);
        int int26 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "121) test2183(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1725318225 + "'", int17 == 1725318225);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0.primaryCount();
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        byteQuadsCanonicalizer1._hashSize = (-1836488100);
        int int29 = byteQuadsCanonicalizer1.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "122) test2185(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 796527655 + "'", int18 == 796527655);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1836488100) + "'", int29 == (-1836488100));
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 1;
        int int11 = byteQuadsCanonicalizer0.calcHash(725986813, 725970658, 726014290);
        int int12 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "123) test2186(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1313726072 + "'", int11 == 1313726072);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1410463371));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        byteQuadsCanonicalizer0.release();
        int int40 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "124) test2188(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432089223) + "'", int1 == (-432089223));
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
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "66) test2188(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1913871240) + "'", int24 == (-1913871240));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._secondaryStart = 32;
        int int15 = byteQuadsCanonicalizer0._secondaryStart;
        int int16 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "125) test2189(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432089189) + "'", int1 == (-432089189));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "67) test2189(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432089189) + "'", int3 == (-432089189));
// flaky "34) test2189(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725515807 + "'", int8 == 725515807);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        int int6 = byteQuadsCanonicalizer3.calcHash((-432144557), (-432142345));
        byteQuadsCanonicalizer3._tertiaryStart = (-2061310101);
        int int9 = byteQuadsCanonicalizer3.secondaryCount();
        int int10 = byteQuadsCanonicalizer3._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2066928024) + "'", int6 == (-2066928024));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        int int4 = byteQuadsCanonicalizer3.size();
        int int7 = byteQuadsCanonicalizer3.calcHash(802144728, (-673776329));
        byteQuadsCanonicalizer3._hashSize = (-432137715);
        int int10 = byteQuadsCanonicalizer3.hashSeed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = byteQuadsCanonicalizer3.findName(133190806, (-432102747));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1743247357 out of bounds for length 512");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1602889187) + "'", int7 == (-1602889187));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-673751787) + "'", int10 == (-673751787));
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean7 = byteQuadsCanonicalizer0._intern;
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        int int9 = byteQuadsCanonicalizer0.primaryCount();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432140467));
        boolean boolean2 = byteQuadsCanonicalizer1.maybeDirty();
        int int3 = byteQuadsCanonicalizer1.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int6 = byteQuadsCanonicalizer5.hashSeed();
        int int10 = byteQuadsCanonicalizer5.calcHash(0, (int) 'a', (int) (short) 100);
        int int11 = byteQuadsCanonicalizer5._longNameOffset;
        boolean boolean12 = byteQuadsCanonicalizer5.maybeDirty();
        int int13 = byteQuadsCanonicalizer5._tertiaryStart;
        int int14 = byteQuadsCanonicalizer5.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15._hashSize;
        byteQuadsCanonicalizer15._count = (byte) 100;
        java.lang.String[] strArray19 = byteQuadsCanonicalizer15._names;
        byteQuadsCanonicalizer15._spilloverEnd = (byte) 100;
        int int22 = byteQuadsCanonicalizer15.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        int int25 = byteQuadsCanonicalizer23._spilloverEnd;
        int int26 = byteQuadsCanonicalizer23._tertiaryShift;
        boolean boolean27 = byteQuadsCanonicalizer23._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28._hashSize;
        byteQuadsCanonicalizer28._count = (byte) 100;
        java.lang.String[] strArray32 = byteQuadsCanonicalizer28._names;
        int[] intArray37 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int39 = byteQuadsCanonicalizer28.calcHash(intArray37, 4);
        byteQuadsCanonicalizer28._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer42 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int43 = byteQuadsCanonicalizer42._hashSize;
        byteQuadsCanonicalizer42._count = (byte) 100;
        java.lang.String[] strArray46 = byteQuadsCanonicalizer42._names;
        int[] intArray51 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int53 = byteQuadsCanonicalizer42.calcHash(intArray51, 4);
        byteQuadsCanonicalizer28._hashArea = intArray51;
        byteQuadsCanonicalizer23._hashArea = intArray51;
        byteQuadsCanonicalizer15._hashArea = intArray51;
        byteQuadsCanonicalizer15._tertiaryShift = (-1765857076);
        byteQuadsCanonicalizer15.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer60 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int61 = byteQuadsCanonicalizer60._hashSize;
        int int62 = byteQuadsCanonicalizer60._spilloverEnd;
        int int63 = byteQuadsCanonicalizer60._tertiaryShift;
        boolean boolean64 = byteQuadsCanonicalizer60._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer65 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int66 = byteQuadsCanonicalizer65._hashSize;
        byteQuadsCanonicalizer65._count = (byte) 100;
        java.lang.String[] strArray69 = byteQuadsCanonicalizer65._names;
        int[] intArray74 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int76 = byteQuadsCanonicalizer65.calcHash(intArray74, 4);
        byteQuadsCanonicalizer65._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer79 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int80 = byteQuadsCanonicalizer79._hashSize;
        byteQuadsCanonicalizer79._count = (byte) 100;
        java.lang.String[] strArray83 = byteQuadsCanonicalizer79._names;
        int[] intArray88 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int90 = byteQuadsCanonicalizer79.calcHash(intArray88, 4);
        byteQuadsCanonicalizer65._hashArea = intArray88;
        byteQuadsCanonicalizer60._hashArea = intArray88;
        byteQuadsCanonicalizer15._hashArea = intArray88;
        byteQuadsCanonicalizer5._hashArea = intArray88;
        byteQuadsCanonicalizer1._hashArea = intArray88;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1797043 + "'", int10 == 1797043);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "126) test2193(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-144315646) + "'", int39 == (-144315646));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "68) test2193(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-144315646) + "'", int53 == (-144315646));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(strArray69);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "35) test2193(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-144315646) + "'", int76 == (-144315646));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNull(strArray83);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "16) test2193(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-144315646) + "'", int90 == (-144315646));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        byteQuadsCanonicalizer0._hashSize = (-432138931);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._spilloverEnd = (-432141819);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "127) test2194(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674247954) + "'", int5 == (-674247954));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        int int12 = byteQuadsCanonicalizer0.primaryCount();
        int int14 = byteQuadsCanonicalizer0.calcHash(725876932);
        byteQuadsCanonicalizer0._longNameOffset = 90372356;
        int int17 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "128) test2195(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432089115) + "'", int1 == (-432089115));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "69) test2195(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432089115) + "'", int3 == (-432089115));
// flaky "36) test2195(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725516122 + "'", int8 == 725516122);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "17) test2195(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1498355029) + "'", int14 == (-1498355029));
// flaky "10) test2195(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-432089115) + "'", int17 == (-432089115));
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        byteQuadsCanonicalizer1.release();
        int int3 = byteQuadsCanonicalizer1._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int5 = byteQuadsCanonicalizer4.hashSeed();
        int int6 = byteQuadsCanonicalizer4._longNameOffset;
        int int7 = byteQuadsCanonicalizer4.hashSeed();
        byteQuadsCanonicalizer4._longNameOffset = (short) 10;
        int int12 = byteQuadsCanonicalizer4.calcHash((int) '#', (int) (short) 10);
        int int13 = byteQuadsCanonicalizer4._secondaryStart;
        byteQuadsCanonicalizer4._tertiaryShift = (-673757953);
        boolean boolean16 = byteQuadsCanonicalizer4.maybeDirty();
        int[] intArray20 = new int[] { 133190806, (-432144885), 209767541 };
        byteQuadsCanonicalizer4._hashArea = intArray20;
        byteQuadsCanonicalizer1._hashArea = intArray20;
        int int23 = byteQuadsCanonicalizer1.bucketCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = byteQuadsCanonicalizer1.findName((-432107051), (-432112189));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1952173721 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
// flaky "129) test2196(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432089107) + "'", int5 == (-432089107));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "70) test2196(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-432089107) + "'", int7 == (-432089107));
// flaky "37) test2196(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 725517085 + "'", int12 == 725517085);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 133190806, (-432144885), 209767541 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        int int8 = byteQuadsCanonicalizer1.spilloverCount();
        int int9 = byteQuadsCanonicalizer1.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer36 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int37 = byteQuadsCanonicalizer36._hashSize;
        int int38 = byteQuadsCanonicalizer36._spilloverEnd;
        int int39 = byteQuadsCanonicalizer36._tertiaryShift;
        int int43 = byteQuadsCanonicalizer36.calcHash(6000, (-432145171), 0);
        byteQuadsCanonicalizer36._reportTooManyCollisions();
        int int45 = byteQuadsCanonicalizer36.hashSeed();
        int[] intArray46 = byteQuadsCanonicalizer36._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer47 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int48 = byteQuadsCanonicalizer47._hashSize;
        byteQuadsCanonicalizer47._count = (byte) 100;
        java.lang.String[] strArray51 = byteQuadsCanonicalizer47._names;
        java.lang.String str52 = byteQuadsCanonicalizer47.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer53 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int54 = byteQuadsCanonicalizer53._hashSize;
        byteQuadsCanonicalizer53._count = (byte) 100;
        java.lang.String[] strArray57 = byteQuadsCanonicalizer53._names;
        int[] intArray62 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int64 = byteQuadsCanonicalizer53.calcHash(intArray62, 4);
        byteQuadsCanonicalizer47._hashArea = intArray62;
        byteQuadsCanonicalizer36._hashArea = intArray62;
        byteQuadsCanonicalizer35._hashArea = intArray62;
        int int71 = byteQuadsCanonicalizer35.calcHash(0, 1198725056, 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "130) test2198(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1297940204) + "'", int20 == (-1297940204));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
// flaky "71) test2198(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1678927817 + "'", int43 == 1678927817);
// flaky "38) test2198(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-432089081) + "'", int45 == (-432089081));
        org.junit.Assert.assertNull(intArray46);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str52, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(strArray57);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "18) test2198(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1297940204) + "'", int64 == (-1297940204));
// flaky "11) test2198(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-54864295) + "'", int71 == (-54864295));
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        boolean boolean18 = byteQuadsCanonicalizer0.maybeDirty();
        boolean boolean19 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "131) test2199(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-542381300) + "'", int11 == (-542381300));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean5 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._secondaryStart = 1742931497;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        int int14 = byteQuadsCanonicalizer0._hashSize;
        int int15 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "132) test2201(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432089017) + "'", int1 == (-432089017));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "72) test2201(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432089017) + "'", int3 == (-432089017));
// flaky "39) test2201(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725510542 + "'", int8 == 725510542);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        int int2 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        int[] intArray13 = byteQuadsCanonicalizer0._hashArea;
        int int14 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean15 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "133) test2203(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432088991) + "'", int1 == (-432088991));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "73) test2203(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1713807818) + "'", int9 == (-1713807818));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        int int4 = byteQuadsCanonicalizer1.totalCount();
        byteQuadsCanonicalizer1._tertiaryShift = (-432138277);
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        boolean boolean8 = byteQuadsCanonicalizer1.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-432142677);
        int[] intArray11 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-432131891));
        byteQuadsCanonicalizer8._spilloverEnd = (-432129099);
        int int14 = byteQuadsCanonicalizer8.calcHash((-1684059787), 725527453, (-1096127663));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "134) test2206(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 90308861 + "'", int14 == 90308861);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144543));
        int int10 = byteQuadsCanonicalizer0.calcHash((-1), (-432144885), 725961082);
        java.lang.String[] strArray11 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0._secondaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer0._parent;
        boolean boolean15 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._secondaryStart = (-432117361);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "135) test2207(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1710676 + "'", int6 == 1710676);
// flaky "74) test2207(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-77605283) + "'", int10 == (-77605283));
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._spilloverEnd = (-432146455);
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
        int int12 = byteQuadsCanonicalizer0.size();
        int int13 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "136) test2209(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432088879) + "'", int1 == (-432088879));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "75) test2209(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432088879) + "'", int3 == (-432088879));
// flaky "40) test2209(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725509165 + "'", int8 == 725509165);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = (-1253791504);
        byteQuadsCanonicalizer0._intern = true;
        int int13 = byteQuadsCanonicalizer0.secondaryCount();
        int int14 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "137) test2210(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1227911326) + "'", int6 == (-1227911326));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "76) test2210(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-432088861) + "'", int14 == (-432088861));
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1409413593));
        byteQuadsCanonicalizer1._tertiaryStart = (-432122581);
        int[] intArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = byteQuadsCanonicalizer1.findName(intArray4, 1993181);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        int int43 = byteQuadsCanonicalizer0.primaryCount();
        int int44 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 13 + "'", int7 == 13);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "138) test2212(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432088833) + "'", int9 == (-432088833));
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
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "77) test2212(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-277747958) + "'", int32 == (-277747958));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
// flaky "41) test2212(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-432088833) + "'", int44 == (-432088833));
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        int int9 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        int int10 = byteQuadsCanonicalizer0._secondaryStart;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "139) test2214(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432088813) + "'", int1 == (-432088813));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "78) test2214(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-432088813) + "'", int11 == (-432088813));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(914786180);
        byteQuadsCanonicalizer1._longNameOffset = (-432138111);
        byteQuadsCanonicalizer1._longNameOffset = 691534002;
        byteQuadsCanonicalizer1._count = (-432135623);
        int int8 = byteQuadsCanonicalizer1._hashSize;
        int int9 = byteQuadsCanonicalizer1._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432135623) + "'", int9 == (-432135623));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        byteQuadsCanonicalizer0.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer0.makeChild((-432134339));
        int int15 = byteQuadsCanonicalizer14.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "140) test2216(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-674250648) + "'", int11 == (-674250648));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432129633));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1888459861), 1848248);
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10.hashSeed();
        int int12 = byteQuadsCanonicalizer10._longNameOffset;
        int int13 = byteQuadsCanonicalizer10.hashSeed();
        byteQuadsCanonicalizer10._longNameOffset = (short) 10;
        int int18 = byteQuadsCanonicalizer10.calcHash((int) '#', (int) (short) 10);
        int int19 = byteQuadsCanonicalizer10._secondaryStart;
        byteQuadsCanonicalizer10._tertiaryShift = (-673757953);
        int int22 = byteQuadsCanonicalizer10._count;
        byteQuadsCanonicalizer10._tertiaryStart = (-1989560847);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int26 = byteQuadsCanonicalizer25._hashSize;
        int int30 = byteQuadsCanonicalizer25.calcHash(726014974, 439949297, 1889548666);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer32 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        boolean boolean33 = byteQuadsCanonicalizer32.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer34 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int35 = byteQuadsCanonicalizer34._hashSize;
        byteQuadsCanonicalizer34._count = (byte) 100;
        int int38 = byteQuadsCanonicalizer34.bucketCount();
        int int39 = byteQuadsCanonicalizer34._tertiaryStart;
        int int40 = byteQuadsCanonicalizer34.primaryCount();
        int int41 = byteQuadsCanonicalizer34.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer43 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray44 = byteQuadsCanonicalizer43._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer45 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int46 = byteQuadsCanonicalizer45._hashSize;
        byteQuadsCanonicalizer45._count = (byte) 100;
        java.lang.String[] strArray49 = byteQuadsCanonicalizer45._names;
        int[] intArray54 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int56 = byteQuadsCanonicalizer45.calcHash(intArray54, 4);
        byteQuadsCanonicalizer45._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer59 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int60 = byteQuadsCanonicalizer59._hashSize;
        byteQuadsCanonicalizer59._count = (byte) 100;
        java.lang.String[] strArray63 = byteQuadsCanonicalizer59._names;
        int[] intArray68 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int70 = byteQuadsCanonicalizer59.calcHash(intArray68, 4);
        byteQuadsCanonicalizer45._hashArea = intArray68;
        byteQuadsCanonicalizer43._hashArea = intArray68;
        byteQuadsCanonicalizer34._hashArea = intArray68;
        byteQuadsCanonicalizer32._hashArea = intArray68;
        byteQuadsCanonicalizer25._hashArea = intArray68;
        byteQuadsCanonicalizer10._hashArea = intArray68;
        byteQuadsCanonicalizer0._hashArea = intArray68;
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "141) test2218(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432088775) + "'", int4 == (-432088775));
// flaky "79) test2218(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 284142539 + "'", int7 == 284142539);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
// flaky "42) test2218(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-432088775) + "'", int11 == (-432088775));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "19) test2218(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-432088775) + "'", int13 == (-432088775));
// flaky "12) test2218(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 725512531 + "'", int18 == 725512531);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky "6) test2218(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2005207400) + "'", int30 == (-2005207400));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer43);
        org.junit.Assert.assertNull(intArray44);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "4) test2218(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 758707937 + "'", int56 == 758707937);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(strArray63);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "4) test2218(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 758707937 + "'", int70 == 758707937);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1._spilloverEnd = (-432142005);
        java.lang.String[] strArray5 = byteQuadsCanonicalizer1._names;
        byteQuadsCanonicalizer1._secondaryStart = (-673888554);
        int int8 = byteQuadsCanonicalizer1._hashSize;
        int int9 = byteQuadsCanonicalizer1.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(914786180);
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        int int3 = byteQuadsCanonicalizer1.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-673746378);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._count = (-683076949);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "142) test2221(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 336496091 + "'", int4 == 336496091);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-673746378) + "'", int7 == (-673746378));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int[] intArray2 = byteQuadsCanonicalizer0._hashArea;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._count = (-892521940);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0._parent;
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0._count;
        int[] intArray8 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "143) test2223(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432088697) + "'", int1 == (-432088697));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int11 = byteQuadsCanonicalizer1.calcHash((-673923081), (-937951140));
        int int12 = byteQuadsCanonicalizer1._tertiaryStart;
        byteQuadsCanonicalizer1._longNameOffset = 0;
        java.lang.Class<?> wildcardClass15 = byteQuadsCanonicalizer1.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-254421924) + "'", int11 == (-254421924));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0._hashSize = (-432091323);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "144) test2225(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1410170025) + "'", int10 == (-1410170025));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1425139590));
        byteQuadsCanonicalizer1._count = (-674238753);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        byteQuadsCanonicalizer0._tertiaryStart = (-1410416013);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.calcHash(726014974, 439949297, 1889548666);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        boolean boolean8 = byteQuadsCanonicalizer7.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        int int13 = byteQuadsCanonicalizer9.bucketCount();
        int int14 = byteQuadsCanonicalizer9._tertiaryStart;
        int int15 = byteQuadsCanonicalizer9.primaryCount();
        int int16 = byteQuadsCanonicalizer9.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray19 = byteQuadsCanonicalizer18._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20._hashSize;
        byteQuadsCanonicalizer20._count = (byte) 100;
        java.lang.String[] strArray24 = byteQuadsCanonicalizer20._names;
        int[] intArray29 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int31 = byteQuadsCanonicalizer20.calcHash(intArray29, 4);
        byteQuadsCanonicalizer20._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer34 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int35 = byteQuadsCanonicalizer34._hashSize;
        byteQuadsCanonicalizer34._count = (byte) 100;
        java.lang.String[] strArray38 = byteQuadsCanonicalizer34._names;
        int[] intArray43 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int45 = byteQuadsCanonicalizer34.calcHash(intArray43, 4);
        byteQuadsCanonicalizer20._hashArea = intArray43;
        byteQuadsCanonicalizer18._hashArea = intArray43;
        byteQuadsCanonicalizer9._hashArea = intArray43;
        byteQuadsCanonicalizer7._hashArea = intArray43;
        byteQuadsCanonicalizer0._hashArea = intArray43;
        byteQuadsCanonicalizer0._spilloverEnd = 1330905141;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer53 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "145) test2228(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1937653188) + "'", int5 == (-1937653188));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "80) test2228(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2098973419 + "'", int31 == 2098973419);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "43) test2228(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2098973419 + "'", int45 == 2098973419);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer53);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "146) test2229(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-706994556) + "'", int11 == (-706994556));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        byteQuadsCanonicalizer14._count = (byte) 100;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer14._names;
        int[] intArray23 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int25 = byteQuadsCanonicalizer14.calcHash(intArray23, 4);
        byteQuadsCanonicalizer0._hashArea = intArray23;
        int int27 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28._longNameOffset;
        byteQuadsCanonicalizer28._tertiaryStart = 0;
        int int32 = byteQuadsCanonicalizer28._tertiaryShift;
        int int33 = byteQuadsCanonicalizer28.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer34 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int35 = byteQuadsCanonicalizer34._hashSize;
        int int36 = byteQuadsCanonicalizer34._spilloverEnd;
        int int37 = byteQuadsCanonicalizer34._longNameOffset;
        int int38 = byteQuadsCanonicalizer34.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer39 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int40 = byteQuadsCanonicalizer39.hashSeed();
        int int41 = byteQuadsCanonicalizer39._longNameOffset;
        int int42 = byteQuadsCanonicalizer39.hashSeed();
        byteQuadsCanonicalizer39._longNameOffset = (short) 10;
        int int47 = byteQuadsCanonicalizer39.calcHash((int) '#', (int) (short) 10);
        int int48 = byteQuadsCanonicalizer39._secondaryStart;
        byteQuadsCanonicalizer39._tertiaryShift = (-673757953);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer51 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int52 = byteQuadsCanonicalizer51._hashSize;
        byteQuadsCanonicalizer51._count = (byte) 100;
        java.lang.String[] strArray55 = byteQuadsCanonicalizer51._names;
        int[] intArray60 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int62 = byteQuadsCanonicalizer51.calcHash(intArray60, 4);
        java.lang.String[] strArray68 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer51._names = strArray68;
        byteQuadsCanonicalizer39._names = strArray68;
        byteQuadsCanonicalizer34._names = strArray68;
        byteQuadsCanonicalizer28._names = strArray68;
        byteQuadsCanonicalizer0._names = strArray68;
        int int74 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "147) test2230(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1169932016) + "'", int11 == (-1169932016));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "81) test2230(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1169932016) + "'", int25 == (-1169932016));
// flaky "44) test2230(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-432088615) + "'", int27 == (-432088615));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
// flaky "20) test2230(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-432088615) + "'", int33 == (-432088615));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer39);
// flaky "13) test2230(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-432088615) + "'", int40 == (-432088615));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
// flaky "7) test2230(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-432088615) + "'", int42 == (-432088615));
// flaky "5) test2230(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 725511685 + "'", int47 == 725511685);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "5) test2230(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1169932016) + "'", int62 == (-1169932016));
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        int[] intArray9 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        byteQuadsCanonicalizer11._count = (byte) 100;
        int int16 = byteQuadsCanonicalizer11.calcHash((int) (short) 1);
        java.lang.String str17 = byteQuadsCanonicalizer11.toString();
        int int18 = byteQuadsCanonicalizer11._tertiaryShift;
        java.lang.String[] strArray19 = byteQuadsCanonicalizer11._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = byteQuadsCanonicalizer11.makeChild(0);
        byteQuadsCanonicalizer11._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        int int25 = byteQuadsCanonicalizer23._spilloverEnd;
        int int26 = byteQuadsCanonicalizer23._hashSize;
        byteQuadsCanonicalizer23._tertiaryShift = (-673746557);
        boolean boolean29 = byteQuadsCanonicalizer23._failOnDoS;
        boolean boolean30 = byteQuadsCanonicalizer23.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer32 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int33 = byteQuadsCanonicalizer32.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray36 = byteQuadsCanonicalizer35._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer37 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int38 = byteQuadsCanonicalizer37._hashSize;
        byteQuadsCanonicalizer37._count = (byte) 100;
        java.lang.String[] strArray41 = byteQuadsCanonicalizer37._names;
        int[] intArray46 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int48 = byteQuadsCanonicalizer37.calcHash(intArray46, 4);
        byteQuadsCanonicalizer37._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer51 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int52 = byteQuadsCanonicalizer51._hashSize;
        byteQuadsCanonicalizer51._count = (byte) 100;
        java.lang.String[] strArray55 = byteQuadsCanonicalizer51._names;
        int[] intArray60 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int62 = byteQuadsCanonicalizer51.calcHash(intArray60, 4);
        byteQuadsCanonicalizer37._hashArea = intArray60;
        byteQuadsCanonicalizer35._hashArea = intArray60;
        byteQuadsCanonicalizer32._hashArea = intArray60;
        byteQuadsCanonicalizer23._hashArea = intArray60;
        byteQuadsCanonicalizer11._hashArea = intArray60;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=725993347, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray60, 2044597701);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "148) test2231(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432088601) + "'", int8 == (-432088601));
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "82) test2231(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-674284256) + "'", int16 == (-674284256));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str17, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "45) test2231(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1293568735) + "'", int48 == (-1293568735));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "21) test2231(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1293568735) + "'", int62 == (-1293568735));
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432115847));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2._hashSize;
        byteQuadsCanonicalizer2._count = (byte) 100;
        java.lang.String[] strArray6 = byteQuadsCanonicalizer2._names;
        int[] intArray11 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int13 = byteQuadsCanonicalizer2.calcHash(intArray11, 4);
        byteQuadsCanonicalizer0._hashArea = intArray11;
        int int15 = byteQuadsCanonicalizer0.spilloverCount();
        int int16 = byteQuadsCanonicalizer0._spilloverEnd;
        int int17 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = byteQuadsCanonicalizer0.makeChild(1747878337);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = byteQuadsCanonicalizer0.makeChild((-432129277));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "149) test2233(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 883366013 + "'", int13 == 883366013);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        byteQuadsCanonicalizer3._spilloverEnd = (-1724451009);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-1409337966);
        int int16 = byteQuadsCanonicalizer0.secondaryCount();
        int int17 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = (-432142603);
        int int20 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._tertiaryShift = 725749159;
        byteQuadsCanonicalizer0._tertiaryStart = (-432141693);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "150) test2235(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 534527456 + "'", int11 == 534527456);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild((-922425077));
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int int6 = byteQuadsCanonicalizer4._tertiaryShift;
        byteQuadsCanonicalizer4._intern = true;
        java.lang.String str11 = byteQuadsCanonicalizer4.findName((-432133197), (-432136449));
        int int12 = byteQuadsCanonicalizer4.bucketCount();
        byteQuadsCanonicalizer4._secondaryStart = 725794321;
        byteQuadsCanonicalizer4._hashSize = 937565581;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "151) test2236(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432088519) + "'", int1 == (-432088519));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(725577583);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
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
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-673757953);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._secondaryStart = 32;
        int int15 = byteQuadsCanonicalizer0.bucketCount();
        int int16 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._secondaryStart = 157658724;
        boolean boolean19 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "152) test2238(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432088489) + "'", int1 == (-432088489));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "83) test2238(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432088489) + "'", int3 == (-432088489));
// flaky "46) test2238(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725493991 + "'", int8 == 725493991);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-673757953) + "'", int16 == (-673757953));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        int int13 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._secondaryStart = 841774826;
        byteQuadsCanonicalizer0._secondaryStart = 725954260;
        int int20 = byteQuadsCanonicalizer0.calcHash((-1857547515), (-432126295));
        int int22 = byteQuadsCanonicalizer0.calcHash(0);
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "153) test2239(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432088477) + "'", int1 == (-432088477));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "84) test2239(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432088477) + "'", int3 == (-432088477));
// flaky "47) test2239(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725493784 + "'", int8 == 725493784);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "22) test2239(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-432088477) + "'", int13 == (-432088477));
// flaky "14) test2239(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2043024254 + "'", int20 == 2043024254);
// flaky "8) test2239(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-674283067) + "'", int22 == (-674283067));
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        byteQuadsCanonicalizer1._longNameOffset = (-432144003);
        byteQuadsCanonicalizer1._spilloverEnd = 1209132704;
        boolean boolean11 = byteQuadsCanonicalizer1._failOnDoS;
        java.lang.String str12 = byteQuadsCanonicalizer1.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/302283176 pri/sec/ter/spill (=0), total:302283176]" + "'", str12, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/302283176 pri/sec/ter/spill (=0), total:302283176]");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        int int9 = byteQuadsCanonicalizer0.calcHash(0, 551623854, (-432135549));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer11.makeChild(802144728);
        byteQuadsCanonicalizer13._reportTooManyCollisions();
        int int15 = byteQuadsCanonicalizer13._count;
        byteQuadsCanonicalizer13._hashSize = (-432142511);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20._hashSize;
        byteQuadsCanonicalizer20._count = (byte) 100;
        java.lang.String[] strArray24 = byteQuadsCanonicalizer20._names;
        int[] intArray29 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int31 = byteQuadsCanonicalizer20.calcHash(intArray29, 4);
        byteQuadsCanonicalizer18._hashArea = intArray29;
        byteQuadsCanonicalizer13._hashArea = intArray29;
        byteQuadsCanonicalizer0._hashArea = intArray29;
        int int35 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "154) test2241(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432088443) + "'", int1 == (-432088443));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "85) test2241(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432088443) + "'", int3 == (-432088443));
// flaky "48) test2241(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 241840994 + "'", int9 == 241840994);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "23) test2241(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-69388461) + "'", int31 == (-69388461));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._count = 725969857;
        int int6 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.calcHash(726014974, 439949297, 1889548666);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        boolean boolean8 = byteQuadsCanonicalizer7.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        int int13 = byteQuadsCanonicalizer9.bucketCount();
        int int14 = byteQuadsCanonicalizer9._tertiaryStart;
        int int15 = byteQuadsCanonicalizer9.primaryCount();
        int int16 = byteQuadsCanonicalizer9.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray19 = byteQuadsCanonicalizer18._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20._hashSize;
        byteQuadsCanonicalizer20._count = (byte) 100;
        java.lang.String[] strArray24 = byteQuadsCanonicalizer20._names;
        int[] intArray29 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int31 = byteQuadsCanonicalizer20.calcHash(intArray29, 4);
        byteQuadsCanonicalizer20._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer34 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int35 = byteQuadsCanonicalizer34._hashSize;
        byteQuadsCanonicalizer34._count = (byte) 100;
        java.lang.String[] strArray38 = byteQuadsCanonicalizer34._names;
        int[] intArray43 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int45 = byteQuadsCanonicalizer34.calcHash(intArray43, 4);
        byteQuadsCanonicalizer20._hashArea = intArray43;
        byteQuadsCanonicalizer18._hashArea = intArray43;
        byteQuadsCanonicalizer9._hashArea = intArray43;
        byteQuadsCanonicalizer7._hashArea = intArray43;
        byteQuadsCanonicalizer0._hashArea = intArray43;
        int int51 = byteQuadsCanonicalizer0._secondaryStart;
        int int52 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "155) test2243(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2065725688) + "'", int5 == (-2065725688));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "86) test2243(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1666940570) + "'", int31 == (-1666940570));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "49) test2243(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1666940570) + "'", int45 == (-1666940570));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._count;
        int int4 = byteQuadsCanonicalizer0._tertiaryStart;
        boolean boolean5 = byteQuadsCanonicalizer0._failOnDoS;
        int int6 = byteQuadsCanonicalizer0._tertiaryStart;
        int int7 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        java.lang.String str12 = byteQuadsCanonicalizer10.toString();
        int[] intArray17 = new int[] { (-432144557), (-432145785), 725972989, 490519636 };
        byteQuadsCanonicalizer10._hashArea = intArray17;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = byteQuadsCanonicalizer8.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray17, (-432088861));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str12, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-432144557), (-432145785), 725972989, 490519636 });
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        int int11 = byteQuadsCanonicalizer0.calcHash((-432132099));
        int int12 = byteQuadsCanonicalizer0.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer0.makeChild((-217805254));
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "156) test2245(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1927612358 + "'", int7 == 1927612358);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str9, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "87) test2245(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 482569 + "'", int11 == 482569);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0._parent;
        int int12 = byteQuadsCanonicalizer0._spilloverEnd;
        int int13 = byteQuadsCanonicalizer0.hashSeed();
        int int14 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "157) test2246(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1940821596 + "'", int7 == 1940821596);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "88) test2246(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432088365) + "'", int9 == (-432088365));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "50) test2246(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-432088365) + "'", int13 == (-432088365));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-409814536));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) 100);
        int int2 = byteQuadsCanonicalizer1.tertiaryCount();
        java.lang.String[] strArray3 = byteQuadsCanonicalizer1._names;
        byteQuadsCanonicalizer1._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        int int4 = byteQuadsCanonicalizer1.totalCount();
        byteQuadsCanonicalizer1._tertiaryShift = (-432138277);
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        int int8 = byteQuadsCanonicalizer1._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        int int4 = byteQuadsCanonicalizer1.totalCount();
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._tertiaryStart = (-673785726);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int14 = byteQuadsCanonicalizer13._hashSize;
        int int15 = byteQuadsCanonicalizer13.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int18 = byteQuadsCanonicalizer17.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray21 = byteQuadsCanonicalizer20._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._hashSize;
        byteQuadsCanonicalizer22._count = (byte) 100;
        java.lang.String[] strArray26 = byteQuadsCanonicalizer22._names;
        int[] intArray31 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int33 = byteQuadsCanonicalizer22.calcHash(intArray31, 4);
        byteQuadsCanonicalizer22._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer36 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int37 = byteQuadsCanonicalizer36._hashSize;
        byteQuadsCanonicalizer36._count = (byte) 100;
        java.lang.String[] strArray40 = byteQuadsCanonicalizer36._names;
        int[] intArray45 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int47 = byteQuadsCanonicalizer36.calcHash(intArray45, 4);
        byteQuadsCanonicalizer22._hashArea = intArray45;
        byteQuadsCanonicalizer20._hashArea = intArray45;
        byteQuadsCanonicalizer17._hashArea = intArray45;
        byteQuadsCanonicalizer13._hashArea = intArray45;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432118773, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray45, (-432128957));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "158) test2251(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-185012524) + "'", int33 == (-185012524));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(strArray40);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "89) test2251(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-185012524) + "'", int47 == (-185012524));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        int int9 = byteQuadsCanonicalizer0.calcHash((-432133149));
        int int10 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "159) test2252(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674281424) + "'", int5 == (-674281424));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "90) test2252(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 488619 + "'", int9 == 488619);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8._hashSize;
        byteQuadsCanonicalizer8._count = (byte) 100;
        java.lang.String[] strArray12 = byteQuadsCanonicalizer8._names;
        int[] intArray17 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int19 = byteQuadsCanonicalizer8.calcHash(intArray17, 4);
        byteQuadsCanonicalizer8._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._hashSize;
        byteQuadsCanonicalizer22._count = (byte) 100;
        java.lang.String[] strArray26 = byteQuadsCanonicalizer22._names;
        int[] intArray31 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int33 = byteQuadsCanonicalizer22.calcHash(intArray31, 4);
        byteQuadsCanonicalizer8._hashArea = intArray31;
        byteQuadsCanonicalizer1._hashArea = intArray31;
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "160) test2253(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1729936348) + "'", int19 == (-1729936348));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "91) test2253(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1729936348) + "'", int33 == (-1729936348));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1.secondaryCount();
        int int8 = byteQuadsCanonicalizer1.size();
        byteQuadsCanonicalizer1._spilloverEnd = 406821481;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._hashSize = (-1662432109);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "161) test2255(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432088155) + "'", int1 == (-432088155));
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0.makeChild(0);
        int int13 = byteQuadsCanonicalizer0._tertiaryStart;
        int[] intArray14 = byteQuadsCanonicalizer0._hashArea;
        boolean boolean15 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "162) test2256(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432088147) + "'", int1 == (-432088147));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "92) test2256(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432088147) + "'", int3 == (-432088147));
// flaky "51) test2256(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725492857 + "'", int8 == 725492857);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) 'a');
        byteQuadsCanonicalizer1.release();
        int int4 = byteQuadsCanonicalizer1.calcHash((-1814760150));
        java.lang.Class<?> wildcardClass5 = byteQuadsCanonicalizer1.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 226138499 + "'", int4 == 226138499);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144281), (-432142395), 12495515);
        int[] intArray7 = byteQuadsCanonicalizer0._hashArea;
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "163) test2258(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1675024037 + "'", int6 == 1675024037);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432125473));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0.primaryCount();
        int int6 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._hashSize = (-432134985);
        byteQuadsCanonicalizer0._tertiaryShift = 1424025331;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer0.makeChild(0);
        java.lang.String str10 = byteQuadsCanonicalizer7.findName((-432122901), (-432094757));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432099715));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.calcHash(726014974, 439949297, 1889548666);
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryShift = (-432098763);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "164) test2263(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1342037782) + "'", int5 == (-1342037782));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(725879344);
        int int10 = byteQuadsCanonicalizer9._tertiaryShift;
        byteQuadsCanonicalizer9._tertiaryStart = 67826562;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = byteQuadsCanonicalizer9.secondaryCount();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 515 out of bounds for length 512");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "165) test2264(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1288598513 + "'", int7 == 1288598513);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        int int19 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._secondaryStart = (-432141389);
        int int22 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._spilloverEnd = (-118405630);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "166) test2265(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1744662060 + "'", int17 == 1744662060);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432146455), (-432146251), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-673746378);
        int int7 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0._tertiaryStart = (-432138851);
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
        // The following exception was thrown during execution in test generation
        try {
            int int32 = byteQuadsCanonicalizer0.calcHash(intArray27, 87790485);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "167) test2266(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2050937457 + "'", int4 == 2050937457);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str17, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "93) test2266(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 322485070 + "'", int29 == 322485070);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-432137521);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int11 = byteQuadsCanonicalizer0._longNameOffset;
        int int13 = byteQuadsCanonicalizer0.calcHash(725897965);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "168) test2267(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432088029) + "'", int1 == (-432088029));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "94) test2267(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1498666973) + "'", int13 == (-1498666973));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        int int33 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "169) test2268(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1589036176) + "'", int20 == (-1589036176));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(48709);
        int int2 = byteQuadsCanonicalizer1._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.calcHash((int) 'a');
        int int8 = byteQuadsCanonicalizer0._count;
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "170) test2270(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-674278759) + "'", int7 == (-674278759));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1888459861), 1848248);
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 1507620431;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "171) test2271(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432087991) + "'", int4 == (-432087991));
// flaky "95) test2271(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 284093282 + "'", int7 == 284093282);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        int int9 = byteQuadsCanonicalizer0.calcHash(0, 551623854, (-432135549));
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._longNameOffset;
        int int13 = byteQuadsCanonicalizer11._longNameOffset;
        int int14 = byteQuadsCanonicalizer11.secondaryCount();
        byteQuadsCanonicalizer11._hashSize = (-673796221);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17._hashSize;
        int int19 = byteQuadsCanonicalizer17._spilloverEnd;
        int int20 = byteQuadsCanonicalizer17._tertiaryShift;
        boolean boolean21 = byteQuadsCanonicalizer17._intern;
        byteQuadsCanonicalizer17.release();
        boolean boolean23 = byteQuadsCanonicalizer17._intern;
        int int24 = byteQuadsCanonicalizer17.hashSeed();
        int int25 = byteQuadsCanonicalizer17.bucketCount();
        int int28 = byteQuadsCanonicalizer17.calcHash(717585690, (-432137177));
        int int29 = byteQuadsCanonicalizer17.spilloverCount();
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
        int[] intArray48 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int50 = byteQuadsCanonicalizer39.calcHash(intArray48, 4);
        java.lang.String[] strArray56 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer39._names = strArray56;
        byteQuadsCanonicalizer30._names = strArray56;
        java.lang.String[] strArray59 = new java.lang.String[] {};
        byteQuadsCanonicalizer30._names = strArray59;
        int int61 = byteQuadsCanonicalizer30._secondaryStart;
        java.lang.String[] strArray62 = byteQuadsCanonicalizer30._names;
        byteQuadsCanonicalizer17._names = strArray62;
        byteQuadsCanonicalizer11._names = strArray62;
        byteQuadsCanonicalizer0._names = strArray62;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "172) test2272(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087983) + "'", int1 == (-432087983));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "96) test2272(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432087983) + "'", int3 == (-432087983));
// flaky "52) test2272(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 129166491 + "'", int9 == 129166491);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky "24) test2272(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-432087983) + "'", int24 == (-432087983));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
// flaky "15) test2272(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 621953470 + "'", int28 == 621953470);
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
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "9) test2272(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 331200794 + "'", int50 == 331200794);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] {});
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0.release();
        int int5 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean7 = byteQuadsCanonicalizer0._intern;
        int int8 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild((-432137437));
        boolean boolean11 = byteQuadsCanonicalizer10._failOnDoS;
        int[] intArray12 = null;
        byteQuadsCanonicalizer10._hashArea = intArray12;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        java.lang.String str13 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = byteQuadsCanonicalizer0.makeChild(756548098);
        int int16 = byteQuadsCanonicalizer15.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18.hashSeed();
        int int20 = byteQuadsCanonicalizer18._longNameOffset;
        int int22 = byteQuadsCanonicalizer18.calcHash((-432144885));
        int[] intArray23 = byteQuadsCanonicalizer18._hashArea;
        int[] intArray24 = byteQuadsCanonicalizer18._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        boolean boolean27 = byteQuadsCanonicalizer26.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28._hashSize;
        byteQuadsCanonicalizer28._count = (byte) 100;
        int int32 = byteQuadsCanonicalizer28.bucketCount();
        int int33 = byteQuadsCanonicalizer28._tertiaryStart;
        int int34 = byteQuadsCanonicalizer28.primaryCount();
        int int35 = byteQuadsCanonicalizer28.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer37 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray38 = byteQuadsCanonicalizer37._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer39 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int40 = byteQuadsCanonicalizer39._hashSize;
        byteQuadsCanonicalizer39._count = (byte) 100;
        java.lang.String[] strArray43 = byteQuadsCanonicalizer39._names;
        int[] intArray48 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int50 = byteQuadsCanonicalizer39.calcHash(intArray48, 4);
        byteQuadsCanonicalizer39._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer53 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int54 = byteQuadsCanonicalizer53._hashSize;
        byteQuadsCanonicalizer53._count = (byte) 100;
        java.lang.String[] strArray57 = byteQuadsCanonicalizer53._names;
        int[] intArray62 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int64 = byteQuadsCanonicalizer53.calcHash(intArray62, 4);
        byteQuadsCanonicalizer39._hashArea = intArray62;
        byteQuadsCanonicalizer37._hashArea = intArray62;
        byteQuadsCanonicalizer28._hashArea = intArray62;
        byteQuadsCanonicalizer26._hashArea = intArray62;
        byteQuadsCanonicalizer18._hashArea = intArray62;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str71 = byteQuadsCanonicalizer15.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432142439, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray62, (-432090801));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "173) test2275(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087955) + "'", int1 == (-432087955));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "97) test2275(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432087955) + "'", int3 == (-432087955));
// flaky "53) test2275(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725497717 + "'", int8 == 725497717);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str13, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
// flaky "25) test2275(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-432087955) + "'", int16 == (-432087955));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
// flaky "16) test2275(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-432087955) + "'", int19 == (-432087955));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "10) test2275(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1716932 + "'", int22 == 1716932);
        org.junit.Assert.assertNull(intArray23);
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer37);
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "6) test2275(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1588970820) + "'", int50 == (-1588970820));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(strArray57);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "6) test2275(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1588970820) + "'", int64 == (-1588970820));
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 0;
        byteQuadsCanonicalizer0._secondaryStart = (byte) 0;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8._hashSize;
        byteQuadsCanonicalizer8._count = (byte) 100;
        java.lang.String[] strArray12 = byteQuadsCanonicalizer8._names;
        int[] intArray17 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int19 = byteQuadsCanonicalizer8.calcHash(intArray17, 4);
        boolean boolean20 = byteQuadsCanonicalizer8._failOnDoS;
        int int21 = byteQuadsCanonicalizer8.primaryCount();
        byteQuadsCanonicalizer8._spilloverEnd = (-1409337966);
        boolean boolean24 = byteQuadsCanonicalizer8.maybeDirty();
        int int25 = byteQuadsCanonicalizer8._spilloverEnd;
        byteQuadsCanonicalizer8._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27._hashSize;
        byteQuadsCanonicalizer27._count = (byte) 100;
        java.lang.String[] strArray31 = byteQuadsCanonicalizer27._names;
        int[] intArray36 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int38 = byteQuadsCanonicalizer27.calcHash(intArray36, 4);
        byteQuadsCanonicalizer27._tertiaryStart = (-1425713151);
        int int41 = byteQuadsCanonicalizer27.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer42 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int43 = byteQuadsCanonicalizer42._longNameOffset;
        byteQuadsCanonicalizer42._tertiaryStart = 0;
        int int46 = byteQuadsCanonicalizer42._tertiaryShift;
        int int47 = byteQuadsCanonicalizer42.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer48 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int49 = byteQuadsCanonicalizer48._hashSize;
        int int50 = byteQuadsCanonicalizer48._spilloverEnd;
        int int51 = byteQuadsCanonicalizer48._longNameOffset;
        int int52 = byteQuadsCanonicalizer48.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer53 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int54 = byteQuadsCanonicalizer53.hashSeed();
        int int55 = byteQuadsCanonicalizer53._longNameOffset;
        int int56 = byteQuadsCanonicalizer53.hashSeed();
        byteQuadsCanonicalizer53._longNameOffset = (short) 10;
        int int61 = byteQuadsCanonicalizer53.calcHash((int) '#', (int) (short) 10);
        int int62 = byteQuadsCanonicalizer53._secondaryStart;
        byteQuadsCanonicalizer53._tertiaryShift = (-673757953);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer65 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int66 = byteQuadsCanonicalizer65._hashSize;
        byteQuadsCanonicalizer65._count = (byte) 100;
        java.lang.String[] strArray69 = byteQuadsCanonicalizer65._names;
        int[] intArray74 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int76 = byteQuadsCanonicalizer65.calcHash(intArray74, 4);
        java.lang.String[] strArray82 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer65._names = strArray82;
        byteQuadsCanonicalizer53._names = strArray82;
        byteQuadsCanonicalizer48._names = strArray82;
        byteQuadsCanonicalizer42._names = strArray82;
        byteQuadsCanonicalizer27._names = strArray82;
        byteQuadsCanonicalizer8._names = strArray82;
        byteQuadsCanonicalizer0._names = strArray82;
        byteQuadsCanonicalizer0._spilloverEnd = 79263;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "174) test2276(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087943) + "'", int1 == (-432087943));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "98) test2276(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1870351050 + "'", int19 == 1870351050);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1409337966) + "'", int25 == (-1409337966));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "54) test2276(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1870351050 + "'", int38 == 1870351050);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
// flaky "26) test2276(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-432087943) + "'", int47 == (-432087943));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer53);
// flaky "17) test2276(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-432087943) + "'", int54 == (-432087943));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
// flaky "11) test2276(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-432087943) + "'", int56 == (-432087943));
// flaky "7) test2276(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int61 + "' != '" + 725498527 + "'", int61 == 725498527);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(strArray69);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "7) test2276(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1870351050 + "'", int76 == 1870351050);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = intArray10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = byteQuadsCanonicalizer0._parent;
        int int17 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "175) test2278(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1410154320) + "'", int10 == (-1410154320));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0.bucketCount();
        int[] intArray6 = null;
        byteQuadsCanonicalizer0._hashArea = intArray6;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "176) test2279(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-674277464) + "'", int3 == (-674277464));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        boolean boolean8 = byteQuadsCanonicalizer0._intern;
        int int9 = byteQuadsCanonicalizer0.size();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "177) test2280(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674279069) + "'", int5 == (-674279069));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str9 = byteQuadsCanonicalizer8.toString();
        int[] intArray10 = byteQuadsCanonicalizer8._hashArea;
        int int11 = byteQuadsCanonicalizer8.totalCount();
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
        int int39 = byteQuadsCanonicalizer12.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer40 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int41 = byteQuadsCanonicalizer40._longNameOffset;
        byteQuadsCanonicalizer40._tertiaryStart = 0;
        int int44 = byteQuadsCanonicalizer40._tertiaryShift;
        int int45 = byteQuadsCanonicalizer40.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer46 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int47 = byteQuadsCanonicalizer46._hashSize;
        int int48 = byteQuadsCanonicalizer46._spilloverEnd;
        int int49 = byteQuadsCanonicalizer46._longNameOffset;
        int int50 = byteQuadsCanonicalizer46.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer51 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int52 = byteQuadsCanonicalizer51.hashSeed();
        int int53 = byteQuadsCanonicalizer51._longNameOffset;
        int int54 = byteQuadsCanonicalizer51.hashSeed();
        byteQuadsCanonicalizer51._longNameOffset = (short) 10;
        int int59 = byteQuadsCanonicalizer51.calcHash((int) '#', (int) (short) 10);
        int int60 = byteQuadsCanonicalizer51._secondaryStart;
        byteQuadsCanonicalizer51._tertiaryShift = (-673757953);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer63 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int64 = byteQuadsCanonicalizer63._hashSize;
        byteQuadsCanonicalizer63._count = (byte) 100;
        java.lang.String[] strArray67 = byteQuadsCanonicalizer63._names;
        int[] intArray72 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int74 = byteQuadsCanonicalizer63.calcHash(intArray72, 4);
        java.lang.String[] strArray80 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer63._names = strArray80;
        byteQuadsCanonicalizer51._names = strArray80;
        byteQuadsCanonicalizer46._names = strArray80;
        byteQuadsCanonicalizer40._names = strArray80;
        byteQuadsCanonicalizer12._names = strArray80;
        byteQuadsCanonicalizer8._names = strArray80;
        byteQuadsCanonicalizer0._names = strArray80;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str9, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "178) test2281(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1359929888 + "'", int23 == 1359929888);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "99) test2281(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1359929888 + "'", int37 == 1359929888);
// flaky "55) test2281(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-432087871) + "'", int39 == (-432087871));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
// flaky "27) test2281(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-432087871) + "'", int45 == (-432087871));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer51);
// flaky "18) test2281(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-432087871) + "'", int52 == (-432087871));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
// flaky "12) test2281(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-432087871) + "'", int54 == (-432087871));
// flaky "8) test2281(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 725499508 + "'", int59 == 725499508);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(strArray67);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "8) test2281(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1359929888 + "'", int74 == 1359929888);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        byteQuadsCanonicalizer0._spilloverEnd = (-432130945);
        boolean boolean17 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._spilloverEnd = (-1282423228);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "179) test2282(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087851) + "'", int1 == (-432087851));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "100) test2282(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432087851) + "'", int3 == (-432087851));
// flaky "56) test2282(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725499409 + "'", int8 == 725499409);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer20);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild(0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        int int14 = byteQuadsCanonicalizer12._spilloverEnd;
        int int15 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._tertiaryShift = (-673746557);
        boolean boolean18 = byteQuadsCanonicalizer12._failOnDoS;
        boolean boolean19 = byteQuadsCanonicalizer12.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int22 = byteQuadsCanonicalizer21.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray25 = byteQuadsCanonicalizer24._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int27 = byteQuadsCanonicalizer26._hashSize;
        byteQuadsCanonicalizer26._count = (byte) 100;
        java.lang.String[] strArray30 = byteQuadsCanonicalizer26._names;
        int[] intArray35 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int37 = byteQuadsCanonicalizer26.calcHash(intArray35, 4);
        byteQuadsCanonicalizer26._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer40 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int41 = byteQuadsCanonicalizer40._hashSize;
        byteQuadsCanonicalizer40._count = (byte) 100;
        java.lang.String[] strArray44 = byteQuadsCanonicalizer40._names;
        int[] intArray49 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int51 = byteQuadsCanonicalizer40.calcHash(intArray49, 4);
        byteQuadsCanonicalizer26._hashArea = intArray49;
        byteQuadsCanonicalizer24._hashArea = intArray49;
        byteQuadsCanonicalizer21._hashArea = intArray49;
        byteQuadsCanonicalizer12._hashArea = intArray49;
        byteQuadsCanonicalizer0._hashArea = intArray49;
        int int57 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryShift = (-432103723);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "180) test2283(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674277351) + "'", int5 == (-674277351));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "101) test2283(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1002413564 + "'", int37 == 1002413564);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "57) test2283(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1002413564 + "'", int51 == 1002413564);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        int int9 = byteQuadsCanonicalizer0.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10.hashSeed();
        int int12 = byteQuadsCanonicalizer10._longNameOffset;
        int int13 = byteQuadsCanonicalizer10.hashSeed();
        byteQuadsCanonicalizer10._longNameOffset = (short) 10;
        int int18 = byteQuadsCanonicalizer10.calcHash((int) '#', (int) (short) 10);
        int int19 = byteQuadsCanonicalizer10._secondaryStart;
        byteQuadsCanonicalizer10._tertiaryShift = (-673757953);
        boolean boolean22 = byteQuadsCanonicalizer10.maybeDirty();
        int[] intArray26 = new int[] { 133190806, (-432144885), 209767541 };
        byteQuadsCanonicalizer10._hashArea = intArray26;
        int int28 = byteQuadsCanonicalizer10.secondaryCount();
        int[] intArray29 = byteQuadsCanonicalizer10._hashArea;
        byteQuadsCanonicalizer0._hashArea = intArray29;
        boolean boolean31 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "181) test2284(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674277765) + "'", int5 == (-674277765));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
// flaky "102) test2284(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-432087823) + "'", int11 == (-432087823));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "58) test2284(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-432087823) + "'", int13 == (-432087823));
// flaky "28) test2284(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 725499679 + "'", int18 == 725499679);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 133190806, (-432144885), 209767541 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 133190806, (-432144885), 209767541 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        int int11 = byteQuadsCanonicalizer0._tertiaryShift;
        int int12 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str14 = byteQuadsCanonicalizer13.toString();
        int int15 = byteQuadsCanonicalizer13._spilloverEnd;
        int int16 = byteQuadsCanonicalizer13.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(48709);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        int int21 = byteQuadsCanonicalizer19._spilloverEnd;
        boolean boolean22 = byteQuadsCanonicalizer19.maybeDirty();
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
        int[] intArray41 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int43 = byteQuadsCanonicalizer32.calcHash(intArray41, 4);
        java.lang.String[] strArray49 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer32._names = strArray49;
        byteQuadsCanonicalizer23._names = strArray49;
        byteQuadsCanonicalizer19._names = strArray49;
        byteQuadsCanonicalizer18._names = strArray49;
        byteQuadsCanonicalizer13._names = strArray49;
        byteQuadsCanonicalizer0._names = strArray49;
        int int57 = byteQuadsCanonicalizer0.calcHash((-432128535));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "182) test2285(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087813) + "'", int1 == (-432087813));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str14, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "103) test2285(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1430902001) + "'", int43 == (-1430902001));
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
// flaky "59) test2285(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 518656 + "'", int57 == 518656);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432133453));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._intern = true;
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        int int12 = byteQuadsCanonicalizer0.calcHash(697911168, 0);
        int int16 = byteQuadsCanonicalizer0.calcHash(725746603, 0, 31963531);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "183) test2287(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-574090246) + "'", int12 == (-574090246));
// flaky "104) test2287(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-775430916) + "'", int16 == (-775430916));
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = byteQuadsCanonicalizer6._tertiaryShift;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer6);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8._hashSize;
        byteQuadsCanonicalizer8._count = (byte) 100;
        int int12 = byteQuadsCanonicalizer8.bucketCount();
        int int13 = byteQuadsCanonicalizer8._tertiaryStart;
        int int14 = byteQuadsCanonicalizer8.primaryCount();
        int int15 = byteQuadsCanonicalizer8.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray18 = byteQuadsCanonicalizer17._hashArea;
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
        byteQuadsCanonicalizer17._hashArea = intArray42;
        byteQuadsCanonicalizer8._hashArea = intArray42;
        byteQuadsCanonicalizer0._hashArea = intArray42;
        int int49 = byteQuadsCanonicalizer0._tertiaryShift;
        int int53 = byteQuadsCanonicalizer0.calcHash((-432107839), (-846085795), (-432121071));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "184) test2289(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087745) + "'", int1 == (-432087745));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "105) test2289(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-989072479) + "'", int30 == (-989072479));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "60) test2289(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-989072479) + "'", int44 == (-989072479));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
// flaky "29) test2289(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1554286603 + "'", int53 == 1554286603);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = (-432139871);
        int int11 = byteQuadsCanonicalizer0._longNameOffset;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.Class<?> wildcardClass13 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "185) test2290(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1750725634) + "'", int6 == (-1750725634));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "106) test2290(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432087735) + "'", int12 == (-432087735));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) 'a');
        byteQuadsCanonicalizer1.release();
        java.lang.String[] strArray3 = byteQuadsCanonicalizer1._names;
        byteQuadsCanonicalizer1._count = (-673966291);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        byteQuadsCanonicalizer0._longNameOffset = (-432142603);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = (-1425713151);
        boolean boolean14 = byteQuadsCanonicalizer0._intern;
        int int15 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "186) test2293(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1383495800) + "'", int11 == (-1383495800));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        int int19 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._secondaryStart = (-432141389);
        int int22 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "187) test2294(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 378076029 + "'", int17 == 378076029);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        int int9 = byteQuadsCanonicalizer0.calcHash(0, 551623854, (-432135549));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer11.makeChild(802144728);
        byteQuadsCanonicalizer13._reportTooManyCollisions();
        int int15 = byteQuadsCanonicalizer13._count;
        byteQuadsCanonicalizer13._hashSize = (-432142511);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20._hashSize;
        byteQuadsCanonicalizer20._count = (byte) 100;
        java.lang.String[] strArray24 = byteQuadsCanonicalizer20._names;
        int[] intArray29 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int31 = byteQuadsCanonicalizer20.calcHash(intArray29, 4);
        byteQuadsCanonicalizer18._hashArea = intArray29;
        byteQuadsCanonicalizer13._hashArea = intArray29;
        byteQuadsCanonicalizer0._hashArea = intArray29;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._tertiaryShift = 725504557;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "188) test2295(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087677) + "'", int1 == (-432087677));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "107) test2295(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432087677) + "'", int3 == (-432087677));
// flaky "61) test2295(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 140216786 + "'", int9 == 140216786);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "30) test2295(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1000297122 + "'", int31 == 1000297122);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432097439));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2._hashSize;
        byteQuadsCanonicalizer2._count = (byte) 100;
        int int7 = byteQuadsCanonicalizer2.calcHash((int) (short) 1);
        java.lang.String str8 = byteQuadsCanonicalizer2.toString();
        int int9 = byteQuadsCanonicalizer2._tertiaryShift;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer2._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer2.makeChild(0);
        byteQuadsCanonicalizer2._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        int int16 = byteQuadsCanonicalizer14._spilloverEnd;
        int int17 = byteQuadsCanonicalizer14._hashSize;
        byteQuadsCanonicalizer14._tertiaryShift = (-673746557);
        boolean boolean20 = byteQuadsCanonicalizer14._failOnDoS;
        boolean boolean21 = byteQuadsCanonicalizer14.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int24 = byteQuadsCanonicalizer23.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray27 = byteQuadsCanonicalizer26._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28._hashSize;
        byteQuadsCanonicalizer28._count = (byte) 100;
        java.lang.String[] strArray32 = byteQuadsCanonicalizer28._names;
        int[] intArray37 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int39 = byteQuadsCanonicalizer28.calcHash(intArray37, 4);
        byteQuadsCanonicalizer28._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer42 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int43 = byteQuadsCanonicalizer42._hashSize;
        byteQuadsCanonicalizer42._count = (byte) 100;
        java.lang.String[] strArray46 = byteQuadsCanonicalizer42._names;
        int[] intArray51 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int53 = byteQuadsCanonicalizer42.calcHash(intArray51, 4);
        byteQuadsCanonicalizer28._hashArea = intArray51;
        byteQuadsCanonicalizer26._hashArea = intArray51;
        byteQuadsCanonicalizer23._hashArea = intArray51;
        byteQuadsCanonicalizer14._hashArea = intArray51;
        byteQuadsCanonicalizer2._hashArea = intArray51;
        byteQuadsCanonicalizer1._hashArea = intArray51;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "189) test2296(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-674276955) + "'", int7 == (-674276955));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
        org.junit.Assert.assertNull(intArray27);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "108) test2296(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 532459085 + "'", int39 == 532459085);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "62) test2296(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 532459085 + "'", int53 == 532459085);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0._tertiaryStart = (-432144783);
        boolean boolean11 = byteQuadsCanonicalizer0._intern;
        int int12 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._count = (-432146083);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._hashSize = (-2034212398);
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._tertiaryShift = (-432087677);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "190) test2298(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087651) + "'", int1 == (-432087651));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        int int14 = byteQuadsCanonicalizer0.totalCount();
        int int15 = byteQuadsCanonicalizer0.primaryCount();
        boolean boolean16 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "191) test2299(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-674277105) + "'", int11 == (-674277105));
// flaky "109) test2299(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 396724 + "'", int13 == 396724);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        boolean boolean2 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer3._hashSize;
        byteQuadsCanonicalizer3._count = (byte) 100;
        int int7 = byteQuadsCanonicalizer3.bucketCount();
        int int8 = byteQuadsCanonicalizer3._tertiaryStart;
        int int9 = byteQuadsCanonicalizer3.primaryCount();
        int int10 = byteQuadsCanonicalizer3.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray13 = byteQuadsCanonicalizer12._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        byteQuadsCanonicalizer14._count = (byte) 100;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer14._names;
        int[] intArray23 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int25 = byteQuadsCanonicalizer14.calcHash(intArray23, 4);
        byteQuadsCanonicalizer14._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28._hashSize;
        byteQuadsCanonicalizer28._count = (byte) 100;
        java.lang.String[] strArray32 = byteQuadsCanonicalizer28._names;
        int[] intArray37 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int39 = byteQuadsCanonicalizer28.calcHash(intArray37, 4);
        byteQuadsCanonicalizer14._hashArea = intArray37;
        byteQuadsCanonicalizer12._hashArea = intArray37;
        byteQuadsCanonicalizer3._hashArea = intArray37;
        byteQuadsCanonicalizer1._hashArea = intArray37;
        java.lang.Class<?> wildcardClass44 = byteQuadsCanonicalizer1.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "192) test2300(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1757978713) + "'", int25 == (-1757978713));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "110) test2300(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1757978713) + "'", int39 == (-1757978713));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '4');
        int int11 = byteQuadsCanonicalizer0.calcHash((int) '4', 0);
        int int12 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "193) test2301(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674277277) + "'", int5 == (-674277277));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "111) test2301(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-674276944) + "'", int8 == (-674276944));
// flaky "63) test2301(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 725499823 + "'", int11 == 725499823);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        int int5 = byteQuadsCanonicalizer3._count;
        int int6 = byteQuadsCanonicalizer3._spilloverEnd;
        java.lang.String str11 = byteQuadsCanonicalizer3.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-201795637), 68138809, 0);
        int int12 = byteQuadsCanonicalizer3._hashSize;
        int int13 = byteQuadsCanonicalizer3._tertiaryStart;
        java.lang.String str16 = byteQuadsCanonicalizer3.findName((-432094811), (-432124935));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 448 + "'", int6 == 448);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 384 + "'", int13 == 384);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._longNameOffset = (byte) 100;
        java.lang.String str15 = byteQuadsCanonicalizer0.toString();
        int int16 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "194) test2303(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1967687650) + "'", int11 == (-1967687650));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str15, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
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
        byteQuadsCanonicalizer0._secondaryStart = (-432146111);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432146367), (-1072272327));
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0.release();
        int int13 = byteQuadsCanonicalizer0._hashSize;
        int int16 = byteQuadsCanonicalizer0.calcHash((-432125149), (-673976455));
        int int17 = byteQuadsCanonicalizer0._tertiaryShift;
        int int18 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "195) test2304(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1410160593) + "'", int10 == (-1410160593));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "112) test2304(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 907487664 + "'", int16 == 907487664);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432145171), 0);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(725879344);
        int int10 = byteQuadsCanonicalizer9._spilloverEnd;
        java.lang.String str14 = byteQuadsCanonicalizer9.findName(1228349195, (-432091879), (-800804035));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "196) test2305(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1463705863 + "'", int7 == 1463705863);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 448 + "'", int10 == 448);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int9 = byteQuadsCanonicalizer0.calcHash((-432135531), (-673933336), 0);
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "197) test2306(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087537) + "'", int1 == (-432087537));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "113) test2306(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1806210129 + "'", int9 == 1806210129);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = (-1425713151);
        int int14 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryShift = (-432137649);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "198) test2307(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1279219349) + "'", int11 == (-1279219349));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        boolean boolean8 = byteQuadsCanonicalizer1._failOnDoS;
        int int9 = byteQuadsCanonicalizer1.size();
        int int10 = byteQuadsCanonicalizer1._tertiaryShift;
        byteQuadsCanonicalizer1._count = (-432144033);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        java.lang.String[] strArray13 = byteQuadsCanonicalizer9._names;
        int[] intArray18 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int20 = byteQuadsCanonicalizer9.calcHash(intArray18, 4);
        byteQuadsCanonicalizer7._hashArea = intArray18;
        byteQuadsCanonicalizer0._hashArea = intArray18;
        boolean boolean23 = byteQuadsCanonicalizer0.maybeDirty();
        java.lang.String str24 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "199) test2309(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-490662329) + "'", int20 == (-490662329));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str24, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) 100);
        int int2 = byteQuadsCanonicalizer1.tertiaryCount();
        java.lang.String[] strArray3 = byteQuadsCanonicalizer1._names;
        byteQuadsCanonicalizer1._secondaryStart = (-432118773);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray10 = byteQuadsCanonicalizer9._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        byteQuadsCanonicalizer11._count = (byte) 100;
        java.lang.String[] strArray15 = byteQuadsCanonicalizer11._names;
        int[] intArray20 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int22 = byteQuadsCanonicalizer11.calcHash(intArray20, 4);
        byteQuadsCanonicalizer11._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int26 = byteQuadsCanonicalizer25._hashSize;
        byteQuadsCanonicalizer25._count = (byte) 100;
        java.lang.String[] strArray29 = byteQuadsCanonicalizer25._names;
        int[] intArray34 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int36 = byteQuadsCanonicalizer25.calcHash(intArray34, 4);
        byteQuadsCanonicalizer11._hashArea = intArray34;
        byteQuadsCanonicalizer9._hashArea = intArray34;
        byteQuadsCanonicalizer0._hashArea = intArray34;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer41 = byteQuadsCanonicalizer0.makeChild((-1417750435));
        int int42 = byteQuadsCanonicalizer41._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "200) test2311(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1715011735 + "'", int22 == 1715011735);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "114) test2311(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1715011735 + "'", int36 == 1715011735);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 256 + "'", int42 == 256);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-432131891));
        byteQuadsCanonicalizer0._spilloverEnd = (-432117447);
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._longNameOffset;
        int int14 = byteQuadsCanonicalizer12._longNameOffset;
        int int15 = byteQuadsCanonicalizer12.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._hashSize;
        int int18 = byteQuadsCanonicalizer16._spilloverEnd;
        int int19 = byteQuadsCanonicalizer16._tertiaryShift;
        boolean boolean20 = byteQuadsCanonicalizer16._intern;
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
        byteQuadsCanonicalizer16._hashArea = intArray44;
        byteQuadsCanonicalizer12._hashArea = intArray44;
        byteQuadsCanonicalizer0._hashArea = intArray44;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "201) test2312(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-432087481) + "'", int11 == (-432087481));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "115) test2312(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1863843413 + "'", int32 == 1863843413);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "64) test2312(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1863843413 + "'", int46 == 1863843413);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int[] intArray7 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "202) test2313(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674276068) + "'", int5 == (-674276068));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "203) test2314(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-741993178) + "'", int11 == (-741993178));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-432131891));
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        int int10 = byteQuadsCanonicalizer0._secondaryStart;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-673746557);
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean7 = byteQuadsCanonicalizer0._intern;
        int int8 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str13 = byteQuadsCanonicalizer12.toString();
        int int14 = byteQuadsCanonicalizer12._spilloverEnd;
        int int15 = byteQuadsCanonicalizer12.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(48709);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        int int20 = byteQuadsCanonicalizer18._spilloverEnd;
        boolean boolean21 = byteQuadsCanonicalizer18.maybeDirty();
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
        byteQuadsCanonicalizer18._names = strArray48;
        byteQuadsCanonicalizer17._names = strArray48;
        byteQuadsCanonicalizer12._names = strArray48;
        byteQuadsCanonicalizer0._names = strArray48;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "204) test2317(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087393) + "'", int1 == (-432087393));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "116) test2317(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432087393) + "'", int3 == (-432087393));
// flaky "65) test2317(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725486827 + "'", int8 == 725486827);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str13, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "31) test2317(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2135942779 + "'", int42 == 2135942779);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(492187041);
        java.lang.String str2 = byteQuadsCanonicalizer1.toString();
        java.lang.String str3 = byteQuadsCanonicalizer1.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer1.makeChild((-432111375));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str2, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        byteQuadsCanonicalizer0._count = (-432128695);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "205) test2319(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087375) + "'", int1 == (-432087375));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild((-432144915));
        boolean boolean11 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "206) test2320(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087339) + "'", int1 == (-432087339));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "117) test2320(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432087339) + "'", int3 == (-432087339));
// flaky "66) test2320(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725485297 + "'", int8 == 725485297);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144543));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        boolean boolean8 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._hashSize = (-432132797);
        int int11 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "207) test2321(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1715689 + "'", int6 == 1715689);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = 725993347;
        byteQuadsCanonicalizer1._intern = false;
        java.lang.String[] strArray6 = byteQuadsCanonicalizer1._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = byteQuadsCanonicalizer14._parent;
        int int17 = byteQuadsCanonicalizer14.hashSeed();
        boolean boolean18 = byteQuadsCanonicalizer14._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = byteQuadsCanonicalizer14.makeChild(1547696045);
        int int21 = byteQuadsCanonicalizer20.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int24 = byteQuadsCanonicalizer23.hashSeed();
        int int28 = byteQuadsCanonicalizer23.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean29 = byteQuadsCanonicalizer23.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int31 = byteQuadsCanonicalizer30._hashSize;
        byteQuadsCanonicalizer30._count = (byte) 100;
        java.lang.String[] strArray34 = byteQuadsCanonicalizer30._names;
        int[] intArray39 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int41 = byteQuadsCanonicalizer30.calcHash(intArray39, 4);
        byteQuadsCanonicalizer30._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer44 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int45 = byteQuadsCanonicalizer44._hashSize;
        byteQuadsCanonicalizer44._count = (byte) 100;
        java.lang.String[] strArray48 = byteQuadsCanonicalizer44._names;
        int[] intArray53 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int55 = byteQuadsCanonicalizer44.calcHash(intArray53, 4);
        byteQuadsCanonicalizer30._hashArea = intArray53;
        byteQuadsCanonicalizer23._hashArea = intArray53;
        java.lang.String str59 = byteQuadsCanonicalizer20.findName(intArray53, 0);
        byteQuadsCanonicalizer0._hashArea = intArray53;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "208) test2323(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42135737 + "'", int11 == 42135737);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer16);
// flaky "118) test2323(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-432087299) + "'", int17 == (-432087299));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
// flaky "67) test2323(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-432087299) + "'", int21 == (-432087299));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1797043 + "'", int28 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "32) test2323(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 42135737 + "'", int41 == 42135737);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "19) test2323(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 42135737 + "'", int55 == 42135737);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        byteQuadsCanonicalizer0._hashSize = 725993347;
        int int24 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "209) test2324(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1786138116) + "'", int11 == (-1786138116));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash(490519636, 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = (-432139871);
        int int11 = byteQuadsCanonicalizer0._secondaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        boolean boolean13 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "210) test2325(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1554947215) + "'", int6 == (-1554947215));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432115825));
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._hashSize = (-673796221);
        byteQuadsCanonicalizer0._count = 285499017;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1._spilloverEnd = (-432142005);
        boolean boolean5 = byteQuadsCanonicalizer1._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432144281), (-432142395), 12495515);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._count = (-673750975);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "211) test2329(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7979465 + "'", int6 == 7979465);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) 100);
        byteQuadsCanonicalizer1._hashSize = 100;
        byteQuadsCanonicalizer1._tertiaryStart = 841774826;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432136911));
        boolean boolean8 = byteQuadsCanonicalizer7.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        int int13 = byteQuadsCanonicalizer9.bucketCount();
        int int14 = byteQuadsCanonicalizer9._tertiaryStart;
        int int15 = byteQuadsCanonicalizer9.primaryCount();
        int int16 = byteQuadsCanonicalizer9.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673765784));
        int[] intArray19 = byteQuadsCanonicalizer18._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20._hashSize;
        byteQuadsCanonicalizer20._count = (byte) 100;
        java.lang.String[] strArray24 = byteQuadsCanonicalizer20._names;
        int[] intArray29 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int31 = byteQuadsCanonicalizer20.calcHash(intArray29, 4);
        byteQuadsCanonicalizer20._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer34 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int35 = byteQuadsCanonicalizer34._hashSize;
        byteQuadsCanonicalizer34._count = (byte) 100;
        java.lang.String[] strArray38 = byteQuadsCanonicalizer34._names;
        int[] intArray43 = new int[] { (-432145785), (-432146083), (byte) 100, (-1) };
        int int45 = byteQuadsCanonicalizer34.calcHash(intArray43, 4);
        byteQuadsCanonicalizer20._hashArea = intArray43;
        byteQuadsCanonicalizer18._hashArea = intArray43;
        byteQuadsCanonicalizer9._hashArea = intArray43;
        byteQuadsCanonicalizer7._hashArea = intArray43;
        byteQuadsCanonicalizer1._hashArea = intArray43;
        int int51 = byteQuadsCanonicalizer1.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "212) test2330(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1073415841) + "'", int31 == (-1073415841));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "119) test2330(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1073415841) + "'", int45 == (-1073415841));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0.size();
        int int8 = byteQuadsCanonicalizer0.totalCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (-1677284569);
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "213) test2332(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087203) + "'", int1 == (-432087203));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "120) test2332(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432087203) + "'", int3 == (-432087203));
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        int int42 = byteQuadsCanonicalizer0.spilloverCount();
        int int43 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "214) test2333(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087197) + "'", int1 == (-432087197));
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
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-432145785), (-432146083), 100, (-1) });
// flaky "121) test2333(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 248708602 + "'", int24 == 248708602);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
// flaky "68) test2333(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-674274105) + "'", int40 == (-674274105));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._hashSize = (-922425077);
        int int11 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0.release();
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._secondaryStart = (-173279133);
        byteQuadsCanonicalizer0._secondaryStart = 758198797;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "215) test2335(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087173) + "'", int1 == (-432087173));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432124739));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild(1641269500);
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0._tertiaryShift;
        int int9 = byteQuadsCanonicalizer0._count;
        int int10 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        boolean boolean14 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._tertiaryStart = 618057394;
        byteQuadsCanonicalizer0._secondaryStart = (-432120797);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "216) test2338(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-674273334) + "'", int11 == (-674273334));
// flaky "122) test2338(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 401039 + "'", int13 == 401039);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer19);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        boolean boolean16 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "217) test2339(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087139) + "'", int1 == (-432087139));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "123) test2339(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432087139) + "'", int3 == (-432087139));
// flaky "69) test2339(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 725484892 + "'", int8 == 725484892);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild(30323224);
        byteQuadsCanonicalizer8._tertiaryStart = (-432133779);
        java.lang.String[] strArray11 = byteQuadsCanonicalizer8._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer0.makeChild((int) '4');
        java.lang.String str8 = byteQuadsCanonicalizer7.toString();
        java.lang.String str13 = byteQuadsCanonicalizer7.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432130031), (-1626615438), (-1098274085));
        java.lang.String str17 = byteQuadsCanonicalizer7.addName("hi!", (-432121563), (-432140279));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "218) test2341(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-674273594) + "'", int5 == (-674273594));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str13, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0._parent;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._longNameOffset = 1536105120;
        boolean boolean10 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "219) test2342(com.fasterxml.jackson.core.sym.RegressionTest4)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432087117) + "'", int1 == (-432087117));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._tertiaryStart = (-38977595);
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-673751787));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(802144728);
        int int6 = byteQuadsCanonicalizer3.calcHash(32, 0);
        byteQuadsCanonicalizer3._spilloverEnd = (-673900579);
        boolean boolean9 = byteQuadsCanonicalizer3.maybeDirty();
        boolean boolean10 = byteQuadsCanonicalizer3._failOnDoS;
        byteQuadsCanonicalizer3._secondaryStart = (-674154099);
        byteQuadsCanonicalizer3._spilloverEnd = (-673997546);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1345099460) + "'", int6 == (-1345099460));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }
}
