package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] { '4', ' ', 'a' };
        int int14 = reader9.read(charArray13);
        int int15 = extendedBufferedReader6.read(charArray13);
        long long17 = extendedBufferedReader6.skip(10L);
        int int18 = extendedBufferedReader6.lookAhead();
        java.util.stream.Stream<java.lang.String> strStream19 = extendedBufferedReader6.lines();
        long long21 = extendedBufferedReader6.skip(0L);
        java.util.stream.Stream<java.lang.String> strStream22 = extendedBufferedReader6.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int25 = extendedBufferedReader24.lookAhead();
        extendedBufferedReader24.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strStream19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(strStream22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        extendedBufferedReader6.mark((int) (short) 0);
        java.util.stream.Stream<java.lang.String> strStream13 = extendedBufferedReader6.lines();
        extendedBufferedReader6.mark(0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        long long18 = extendedBufferedReader16.skip((long) (byte) 10);
        java.io.Reader reader19 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader19);
        boolean boolean21 = extendedBufferedReader20.markSupported();
        long long23 = extendedBufferedReader20.skip((long) '#');
        char[] charArray29 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int30 = extendedBufferedReader20.read(charArray29);
        int int31 = extendedBufferedReader20.getLineNumber();
        java.io.Reader reader32 = java.io.Reader.nullReader();
        char[] charArray36 = new char[] { '4', ' ', 'a' };
        int int37 = reader32.read(charArray36);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader38 = new org.apache.commons.csv.ExtendedBufferedReader(reader32);
        java.util.stream.Stream<java.lang.String> strStream39 = extendedBufferedReader38.lines();
        int int40 = extendedBufferedReader38.readAgain();
        int int41 = extendedBufferedReader38.lookAhead();
        int int42 = extendedBufferedReader38.lookAhead();
        long long44 = extendedBufferedReader38.skip(0L);
        extendedBufferedReader38.mark((int) (byte) 1);
        java.io.Reader reader47 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader48 = new org.apache.commons.csv.ExtendedBufferedReader(reader47);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader49 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader48);
        int int50 = extendedBufferedReader49.read();
        java.io.Reader reader51 = java.io.Reader.nullReader();
        char[] charArray55 = new char[] { '4', ' ', 'a' };
        int int56 = reader51.read(charArray55);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader57 = new org.apache.commons.csv.ExtendedBufferedReader(reader51);
        int int58 = extendedBufferedReader57.lookAhead();
        java.lang.String str59 = extendedBufferedReader57.readLine();
        int int60 = extendedBufferedReader57.lookAhead();
        java.io.Reader reader61 = java.io.Reader.nullReader();
        char[] charArray65 = new char[] { '4', ' ', 'a' };
        int int66 = reader61.read(charArray65);
        char[] charArray72 = new char[] { '4', ' ', '#', '4', ' ' };
        int int73 = reader61.read(charArray72);
        int int74 = extendedBufferedReader57.read(charArray72);
        java.io.Reader reader75 = java.io.Reader.nullReader();
        char[] charArray79 = new char[] { '4', ' ', 'a' };
        int int80 = reader75.read(charArray79);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader81 = new org.apache.commons.csv.ExtendedBufferedReader(reader75);
        int int82 = extendedBufferedReader81.lookAhead();
        boolean boolean83 = extendedBufferedReader81.markSupported();
        java.io.Reader reader84 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader85 = new org.apache.commons.csv.ExtendedBufferedReader(reader84);
        char[] charArray87 = new char[] { ' ' };
        int int88 = reader84.read(charArray87);
        int int89 = extendedBufferedReader81.read(charArray87);
        int int90 = extendedBufferedReader57.read(charArray87);
        int int91 = extendedBufferedReader49.read(charArray87);
        int int92 = extendedBufferedReader38.read(charArray87);
        int int95 = extendedBufferedReader20.read(charArray87, (int) '4', 0);
        int int96 = extendedBufferedReader16.read(charArray87);
        int int97 = extendedBufferedReader16.getLineNumber();
        extendedBufferedReader16.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(reader19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(reader32);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strStream39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-2) + "'", int40 == (-2));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(reader47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(reader51);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(reader61);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(reader75);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(reader84);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertArrayEquals(charArray87, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        java.util.stream.Stream<java.lang.String> strStream5 = extendedBufferedReader1.lines();
        extendedBufferedReader1.mark(0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] { '4', ' ', 'a' };
        int int14 = reader9.read(charArray13);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        int int16 = extendedBufferedReader15.lookAhead();
        int int17 = extendedBufferedReader15.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader15);
        int int19 = extendedBufferedReader18.read();
        int int20 = extendedBufferedReader18.readAgain();
        long long22 = extendedBufferedReader18.skip((long) 10);
        java.io.Reader reader23 = java.io.Reader.nullReader();
        char[] charArray27 = new char[] { '4', ' ', 'a' };
        int int28 = reader23.read(charArray27);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader29 = new org.apache.commons.csv.ExtendedBufferedReader(reader23);
        int int30 = extendedBufferedReader29.lookAhead();
        java.lang.String str31 = extendedBufferedReader29.readLine();
        extendedBufferedReader29.reset();
        int int33 = extendedBufferedReader29.getLineNumber();
        char[] charArray40 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int41 = extendedBufferedReader29.read(charArray40);
        int int42 = extendedBufferedReader18.read(charArray40);
        int int43 = extendedBufferedReader1.read(charArray40);
        java.io.Reader reader44 = java.io.Reader.nullReader();
        char[] charArray48 = new char[] { '4', ' ', 'a' };
        int int49 = reader44.read(charArray48);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader50 = new org.apache.commons.csv.ExtendedBufferedReader(reader44);
        int int51 = extendedBufferedReader50.lookAhead();
        java.lang.String str52 = extendedBufferedReader50.readLine();
        int int53 = extendedBufferedReader50.lookAhead();
        java.io.Reader reader54 = java.io.Reader.nullReader();
        char[] charArray58 = new char[] { '4', ' ', 'a' };
        int int59 = reader54.read(charArray58);
        char[] charArray65 = new char[] { '4', ' ', '#', '4', ' ' };
        int int66 = reader54.read(charArray65);
        int int67 = extendedBufferedReader50.read(charArray65);
        java.io.Reader reader68 = java.io.Reader.nullReader();
        char[] charArray72 = new char[] { '4', ' ', 'a' };
        int int73 = reader68.read(charArray72);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader74 = new org.apache.commons.csv.ExtendedBufferedReader(reader68);
        int int75 = extendedBufferedReader74.lookAhead();
        boolean boolean76 = extendedBufferedReader74.markSupported();
        java.io.Reader reader77 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader78 = new org.apache.commons.csv.ExtendedBufferedReader(reader77);
        char[] charArray80 = new char[] { ' ' };
        int int81 = reader77.read(charArray80);
        int int82 = extendedBufferedReader74.read(charArray80);
        int int83 = extendedBufferedReader50.read(charArray80);
        int int86 = extendedBufferedReader1.read(charArray80, (int) (byte) 0, (int) (byte) 1);
        int int87 = extendedBufferedReader1.readAgain();
        java.nio.CharBuffer charBuffer88 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int89 = extendedBufferedReader1.read(charBuffer88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(reader23);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(reader44);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(reader54);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(reader68);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(reader77);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        char[] charArray10 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int11 = extendedBufferedReader1.read(charArray10);
        int int12 = extendedBufferedReader1.lookAhead();
        boolean boolean13 = extendedBufferedReader1.markSupported();
        int int14 = extendedBufferedReader1.readAgain();
        int int15 = extendedBufferedReader1.lookAhead();
        int int16 = extendedBufferedReader1.readAgain();
        long long18 = extendedBufferedReader1.skip((long) (byte) 100);
        java.lang.String str19 = extendedBufferedReader1.readLine();
        extendedBufferedReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = extendedBufferedReader1.lookAhead();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        long long11 = extendedBufferedReader6.skip((long) (byte) 10);
        extendedBufferedReader6.reset();
        int int13 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader14);
        java.lang.String str16 = extendedBufferedReader14.readLine();
        java.nio.CharBuffer charBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedBufferedReader14.read(charBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        java.util.stream.Stream<java.lang.String> strStream11 = extendedBufferedReader6.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int13 = extendedBufferedReader12.getLineNumber();
        extendedBufferedReader12.mark((int) '#');
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int3 = extendedBufferedReader2.read();
        extendedBufferedReader2.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader2);
        java.util.stream.Stream<java.lang.String> strStream6 = extendedBufferedReader5.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader5);
        extendedBufferedReader7.mark((int) (byte) 0);
        boolean boolean10 = extendedBufferedReader7.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream12 = extendedBufferedReader6.lines();
        extendedBufferedReader6.mark((int) (short) 10);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.reset();
        int int17 = extendedBufferedReader6.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.lookAhead();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        java.io.Reader reader11 = java.io.Reader.nullReader();
        char[] charArray15 = new char[] { '4', ' ', 'a' };
        int int16 = reader11.read(charArray15);
        char[] charArray22 = new char[] { '4', ' ', '#', '4', ' ' };
        int int23 = reader11.read(charArray22);
        int int24 = extendedBufferedReader6.read(charArray22);
        int int25 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.mark(1);
        extendedBufferedReader6.mark(0);
        boolean boolean30 = extendedBufferedReader6.markSupported();
        extendedBufferedReader6.mark((int) (byte) 10);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10);
        extendedBufferedReader10.mark(10);
        java.io.Reader reader14 = java.io.Reader.nullReader();
        char[] charArray18 = new char[] { '4', ' ', 'a' };
        int int19 = reader14.read(charArray18);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        int int21 = extendedBufferedReader20.lookAhead();
        java.lang.String str22 = extendedBufferedReader20.readLine();
        extendedBufferedReader20.reset();
        int int24 = extendedBufferedReader20.getLineNumber();
        java.io.Reader reader25 = java.io.Reader.nullReader();
        char[] charArray29 = new char[] { '4', ' ', 'a' };
        int int30 = reader25.read(charArray29);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader31 = new org.apache.commons.csv.ExtendedBufferedReader(reader25);
        int int32 = extendedBufferedReader31.lookAhead();
        int int33 = extendedBufferedReader31.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader34 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader31);
        int int35 = extendedBufferedReader34.read();
        java.util.stream.Stream<java.lang.String> strStream36 = extendedBufferedReader34.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader37 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader34);
        java.io.Reader reader38 = java.io.Reader.nullReader();
        char[] charArray42 = new char[] { '4', ' ', 'a' };
        int int43 = reader38.read(charArray42);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader44 = new org.apache.commons.csv.ExtendedBufferedReader(reader38);
        int int45 = extendedBufferedReader44.lookAhead();
        boolean boolean46 = extendedBufferedReader44.markSupported();
        java.io.Reader reader47 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader48 = new org.apache.commons.csv.ExtendedBufferedReader(reader47);
        char[] charArray50 = new char[] { ' ' };
        int int51 = reader47.read(charArray50);
        int int52 = extendedBufferedReader44.read(charArray50);
        int int53 = extendedBufferedReader34.read(charArray50);
        int int54 = extendedBufferedReader20.read(charArray50);
        java.io.Reader reader55 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader56 = new org.apache.commons.csv.ExtendedBufferedReader(reader55);
        boolean boolean57 = extendedBufferedReader56.markSupported();
        long long59 = extendedBufferedReader56.skip((long) '#');
        char[] charArray65 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int66 = extendedBufferedReader56.read(charArray65);
        int int67 = extendedBufferedReader20.read(charArray65);
        int int68 = extendedBufferedReader10.read(charArray65);
        java.lang.String str69 = extendedBufferedReader10.readLine();
        extendedBufferedReader10.mark((int) (short) 1);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strStream36);
        org.junit.Assert.assertNotNull(reader38);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(reader47);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(reader55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.read();
        java.util.stream.Stream<java.lang.String> strStream11 = extendedBufferedReader9.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] { '4', ' ', 'a' };
        int int18 = reader13.read(charArray17);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader(reader13);
        int int20 = extendedBufferedReader19.lookAhead();
        boolean boolean21 = extendedBufferedReader19.markSupported();
        java.io.Reader reader22 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader(reader22);
        char[] charArray25 = new char[] { ' ' };
        int int26 = reader22.read(charArray25);
        int int27 = extendedBufferedReader19.read(charArray25);
        int int28 = extendedBufferedReader9.read(charArray25);
        extendedBufferedReader9.mark(10);
        int int31 = extendedBufferedReader9.lookAhead();
        extendedBufferedReader9.mark((int) (short) 0);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(reader22);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        char[] charArray10 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int11 = extendedBufferedReader1.read(charArray10);
        int int12 = extendedBufferedReader1.lookAhead();
        boolean boolean13 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.mark((int) (byte) 100);
        int int16 = extendedBufferedReader1.read();
        int int17 = extendedBufferedReader1.readAgain();
        int int18 = extendedBufferedReader1.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int20 = extendedBufferedReader19.read();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        int int11 = extendedBufferedReader10.getLineNumber();
        extendedBufferedReader10.close();
        int int13 = extendedBufferedReader10.readAgain();
        boolean boolean14 = extendedBufferedReader10.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = extendedBufferedReader10.skip((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: skip value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.lookAhead();
        int int10 = extendedBufferedReader6.lookAhead();
        long long12 = extendedBufferedReader6.skip(0L);
        extendedBufferedReader6.mark((int) (byte) 1);
        extendedBufferedReader6.mark(0);
        java.nio.CharBuffer charBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedBufferedReader6.read(charBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int11 = extendedBufferedReader6.readAgain();
        java.io.Reader reader12 = java.io.Reader.nullReader();
        char[] charArray16 = new char[] { '4', ' ', 'a' };
        int int17 = reader12.read(charArray16);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader(reader12);
        int int19 = extendedBufferedReader18.lookAhead();
        int int20 = extendedBufferedReader18.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader18);
        extendedBufferedReader18.reset();
        extendedBufferedReader18.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader18);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader24);
        java.util.stream.Stream<java.lang.String> strStream26 = extendedBufferedReader24.lines();
        java.io.Reader reader27 = java.io.Reader.nullReader();
        char[] charArray31 = new char[] { '4', ' ', 'a' };
        int int32 = reader27.read(charArray31);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader33 = new org.apache.commons.csv.ExtendedBufferedReader(reader27);
        int int34 = extendedBufferedReader33.lookAhead();
        java.lang.String str35 = extendedBufferedReader33.readLine();
        int int36 = extendedBufferedReader33.lookAhead();
        extendedBufferedReader33.reset();
        int int38 = extendedBufferedReader33.getLineNumber();
        java.io.Reader reader39 = java.io.Reader.nullReader();
        char[] charArray43 = new char[] { '4', ' ', 'a' };
        int int44 = reader39.read(charArray43);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader45 = new org.apache.commons.csv.ExtendedBufferedReader(reader39);
        int int46 = extendedBufferedReader45.lookAhead();
        int int47 = extendedBufferedReader45.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader48 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader45);
        int int49 = extendedBufferedReader45.lookAhead();
        java.io.Reader reader50 = java.io.Reader.nullReader();
        char[] charArray54 = new char[] { '4', ' ', 'a' };
        int int55 = reader50.read(charArray54);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader56 = new org.apache.commons.csv.ExtendedBufferedReader(reader50);
        int int57 = extendedBufferedReader56.lookAhead();
        java.lang.String str58 = extendedBufferedReader56.readLine();
        java.io.Reader reader59 = java.io.Reader.nullReader();
        char[] charArray63 = new char[] { '4', ' ', 'a' };
        int int64 = reader59.read(charArray63);
        int int65 = extendedBufferedReader56.read(charArray63);
        int int66 = extendedBufferedReader45.read(charArray63);
        int int67 = extendedBufferedReader33.read(charArray63);
        int int68 = extendedBufferedReader24.read(charArray63);
        int int69 = extendedBufferedReader6.read(charArray63);
        java.lang.String str70 = extendedBufferedReader6.readLine();
        extendedBufferedReader6.reset();
        int int72 = extendedBufferedReader6.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strStream26);
        org.junit.Assert.assertNotNull(reader27);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(reader39);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(reader50);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(reader59);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] { '4', ' ', 'a' };
        int int14 = reader9.read(charArray13);
        int int15 = extendedBufferedReader6.read(charArray13);
        long long17 = extendedBufferedReader6.skip(10L);
        int int18 = extendedBufferedReader6.lookAhead();
        java.util.stream.Stream<java.lang.String> strStream19 = extendedBufferedReader6.lines();
        extendedBufferedReader6.reset();
        java.lang.String str21 = extendedBufferedReader6.readLine();
        int int22 = extendedBufferedReader6.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.util.stream.Stream<java.lang.String> strStream24 = extendedBufferedReader23.lines();
        int int25 = extendedBufferedReader23.lookAhead();
        long long27 = extendedBufferedReader23.skip(0L);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strStream19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strStream24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.lang.String str11 = extendedBufferedReader10.readLine();
        int int12 = extendedBufferedReader10.lookAhead();
        int int13 = extendedBufferedReader10.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10);
        extendedBufferedReader10.close();
        int int16 = extendedBufferedReader10.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.lang.String str3 = extendedBufferedReader1.readLine();
        int int4 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.close();
        java.io.Reader reader6 = java.io.Reader.nullReader();
        char[] charArray10 = new char[] { '4', ' ', 'a' };
        int int11 = reader6.read(charArray10);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader6);
        int int13 = extendedBufferedReader12.lookAhead();
        java.lang.String str14 = extendedBufferedReader12.readLine();
        java.lang.String str15 = extendedBufferedReader12.readLine();
        boolean boolean16 = extendedBufferedReader12.markSupported();
        int int17 = extendedBufferedReader12.readAgain();
        int int18 = extendedBufferedReader12.read();
        java.util.stream.Stream<java.lang.String> strStream19 = extendedBufferedReader12.lines();
        int int20 = extendedBufferedReader12.getLineNumber();
        int int21 = extendedBufferedReader12.read();
        extendedBufferedReader12.reset();
        java.util.stream.Stream<java.lang.String> strStream23 = extendedBufferedReader12.lines();
        java.util.stream.Stream<java.lang.String> strStream24 = extendedBufferedReader12.lines();
        java.io.Reader reader25 = java.io.Reader.nullReader();
        char[] charArray29 = new char[] { '4', ' ', 'a' };
        int int30 = reader25.read(charArray29);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader31 = new org.apache.commons.csv.ExtendedBufferedReader(reader25);
        int int32 = extendedBufferedReader31.lookAhead();
        java.lang.String str33 = extendedBufferedReader31.readLine();
        java.lang.String str34 = extendedBufferedReader31.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader35 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader31);
        int int36 = extendedBufferedReader31.readAgain();
        boolean boolean37 = extendedBufferedReader31.markSupported();
        int int38 = extendedBufferedReader31.getLineNumber();
        extendedBufferedReader31.mark((int) (short) 0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader41 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader31);
        java.io.Reader reader42 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader43 = new org.apache.commons.csv.ExtendedBufferedReader(reader42);
        boolean boolean44 = extendedBufferedReader43.markSupported();
        long long46 = extendedBufferedReader43.skip((long) '#');
        java.util.stream.Stream<java.lang.String> strStream47 = extendedBufferedReader43.lines();
        extendedBufferedReader43.mark(0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader50 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader43);
        java.io.Reader reader51 = java.io.Reader.nullReader();
        char[] charArray55 = new char[] { '4', ' ', 'a' };
        int int56 = reader51.read(charArray55);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader57 = new org.apache.commons.csv.ExtendedBufferedReader(reader51);
        int int58 = extendedBufferedReader57.lookAhead();
        java.lang.String str59 = extendedBufferedReader57.readLine();
        extendedBufferedReader57.reset();
        int int61 = extendedBufferedReader57.getLineNumber();
        java.io.Reader reader62 = java.io.Reader.nullReader();
        char[] charArray66 = new char[] { '4', ' ', 'a' };
        int int67 = reader62.read(charArray66);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader68 = new org.apache.commons.csv.ExtendedBufferedReader(reader62);
        int int69 = extendedBufferedReader68.lookAhead();
        int int70 = extendedBufferedReader68.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader71 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader68);
        int int72 = extendedBufferedReader71.read();
        java.util.stream.Stream<java.lang.String> strStream73 = extendedBufferedReader71.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader74 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader71);
        java.io.Reader reader75 = java.io.Reader.nullReader();
        char[] charArray79 = new char[] { '4', ' ', 'a' };
        int int80 = reader75.read(charArray79);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader81 = new org.apache.commons.csv.ExtendedBufferedReader(reader75);
        int int82 = extendedBufferedReader81.lookAhead();
        boolean boolean83 = extendedBufferedReader81.markSupported();
        java.io.Reader reader84 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader85 = new org.apache.commons.csv.ExtendedBufferedReader(reader84);
        char[] charArray87 = new char[] { ' ' };
        int int88 = reader84.read(charArray87);
        int int89 = extendedBufferedReader81.read(charArray87);
        int int90 = extendedBufferedReader71.read(charArray87);
        int int91 = extendedBufferedReader57.read(charArray87);
        int int92 = extendedBufferedReader50.read(charArray87);
        int int93 = extendedBufferedReader31.read(charArray87);
        int int94 = extendedBufferedReader12.read(charArray87);
        // The following exception was thrown during execution in test generation
        try {
            int int95 = extendedBufferedReader1.read(charArray87);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strStream19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strStream23);
        org.junit.Assert.assertNotNull(strStream24);
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(reader42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(strStream47);
        org.junit.Assert.assertNotNull(reader51);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(reader62);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(strStream73);
        org.junit.Assert.assertNotNull(reader75);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(reader84);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertArrayEquals(charArray87, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.read();
        java.util.stream.Stream<java.lang.String> strStream11 = extendedBufferedReader9.lines();
        int int12 = extendedBufferedReader9.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        java.io.Reader reader14 = java.io.Reader.nullReader();
        char[] charArray18 = new char[] { '4', ' ', 'a' };
        int int19 = reader14.read(charArray18);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        int int21 = extendedBufferedReader20.lookAhead();
        java.lang.String str22 = extendedBufferedReader20.readLine();
        extendedBufferedReader20.reset();
        int int24 = extendedBufferedReader20.getLineNumber();
        char[] charArray31 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int32 = extendedBufferedReader20.read(charArray31);
        int int33 = extendedBufferedReader9.read(charArray31);
        long long35 = extendedBufferedReader9.skip(1L);
        int int36 = extendedBufferedReader9.getLineNumber();
        int int37 = extendedBufferedReader9.readAgain();
        int int38 = extendedBufferedReader9.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream12 = extendedBufferedReader6.lines();
        extendedBufferedReader6.mark((int) (short) 10);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.mark(10);
        boolean boolean18 = extendedBufferedReader6.markSupported();
        extendedBufferedReader6.mark(100);
        int int21 = extendedBufferedReader6.readAgain();
        extendedBufferedReader6.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.nio.CharBuffer charBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = extendedBufferedReader6.read(charBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.lang.String str7 = extendedBufferedReader6.readLine();
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray12 = new char[] { '4', ' ', 'a' };
        int int13 = reader8.read(charArray12);
        char[] charArray19 = new char[] { '4', ' ', '#', '4', ' ' };
        int int20 = reader8.read(charArray19);
        java.io.Reader reader21 = java.io.Reader.nullReader();
        char[] charArray25 = new char[] { '4', ' ', 'a' };
        int int26 = reader21.read(charArray25);
        char[] charArray32 = new char[] { '4', ' ', '#', '4', ' ' };
        int int33 = reader21.read(charArray32);
        int int34 = reader8.read(charArray32);
        int int35 = extendedBufferedReader6.read(charArray32);
        extendedBufferedReader6.close();
        int int37 = extendedBufferedReader6.readAgain();
        java.io.Writer writer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long39 = extendedBufferedReader6.transferTo(writer38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(reader21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        int int9 = extendedBufferedReader6.lookAhead();
        java.io.Reader reader10 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', ' ', 'a' };
        int int15 = reader10.read(charArray14);
        char[] charArray21 = new char[] { '4', ' ', '#', '4', ' ' };
        int int22 = reader10.read(charArray21);
        int int23 = extendedBufferedReader6.read(charArray21);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.lang.String str25 = extendedBufferedReader6.readLine();
        long long27 = extendedBufferedReader6.skip((long) (byte) 1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader28 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int29 = extendedBufferedReader6.lookAhead();
        int int30 = extendedBufferedReader6.read();
        extendedBufferedReader6.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader32 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.lang.String str33 = extendedBufferedReader6.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        int int9 = extendedBufferedReader6.lookAhead();
        java.io.Reader reader10 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', ' ', 'a' };
        int int15 = reader10.read(charArray14);
        char[] charArray21 = new char[] { '4', ' ', '#', '4', ' ' };
        int int22 = reader10.read(charArray21);
        int int23 = extendedBufferedReader6.read(charArray21);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.lang.String str25 = extendedBufferedReader6.readLine();
        long long27 = extendedBufferedReader6.skip((long) (byte) 1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader28 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        boolean boolean29 = extendedBufferedReader6.markSupported();
        int int30 = extendedBufferedReader6.readAgain();
        int int31 = extendedBufferedReader6.getLineNumber();
        java.lang.String str32 = extendedBufferedReader6.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        java.util.stream.Stream<java.lang.String> strStream5 = extendedBufferedReader1.lines();
        int int6 = extendedBufferedReader1.readAgain();
        int int7 = extendedBufferedReader1.lookAhead();
        boolean boolean8 = extendedBufferedReader1.markSupported();
        int int9 = extendedBufferedReader1.read();
        extendedBufferedReader1.reset();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        java.util.stream.Stream<java.lang.String> strStream3 = extendedBufferedReader1.lines();
        int int4 = extendedBufferedReader1.readAgain();
        int int5 = extendedBufferedReader1.lookAhead();
        extendedBufferedReader1.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean8 = extendedBufferedReader7.markSupported();
        java.util.stream.Stream<java.lang.String> strStream9 = extendedBufferedReader7.lines();
        extendedBufferedReader7.mark((int) (short) 100);
        java.nio.CharBuffer charBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = extendedBufferedReader7.read(charBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strStream9);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.read();
        int int11 = extendedBufferedReader9.readAgain();
        long long13 = extendedBufferedReader9.skip((long) 10);
        java.io.Reader reader14 = java.io.Reader.nullReader();
        char[] charArray18 = new char[] { '4', ' ', 'a' };
        int int19 = reader14.read(charArray18);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        int int21 = extendedBufferedReader20.lookAhead();
        java.lang.String str22 = extendedBufferedReader20.readLine();
        extendedBufferedReader20.reset();
        int int24 = extendedBufferedReader20.getLineNumber();
        char[] charArray31 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int32 = extendedBufferedReader20.read(charArray31);
        int int33 = extendedBufferedReader9.read(charArray31);
        java.util.stream.Stream<java.lang.String> strStream34 = extendedBufferedReader9.lines();
        int int35 = extendedBufferedReader9.getLineNumber();
        extendedBufferedReader9.mark(1);
        boolean boolean38 = extendedBufferedReader9.markSupported();
        boolean boolean39 = extendedBufferedReader9.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strStream34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        int int9 = extendedBufferedReader6.lookAhead();
        java.io.Reader reader10 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', ' ', 'a' };
        int int15 = reader10.read(charArray14);
        char[] charArray21 = new char[] { '4', ' ', '#', '4', ' ' };
        int int22 = reader10.read(charArray21);
        int int23 = extendedBufferedReader6.read(charArray21);
        java.io.Reader reader24 = java.io.Reader.nullReader();
        char[] charArray28 = new char[] { '4', ' ', 'a' };
        int int29 = reader24.read(charArray28);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader30 = new org.apache.commons.csv.ExtendedBufferedReader(reader24);
        int int31 = extendedBufferedReader30.lookAhead();
        boolean boolean32 = extendedBufferedReader30.markSupported();
        java.io.Reader reader33 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader34 = new org.apache.commons.csv.ExtendedBufferedReader(reader33);
        char[] charArray36 = new char[] { ' ' };
        int int37 = reader33.read(charArray36);
        int int38 = extendedBufferedReader30.read(charArray36);
        int int39 = extendedBufferedReader6.read(charArray36);
        int int40 = extendedBufferedReader6.read();
        extendedBufferedReader6.close();
        boolean boolean42 = extendedBufferedReader6.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(reader24);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(reader33);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        boolean boolean8 = extendedBufferedReader6.markSupported();
        java.io.Reader reader9 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        char[] charArray12 = new char[] { ' ' };
        int int13 = reader9.read(charArray12);
        int int14 = extendedBufferedReader6.read(charArray12);
        java.util.stream.Stream<java.lang.String> strStream15 = extendedBufferedReader6.lines();
        int int16 = extendedBufferedReader6.getLineNumber();
        java.nio.CharBuffer charBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedBufferedReader6.read(charBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        int int12 = extendedBufferedReader6.getLineNumber();
        int int13 = extendedBufferedReader6.readAgain();
        boolean boolean14 = extendedBufferedReader6.markSupported();
        int int15 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.lang.String str17 = extendedBufferedReader16.readLine();
        int int18 = extendedBufferedReader16.lookAhead();
        boolean boolean19 = extendedBufferedReader16.markSupported();
        int int20 = extendedBufferedReader16.read();
        boolean boolean21 = extendedBufferedReader16.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        char[] charArray10 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int11 = extendedBufferedReader1.read(charArray10);
        int int12 = extendedBufferedReader1.lookAhead();
        java.lang.String str13 = extendedBufferedReader1.readLine();
        int int14 = extendedBufferedReader1.lookAhead();
        java.lang.String str15 = extendedBufferedReader1.readLine();
        extendedBufferedReader1.reset();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.mark((int) (short) 1);
        boolean boolean10 = extendedBufferedReader6.markSupported();
        java.lang.String str11 = extendedBufferedReader6.readLine();
        int int12 = extendedBufferedReader6.read();
        long long14 = extendedBufferedReader6.skip(1L);
        extendedBufferedReader6.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.getLineNumber();
        java.io.Reader reader11 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        char[] charArray14 = new char[] { ' ' };
        int int15 = reader11.read(charArray14);
        int int16 = extendedBufferedReader9.read(charArray14);
        boolean boolean17 = extendedBufferedReader9.markSupported();
        java.util.stream.Stream<java.lang.String> strStream18 = extendedBufferedReader9.lines();
        int int19 = extendedBufferedReader9.readAgain();
        int int20 = extendedBufferedReader9.read();
        int int21 = extendedBufferedReader9.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = extendedBufferedReader9.skip((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: skip value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.lang.String str11 = extendedBufferedReader10.readLine();
        int int12 = extendedBufferedReader10.lookAhead();
        int int13 = extendedBufferedReader10.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10);
        int int15 = extendedBufferedReader14.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader14);
        int int17 = extendedBufferedReader14.read();
        boolean boolean18 = extendedBufferedReader14.markSupported();
        extendedBufferedReader14.mark(1);
        java.lang.String str21 = extendedBufferedReader14.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        char[] charArray10 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int11 = extendedBufferedReader1.read(charArray10);
        int int12 = extendedBufferedReader1.lookAhead();
        boolean boolean13 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.mark((int) (byte) 100);
        int int16 = extendedBufferedReader1.read();
        int int17 = extendedBufferedReader1.readAgain();
        int int18 = extendedBufferedReader1.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        char[] charArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = extendedBufferedReader1.read(charArray20, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.lookAhead();
        int int10 = extendedBufferedReader6.lookAhead();
        int int11 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.mark(0);
        extendedBufferedReader6.mark((int) (byte) 10);
        boolean boolean16 = extendedBufferedReader6.markSupported();
        int int17 = extendedBufferedReader6.read();
        int int18 = extendedBufferedReader6.readAgain();
        int int19 = extendedBufferedReader6.readAgain();
        java.util.stream.Stream<java.lang.String> strStream20 = extendedBufferedReader6.lines();
        extendedBufferedReader6.mark((int) (byte) 100);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strStream20);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] { '4', ' ', 'a' };
        int int14 = reader9.read(charArray13);
        int int15 = extendedBufferedReader6.read(charArray13);
        int int16 = extendedBufferedReader6.readAgain();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader17);
        java.io.Reader reader19 = java.io.Reader.nullReader();
        char[] charArray23 = new char[] { '4', ' ', 'a' };
        int int24 = reader19.read(charArray23);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader(reader19);
        int int26 = extendedBufferedReader25.lookAhead();
        int int27 = extendedBufferedReader25.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader28 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader25);
        int int29 = extendedBufferedReader28.read();
        int int30 = extendedBufferedReader28.readAgain();
        long long32 = extendedBufferedReader28.skip((long) 10);
        java.io.Reader reader33 = java.io.Reader.nullReader();
        char[] charArray37 = new char[] { '4', ' ', 'a' };
        int int38 = reader33.read(charArray37);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader39 = new org.apache.commons.csv.ExtendedBufferedReader(reader33);
        int int40 = extendedBufferedReader39.lookAhead();
        java.lang.String str41 = extendedBufferedReader39.readLine();
        extendedBufferedReader39.reset();
        int int43 = extendedBufferedReader39.getLineNumber();
        char[] charArray50 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int51 = extendedBufferedReader39.read(charArray50);
        int int52 = extendedBufferedReader28.read(charArray50);
        char[] charArray54 = new char[] { 'a' };
        int int57 = extendedBufferedReader28.read(charArray54, 1, 0);
        int int58 = extendedBufferedReader17.read(charArray54);
        long long60 = extendedBufferedReader17.skip((long) ' ');
        java.io.Reader reader61 = java.io.Reader.nullReader();
        java.io.Reader reader62 = java.io.Reader.nullReader();
        char[] charArray66 = new char[] { '4', ' ', 'a' };
        int int67 = reader62.read(charArray66);
        char[] charArray73 = new char[] { '4', ' ', '#', '4', ' ' };
        int int74 = reader62.read(charArray73);
        java.io.Reader reader75 = java.io.Reader.nullReader();
        char[] charArray79 = new char[] { '4', ' ', 'a' };
        int int80 = reader75.read(charArray79);
        char[] charArray86 = new char[] { '4', ' ', '#', '4', ' ' };
        int int87 = reader75.read(charArray86);
        int int88 = reader62.read(charArray86);
        int int89 = reader61.read(charArray86);
        int int92 = extendedBufferedReader17.read(charArray86, (int) (byte) 10, (int) (short) 0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader93 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader17);
        extendedBufferedReader93.close();
        java.util.stream.Stream<java.lang.String> strStream95 = extendedBufferedReader93.lines();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(reader19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(reader33);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(reader61);
        org.junit.Assert.assertNotNull(reader62);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(reader75);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertArrayEquals(charArray86, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(strStream95);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        int int12 = extendedBufferedReader6.readAgain();
        int int13 = extendedBufferedReader6.readAgain();
        int int14 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.reset();
        int int16 = extendedBufferedReader6.lookAhead();
        int int17 = extendedBufferedReader6.readAgain();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        boolean boolean11 = extendedBufferedReader10.markSupported();
        boolean boolean12 = extendedBufferedReader10.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader13);
        java.util.stream.Stream<java.lang.String> strStream15 = extendedBufferedReader13.lines();
        int int16 = extendedBufferedReader13.readAgain();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] { '4', ' ', 'a' };
        int int14 = reader9.read(charArray13);
        int int15 = extendedBufferedReader6.read(charArray13);
        int int16 = extendedBufferedReader6.readAgain();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader17);
        int int19 = extendedBufferedReader17.read();
        java.io.Reader reader20 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', ' ', 'a' };
        int int25 = reader20.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader26 = new org.apache.commons.csv.ExtendedBufferedReader(reader20);
        int int27 = extendedBufferedReader26.lookAhead();
        java.lang.String str28 = extendedBufferedReader26.readLine();
        java.lang.String str29 = extendedBufferedReader26.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader30 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader26);
        int int31 = extendedBufferedReader26.readAgain();
        boolean boolean32 = extendedBufferedReader26.markSupported();
        int int33 = extendedBufferedReader26.getLineNumber();
        extendedBufferedReader26.mark((int) (short) 0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader36 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader26);
        java.io.Reader reader37 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader38 = new org.apache.commons.csv.ExtendedBufferedReader(reader37);
        boolean boolean39 = extendedBufferedReader38.markSupported();
        long long41 = extendedBufferedReader38.skip((long) '#');
        java.util.stream.Stream<java.lang.String> strStream42 = extendedBufferedReader38.lines();
        extendedBufferedReader38.mark(0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader45 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader38);
        java.io.Reader reader46 = java.io.Reader.nullReader();
        char[] charArray50 = new char[] { '4', ' ', 'a' };
        int int51 = reader46.read(charArray50);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader52 = new org.apache.commons.csv.ExtendedBufferedReader(reader46);
        int int53 = extendedBufferedReader52.lookAhead();
        java.lang.String str54 = extendedBufferedReader52.readLine();
        extendedBufferedReader52.reset();
        int int56 = extendedBufferedReader52.getLineNumber();
        java.io.Reader reader57 = java.io.Reader.nullReader();
        char[] charArray61 = new char[] { '4', ' ', 'a' };
        int int62 = reader57.read(charArray61);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader63 = new org.apache.commons.csv.ExtendedBufferedReader(reader57);
        int int64 = extendedBufferedReader63.lookAhead();
        int int65 = extendedBufferedReader63.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader66 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader63);
        int int67 = extendedBufferedReader66.read();
        java.util.stream.Stream<java.lang.String> strStream68 = extendedBufferedReader66.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader69 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader66);
        java.io.Reader reader70 = java.io.Reader.nullReader();
        char[] charArray74 = new char[] { '4', ' ', 'a' };
        int int75 = reader70.read(charArray74);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader76 = new org.apache.commons.csv.ExtendedBufferedReader(reader70);
        int int77 = extendedBufferedReader76.lookAhead();
        boolean boolean78 = extendedBufferedReader76.markSupported();
        java.io.Reader reader79 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader80 = new org.apache.commons.csv.ExtendedBufferedReader(reader79);
        char[] charArray82 = new char[] { ' ' };
        int int83 = reader79.read(charArray82);
        int int84 = extendedBufferedReader76.read(charArray82);
        int int85 = extendedBufferedReader66.read(charArray82);
        int int86 = extendedBufferedReader52.read(charArray82);
        int int87 = extendedBufferedReader45.read(charArray82);
        int int88 = extendedBufferedReader26.read(charArray82);
        int int89 = extendedBufferedReader17.read(charArray82);
        int int90 = extendedBufferedReader17.readAgain();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(reader20);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(reader37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(strStream42);
        org.junit.Assert.assertNotNull(reader46);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(reader57);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(strStream68);
        org.junit.Assert.assertNotNull(reader70);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(reader79);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertArrayEquals(charArray82, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.mark((int) '#');
        java.lang.String str12 = extendedBufferedReader6.readLine();
        int int13 = extendedBufferedReader6.getLineNumber();
        java.lang.String str14 = extendedBufferedReader6.readLine();
        long long16 = extendedBufferedReader6.skip((long) ' ');
        extendedBufferedReader6.mark((int) (short) 0);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.reset();
        extendedBufferedReader6.mark((int) (byte) 10);
        int int14 = extendedBufferedReader6.read();
        extendedBufferedReader6.mark((int) '4');
        int int17 = extendedBufferedReader6.read();
        int int18 = extendedBufferedReader6.read();
        extendedBufferedReader6.reset();
        java.io.Reader reader20 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', ' ', 'a' };
        int int25 = reader20.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader26 = new org.apache.commons.csv.ExtendedBufferedReader(reader20);
        java.util.stream.Stream<java.lang.String> strStream27 = extendedBufferedReader26.lines();
        int int28 = extendedBufferedReader26.readAgain();
        int int29 = extendedBufferedReader26.lookAhead();
        int int30 = extendedBufferedReader26.lookAhead();
        int int31 = extendedBufferedReader26.lookAhead();
        extendedBufferedReader26.mark(0);
        java.util.stream.Stream<java.lang.String> strStream34 = extendedBufferedReader26.lines();
        int int35 = extendedBufferedReader26.getLineNumber();
        java.lang.String str36 = extendedBufferedReader26.readLine();
        java.io.Reader reader37 = java.io.Reader.nullReader();
        char[] charArray41 = new char[] { '4', ' ', 'a' };
        int int42 = reader37.read(charArray41);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader43 = new org.apache.commons.csv.ExtendedBufferedReader(reader37);
        int int44 = extendedBufferedReader43.lookAhead();
        int int45 = extendedBufferedReader43.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader46 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader43);
        extendedBufferedReader43.mark((int) '#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader49 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader43);
        int int50 = extendedBufferedReader43.readAgain();
        int int51 = extendedBufferedReader43.getLineNumber();
        java.io.Reader reader52 = java.io.Reader.nullReader();
        char[] charArray56 = new char[] { '4', ' ', 'a' };
        int int57 = reader52.read(charArray56);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader58 = new org.apache.commons.csv.ExtendedBufferedReader(reader52);
        int int59 = extendedBufferedReader58.lookAhead();
        int int60 = extendedBufferedReader58.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader61 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader58);
        int int62 = extendedBufferedReader61.read();
        int int63 = extendedBufferedReader61.readAgain();
        long long65 = extendedBufferedReader61.skip((long) 10);
        java.io.Reader reader66 = java.io.Reader.nullReader();
        char[] charArray70 = new char[] { '4', ' ', 'a' };
        int int71 = reader66.read(charArray70);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader72 = new org.apache.commons.csv.ExtendedBufferedReader(reader66);
        int int73 = extendedBufferedReader72.lookAhead();
        java.lang.String str74 = extendedBufferedReader72.readLine();
        extendedBufferedReader72.reset();
        int int76 = extendedBufferedReader72.getLineNumber();
        char[] charArray83 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int84 = extendedBufferedReader72.read(charArray83);
        int int85 = extendedBufferedReader61.read(charArray83);
        int int86 = extendedBufferedReader43.read(charArray83);
        int int87 = extendedBufferedReader26.read(charArray83);
        int int88 = extendedBufferedReader6.read(charArray83);
        int int89 = extendedBufferedReader6.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(reader20);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strStream27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strStream34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(reader37);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-2) + "'", int50 == (-2));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(reader52);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(reader66);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertArrayEquals(charArray83, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        boolean boolean11 = extendedBufferedReader6.markSupported();
        int int12 = extendedBufferedReader6.read();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int11 = extendedBufferedReader6.readAgain();
        long long13 = extendedBufferedReader6.skip((long) (short) 100);
        extendedBufferedReader6.mark((int) (byte) 100);
        java.io.Reader reader16 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader17);
        int int19 = extendedBufferedReader17.read();
        java.lang.String str20 = extendedBufferedReader17.readLine();
        boolean boolean21 = extendedBufferedReader17.markSupported();
        java.io.Reader reader22 = java.io.Reader.nullReader();
        char[] charArray26 = new char[] { '4', ' ', 'a' };
        int int27 = reader22.read(charArray26);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader28 = new org.apache.commons.csv.ExtendedBufferedReader(reader22);
        int int29 = extendedBufferedReader28.lookAhead();
        java.lang.String str30 = extendedBufferedReader28.readLine();
        java.lang.String str31 = extendedBufferedReader28.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader32 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader28);
        int int33 = extendedBufferedReader28.readAgain();
        boolean boolean34 = extendedBufferedReader28.markSupported();
        int int35 = extendedBufferedReader28.readAgain();
        java.io.Reader reader36 = java.io.Reader.nullReader();
        char[] charArray40 = new char[] { '4', ' ', 'a' };
        int int41 = reader36.read(charArray40);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader42 = new org.apache.commons.csv.ExtendedBufferedReader(reader36);
        java.util.stream.Stream<java.lang.String> strStream43 = extendedBufferedReader42.lines();
        int int44 = extendedBufferedReader42.readAgain();
        int int45 = extendedBufferedReader42.lookAhead();
        int int46 = extendedBufferedReader42.lookAhead();
        int int47 = extendedBufferedReader42.lookAhead();
        java.io.Reader reader48 = java.io.Reader.nullReader();
        char[] charArray52 = new char[] { '4', ' ', 'a' };
        int int53 = reader48.read(charArray52);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader54 = new org.apache.commons.csv.ExtendedBufferedReader(reader48);
        java.lang.String str55 = extendedBufferedReader54.readLine();
        java.io.Reader reader56 = java.io.Reader.nullReader();
        char[] charArray60 = new char[] { '4', ' ', 'a' };
        int int61 = reader56.read(charArray60);
        char[] charArray67 = new char[] { '4', ' ', '#', '4', ' ' };
        int int68 = reader56.read(charArray67);
        java.io.Reader reader69 = java.io.Reader.nullReader();
        char[] charArray73 = new char[] { '4', ' ', 'a' };
        int int74 = reader69.read(charArray73);
        char[] charArray80 = new char[] { '4', ' ', '#', '4', ' ' };
        int int81 = reader69.read(charArray80);
        int int82 = reader56.read(charArray80);
        int int83 = extendedBufferedReader54.read(charArray80);
        int int84 = extendedBufferedReader42.read(charArray80);
        int int85 = extendedBufferedReader28.read(charArray80);
        int int86 = extendedBufferedReader17.read(charArray80);
        int int87 = extendedBufferedReader6.read(charArray80);
        java.nio.CharBuffer charBuffer88 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int89 = extendedBufferedReader6.read(charBuffer88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(reader22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(reader36);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strStream43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-2) + "'", int44 == (-2));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(reader48);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(reader56);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(reader69);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        java.util.stream.Stream<java.lang.String> strStream9 = extendedBufferedReader6.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int11 = extendedBufferedReader6.readAgain();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.reset();
        int int14 = extendedBufferedReader6.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.lang.String str7 = extendedBufferedReader6.readLine();
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray12 = new char[] { '4', ' ', 'a' };
        int int13 = reader8.read(charArray12);
        char[] charArray19 = new char[] { '4', ' ', '#', '4', ' ' };
        int int20 = reader8.read(charArray19);
        java.io.Reader reader21 = java.io.Reader.nullReader();
        char[] charArray25 = new char[] { '4', ' ', 'a' };
        int int26 = reader21.read(charArray25);
        char[] charArray32 = new char[] { '4', ' ', '#', '4', ' ' };
        int int33 = reader21.read(charArray32);
        int int34 = reader8.read(charArray32);
        int int35 = extendedBufferedReader6.read(charArray32);
        int int36 = extendedBufferedReader6.readAgain();
        boolean boolean37 = extendedBufferedReader6.markSupported();
        long long39 = extendedBufferedReader6.skip((long) (short) 100);
        int int40 = extendedBufferedReader6.lookAhead();
        int int41 = extendedBufferedReader6.readAgain();
        extendedBufferedReader6.reset();
        extendedBufferedReader6.mark((int) (short) 100);
        java.lang.String str45 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader46 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(reader21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        char[] charArray10 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int11 = extendedBufferedReader1.read(charArray10);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int13 = extendedBufferedReader1.lookAhead();
        int int14 = extendedBufferedReader1.readAgain();
        int int15 = extendedBufferedReader1.readAgain();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.lang.String str3 = extendedBufferedReader1.readLine();
        int int4 = extendedBufferedReader1.getLineNumber();
        int int5 = extendedBufferedReader1.getLineNumber();
        extendedBufferedReader1.close();
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = extendedBufferedReader1.transferTo(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        char[] charArray10 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int11 = extendedBufferedReader1.read(charArray10);
        int int12 = extendedBufferedReader1.lookAhead();
        java.lang.String str13 = extendedBufferedReader1.readLine();
        boolean boolean14 = extendedBufferedReader1.markSupported();
        int int15 = extendedBufferedReader1.readAgain();
        long long17 = extendedBufferedReader1.skip((long) (short) 100);
        java.lang.String str18 = extendedBufferedReader1.readLine();
        java.lang.String str19 = extendedBufferedReader1.readLine();
        java.util.stream.Stream<java.lang.String> strStream20 = extendedBufferedReader1.lines();
        int int21 = extendedBufferedReader1.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        char[] charArray11 = new char[] { '4', ' ', '#', '4', ' ' };
        int int12 = reader0.read(charArray11);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] { '4', ' ', 'a' };
        int int18 = reader13.read(charArray17);
        char[] charArray24 = new char[] { '4', ' ', '#', '4', ' ' };
        int int25 = reader13.read(charArray24);
        int int26 = reader0.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int28 = extendedBufferedReader27.getLineNumber();
        int int29 = extendedBufferedReader27.lookAhead();
        int int30 = extendedBufferedReader27.read();
        extendedBufferedReader27.mark((int) (byte) 1);
        java.lang.String str33 = extendedBufferedReader27.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader34 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader27);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.read();
        int int11 = extendedBufferedReader9.readAgain();
        long long13 = extendedBufferedReader9.skip((long) 10);
        java.io.Reader reader14 = java.io.Reader.nullReader();
        char[] charArray18 = new char[] { '4', ' ', 'a' };
        int int19 = reader14.read(charArray18);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        int int21 = extendedBufferedReader20.lookAhead();
        java.lang.String str22 = extendedBufferedReader20.readLine();
        extendedBufferedReader20.reset();
        int int24 = extendedBufferedReader20.getLineNumber();
        char[] charArray31 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int32 = extendedBufferedReader20.read(charArray31);
        int int33 = extendedBufferedReader9.read(charArray31);
        java.util.stream.Stream<java.lang.String> strStream34 = extendedBufferedReader9.lines();
        java.io.Reader reader35 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader36 = new org.apache.commons.csv.ExtendedBufferedReader(reader35);
        extendedBufferedReader36.close();
        extendedBufferedReader36.close();
        int int39 = extendedBufferedReader36.getLineNumber();
        java.io.Reader reader40 = java.io.Reader.nullReader();
        char[] charArray44 = new char[] { '4', ' ', 'a' };
        int int45 = reader40.read(charArray44);
        char[] charArray51 = new char[] { '4', ' ', '#', '4', ' ' };
        int int52 = reader40.read(charArray51);
        java.io.Reader reader53 = java.io.Reader.nullReader();
        char[] charArray57 = new char[] { '4', ' ', 'a' };
        int int58 = reader53.read(charArray57);
        char[] charArray64 = new char[] { '4', ' ', '#', '4', ' ' };
        int int65 = reader53.read(charArray64);
        int int66 = reader40.read(charArray64);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader67 = new org.apache.commons.csv.ExtendedBufferedReader(reader40);
        int int68 = extendedBufferedReader67.getLineNumber();
        int int69 = extendedBufferedReader67.lookAhead();
        int int70 = extendedBufferedReader67.read();
        extendedBufferedReader67.mark((int) (byte) 1);
        boolean boolean73 = extendedBufferedReader67.markSupported();
        java.io.Reader reader74 = java.io.Reader.nullReader();
        char[] charArray78 = new char[] { '4', ' ', 'a' };
        int int79 = reader74.read(charArray78);
        int int80 = extendedBufferedReader67.read(charArray78);
        int int83 = extendedBufferedReader36.read(charArray78, 0, 0);
        int int84 = extendedBufferedReader9.read(charArray78);
        int int85 = extendedBufferedReader9.readAgain();
        int int86 = extendedBufferedReader9.getLineNumber();
        int int87 = extendedBufferedReader9.getLineNumber();
        java.lang.Class<?> wildcardClass88 = extendedBufferedReader9.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strStream34);
        org.junit.Assert.assertNotNull(reader35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(reader40);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(reader53);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(reader74);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.lookAhead();
        int int10 = extendedBufferedReader6.lookAhead();
        int int11 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.mark(0);
        java.util.stream.Stream<java.lang.String> strStream14 = extendedBufferedReader6.lines();
        extendedBufferedReader6.reset();
        extendedBufferedReader6.mark((int) 'a');
        int int18 = extendedBufferedReader6.readAgain();
        java.io.Writer writer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = extendedBufferedReader6.transferTo(writer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        char[] charArray11 = new char[] { '4', ' ', '#', '4', ' ' };
        int int12 = reader0.read(charArray11);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] { '4', ' ', 'a' };
        int int18 = reader13.read(charArray17);
        char[] charArray24 = new char[] { '4', ' ', '#', '4', ' ' };
        int int25 = reader13.read(charArray24);
        int int26 = reader0.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader28 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.readAgain();
        int int12 = extendedBufferedReader6.read();
        java.util.stream.Stream<java.lang.String> strStream13 = extendedBufferedReader6.lines();
        int int14 = extendedBufferedReader6.lookAhead();
        java.io.Reader reader15 = java.io.Reader.nullReader();
        char[] charArray19 = new char[] { '4', ' ', 'a' };
        int int20 = reader15.read(charArray19);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = new org.apache.commons.csv.ExtendedBufferedReader(reader15);
        int int22 = extendedBufferedReader21.lookAhead();
        java.lang.String str23 = extendedBufferedReader21.readLine();
        java.io.Reader reader24 = java.io.Reader.nullReader();
        char[] charArray28 = new char[] { '4', ' ', 'a' };
        int int29 = reader24.read(charArray28);
        int int30 = extendedBufferedReader21.read(charArray28);
        int int31 = extendedBufferedReader21.readAgain();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader32 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader21);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader33 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader32);
        java.io.Reader reader34 = java.io.Reader.nullReader();
        char[] charArray38 = new char[] { '4', ' ', 'a' };
        int int39 = reader34.read(charArray38);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader40 = new org.apache.commons.csv.ExtendedBufferedReader(reader34);
        int int41 = extendedBufferedReader40.lookAhead();
        int int42 = extendedBufferedReader40.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader43 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader40);
        int int44 = extendedBufferedReader43.read();
        int int45 = extendedBufferedReader43.readAgain();
        long long47 = extendedBufferedReader43.skip((long) 10);
        java.io.Reader reader48 = java.io.Reader.nullReader();
        char[] charArray52 = new char[] { '4', ' ', 'a' };
        int int53 = reader48.read(charArray52);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader54 = new org.apache.commons.csv.ExtendedBufferedReader(reader48);
        int int55 = extendedBufferedReader54.lookAhead();
        java.lang.String str56 = extendedBufferedReader54.readLine();
        extendedBufferedReader54.reset();
        int int58 = extendedBufferedReader54.getLineNumber();
        char[] charArray65 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int66 = extendedBufferedReader54.read(charArray65);
        int int67 = extendedBufferedReader43.read(charArray65);
        char[] charArray69 = new char[] { 'a' };
        int int72 = extendedBufferedReader43.read(charArray69, 1, 0);
        int int73 = extendedBufferedReader32.read(charArray69);
        int int74 = extendedBufferedReader6.read(charArray69);
        int int75 = extendedBufferedReader6.lookAhead();
        int int76 = extendedBufferedReader6.lookAhead();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(reader24);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(reader34);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(reader48);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.lookAhead();
        int int10 = extendedBufferedReader6.lookAhead();
        int int11 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.mark(0);
        extendedBufferedReader6.mark((int) (byte) 10);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int18 = extendedBufferedReader17.read();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        long long11 = extendedBufferedReader6.skip((long) (byte) 10);
        extendedBufferedReader6.reset();
        int int13 = extendedBufferedReader6.lookAhead();
        int int14 = extendedBufferedReader6.lookAhead();
        int int15 = extendedBufferedReader6.getLineNumber();
        java.lang.String str16 = extendedBufferedReader6.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        char[] charArray10 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int11 = extendedBufferedReader1.read(charArray10);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int13 = extendedBufferedReader1.lookAhead();
        extendedBufferedReader1.mark((int) (byte) 10);
        java.lang.String str16 = extendedBufferedReader1.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.readAgain();
        int int12 = extendedBufferedReader6.read();
        java.util.stream.Stream<java.lang.String> strStream13 = extendedBufferedReader6.lines();
        int int14 = extendedBufferedReader6.getLineNumber();
        int int15 = extendedBufferedReader6.read();
        int int16 = extendedBufferedReader6.getLineNumber();
        java.lang.String str17 = extendedBufferedReader6.readLine();
        java.lang.String str18 = extendedBufferedReader6.readLine();
        int int19 = extendedBufferedReader6.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader6.mark((int) (byte) 10);
        int int9 = extendedBufferedReader6.getLineNumber();
        extendedBufferedReader6.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        long long13 = extendedBufferedReader11.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = extendedBufferedReader11.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        java.util.stream.Stream<java.lang.String> strStream11 = extendedBufferedReader6.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int13 = extendedBufferedReader12.lookAhead();
        int int14 = extendedBufferedReader12.lookAhead();
        java.io.Reader reader15 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader(reader15);
        extendedBufferedReader16.close();
        extendedBufferedReader16.close();
        int int19 = extendedBufferedReader16.getLineNumber();
        java.io.Reader reader20 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', ' ', 'a' };
        int int25 = reader20.read(charArray24);
        char[] charArray31 = new char[] { '4', ' ', '#', '4', ' ' };
        int int32 = reader20.read(charArray31);
        java.io.Reader reader33 = java.io.Reader.nullReader();
        char[] charArray37 = new char[] { '4', ' ', 'a' };
        int int38 = reader33.read(charArray37);
        char[] charArray44 = new char[] { '4', ' ', '#', '4', ' ' };
        int int45 = reader33.read(charArray44);
        int int46 = reader20.read(charArray44);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader47 = new org.apache.commons.csv.ExtendedBufferedReader(reader20);
        int int48 = extendedBufferedReader47.getLineNumber();
        int int49 = extendedBufferedReader47.lookAhead();
        int int50 = extendedBufferedReader47.read();
        extendedBufferedReader47.mark((int) (byte) 1);
        boolean boolean53 = extendedBufferedReader47.markSupported();
        java.io.Reader reader54 = java.io.Reader.nullReader();
        char[] charArray58 = new char[] { '4', ' ', 'a' };
        int int59 = reader54.read(charArray58);
        int int60 = extendedBufferedReader47.read(charArray58);
        int int63 = extendedBufferedReader16.read(charArray58, 0, 0);
        int int64 = extendedBufferedReader12.read(charArray58);
        extendedBufferedReader12.mark(100);
        java.lang.String str67 = extendedBufferedReader12.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(reader20);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(reader33);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(reader54);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        long long10 = extendedBufferedReader6.skip((long) (byte) 10);
        java.lang.String str11 = extendedBufferedReader6.readLine();
        java.io.Reader reader12 = java.io.Reader.nullReader();
        char[] charArray16 = new char[] { '4', ' ', 'a' };
        int int17 = reader12.read(charArray16);
        char[] charArray23 = new char[] { '4', ' ', '#', '4', ' ' };
        int int24 = reader12.read(charArray23);
        int int25 = extendedBufferedReader6.read(charArray23);
        int int26 = extendedBufferedReader6.read();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        char[] charArray11 = new char[] { '4', ' ', '#', '4', ' ' };
        int int12 = reader0.read(charArray11);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] { '4', ' ', 'a' };
        int int18 = reader13.read(charArray17);
        char[] charArray24 = new char[] { '4', ' ', '#', '4', ' ' };
        int int25 = reader13.read(charArray24);
        int int26 = reader0.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean28 = extendedBufferedReader27.markSupported();
        extendedBufferedReader27.mark(1);
        extendedBufferedReader27.reset();
        extendedBufferedReader27.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader33 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader27);
        java.io.Reader reader34 = java.io.Reader.nullReader();
        java.io.Reader reader35 = java.io.Reader.nullReader();
        char[] charArray39 = new char[] { '4', ' ', 'a' };
        int int40 = reader35.read(charArray39);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader41 = new org.apache.commons.csv.ExtendedBufferedReader(reader35);
        int int42 = extendedBufferedReader41.lookAhead();
        java.lang.String str43 = extendedBufferedReader41.readLine();
        extendedBufferedReader41.reset();
        int int45 = extendedBufferedReader41.getLineNumber();
        java.io.Reader reader46 = java.io.Reader.nullReader();
        char[] charArray50 = new char[] { '4', ' ', 'a' };
        int int51 = reader46.read(charArray50);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader52 = new org.apache.commons.csv.ExtendedBufferedReader(reader46);
        int int53 = extendedBufferedReader52.lookAhead();
        int int54 = extendedBufferedReader52.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader55 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader52);
        int int56 = extendedBufferedReader55.read();
        java.util.stream.Stream<java.lang.String> strStream57 = extendedBufferedReader55.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader58 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader55);
        java.io.Reader reader59 = java.io.Reader.nullReader();
        char[] charArray63 = new char[] { '4', ' ', 'a' };
        int int64 = reader59.read(charArray63);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader65 = new org.apache.commons.csv.ExtendedBufferedReader(reader59);
        int int66 = extendedBufferedReader65.lookAhead();
        boolean boolean67 = extendedBufferedReader65.markSupported();
        java.io.Reader reader68 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader69 = new org.apache.commons.csv.ExtendedBufferedReader(reader68);
        char[] charArray71 = new char[] { ' ' };
        int int72 = reader68.read(charArray71);
        int int73 = extendedBufferedReader65.read(charArray71);
        int int74 = extendedBufferedReader55.read(charArray71);
        int int75 = extendedBufferedReader41.read(charArray71);
        java.io.Reader reader76 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader77 = new org.apache.commons.csv.ExtendedBufferedReader(reader76);
        boolean boolean78 = extendedBufferedReader77.markSupported();
        long long80 = extendedBufferedReader77.skip((long) '#');
        char[] charArray86 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int87 = extendedBufferedReader77.read(charArray86);
        int int88 = extendedBufferedReader41.read(charArray86);
        int int89 = reader34.read(charArray86);
        int int90 = extendedBufferedReader27.read(charArray86);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader91 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader27);
        java.lang.Class<?> wildcardClass92 = extendedBufferedReader27.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(reader34);
        org.junit.Assert.assertNotNull(reader35);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(reader46);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strStream57);
        org.junit.Assert.assertNotNull(reader59);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(reader68);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(reader76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertArrayEquals(charArray86, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        extendedBufferedReader6.mark((int) (short) 0);
        java.util.stream.Stream<java.lang.String> strStream13 = extendedBufferedReader6.lines();
        int int14 = extendedBufferedReader6.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int16 = extendedBufferedReader6.lookAhead();
        int int17 = extendedBufferedReader6.readAgain();
        boolean boolean18 = extendedBufferedReader6.markSupported();
        java.util.stream.Stream<java.lang.String> strStream19 = extendedBufferedReader6.lines();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strStream19);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.getLineNumber();
        java.lang.String str11 = extendedBufferedReader9.readLine();
        int int12 = extendedBufferedReader9.getLineNumber();
        boolean boolean13 = extendedBufferedReader9.markSupported();
        int int14 = extendedBufferedReader9.getLineNumber();
        int int15 = extendedBufferedReader9.read();
        java.io.Reader reader16 = java.io.Reader.nullReader();
        char[] charArray20 = new char[] { '4', ' ', 'a' };
        int int21 = reader16.read(charArray20);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        int int23 = extendedBufferedReader22.lookAhead();
        java.lang.String str24 = extendedBufferedReader22.readLine();
        java.lang.String str25 = extendedBufferedReader22.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader26 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader22);
        int int27 = extendedBufferedReader22.readAgain();
        boolean boolean28 = extendedBufferedReader22.markSupported();
        int int29 = extendedBufferedReader22.readAgain();
        java.io.Reader reader30 = java.io.Reader.nullReader();
        char[] charArray34 = new char[] { '4', ' ', 'a' };
        int int35 = reader30.read(charArray34);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader36 = new org.apache.commons.csv.ExtendedBufferedReader(reader30);
        java.util.stream.Stream<java.lang.String> strStream37 = extendedBufferedReader36.lines();
        int int38 = extendedBufferedReader36.readAgain();
        int int39 = extendedBufferedReader36.lookAhead();
        int int40 = extendedBufferedReader36.lookAhead();
        int int41 = extendedBufferedReader36.lookAhead();
        java.io.Reader reader42 = java.io.Reader.nullReader();
        char[] charArray46 = new char[] { '4', ' ', 'a' };
        int int47 = reader42.read(charArray46);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader48 = new org.apache.commons.csv.ExtendedBufferedReader(reader42);
        java.lang.String str49 = extendedBufferedReader48.readLine();
        java.io.Reader reader50 = java.io.Reader.nullReader();
        char[] charArray54 = new char[] { '4', ' ', 'a' };
        int int55 = reader50.read(charArray54);
        char[] charArray61 = new char[] { '4', ' ', '#', '4', ' ' };
        int int62 = reader50.read(charArray61);
        java.io.Reader reader63 = java.io.Reader.nullReader();
        char[] charArray67 = new char[] { '4', ' ', 'a' };
        int int68 = reader63.read(charArray67);
        char[] charArray74 = new char[] { '4', ' ', '#', '4', ' ' };
        int int75 = reader63.read(charArray74);
        int int76 = reader50.read(charArray74);
        int int77 = extendedBufferedReader48.read(charArray74);
        int int78 = extendedBufferedReader36.read(charArray74);
        int int79 = extendedBufferedReader22.read(charArray74);
        int int80 = extendedBufferedReader9.read(charArray74);
        int int81 = extendedBufferedReader9.read();
        int int82 = extendedBufferedReader9.readAgain();
        int int83 = extendedBufferedReader9.read();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(reader30);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strStream37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-2) + "'", int38 == (-2));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(reader42);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(reader50);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(reader63);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        int int12 = extendedBufferedReader6.readAgain();
        boolean boolean13 = extendedBufferedReader6.markSupported();
        long long15 = extendedBufferedReader6.skip(10L);
        extendedBufferedReader6.close();
        java.lang.Class<?> wildcardClass17 = extendedBufferedReader6.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.close();
        boolean boolean12 = extendedBufferedReader6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader6.mark((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Read-ahead limit < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        long long11 = extendedBufferedReader6.skip((long) (byte) 10);
        extendedBufferedReader6.reset();
        int int13 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader14);
        java.lang.String str16 = extendedBufferedReader14.readLine();
        java.lang.String str17 = extendedBufferedReader14.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        java.util.stream.Stream<java.lang.String> strStream5 = extendedBufferedReader1.lines();
        extendedBufferedReader1.mark(0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] { '4', ' ', 'a' };
        int int14 = reader9.read(charArray13);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        int int16 = extendedBufferedReader15.lookAhead();
        int int17 = extendedBufferedReader15.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader15);
        int int19 = extendedBufferedReader18.read();
        int int20 = extendedBufferedReader18.readAgain();
        long long22 = extendedBufferedReader18.skip((long) 10);
        java.io.Reader reader23 = java.io.Reader.nullReader();
        char[] charArray27 = new char[] { '4', ' ', 'a' };
        int int28 = reader23.read(charArray27);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader29 = new org.apache.commons.csv.ExtendedBufferedReader(reader23);
        int int30 = extendedBufferedReader29.lookAhead();
        java.lang.String str31 = extendedBufferedReader29.readLine();
        extendedBufferedReader29.reset();
        int int33 = extendedBufferedReader29.getLineNumber();
        char[] charArray40 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int41 = extendedBufferedReader29.read(charArray40);
        int int42 = extendedBufferedReader18.read(charArray40);
        int int43 = extendedBufferedReader1.read(charArray40);
        java.io.Reader reader44 = java.io.Reader.nullReader();
        char[] charArray48 = new char[] { '4', ' ', 'a' };
        int int49 = reader44.read(charArray48);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader50 = new org.apache.commons.csv.ExtendedBufferedReader(reader44);
        int int51 = extendedBufferedReader50.lookAhead();
        java.lang.String str52 = extendedBufferedReader50.readLine();
        int int53 = extendedBufferedReader50.lookAhead();
        java.io.Reader reader54 = java.io.Reader.nullReader();
        char[] charArray58 = new char[] { '4', ' ', 'a' };
        int int59 = reader54.read(charArray58);
        char[] charArray65 = new char[] { '4', ' ', '#', '4', ' ' };
        int int66 = reader54.read(charArray65);
        int int67 = extendedBufferedReader50.read(charArray65);
        java.io.Reader reader68 = java.io.Reader.nullReader();
        char[] charArray72 = new char[] { '4', ' ', 'a' };
        int int73 = reader68.read(charArray72);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader74 = new org.apache.commons.csv.ExtendedBufferedReader(reader68);
        int int75 = extendedBufferedReader74.lookAhead();
        boolean boolean76 = extendedBufferedReader74.markSupported();
        java.io.Reader reader77 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader78 = new org.apache.commons.csv.ExtendedBufferedReader(reader77);
        char[] charArray80 = new char[] { ' ' };
        int int81 = reader77.read(charArray80);
        int int82 = extendedBufferedReader74.read(charArray80);
        int int83 = extendedBufferedReader50.read(charArray80);
        int int86 = extendedBufferedReader1.read(charArray80, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str87 = extendedBufferedReader1.readLine();
        int int88 = extendedBufferedReader1.lookAhead();
        int int89 = extendedBufferedReader1.readAgain();
        boolean boolean90 = extendedBufferedReader1.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(reader23);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(reader44);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(reader54);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(reader68);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(reader77);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.mark((int) '#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int13 = extendedBufferedReader6.readAgain();
        int int14 = extendedBufferedReader6.readAgain();
        extendedBufferedReader6.reset();
        extendedBufferedReader6.close();
        int int17 = extendedBufferedReader6.readAgain();
        boolean boolean18 = extendedBufferedReader6.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        extendedBufferedReader6.reset();
        int int10 = extendedBufferedReader6.getLineNumber();
        char[] charArray17 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int18 = extendedBufferedReader6.read(charArray17);
        int int19 = extendedBufferedReader6.lookAhead();
        int int20 = extendedBufferedReader6.readAgain();
        int int21 = extendedBufferedReader6.lookAhead();
        int int22 = extendedBufferedReader6.getLineNumber();
        java.lang.Class<?> wildcardClass23 = extendedBufferedReader6.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.mark((int) (short) 1);
        int int10 = extendedBufferedReader6.read();
        java.lang.String str11 = extendedBufferedReader6.readLine();
        extendedBufferedReader6.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int14 = extendedBufferedReader6.readAgain();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        java.util.stream.Stream<java.lang.String> strStream5 = extendedBufferedReader1.lines();
        extendedBufferedReader1.mark(0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] { '4', ' ', 'a' };
        int int14 = reader9.read(charArray13);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        int int16 = extendedBufferedReader15.lookAhead();
        int int17 = extendedBufferedReader15.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader15);
        int int19 = extendedBufferedReader18.read();
        int int20 = extendedBufferedReader18.readAgain();
        long long22 = extendedBufferedReader18.skip((long) 10);
        java.io.Reader reader23 = java.io.Reader.nullReader();
        char[] charArray27 = new char[] { '4', ' ', 'a' };
        int int28 = reader23.read(charArray27);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader29 = new org.apache.commons.csv.ExtendedBufferedReader(reader23);
        int int30 = extendedBufferedReader29.lookAhead();
        java.lang.String str31 = extendedBufferedReader29.readLine();
        extendedBufferedReader29.reset();
        int int33 = extendedBufferedReader29.getLineNumber();
        char[] charArray40 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int41 = extendedBufferedReader29.read(charArray40);
        int int42 = extendedBufferedReader18.read(charArray40);
        int int43 = extendedBufferedReader1.read(charArray40);
        java.io.Reader reader44 = java.io.Reader.nullReader();
        char[] charArray48 = new char[] { '4', ' ', 'a' };
        int int49 = reader44.read(charArray48);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader50 = new org.apache.commons.csv.ExtendedBufferedReader(reader44);
        int int51 = extendedBufferedReader50.lookAhead();
        java.lang.String str52 = extendedBufferedReader50.readLine();
        int int53 = extendedBufferedReader50.lookAhead();
        java.io.Reader reader54 = java.io.Reader.nullReader();
        char[] charArray58 = new char[] { '4', ' ', 'a' };
        int int59 = reader54.read(charArray58);
        char[] charArray65 = new char[] { '4', ' ', '#', '4', ' ' };
        int int66 = reader54.read(charArray65);
        int int67 = extendedBufferedReader50.read(charArray65);
        java.io.Reader reader68 = java.io.Reader.nullReader();
        char[] charArray72 = new char[] { '4', ' ', 'a' };
        int int73 = reader68.read(charArray72);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader74 = new org.apache.commons.csv.ExtendedBufferedReader(reader68);
        int int75 = extendedBufferedReader74.lookAhead();
        boolean boolean76 = extendedBufferedReader74.markSupported();
        java.io.Reader reader77 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader78 = new org.apache.commons.csv.ExtendedBufferedReader(reader77);
        char[] charArray80 = new char[] { ' ' };
        int int81 = reader77.read(charArray80);
        int int82 = extendedBufferedReader74.read(charArray80);
        int int83 = extendedBufferedReader50.read(charArray80);
        int int86 = extendedBufferedReader1.read(charArray80, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str87 = extendedBufferedReader1.readLine();
        java.nio.CharBuffer charBuffer88 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int89 = extendedBufferedReader1.read(charBuffer88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(reader23);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(reader44);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(reader54);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(reader68);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(reader77);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNull(str87);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.read();
        java.util.stream.Stream<java.lang.String> strStream11 = extendedBufferedReader9.lines();
        int int12 = extendedBufferedReader9.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        java.util.stream.Stream<java.lang.String> strStream15 = extendedBufferedReader9.lines();
        int int16 = extendedBufferedReader9.read();
        java.lang.String str17 = extendedBufferedReader9.readLine();
        java.nio.CharBuffer charBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = extendedBufferedReader9.read(charBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.lang.Class<?> wildcardClass13 = extendedBufferedReader12.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        int int12 = extendedBufferedReader6.getLineNumber();
        int int13 = extendedBufferedReader6.getLineNumber();
        int int14 = extendedBufferedReader6.read();
        int int15 = extendedBufferedReader6.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int17 = extendedBufferedReader16.readAgain();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] { '4', ' ', 'a' };
        int int14 = reader9.read(charArray13);
        int int15 = extendedBufferedReader6.read(charArray13);
        int int16 = extendedBufferedReader6.readAgain();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.io.Reader reader18 = java.io.Reader.nullReader();
        char[] charArray22 = new char[] { '4', ' ', 'a' };
        int int23 = reader18.read(charArray22);
        int int26 = extendedBufferedReader6.read(charArray22, (int) (short) 0, (int) (byte) 0);
        int int27 = extendedBufferedReader6.lookAhead();
        boolean boolean28 = extendedBufferedReader6.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.read();
        java.util.stream.Stream<java.lang.String> strStream11 = extendedBufferedReader9.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] { '4', ' ', 'a' };
        int int18 = reader13.read(charArray17);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader(reader13);
        int int20 = extendedBufferedReader19.lookAhead();
        boolean boolean21 = extendedBufferedReader19.markSupported();
        java.io.Reader reader22 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader(reader22);
        char[] charArray25 = new char[] { ' ' };
        int int26 = reader22.read(charArray25);
        int int27 = extendedBufferedReader19.read(charArray25);
        int int28 = extendedBufferedReader9.read(charArray25);
        int int29 = extendedBufferedReader9.read();
        int int30 = extendedBufferedReader9.lookAhead();
        int int31 = extendedBufferedReader9.lookAhead();
        java.nio.CharBuffer charBuffer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = extendedBufferedReader9.read(charBuffer32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(reader22);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        char[] charArray10 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int11 = extendedBufferedReader1.read(charArray10);
        int int12 = extendedBufferedReader1.lookAhead();
        boolean boolean13 = extendedBufferedReader1.markSupported();
        int int14 = extendedBufferedReader1.readAgain();
        int int15 = extendedBufferedReader1.lookAhead();
        boolean boolean16 = extendedBufferedReader1.markSupported();
        java.util.stream.Stream<java.lang.String> strStream17 = extendedBufferedReader1.lines();
        int int18 = extendedBufferedReader1.lookAhead();
        java.io.Writer writer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = extendedBufferedReader1.transferTo(writer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strStream17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int11 = extendedBufferedReader6.readAgain();
        extendedBufferedReader6.mark((int) (byte) 0);
        java.io.Reader reader14 = java.io.Reader.nullReader();
        char[] charArray18 = new char[] { '4', ' ', 'a' };
        int int19 = reader14.read(charArray18);
        char[] charArray25 = new char[] { '4', ' ', '#', '4', ' ' };
        int int26 = reader14.read(charArray25);
        java.io.Reader reader27 = java.io.Reader.nullReader();
        char[] charArray31 = new char[] { '4', ' ', 'a' };
        int int32 = reader27.read(charArray31);
        char[] charArray38 = new char[] { '4', ' ', '#', '4', ' ' };
        int int39 = reader27.read(charArray38);
        int int40 = reader14.read(charArray38);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader41 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        int int42 = extendedBufferedReader41.getLineNumber();
        int int43 = extendedBufferedReader41.lookAhead();
        int int44 = extendedBufferedReader41.read();
        extendedBufferedReader41.mark((int) (byte) 1);
        boolean boolean47 = extendedBufferedReader41.markSupported();
        java.io.Reader reader48 = java.io.Reader.nullReader();
        char[] charArray52 = new char[] { '4', ' ', 'a' };
        int int53 = reader48.read(charArray52);
        int int54 = extendedBufferedReader41.read(charArray52);
        int int55 = extendedBufferedReader6.read(charArray52);
        java.util.stream.Stream<java.lang.String> strStream56 = extendedBufferedReader6.lines();
        int int57 = extendedBufferedReader6.lookAhead();
        long long59 = extendedBufferedReader6.skip(10L);
        java.nio.CharBuffer charBuffer60 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int61 = extendedBufferedReader6.read(charBuffer60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(reader27);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(reader48);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strStream56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        char[] charArray11 = new char[] { '4', ' ', '#', '4', ' ' };
        int int12 = reader0.read(charArray11);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] { '4', ' ', 'a' };
        int int18 = reader13.read(charArray17);
        char[] charArray24 = new char[] { '4', ' ', '#', '4', ' ' };
        int int25 = reader13.read(charArray24);
        int int26 = reader0.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int28 = extendedBufferedReader27.getLineNumber();
        int int29 = extendedBufferedReader27.read();
        extendedBufferedReader27.close();
        int int31 = extendedBufferedReader27.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader32 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader27);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader33 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader27);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        char[] charArray10 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int11 = extendedBufferedReader1.read(charArray10);
        int int12 = extendedBufferedReader1.lookAhead();
        boolean boolean13 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.mark((int) (byte) 100);
        java.util.stream.Stream<java.lang.String> strStream16 = extendedBufferedReader1.lines();
        extendedBufferedReader1.mark(100);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strStream16);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        int int3 = extendedBufferedReader1.getLineNumber();
        java.io.Reader reader4 = java.io.Reader.nullReader();
        char[] charArray8 = new char[] { '4', ' ', 'a' };
        int int9 = reader4.read(charArray8);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader4);
        int int11 = extendedBufferedReader10.lookAhead();
        extendedBufferedReader10.mark((int) (short) 1);
        int int14 = extendedBufferedReader10.read();
        java.lang.String str15 = extendedBufferedReader10.readLine();
        extendedBufferedReader10.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10);
        java.io.Reader reader18 = java.io.Reader.nullReader();
        char[] charArray22 = new char[] { '4', ' ', 'a' };
        int int23 = reader18.read(charArray22);
        int int26 = extendedBufferedReader17.read(charArray22, (int) (byte) 100, 0);
        int int27 = extendedBufferedReader1.read(charArray22);
        long long29 = extendedBufferedReader1.skip(0L);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reader4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        boolean boolean8 = extendedBufferedReader6.markSupported();
        java.io.Reader reader9 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        char[] charArray12 = new char[] { ' ' };
        int int13 = reader9.read(charArray12);
        int int14 = extendedBufferedReader6.read(charArray12);
        java.util.stream.Stream<java.lang.String> strStream15 = extendedBufferedReader6.lines();
        int int16 = extendedBufferedReader6.read();
        int int17 = extendedBufferedReader6.read();
        java.util.stream.Stream<java.lang.String> strStream18 = extendedBufferedReader6.lines();
        java.lang.String str19 = extendedBufferedReader6.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.lang.String str7 = extendedBufferedReader6.readLine();
        int int8 = extendedBufferedReader6.read();
        int int9 = extendedBufferedReader6.getLineNumber();
        long long11 = extendedBufferedReader6.skip((long) (short) 100);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = extendedBufferedReader6.transferTo(writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream12 = extendedBufferedReader6.lines();
        boolean boolean13 = extendedBufferedReader6.markSupported();
        int int14 = extendedBufferedReader6.lookAhead();
        int int15 = extendedBufferedReader6.readAgain();
        extendedBufferedReader6.mark((int) 'a');
        java.io.Reader reader18 = java.io.Reader.nullReader();
        char[] charArray22 = new char[] { '4', ' ', 'a' };
        int int23 = reader18.read(charArray22);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader(reader18);
        int int25 = extendedBufferedReader24.lookAhead();
        java.lang.String str26 = extendedBufferedReader24.readLine();
        java.lang.String str27 = extendedBufferedReader24.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader28 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader24);
        int int29 = extendedBufferedReader24.readAgain();
        boolean boolean30 = extendedBufferedReader24.markSupported();
        int int31 = extendedBufferedReader24.readAgain();
        int int32 = extendedBufferedReader24.getLineNumber();
        extendedBufferedReader24.reset();
        java.io.Reader reader34 = java.io.Reader.nullReader();
        char[] charArray38 = new char[] { '4', ' ', 'a' };
        int int39 = reader34.read(charArray38);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader40 = new org.apache.commons.csv.ExtendedBufferedReader(reader34);
        java.lang.String str41 = extendedBufferedReader40.readLine();
        int int42 = extendedBufferedReader40.read();
        int int43 = extendedBufferedReader40.readAgain();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader44 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader40);
        java.io.Reader reader45 = java.io.Reader.nullReader();
        char[] charArray49 = new char[] { '4', ' ', 'a' };
        int int50 = reader45.read(charArray49);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader51 = new org.apache.commons.csv.ExtendedBufferedReader(reader45);
        int int52 = extendedBufferedReader51.lookAhead();
        int int53 = extendedBufferedReader51.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader54 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader51);
        int int55 = extendedBufferedReader54.read();
        int int56 = extendedBufferedReader54.readAgain();
        long long58 = extendedBufferedReader54.skip((long) 10);
        java.io.Reader reader59 = java.io.Reader.nullReader();
        char[] charArray63 = new char[] { '4', ' ', 'a' };
        int int64 = reader59.read(charArray63);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader65 = new org.apache.commons.csv.ExtendedBufferedReader(reader59);
        int int66 = extendedBufferedReader65.lookAhead();
        java.lang.String str67 = extendedBufferedReader65.readLine();
        extendedBufferedReader65.reset();
        int int69 = extendedBufferedReader65.getLineNumber();
        char[] charArray76 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int77 = extendedBufferedReader65.read(charArray76);
        int int78 = extendedBufferedReader54.read(charArray76);
        char[] charArray80 = new char[] { 'a' };
        int int83 = extendedBufferedReader54.read(charArray80, 1, 0);
        int int86 = extendedBufferedReader40.read(charArray80, (int) 'a', 0);
        int int87 = extendedBufferedReader24.read(charArray80);
        int int88 = extendedBufferedReader6.read(charArray80);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(reader34);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(reader45);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(reader59);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.mark((int) '#');
        java.lang.String str12 = extendedBufferedReader6.readLine();
        int int13 = extendedBufferedReader6.getLineNumber();
        long long15 = extendedBufferedReader6.skip((long) 0);
        java.lang.String str16 = extendedBufferedReader6.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.close();
        extendedBufferedReader6.close();
        extendedBufferedReader6.close();
        java.util.stream.Stream<java.lang.String> strStream14 = extendedBufferedReader6.lines();
        boolean boolean15 = extendedBufferedReader6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = extendedBufferedReader6.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.mark((int) (short) 1);
        int int10 = extendedBufferedReader6.read();
        java.lang.String str11 = extendedBufferedReader6.readLine();
        extendedBufferedReader6.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int15 = extendedBufferedReader14.readAgain();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedBufferedReader14.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        char[] charArray11 = new char[] { '4', ' ', '#', '4', ' ' };
        int int12 = reader0.read(charArray11);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] { '4', ' ', 'a' };
        int int18 = reader13.read(charArray17);
        char[] charArray24 = new char[] { '4', ' ', '#', '4', ' ' };
        int int25 = reader13.read(charArray24);
        int int26 = reader0.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int28 = extendedBufferedReader27.getLineNumber();
        int int29 = extendedBufferedReader27.lookAhead();
        int int30 = extendedBufferedReader27.read();
        extendedBufferedReader27.mark((int) (byte) 1);
        boolean boolean33 = extendedBufferedReader27.markSupported();
        java.io.Reader reader34 = java.io.Reader.nullReader();
        char[] charArray38 = new char[] { '4', ' ', 'a' };
        int int39 = reader34.read(charArray38);
        int int40 = extendedBufferedReader27.read(charArray38);
        int int41 = extendedBufferedReader27.lookAhead();
        int int42 = extendedBufferedReader27.readAgain();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(reader34);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        java.util.stream.Stream<java.lang.String> strStream5 = extendedBufferedReader1.lines();
        extendedBufferedReader1.mark(0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] { '4', ' ', 'a' };
        int int14 = reader9.read(charArray13);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        int int16 = extendedBufferedReader15.lookAhead();
        int int17 = extendedBufferedReader15.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader15);
        int int19 = extendedBufferedReader18.read();
        int int20 = extendedBufferedReader18.readAgain();
        long long22 = extendedBufferedReader18.skip((long) 10);
        java.io.Reader reader23 = java.io.Reader.nullReader();
        char[] charArray27 = new char[] { '4', ' ', 'a' };
        int int28 = reader23.read(charArray27);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader29 = new org.apache.commons.csv.ExtendedBufferedReader(reader23);
        int int30 = extendedBufferedReader29.lookAhead();
        java.lang.String str31 = extendedBufferedReader29.readLine();
        extendedBufferedReader29.reset();
        int int33 = extendedBufferedReader29.getLineNumber();
        char[] charArray40 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int41 = extendedBufferedReader29.read(charArray40);
        int int42 = extendedBufferedReader18.read(charArray40);
        int int43 = extendedBufferedReader1.read(charArray40);
        java.io.Reader reader44 = java.io.Reader.nullReader();
        char[] charArray48 = new char[] { '4', ' ', 'a' };
        int int49 = reader44.read(charArray48);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader50 = new org.apache.commons.csv.ExtendedBufferedReader(reader44);
        int int51 = extendedBufferedReader50.lookAhead();
        java.lang.String str52 = extendedBufferedReader50.readLine();
        int int53 = extendedBufferedReader50.lookAhead();
        java.io.Reader reader54 = java.io.Reader.nullReader();
        char[] charArray58 = new char[] { '4', ' ', 'a' };
        int int59 = reader54.read(charArray58);
        char[] charArray65 = new char[] { '4', ' ', '#', '4', ' ' };
        int int66 = reader54.read(charArray65);
        int int67 = extendedBufferedReader50.read(charArray65);
        java.io.Reader reader68 = java.io.Reader.nullReader();
        char[] charArray72 = new char[] { '4', ' ', 'a' };
        int int73 = reader68.read(charArray72);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader74 = new org.apache.commons.csv.ExtendedBufferedReader(reader68);
        int int75 = extendedBufferedReader74.lookAhead();
        boolean boolean76 = extendedBufferedReader74.markSupported();
        java.io.Reader reader77 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader78 = new org.apache.commons.csv.ExtendedBufferedReader(reader77);
        char[] charArray80 = new char[] { ' ' };
        int int81 = reader77.read(charArray80);
        int int82 = extendedBufferedReader74.read(charArray80);
        int int83 = extendedBufferedReader50.read(charArray80);
        int int86 = extendedBufferedReader1.read(charArray80, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str87 = extendedBufferedReader1.readLine();
        long long89 = extendedBufferedReader1.skip((long) 1);
        java.lang.String str90 = extendedBufferedReader1.readLine();
        int int91 = extendedBufferedReader1.read();
        long long93 = extendedBufferedReader1.skip((long) ' ');
        int int94 = extendedBufferedReader1.readAgain();
        boolean boolean95 = extendedBufferedReader1.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(reader23);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(reader44);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(reader54);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(reader68);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(reader77);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        long long14 = extendedBufferedReader6.skip((long) (short) 1);
        int int15 = extendedBufferedReader6.read();
        java.lang.String str16 = extendedBufferedReader6.readLine();
        java.io.Reader reader17 = java.io.Reader.nullReader();
        char[] charArray21 = new char[] { '4', ' ', 'a' };
        int int22 = reader17.read(charArray21);
        char[] charArray28 = new char[] { '4', ' ', '#', '4', ' ' };
        int int29 = reader17.read(charArray28);
        java.io.Reader reader30 = java.io.Reader.nullReader();
        char[] charArray34 = new char[] { '4', ' ', 'a' };
        int int35 = reader30.read(charArray34);
        char[] charArray41 = new char[] { '4', ' ', '#', '4', ' ' };
        int int42 = reader30.read(charArray41);
        int int43 = reader17.read(charArray41);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader44 = new org.apache.commons.csv.ExtendedBufferedReader(reader17);
        boolean boolean45 = extendedBufferedReader44.markSupported();
        int int46 = extendedBufferedReader44.lookAhead();
        extendedBufferedReader44.reset();
        java.io.Reader reader48 = java.io.Reader.nullReader();
        char[] charArray52 = new char[] { '4', ' ', 'a' };
        int int53 = reader48.read(charArray52);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader54 = new org.apache.commons.csv.ExtendedBufferedReader(reader48);
        int int55 = extendedBufferedReader54.lookAhead();
        int int56 = extendedBufferedReader54.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader57 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader54);
        int int58 = extendedBufferedReader57.getLineNumber();
        java.io.Reader reader59 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader60 = new org.apache.commons.csv.ExtendedBufferedReader(reader59);
        char[] charArray62 = new char[] { ' ' };
        int int63 = reader59.read(charArray62);
        int int64 = extendedBufferedReader57.read(charArray62);
        int int65 = extendedBufferedReader44.read(charArray62);
        int int68 = extendedBufferedReader6.read(charArray62, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(reader17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(reader30);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(reader48);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(reader59);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int11 = extendedBufferedReader6.readAgain();
        long long13 = extendedBufferedReader6.skip((long) (short) 100);
        extendedBufferedReader6.mark((int) (byte) 100);
        int int16 = extendedBufferedReader6.readAgain();
        long long18 = extendedBufferedReader6.skip((long) 'a');
        int int19 = extendedBufferedReader6.lookAhead();
        int int20 = extendedBufferedReader6.getLineNumber();
        long long22 = extendedBufferedReader6.skip(10L);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader1.close();
        boolean boolean3 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.lookAhead();
        int int10 = extendedBufferedReader6.lookAhead();
        int int11 = extendedBufferedReader6.lookAhead();
        java.io.Reader reader12 = java.io.Reader.nullReader();
        char[] charArray16 = new char[] { '4', ' ', 'a' };
        int int17 = reader12.read(charArray16);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader(reader12);
        java.lang.String str19 = extendedBufferedReader18.readLine();
        java.io.Reader reader20 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', ' ', 'a' };
        int int25 = reader20.read(charArray24);
        char[] charArray31 = new char[] { '4', ' ', '#', '4', ' ' };
        int int32 = reader20.read(charArray31);
        java.io.Reader reader33 = java.io.Reader.nullReader();
        char[] charArray37 = new char[] { '4', ' ', 'a' };
        int int38 = reader33.read(charArray37);
        char[] charArray44 = new char[] { '4', ' ', '#', '4', ' ' };
        int int45 = reader33.read(charArray44);
        int int46 = reader20.read(charArray44);
        int int47 = extendedBufferedReader18.read(charArray44);
        int int48 = extendedBufferedReader6.read(charArray44);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader49 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        boolean boolean50 = extendedBufferedReader49.markSupported();
        java.lang.String str51 = extendedBufferedReader49.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader52 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader49);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(reader20);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(reader33);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        long long14 = extendedBufferedReader6.skip((long) (short) 1);
        extendedBufferedReader6.reset();
        java.lang.String str16 = extendedBufferedReader6.readLine();
        boolean boolean17 = extendedBufferedReader6.markSupported();
        java.nio.CharBuffer charBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = extendedBufferedReader6.read(charBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        int int3 = extendedBufferedReader1.readAgain();
        extendedBufferedReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = extendedBufferedReader1.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        char[] charArray10 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int11 = extendedBufferedReader1.read(charArray10);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int13 = extendedBufferedReader12.getLineNumber();
        int int14 = extendedBufferedReader12.lookAhead();
        java.io.Reader reader15 = java.io.Reader.nullReader();
        char[] charArray19 = new char[] { '4', ' ', 'a' };
        int int20 = reader15.read(charArray19);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = new org.apache.commons.csv.ExtendedBufferedReader(reader15);
        int int22 = extendedBufferedReader21.lookAhead();
        int int23 = extendedBufferedReader21.read();
        java.util.stream.Stream<java.lang.String> strStream24 = extendedBufferedReader21.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader21);
        extendedBufferedReader21.reset();
        java.lang.String str27 = extendedBufferedReader21.readLine();
        java.io.Reader reader28 = java.io.Reader.nullReader();
        char[] charArray32 = new char[] { '4', ' ', 'a' };
        int int33 = reader28.read(charArray32);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader34 = new org.apache.commons.csv.ExtendedBufferedReader(reader28);
        int int35 = extendedBufferedReader34.lookAhead();
        java.lang.String str36 = extendedBufferedReader34.readLine();
        extendedBufferedReader34.reset();
        int int38 = extendedBufferedReader34.getLineNumber();
        java.io.Reader reader39 = java.io.Reader.nullReader();
        char[] charArray43 = new char[] { '4', ' ', 'a' };
        int int44 = reader39.read(charArray43);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader45 = new org.apache.commons.csv.ExtendedBufferedReader(reader39);
        int int46 = extendedBufferedReader45.lookAhead();
        int int47 = extendedBufferedReader45.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader48 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader45);
        int int49 = extendedBufferedReader48.read();
        java.util.stream.Stream<java.lang.String> strStream50 = extendedBufferedReader48.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader51 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader48);
        java.io.Reader reader52 = java.io.Reader.nullReader();
        char[] charArray56 = new char[] { '4', ' ', 'a' };
        int int57 = reader52.read(charArray56);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader58 = new org.apache.commons.csv.ExtendedBufferedReader(reader52);
        int int59 = extendedBufferedReader58.lookAhead();
        boolean boolean60 = extendedBufferedReader58.markSupported();
        java.io.Reader reader61 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader62 = new org.apache.commons.csv.ExtendedBufferedReader(reader61);
        char[] charArray64 = new char[] { ' ' };
        int int65 = reader61.read(charArray64);
        int int66 = extendedBufferedReader58.read(charArray64);
        int int67 = extendedBufferedReader48.read(charArray64);
        int int68 = extendedBufferedReader34.read(charArray64);
        int int71 = extendedBufferedReader21.read(charArray64, 100, 0);
        int int72 = extendedBufferedReader12.read(charArray64);
        extendedBufferedReader12.reset();
        java.util.stream.Stream<java.lang.String> strStream74 = extendedBufferedReader12.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader75 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader12);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strStream24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(reader28);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(reader39);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strStream50);
        org.junit.Assert.assertNotNull(reader52);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(reader61);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(strStream74);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        int int9 = extendedBufferedReader6.read();
        int int10 = extendedBufferedReader6.lookAhead();
        java.lang.String str11 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader12);
        int int14 = extendedBufferedReader13.readAgain();
        extendedBufferedReader13.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        extendedBufferedReader6.reset();
        int int10 = extendedBufferedReader6.getLineNumber();
        boolean boolean11 = extendedBufferedReader6.markSupported();
        int int12 = extendedBufferedReader6.read();
        int int13 = extendedBufferedReader6.getLineNumber();
        extendedBufferedReader6.mark(100);
        int int16 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.reset();
        java.nio.CharBuffer charBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = extendedBufferedReader6.read(charBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.lang.String str7 = extendedBufferedReader6.readLine();
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray12 = new char[] { '4', ' ', 'a' };
        int int13 = reader8.read(charArray12);
        char[] charArray19 = new char[] { '4', ' ', '#', '4', ' ' };
        int int20 = reader8.read(charArray19);
        java.io.Reader reader21 = java.io.Reader.nullReader();
        char[] charArray25 = new char[] { '4', ' ', 'a' };
        int int26 = reader21.read(charArray25);
        char[] charArray32 = new char[] { '4', ' ', '#', '4', ' ' };
        int int33 = reader21.read(charArray32);
        int int34 = reader8.read(charArray32);
        int int35 = extendedBufferedReader6.read(charArray32);
        int int36 = extendedBufferedReader6.readAgain();
        boolean boolean37 = extendedBufferedReader6.markSupported();
        long long39 = extendedBufferedReader6.skip((long) (short) 100);
        int int40 = extendedBufferedReader6.lookAhead();
        int int41 = extendedBufferedReader6.readAgain();
        int int42 = extendedBufferedReader6.readAgain();
        java.nio.CharBuffer charBuffer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = extendedBufferedReader6.read(charBuffer43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(reader21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        long long11 = extendedBufferedReader6.skip((long) (byte) 10);
        extendedBufferedReader6.reset();
        java.lang.String str13 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int15 = extendedBufferedReader6.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader6.lookAhead();
        java.io.Reader reader11 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        char[] charArray14 = new char[] { ' ' };
        int int15 = reader11.read(charArray14);
        int int16 = extendedBufferedReader6.read(charArray14);
        boolean boolean17 = extendedBufferedReader6.markSupported();
        java.lang.String str18 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        long long21 = extendedBufferedReader6.skip((long) (short) 1);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] { '4', ' ', 'a' };
        int int14 = reader9.read(charArray13);
        int int15 = extendedBufferedReader6.read(charArray13);
        int int16 = extendedBufferedReader6.readAgain();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int18 = extendedBufferedReader17.getLineNumber();
        int int19 = extendedBufferedReader17.read();
        java.io.Reader reader20 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', ' ', 'a' };
        int int25 = reader20.read(charArray24);
        char[] charArray31 = new char[] { '4', ' ', '#', '4', ' ' };
        int int32 = reader20.read(charArray31);
        java.io.Reader reader33 = java.io.Reader.nullReader();
        char[] charArray37 = new char[] { '4', ' ', 'a' };
        int int38 = reader33.read(charArray37);
        char[] charArray44 = new char[] { '4', ' ', '#', '4', ' ' };
        int int45 = reader33.read(charArray44);
        int int46 = reader20.read(charArray44);
        int int49 = extendedBufferedReader17.read(charArray44, (int) (byte) 100, (int) (byte) 0);
        int int50 = extendedBufferedReader17.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader51 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader17);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader52 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader17);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(reader20);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(reader33);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        int int9 = extendedBufferedReader6.lookAhead();
        java.io.Reader reader10 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', ' ', 'a' };
        int int15 = reader10.read(charArray14);
        char[] charArray21 = new char[] { '4', ' ', '#', '4', ' ' };
        int int22 = reader10.read(charArray21);
        int int23 = extendedBufferedReader6.read(charArray21);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.lang.String str25 = extendedBufferedReader6.readLine();
        java.util.stream.Stream<java.lang.String> strStream26 = extendedBufferedReader6.lines();
        java.io.Writer writer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long28 = extendedBufferedReader6.transferTo(writer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strStream26);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        int int12 = extendedBufferedReader6.getLineNumber();
        int int13 = extendedBufferedReader6.readAgain();
        boolean boolean14 = extendedBufferedReader6.markSupported();
        int int15 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader16);
        extendedBufferedReader17.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream12 = extendedBufferedReader6.lines();
        boolean boolean13 = extendedBufferedReader6.markSupported();
        int int14 = extendedBufferedReader6.lookAhead();
        int int15 = extendedBufferedReader6.readAgain();
        int int16 = extendedBufferedReader6.readAgain();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.lookAhead();
        int int10 = extendedBufferedReader6.lookAhead();
        int int11 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.mark(0);
        java.util.stream.Stream<java.lang.String> strStream14 = extendedBufferedReader6.lines();
        int int15 = extendedBufferedReader6.getLineNumber();
        extendedBufferedReader6.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.util.stream.Stream<java.lang.String> strStream18 = extendedBufferedReader17.lines();
        boolean boolean19 = extendedBufferedReader17.markSupported();
        extendedBufferedReader17.mark(100);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        java.util.stream.Stream<java.lang.String> strStream3 = extendedBufferedReader1.lines();
        int int4 = extendedBufferedReader1.readAgain();
        boolean boolean5 = extendedBufferedReader1.markSupported();
        long long7 = extendedBufferedReader1.skip((long) '#');
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        int int12 = extendedBufferedReader6.getLineNumber();
        int int13 = extendedBufferedReader6.readAgain();
        int int14 = extendedBufferedReader6.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream15 = extendedBufferedReader6.lines();
        java.lang.Class<?> wildcardClass16 = strStream15.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strStream15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.read();
        java.util.stream.Stream<java.lang.String> strStream11 = extendedBufferedReader9.lines();
        int int12 = extendedBufferedReader9.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        extendedBufferedReader13.close();
        java.io.Reader reader15 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader(reader15);
        boolean boolean17 = extendedBufferedReader16.markSupported();
        java.util.stream.Stream<java.lang.String> strStream18 = extendedBufferedReader16.lines();
        extendedBufferedReader16.mark((int) (byte) 10);
        extendedBufferedReader16.reset();
        java.io.Reader reader22 = java.io.Reader.nullReader();
        char[] charArray26 = new char[] { '4', ' ', 'a' };
        int int27 = reader22.read(charArray26);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader28 = new org.apache.commons.csv.ExtendedBufferedReader(reader22);
        int int29 = extendedBufferedReader28.lookAhead();
        java.lang.String str30 = extendedBufferedReader28.readLine();
        java.io.Reader reader31 = java.io.Reader.nullReader();
        char[] charArray35 = new char[] { '4', ' ', 'a' };
        int int36 = reader31.read(charArray35);
        int int37 = extendedBufferedReader28.read(charArray35);
        int int38 = extendedBufferedReader16.read(charArray35);
        int int41 = extendedBufferedReader13.read(charArray35, (-2), 0);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertNotNull(reader22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(reader31);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.lang.String str7 = extendedBufferedReader6.readLine();
        int int8 = extendedBufferedReader6.read();
        int int9 = extendedBufferedReader6.readAgain();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int11 = extendedBufferedReader10.read();
        extendedBufferedReader10.mark(0);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader2 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int3 = extendedBufferedReader2.read();
        java.io.Reader reader4 = java.io.Reader.nullReader();
        char[] charArray8 = new char[] { '4', ' ', 'a' };
        int int9 = reader4.read(charArray8);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader4);
        int int11 = extendedBufferedReader10.lookAhead();
        java.lang.String str12 = extendedBufferedReader10.readLine();
        int int13 = extendedBufferedReader10.lookAhead();
        java.io.Reader reader14 = java.io.Reader.nullReader();
        char[] charArray18 = new char[] { '4', ' ', 'a' };
        int int19 = reader14.read(charArray18);
        char[] charArray25 = new char[] { '4', ' ', '#', '4', ' ' };
        int int26 = reader14.read(charArray25);
        int int27 = extendedBufferedReader10.read(charArray25);
        java.io.Reader reader28 = java.io.Reader.nullReader();
        char[] charArray32 = new char[] { '4', ' ', 'a' };
        int int33 = reader28.read(charArray32);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader34 = new org.apache.commons.csv.ExtendedBufferedReader(reader28);
        int int35 = extendedBufferedReader34.lookAhead();
        boolean boolean36 = extendedBufferedReader34.markSupported();
        java.io.Reader reader37 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader38 = new org.apache.commons.csv.ExtendedBufferedReader(reader37);
        char[] charArray40 = new char[] { ' ' };
        int int41 = reader37.read(charArray40);
        int int42 = extendedBufferedReader34.read(charArray40);
        int int43 = extendedBufferedReader10.read(charArray40);
        int int44 = extendedBufferedReader2.read(charArray40);
        int int45 = extendedBufferedReader2.lookAhead();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(reader4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(reader28);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(reader37);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.lang.String str7 = extendedBufferedReader6.readLine();
        int int8 = extendedBufferedReader6.read();
        int int9 = extendedBufferedReader6.getLineNumber();
        int int10 = extendedBufferedReader6.lookAhead();
        int int11 = extendedBufferedReader6.readAgain();
        extendedBufferedReader6.reset();
        int int13 = extendedBufferedReader6.lookAhead();
        java.util.stream.Stream<java.lang.String> strStream14 = extendedBufferedReader6.lines();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strStream14);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.read();
        java.util.stream.Stream<java.lang.String> strStream11 = extendedBufferedReader9.lines();
        int int12 = extendedBufferedReader9.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        java.util.stream.Stream<java.lang.String> strStream15 = extendedBufferedReader9.lines();
        int int16 = extendedBufferedReader9.getLineNumber();
        int int17 = extendedBufferedReader9.lookAhead();
        int int18 = extendedBufferedReader9.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        extendedBufferedReader9.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.read();
        java.util.stream.Stream<java.lang.String> strStream11 = extendedBufferedReader9.lines();
        int int12 = extendedBufferedReader9.readAgain();
        java.lang.String str13 = extendedBufferedReader9.readLine();
        extendedBufferedReader9.mark(10);
        java.io.Reader reader16 = java.io.Reader.nullReader();
        char[] charArray20 = new char[] { '4', ' ', 'a' };
        int int21 = reader16.read(charArray20);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        int int23 = extendedBufferedReader22.lookAhead();
        int int24 = extendedBufferedReader22.read();
        char[] charArray25 = new char[] {};
        int int28 = extendedBufferedReader22.read(charArray25, (int) (byte) -1, (int) (byte) 0);
        int int29 = extendedBufferedReader9.read(charArray25);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.read();
        java.util.stream.Stream<java.lang.String> strStream11 = extendedBufferedReader9.lines();
        int int12 = extendedBufferedReader9.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        java.util.stream.Stream<java.lang.String> strStream15 = extendedBufferedReader9.lines();
        int int16 = extendedBufferedReader9.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        boolean boolean18 = extendedBufferedReader9.markSupported();
        extendedBufferedReader9.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int11 = extendedBufferedReader6.readAgain();
        boolean boolean12 = extendedBufferedReader6.markSupported();
        int int13 = extendedBufferedReader6.readAgain();
        extendedBufferedReader6.close();
        extendedBufferedReader6.close();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedBufferedReader6.lookAhead();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        int int12 = extendedBufferedReader6.getLineNumber();
        int int13 = extendedBufferedReader6.readAgain();
        boolean boolean14 = extendedBufferedReader6.markSupported();
        int int15 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.lang.String str17 = extendedBufferedReader16.readLine();
        long long19 = extendedBufferedReader16.skip((long) (byte) 1);
        java.lang.Class<?> wildcardClass20 = extendedBufferedReader16.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        char[] charArray11 = new char[] { '4', ' ', '#', '4', ' ' };
        int int12 = reader0.read(charArray11);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] { '4', ' ', 'a' };
        int int18 = reader13.read(charArray17);
        char[] charArray24 = new char[] { '4', ' ', '#', '4', ' ' };
        int int25 = reader13.read(charArray24);
        int int26 = reader0.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int28 = extendedBufferedReader27.getLineNumber();
        int int29 = extendedBufferedReader27.read();
        boolean boolean30 = extendedBufferedReader27.markSupported();
        long long32 = extendedBufferedReader27.skip((long) (byte) 10);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.lang.String str7 = extendedBufferedReader6.readLine();
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray12 = new char[] { '4', ' ', 'a' };
        int int13 = reader8.read(charArray12);
        char[] charArray19 = new char[] { '4', ' ', '#', '4', ' ' };
        int int20 = reader8.read(charArray19);
        java.io.Reader reader21 = java.io.Reader.nullReader();
        char[] charArray25 = new char[] { '4', ' ', 'a' };
        int int26 = reader21.read(charArray25);
        char[] charArray32 = new char[] { '4', ' ', '#', '4', ' ' };
        int int33 = reader21.read(charArray32);
        int int34 = reader8.read(charArray32);
        int int35 = extendedBufferedReader6.read(charArray32);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader36 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        long long38 = extendedBufferedReader6.skip((long) ' ');
        java.util.stream.Stream<java.lang.String> strStream39 = extendedBufferedReader6.lines();
        java.io.Reader reader40 = java.io.Reader.nullReader();
        char[] charArray44 = new char[] { '4', ' ', 'a' };
        int int45 = reader40.read(charArray44);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader46 = new org.apache.commons.csv.ExtendedBufferedReader(reader40);
        java.lang.String str47 = extendedBufferedReader46.readLine();
        int int48 = extendedBufferedReader46.getLineNumber();
        java.io.Reader reader49 = java.io.Reader.nullReader();
        char[] charArray53 = new char[] { '4', ' ', 'a' };
        int int54 = reader49.read(charArray53);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader55 = new org.apache.commons.csv.ExtendedBufferedReader(reader49);
        int int56 = extendedBufferedReader55.lookAhead();
        java.lang.String str57 = extendedBufferedReader55.readLine();
        int int58 = extendedBufferedReader55.lookAhead();
        java.io.Reader reader59 = java.io.Reader.nullReader();
        char[] charArray63 = new char[] { '4', ' ', 'a' };
        int int64 = reader59.read(charArray63);
        char[] charArray70 = new char[] { '4', ' ', '#', '4', ' ' };
        int int71 = reader59.read(charArray70);
        int int72 = extendedBufferedReader55.read(charArray70);
        int int73 = extendedBufferedReader46.read(charArray70);
        int int76 = extendedBufferedReader6.read(charArray70, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(reader21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(strStream39);
        org.junit.Assert.assertNotNull(reader40);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(reader49);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(reader59);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream12 = extendedBufferedReader6.lines();
        boolean boolean13 = extendedBufferedReader6.markSupported();
        int int14 = extendedBufferedReader6.getLineNumber();
        java.lang.String str15 = extendedBufferedReader6.readLine();
        long long17 = extendedBufferedReader6.skip((long) 100);
        int int18 = extendedBufferedReader6.lookAhead();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int13 = extendedBufferedReader6.readAgain();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.lang.String str15 = extendedBufferedReader14.readLine();
        java.io.Reader reader16 = java.io.Reader.nullReader();
        char[] charArray20 = new char[] { '4', ' ', 'a' };
        int int21 = reader16.read(charArray20);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        int int23 = extendedBufferedReader22.lookAhead();
        int int24 = extendedBufferedReader22.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader22);
        int int26 = extendedBufferedReader25.read();
        java.util.stream.Stream<java.lang.String> strStream27 = extendedBufferedReader25.lines();
        java.io.Reader reader28 = java.io.Reader.nullReader();
        char[] charArray32 = new char[] { '4', ' ', 'a' };
        int int33 = reader28.read(charArray32);
        char[] charArray39 = new char[] { '4', ' ', '#', '4', ' ' };
        int int40 = reader28.read(charArray39);
        java.io.Reader reader41 = java.io.Reader.nullReader();
        char[] charArray45 = new char[] { '4', ' ', 'a' };
        int int46 = reader41.read(charArray45);
        char[] charArray52 = new char[] { '4', ' ', '#', '4', ' ' };
        int int53 = reader41.read(charArray52);
        int int54 = reader28.read(charArray52);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader55 = new org.apache.commons.csv.ExtendedBufferedReader(reader28);
        java.io.Reader reader56 = java.io.Reader.nullReader();
        char[] charArray60 = new char[] { '4', ' ', 'a' };
        int int61 = reader56.read(charArray60);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader62 = new org.apache.commons.csv.ExtendedBufferedReader(reader56);
        int int63 = extendedBufferedReader62.lookAhead();
        java.lang.String str64 = extendedBufferedReader62.readLine();
        java.io.Reader reader65 = java.io.Reader.nullReader();
        char[] charArray69 = new char[] { '4', ' ', 'a' };
        int int70 = reader65.read(charArray69);
        int int71 = extendedBufferedReader62.read(charArray69);
        int int72 = reader28.read(charArray69);
        int int73 = extendedBufferedReader25.read(charArray69);
        int int74 = extendedBufferedReader14.read(charArray69);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strStream27);
        org.junit.Assert.assertNotNull(reader28);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(reader41);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(reader56);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(reader65);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        char[] charArray11 = new char[] { '4', ' ', '#', '4', ' ' };
        int int12 = reader0.read(charArray11);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] { '4', ' ', 'a' };
        int int18 = reader13.read(charArray17);
        char[] charArray24 = new char[] { '4', ' ', '#', '4', ' ' };
        int int25 = reader13.read(charArray24);
        int int26 = reader0.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int28 = extendedBufferedReader27.getLineNumber();
        int int29 = extendedBufferedReader27.lookAhead();
        int int30 = extendedBufferedReader27.read();
        extendedBufferedReader27.mark((int) (byte) 1);
        boolean boolean33 = extendedBufferedReader27.markSupported();
        java.lang.String str34 = extendedBufferedReader27.readLine();
        int int35 = extendedBufferedReader27.readAgain();
        extendedBufferedReader27.reset();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        extendedBufferedReader6.reset();
        int int10 = extendedBufferedReader6.getLineNumber();
        long long12 = extendedBufferedReader6.skip((long) '4');
        java.lang.String str13 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int15 = extendedBufferedReader14.lookAhead();
        int int16 = extendedBufferedReader14.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        long long11 = extendedBufferedReader6.skip((long) (byte) 10);
        int int12 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.util.stream.Stream<java.lang.String> strStream15 = extendedBufferedReader6.lines();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = extendedBufferedReader6.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strStream15);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream12 = extendedBufferedReader6.lines();
        extendedBufferedReader6.mark((int) (short) 10);
        extendedBufferedReader6.reset();
        int int16 = extendedBufferedReader6.getLineNumber();
        java.io.Reader reader17 = java.io.Reader.nullReader();
        char[] charArray21 = new char[] { '4', ' ', 'a' };
        int int22 = reader17.read(charArray21);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader(reader17);
        int int24 = extendedBufferedReader23.lookAhead();
        java.lang.String str25 = extendedBufferedReader23.readLine();
        java.io.Reader reader26 = java.io.Reader.nullReader();
        char[] charArray30 = new char[] { '4', ' ', 'a' };
        int int31 = reader26.read(charArray30);
        int int32 = extendedBufferedReader23.read(charArray30);
        int int33 = extendedBufferedReader23.readAgain();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader34 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader23);
        extendedBufferedReader34.mark((int) (byte) 100);
        java.io.Reader reader37 = java.io.Reader.nullReader();
        char[] charArray41 = new char[] { '4', ' ', 'a' };
        int int42 = reader37.read(charArray41);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader43 = new org.apache.commons.csv.ExtendedBufferedReader(reader37);
        int int44 = extendedBufferedReader43.lookAhead();
        java.lang.String str45 = extendedBufferedReader43.readLine();
        java.lang.String str46 = extendedBufferedReader43.readLine();
        boolean boolean47 = extendedBufferedReader43.markSupported();
        int int48 = extendedBufferedReader43.getLineNumber();
        int int49 = extendedBufferedReader43.getLineNumber();
        int int50 = extendedBufferedReader43.readAgain();
        java.io.Reader reader51 = java.io.Reader.nullReader();
        char[] charArray55 = new char[] { '4', ' ', 'a' };
        int int56 = reader51.read(charArray55);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader57 = new org.apache.commons.csv.ExtendedBufferedReader(reader51);
        int int58 = extendedBufferedReader57.lookAhead();
        java.lang.String str59 = extendedBufferedReader57.readLine();
        java.lang.String str60 = extendedBufferedReader57.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader61 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader57);
        int int62 = extendedBufferedReader57.readAgain();
        extendedBufferedReader57.mark((int) (byte) 0);
        int int65 = extendedBufferedReader57.getLineNumber();
        char[] charArray72 = new char[] { ' ', 'a', '4', '4', '4', '#' };
        int int73 = extendedBufferedReader57.read(charArray72);
        int int76 = extendedBufferedReader43.read(charArray72, (int) '4', (int) (byte) 0);
        int int77 = extendedBufferedReader34.read(charArray72);
        int int78 = extendedBufferedReader6.read(charArray72);
        java.util.stream.Stream<java.lang.String> strStream79 = extendedBufferedReader6.lines();
        java.lang.Class<?> wildcardClass80 = extendedBufferedReader6.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(reader17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(reader26);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(reader37);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(reader51);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { ' ', 'a', '4', '4', '4', '#' });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(strStream79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        int int3 = extendedBufferedReader1.lookAhead();
        int int4 = extendedBufferedReader1.lookAhead();
        int int5 = extendedBufferedReader1.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int7 = extendedBufferedReader1.lookAhead();
        boolean boolean8 = extendedBufferedReader1.markSupported();
        java.nio.CharBuffer charBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedBufferedReader1.read(charBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        java.util.stream.Stream<java.lang.String> strStream9 = extendedBufferedReader6.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int12 = extendedBufferedReader6.readAgain();
        java.lang.Class<?> wildcardClass13 = extendedBufferedReader6.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int13 = extendedBufferedReader6.readAgain();
        int int14 = extendedBufferedReader6.read();
        java.io.Reader reader15 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader(reader15);
        char[] charArray18 = new char[] { ' ' };
        int int19 = reader15.read(charArray18);
        int int20 = extendedBufferedReader6.read(charArray18);
        java.io.Reader reader21 = java.io.Reader.nullReader();
        char[] charArray25 = new char[] { '4', ' ', 'a' };
        int int26 = reader21.read(charArray25);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader21);
        int int28 = extendedBufferedReader27.lookAhead();
        java.lang.String str29 = extendedBufferedReader27.readLine();
        java.lang.String str30 = extendedBufferedReader27.readLine();
        boolean boolean31 = extendedBufferedReader27.markSupported();
        java.io.Reader reader32 = java.io.Reader.nullReader();
        char[] charArray36 = new char[] { '4', ' ', 'a' };
        int int37 = reader32.read(charArray36);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader38 = new org.apache.commons.csv.ExtendedBufferedReader(reader32);
        int int39 = extendedBufferedReader38.lookAhead();
        int int40 = extendedBufferedReader38.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader41 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader38);
        int int42 = extendedBufferedReader38.lookAhead();
        java.io.Reader reader43 = java.io.Reader.nullReader();
        char[] charArray47 = new char[] { '4', ' ', 'a' };
        int int48 = reader43.read(charArray47);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader49 = new org.apache.commons.csv.ExtendedBufferedReader(reader43);
        int int50 = extendedBufferedReader49.lookAhead();
        java.lang.String str51 = extendedBufferedReader49.readLine();
        java.io.Reader reader52 = java.io.Reader.nullReader();
        char[] charArray56 = new char[] { '4', ' ', 'a' };
        int int57 = reader52.read(charArray56);
        int int58 = extendedBufferedReader49.read(charArray56);
        int int59 = extendedBufferedReader38.read(charArray56);
        int int60 = extendedBufferedReader27.read(charArray56);
        int int61 = extendedBufferedReader6.read(charArray56);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader62 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader63 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.nio.CharBuffer charBuffer64 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int65 = extendedBufferedReader63.read(charBuffer64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(reader21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(reader32);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(reader43);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(reader52);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader6.lookAhead();
        int int11 = extendedBufferedReader6.getLineNumber();
        int int12 = extendedBufferedReader6.lookAhead();
        int int13 = extendedBufferedReader6.lookAhead();
        long long15 = extendedBufferedReader6.skip((long) 10);
        boolean boolean16 = extendedBufferedReader6.markSupported();
        java.io.Reader reader17 = java.io.Reader.nullReader();
        char[] charArray21 = new char[] { '4', ' ', 'a' };
        int int22 = reader17.read(charArray21);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader(reader17);
        int int24 = extendedBufferedReader23.lookAhead();
        int int25 = extendedBufferedReader23.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader26 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader23);
        int int27 = extendedBufferedReader26.read();
        java.util.stream.Stream<java.lang.String> strStream28 = extendedBufferedReader26.lines();
        int int29 = extendedBufferedReader26.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader30 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader26);
        java.io.Reader reader31 = java.io.Reader.nullReader();
        char[] charArray35 = new char[] { '4', ' ', 'a' };
        int int36 = reader31.read(charArray35);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader37 = new org.apache.commons.csv.ExtendedBufferedReader(reader31);
        int int38 = extendedBufferedReader37.lookAhead();
        java.lang.String str39 = extendedBufferedReader37.readLine();
        int int40 = extendedBufferedReader37.lookAhead();
        extendedBufferedReader37.reset();
        int int42 = extendedBufferedReader37.getLineNumber();
        java.io.Reader reader43 = java.io.Reader.nullReader();
        char[] charArray47 = new char[] { '4', ' ', 'a' };
        int int48 = reader43.read(charArray47);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader49 = new org.apache.commons.csv.ExtendedBufferedReader(reader43);
        int int50 = extendedBufferedReader49.lookAhead();
        int int51 = extendedBufferedReader49.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader52 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader49);
        int int53 = extendedBufferedReader49.lookAhead();
        java.io.Reader reader54 = java.io.Reader.nullReader();
        char[] charArray58 = new char[] { '4', ' ', 'a' };
        int int59 = reader54.read(charArray58);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader60 = new org.apache.commons.csv.ExtendedBufferedReader(reader54);
        int int61 = extendedBufferedReader60.lookAhead();
        java.lang.String str62 = extendedBufferedReader60.readLine();
        java.io.Reader reader63 = java.io.Reader.nullReader();
        char[] charArray67 = new char[] { '4', ' ', 'a' };
        int int68 = reader63.read(charArray67);
        int int69 = extendedBufferedReader60.read(charArray67);
        int int70 = extendedBufferedReader49.read(charArray67);
        int int71 = extendedBufferedReader37.read(charArray67);
        int int72 = extendedBufferedReader30.read(charArray67);
        int int73 = extendedBufferedReader6.read(charArray67);
        boolean boolean74 = extendedBufferedReader6.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(reader17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strStream28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(reader31);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(reader43);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(reader54);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(reader63);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        java.util.stream.Stream<java.lang.String> strStream3 = extendedBufferedReader1.lines();
        int int4 = extendedBufferedReader1.readAgain();
        int int5 = extendedBufferedReader1.lookAhead();
        extendedBufferedReader1.close();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        extendedBufferedReader7.mark(10);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader7);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader1.close();
        boolean boolean3 = extendedBufferedReader1.markSupported();
        boolean boolean4 = extendedBufferedReader1.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        java.io.Reader reader6 = java.io.Reader.nullReader();
        char[] charArray10 = new char[] { '4', ' ', 'a' };
        int int11 = reader6.read(charArray10);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader6);
        int int13 = extendedBufferedReader12.lookAhead();
        java.lang.String str14 = extendedBufferedReader12.readLine();
        java.lang.String str15 = extendedBufferedReader12.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader12);
        int int17 = extendedBufferedReader12.readAgain();
        long long19 = extendedBufferedReader12.skip((long) (short) 100);
        extendedBufferedReader12.mark((int) (byte) 100);
        java.io.Reader reader22 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader(reader22);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader23);
        int int25 = extendedBufferedReader23.read();
        java.lang.String str26 = extendedBufferedReader23.readLine();
        boolean boolean27 = extendedBufferedReader23.markSupported();
        java.io.Reader reader28 = java.io.Reader.nullReader();
        char[] charArray32 = new char[] { '4', ' ', 'a' };
        int int33 = reader28.read(charArray32);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader34 = new org.apache.commons.csv.ExtendedBufferedReader(reader28);
        int int35 = extendedBufferedReader34.lookAhead();
        java.lang.String str36 = extendedBufferedReader34.readLine();
        java.lang.String str37 = extendedBufferedReader34.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader38 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader34);
        int int39 = extendedBufferedReader34.readAgain();
        boolean boolean40 = extendedBufferedReader34.markSupported();
        int int41 = extendedBufferedReader34.readAgain();
        java.io.Reader reader42 = java.io.Reader.nullReader();
        char[] charArray46 = new char[] { '4', ' ', 'a' };
        int int47 = reader42.read(charArray46);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader48 = new org.apache.commons.csv.ExtendedBufferedReader(reader42);
        java.util.stream.Stream<java.lang.String> strStream49 = extendedBufferedReader48.lines();
        int int50 = extendedBufferedReader48.readAgain();
        int int51 = extendedBufferedReader48.lookAhead();
        int int52 = extendedBufferedReader48.lookAhead();
        int int53 = extendedBufferedReader48.lookAhead();
        java.io.Reader reader54 = java.io.Reader.nullReader();
        char[] charArray58 = new char[] { '4', ' ', 'a' };
        int int59 = reader54.read(charArray58);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader60 = new org.apache.commons.csv.ExtendedBufferedReader(reader54);
        java.lang.String str61 = extendedBufferedReader60.readLine();
        java.io.Reader reader62 = java.io.Reader.nullReader();
        char[] charArray66 = new char[] { '4', ' ', 'a' };
        int int67 = reader62.read(charArray66);
        char[] charArray73 = new char[] { '4', ' ', '#', '4', ' ' };
        int int74 = reader62.read(charArray73);
        java.io.Reader reader75 = java.io.Reader.nullReader();
        char[] charArray79 = new char[] { '4', ' ', 'a' };
        int int80 = reader75.read(charArray79);
        char[] charArray86 = new char[] { '4', ' ', '#', '4', ' ' };
        int int87 = reader75.read(charArray86);
        int int88 = reader62.read(charArray86);
        int int89 = extendedBufferedReader60.read(charArray86);
        int int90 = extendedBufferedReader48.read(charArray86);
        int int91 = extendedBufferedReader34.read(charArray86);
        int int92 = extendedBufferedReader23.read(charArray86);
        int int93 = extendedBufferedReader12.read(charArray86);
        // The following exception was thrown during execution in test generation
        try {
            int int96 = extendedBufferedReader5.read(charArray86, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(reader22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(reader28);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(reader42);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strStream49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-2) + "'", int50 == (-2));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(reader54);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(reader62);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(reader75);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertArrayEquals(charArray86, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream12 = extendedBufferedReader6.lines();
        boolean boolean13 = extendedBufferedReader6.markSupported();
        int int14 = extendedBufferedReader6.getLineNumber();
        java.lang.String str15 = extendedBufferedReader6.readLine();
        int int16 = extendedBufferedReader6.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        long long14 = extendedBufferedReader6.skip((long) (short) 1);
        int int15 = extendedBufferedReader6.read();
        extendedBufferedReader6.mark((int) (short) 100);
        int int18 = extendedBufferedReader6.readAgain();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.getLineNumber();
        java.lang.String str11 = extendedBufferedReader9.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        boolean boolean13 = extendedBufferedReader12.markSupported();
        extendedBufferedReader12.mark(0);
        java.lang.String str16 = extendedBufferedReader12.readLine();
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = extendedBufferedReader12.transferTo(writer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] { '4', ' ', 'a' };
        int int14 = reader9.read(charArray13);
        int int15 = extendedBufferedReader6.read(charArray13);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        boolean boolean17 = extendedBufferedReader16.markSupported();
        java.lang.String str18 = extendedBufferedReader16.readLine();
        int int19 = extendedBufferedReader16.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        java.util.stream.Stream<java.lang.String> strStream5 = extendedBufferedReader1.lines();
        extendedBufferedReader1.mark(0);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader8 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        boolean boolean9 = extendedBufferedReader1.markSupported();
        extendedBufferedReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = extendedBufferedReader1.skip((long) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.lang.String str7 = extendedBufferedReader6.readLine();
        int int8 = extendedBufferedReader6.read();
        int int9 = extendedBufferedReader6.getLineNumber();
        int int10 = extendedBufferedReader6.lookAhead();
        int int11 = extendedBufferedReader6.readAgain();
        boolean boolean12 = extendedBufferedReader6.markSupported();
        extendedBufferedReader6.reset();
        boolean boolean14 = extendedBufferedReader6.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.mark((int) '#');
        boolean boolean12 = extendedBufferedReader6.markSupported();
        extendedBufferedReader6.mark(10);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.reset();
        int int12 = extendedBufferedReader6.getLineNumber();
        int int13 = extendedBufferedReader6.getLineNumber();
        java.nio.CharBuffer charBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = extendedBufferedReader6.read(charBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        boolean boolean8 = extendedBufferedReader6.markSupported();
        int int9 = extendedBufferedReader6.read();
        java.io.Reader reader10 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', ' ', 'a' };
        int int15 = reader10.read(charArray14);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader(reader10);
        java.lang.String str17 = extendedBufferedReader16.readLine();
        int int18 = extendedBufferedReader16.read();
        int int19 = extendedBufferedReader16.getLineNumber();
        int int20 = extendedBufferedReader16.lookAhead();
        int int21 = extendedBufferedReader16.readAgain();
        extendedBufferedReader16.reset();
        int int23 = extendedBufferedReader16.readAgain();
        java.io.Reader reader24 = java.io.Reader.nullReader();
        char[] charArray28 = new char[] { '4', ' ', 'a' };
        int int29 = reader24.read(charArray28);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader30 = new org.apache.commons.csv.ExtendedBufferedReader(reader24);
        int int31 = extendedBufferedReader30.lookAhead();
        java.lang.String str32 = extendedBufferedReader30.readLine();
        int int33 = extendedBufferedReader30.lookAhead();
        extendedBufferedReader30.reset();
        int int35 = extendedBufferedReader30.getLineNumber();
        java.io.Reader reader36 = java.io.Reader.nullReader();
        char[] charArray40 = new char[] { '4', ' ', 'a' };
        int int41 = reader36.read(charArray40);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader42 = new org.apache.commons.csv.ExtendedBufferedReader(reader36);
        int int43 = extendedBufferedReader42.lookAhead();
        int int44 = extendedBufferedReader42.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader45 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader42);
        int int46 = extendedBufferedReader42.lookAhead();
        java.io.Reader reader47 = java.io.Reader.nullReader();
        char[] charArray51 = new char[] { '4', ' ', 'a' };
        int int52 = reader47.read(charArray51);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader53 = new org.apache.commons.csv.ExtendedBufferedReader(reader47);
        int int54 = extendedBufferedReader53.lookAhead();
        java.lang.String str55 = extendedBufferedReader53.readLine();
        java.io.Reader reader56 = java.io.Reader.nullReader();
        char[] charArray60 = new char[] { '4', ' ', 'a' };
        int int61 = reader56.read(charArray60);
        int int62 = extendedBufferedReader53.read(charArray60);
        int int63 = extendedBufferedReader42.read(charArray60);
        int int64 = extendedBufferedReader30.read(charArray60);
        int int65 = extendedBufferedReader16.read(charArray60);
        int int66 = extendedBufferedReader6.read(charArray60);
        java.nio.CharBuffer charBuffer67 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int68 = extendedBufferedReader6.read(charBuffer67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(reader24);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(reader36);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(reader47);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(reader56);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        extendedBufferedReader6.reset();
        int int10 = extendedBufferedReader6.getLineNumber();
        long long12 = extendedBufferedReader6.skip((long) '4');
        extendedBufferedReader6.mark((int) (short) 10);
        extendedBufferedReader6.mark((int) (byte) 0);
        int int17 = extendedBufferedReader6.getLineNumber();
        int int18 = extendedBufferedReader6.read();
        extendedBufferedReader6.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        char[] charArray11 = new char[] { '4', ' ', '#', '4', ' ' };
        int int12 = reader0.read(charArray11);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] { '4', ' ', 'a' };
        int int18 = reader13.read(charArray17);
        char[] charArray24 = new char[] { '4', ' ', '#', '4', ' ' };
        int int25 = reader13.read(charArray24);
        int int26 = reader0.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int28 = extendedBufferedReader27.getLineNumber();
        int int29 = extendedBufferedReader27.lookAhead();
        boolean boolean30 = extendedBufferedReader27.markSupported();
        java.util.stream.Stream<java.lang.String> strStream31 = extendedBufferedReader27.lines();
        extendedBufferedReader27.close();
        int int33 = extendedBufferedReader27.getLineNumber();
        boolean boolean34 = extendedBufferedReader27.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strStream31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.lang.String str7 = extendedBufferedReader6.readLine();
        int int8 = extendedBufferedReader6.read();
        int int9 = extendedBufferedReader6.lookAhead();
        int int10 = extendedBufferedReader6.readAgain();
        int int11 = extendedBufferedReader6.readAgain();
        int int12 = extendedBufferedReader6.lookAhead();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        char[] charArray11 = new char[] { '4', ' ', '#', '4', ' ' };
        int int12 = reader0.read(charArray11);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] { '4', ' ', 'a' };
        int int18 = reader13.read(charArray17);
        char[] charArray24 = new char[] { '4', ' ', '#', '4', ' ' };
        int int25 = reader13.read(charArray24);
        int int26 = reader0.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean28 = extendedBufferedReader27.markSupported();
        int int29 = extendedBufferedReader27.lookAhead();
        int int30 = extendedBufferedReader27.readAgain();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.lang.String str7 = extendedBufferedReader6.readLine();
        int int8 = extendedBufferedReader6.read();
        boolean boolean9 = extendedBufferedReader6.markSupported();
        int int10 = extendedBufferedReader6.getLineNumber();
        java.lang.String str11 = extendedBufferedReader6.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.read();
        java.util.stream.Stream<java.lang.String> strStream11 = extendedBufferedReader9.lines();
        int int12 = extendedBufferedReader9.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        java.io.Reader reader14 = java.io.Reader.nullReader();
        char[] charArray18 = new char[] { '4', ' ', 'a' };
        int int19 = reader14.read(charArray18);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        int int21 = extendedBufferedReader20.lookAhead();
        java.lang.String str22 = extendedBufferedReader20.readLine();
        extendedBufferedReader20.reset();
        int int24 = extendedBufferedReader20.getLineNumber();
        char[] charArray31 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int32 = extendedBufferedReader20.read(charArray31);
        int int33 = extendedBufferedReader9.read(charArray31);
        long long35 = extendedBufferedReader9.skip(1L);
        char[] charArray41 = new char[] { '#', ' ', 'a', 'a', 'a' };
        int int44 = extendedBufferedReader9.read(charArray41, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader9.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '#', ' ', 'a', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        boolean boolean10 = extendedBufferedReader6.markSupported();
        boolean boolean11 = extendedBufferedReader6.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.reset();
        extendedBufferedReader6.reset();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.getLineNumber();
        java.lang.String str11 = extendedBufferedReader9.readLine();
        int int12 = extendedBufferedReader9.getLineNumber();
        boolean boolean13 = extendedBufferedReader9.markSupported();
        int int14 = extendedBufferedReader9.getLineNumber();
        int int15 = extendedBufferedReader9.getLineNumber();
        java.io.Reader reader16 = java.io.Reader.nullReader();
        char[] charArray20 = new char[] { '4', ' ', 'a' };
        int int21 = reader16.read(charArray20);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        int int23 = extendedBufferedReader22.lookAhead();
        java.lang.String str24 = extendedBufferedReader22.readLine();
        java.lang.String str25 = extendedBufferedReader22.readLine();
        boolean boolean26 = extendedBufferedReader22.markSupported();
        int int27 = extendedBufferedReader22.getLineNumber();
        int int28 = extendedBufferedReader22.getLineNumber();
        int int29 = extendedBufferedReader22.readAgain();
        boolean boolean30 = extendedBufferedReader22.markSupported();
        int int31 = extendedBufferedReader22.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader32 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader22);
        java.lang.String str33 = extendedBufferedReader32.readLine();
        java.util.stream.Stream<java.lang.String> strStream34 = extendedBufferedReader32.lines();
        int int35 = extendedBufferedReader32.getLineNumber();
        java.io.Reader reader36 = java.io.Reader.nullReader();
        char[] charArray40 = new char[] { '4', ' ', 'a' };
        int int41 = reader36.read(charArray40);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader42 = new org.apache.commons.csv.ExtendedBufferedReader(reader36);
        int int43 = extendedBufferedReader42.lookAhead();
        int int44 = extendedBufferedReader42.read();
        char[] charArray45 = new char[] {};
        int int48 = extendedBufferedReader42.read(charArray45, (int) (byte) -1, (int) (byte) 0);
        int int49 = extendedBufferedReader32.read(charArray45);
        int int50 = extendedBufferedReader9.read(charArray45);
        java.lang.String str51 = extendedBufferedReader9.readLine();
        extendedBufferedReader9.mark((int) (short) 100);
        int int54 = extendedBufferedReader9.read();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strStream34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(reader36);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.lookAhead();
        int int10 = extendedBufferedReader6.lookAhead();
        int int11 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.mark(0);
        extendedBufferedReader6.mark((int) (byte) 10);
        boolean boolean16 = extendedBufferedReader6.markSupported();
        int int17 = extendedBufferedReader6.lookAhead();
        long long19 = extendedBufferedReader6.skip(100L);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader6.lookAhead();
        int int11 = extendedBufferedReader6.getLineNumber();
        int int12 = extendedBufferedReader6.lookAhead();
        int int13 = extendedBufferedReader6.lookAhead();
        long long15 = extendedBufferedReader6.skip((long) 10);
        boolean boolean16 = extendedBufferedReader6.markSupported();
        java.util.stream.Stream<java.lang.String> strStream17 = extendedBufferedReader6.lines();
        java.lang.Class<?> wildcardClass18 = extendedBufferedReader6.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strStream17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.reset();
        extendedBufferedReader6.mark((int) (byte) 10);
        int int14 = extendedBufferedReader6.read();
        extendedBufferedReader6.mark((int) '4');
        int int17 = extendedBufferedReader6.read();
        int int18 = extendedBufferedReader6.read();
        extendedBufferedReader6.reset();
        java.io.Reader reader20 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] { '4', ' ', 'a' };
        int int25 = reader20.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader26 = new org.apache.commons.csv.ExtendedBufferedReader(reader20);
        java.util.stream.Stream<java.lang.String> strStream27 = extendedBufferedReader26.lines();
        int int28 = extendedBufferedReader26.readAgain();
        int int29 = extendedBufferedReader26.lookAhead();
        int int30 = extendedBufferedReader26.lookAhead();
        int int31 = extendedBufferedReader26.lookAhead();
        extendedBufferedReader26.mark(0);
        java.util.stream.Stream<java.lang.String> strStream34 = extendedBufferedReader26.lines();
        int int35 = extendedBufferedReader26.getLineNumber();
        java.lang.String str36 = extendedBufferedReader26.readLine();
        java.io.Reader reader37 = java.io.Reader.nullReader();
        char[] charArray41 = new char[] { '4', ' ', 'a' };
        int int42 = reader37.read(charArray41);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader43 = new org.apache.commons.csv.ExtendedBufferedReader(reader37);
        int int44 = extendedBufferedReader43.lookAhead();
        int int45 = extendedBufferedReader43.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader46 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader43);
        extendedBufferedReader43.mark((int) '#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader49 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader43);
        int int50 = extendedBufferedReader43.readAgain();
        int int51 = extendedBufferedReader43.getLineNumber();
        java.io.Reader reader52 = java.io.Reader.nullReader();
        char[] charArray56 = new char[] { '4', ' ', 'a' };
        int int57 = reader52.read(charArray56);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader58 = new org.apache.commons.csv.ExtendedBufferedReader(reader52);
        int int59 = extendedBufferedReader58.lookAhead();
        int int60 = extendedBufferedReader58.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader61 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader58);
        int int62 = extendedBufferedReader61.read();
        int int63 = extendedBufferedReader61.readAgain();
        long long65 = extendedBufferedReader61.skip((long) 10);
        java.io.Reader reader66 = java.io.Reader.nullReader();
        char[] charArray70 = new char[] { '4', ' ', 'a' };
        int int71 = reader66.read(charArray70);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader72 = new org.apache.commons.csv.ExtendedBufferedReader(reader66);
        int int73 = extendedBufferedReader72.lookAhead();
        java.lang.String str74 = extendedBufferedReader72.readLine();
        extendedBufferedReader72.reset();
        int int76 = extendedBufferedReader72.getLineNumber();
        char[] charArray83 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int84 = extendedBufferedReader72.read(charArray83);
        int int85 = extendedBufferedReader61.read(charArray83);
        int int86 = extendedBufferedReader43.read(charArray83);
        int int87 = extendedBufferedReader26.read(charArray83);
        int int88 = extendedBufferedReader6.read(charArray83);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader89 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(reader20);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strStream27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strStream34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(reader37);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-2) + "'", int50 == (-2));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(reader52);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(reader66);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertArrayEquals(charArray83, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        char[] charArray11 = new char[] { '4', ' ', '#', '4', ' ' };
        int int12 = reader0.read(charArray11);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] { '4', ' ', 'a' };
        int int18 = reader13.read(charArray17);
        char[] charArray24 = new char[] { '4', ' ', '#', '4', ' ' };
        int int25 = reader13.read(charArray24);
        int int26 = reader0.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean28 = extendedBufferedReader27.markSupported();
        extendedBufferedReader27.mark(1);
        extendedBufferedReader27.mark(100);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader33 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader27);
        java.io.Reader reader34 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader35 = new org.apache.commons.csv.ExtendedBufferedReader(reader34);
        boolean boolean36 = extendedBufferedReader35.markSupported();
        long long38 = extendedBufferedReader35.skip((long) '#');
        char[] charArray44 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int45 = extendedBufferedReader35.read(charArray44);
        int int48 = extendedBufferedReader33.read(charArray44, (int) (byte) 1, (int) (byte) 1);
        boolean boolean49 = extendedBufferedReader33.markSupported();
        java.io.Writer writer50 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long51 = extendedBufferedReader33.transferTo(writer50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(reader34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.lookAhead();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        java.io.Reader reader11 = java.io.Reader.nullReader();
        char[] charArray15 = new char[] { '4', ' ', 'a' };
        int int16 = reader11.read(charArray15);
        char[] charArray22 = new char[] { '4', ' ', '#', '4', ' ' };
        int int23 = reader11.read(charArray22);
        int int24 = extendedBufferedReader6.read(charArray22);
        int int25 = extendedBufferedReader6.lookAhead();
        int int26 = extendedBufferedReader6.readAgain();
        boolean boolean27 = extendedBufferedReader6.markSupported();
        int int28 = extendedBufferedReader6.lookAhead();
        boolean boolean29 = extendedBufferedReader6.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.lang.String str7 = extendedBufferedReader6.readLine();
        int int8 = extendedBufferedReader6.read();
        extendedBufferedReader6.mark((int) (short) 0);
        int int11 = extendedBufferedReader6.readAgain();
        long long13 = extendedBufferedReader6.skip((long) 1);
        int int14 = extendedBufferedReader6.getLineNumber();
        extendedBufferedReader6.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader12);
        java.util.stream.Stream<java.lang.String> strStream14 = extendedBufferedReader12.lines();
        java.util.stream.Stream<java.lang.String> strStream15 = extendedBufferedReader12.lines();
        extendedBufferedReader12.close();
        extendedBufferedReader12.close();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedBufferedReader12.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertNotNull(strStream15);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader6.read();
        int int11 = extendedBufferedReader6.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = extendedBufferedReader6.skip((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: skip value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int11 = extendedBufferedReader6.readAgain();
        boolean boolean12 = extendedBufferedReader6.markSupported();
        int int13 = extendedBufferedReader6.readAgain();
        extendedBufferedReader6.mark(0);
        char[] charArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = extendedBufferedReader6.read(charArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader1 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean2 = extendedBufferedReader1.markSupported();
        long long4 = extendedBufferedReader1.skip((long) '#');
        char[] charArray10 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int11 = extendedBufferedReader1.read(charArray10);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int13 = extendedBufferedReader1.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader1);
        int int15 = extendedBufferedReader1.readAgain();
        boolean boolean16 = extendedBufferedReader1.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.lang.String str11 = extendedBufferedReader10.readLine();
        int int12 = extendedBufferedReader10.lookAhead();
        int int13 = extendedBufferedReader10.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10);
        int int15 = extendedBufferedReader14.read();
        int int16 = extendedBufferedReader14.lookAhead();
        java.io.Reader reader17 = java.io.Reader.nullReader();
        char[] charArray21 = new char[] { '4', ' ', 'a' };
        int int22 = reader17.read(charArray21);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader(reader17);
        int int24 = extendedBufferedReader23.lookAhead();
        int int25 = extendedBufferedReader23.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader26 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader23);
        int int27 = extendedBufferedReader26.getLineNumber();
        java.lang.String str28 = extendedBufferedReader26.readLine();
        java.io.Reader reader29 = java.io.Reader.nullReader();
        char[] charArray33 = new char[] { '4', ' ', 'a' };
        int int34 = reader29.read(charArray33);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader35 = new org.apache.commons.csv.ExtendedBufferedReader(reader29);
        int int36 = extendedBufferedReader35.lookAhead();
        int int37 = extendedBufferedReader35.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader38 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader35);
        extendedBufferedReader35.mark((int) '#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader41 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader35);
        int int42 = extendedBufferedReader35.readAgain();
        int int43 = extendedBufferedReader35.getLineNumber();
        java.io.Reader reader44 = java.io.Reader.nullReader();
        char[] charArray48 = new char[] { '4', ' ', 'a' };
        int int49 = reader44.read(charArray48);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader50 = new org.apache.commons.csv.ExtendedBufferedReader(reader44);
        int int51 = extendedBufferedReader50.lookAhead();
        int int52 = extendedBufferedReader50.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader53 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader50);
        int int54 = extendedBufferedReader53.read();
        int int55 = extendedBufferedReader53.readAgain();
        long long57 = extendedBufferedReader53.skip((long) 10);
        java.io.Reader reader58 = java.io.Reader.nullReader();
        char[] charArray62 = new char[] { '4', ' ', 'a' };
        int int63 = reader58.read(charArray62);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader64 = new org.apache.commons.csv.ExtendedBufferedReader(reader58);
        int int65 = extendedBufferedReader64.lookAhead();
        java.lang.String str66 = extendedBufferedReader64.readLine();
        extendedBufferedReader64.reset();
        int int68 = extendedBufferedReader64.getLineNumber();
        char[] charArray75 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int76 = extendedBufferedReader64.read(charArray75);
        int int77 = extendedBufferedReader53.read(charArray75);
        int int78 = extendedBufferedReader35.read(charArray75);
        int int79 = extendedBufferedReader26.read(charArray75);
        int int80 = extendedBufferedReader14.read(charArray75);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(reader17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(reader29);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2) + "'", int42 == (-2));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(reader44);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(reader58);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int11 = extendedBufferedReader6.readAgain();
        boolean boolean12 = extendedBufferedReader6.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.io.Reader reader14 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        boolean boolean16 = extendedBufferedReader15.markSupported();
        long long18 = extendedBufferedReader15.skip((long) '#');
        char[] charArray24 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int25 = extendedBufferedReader15.read(charArray24);
        int int26 = extendedBufferedReader6.read(charArray24);
        extendedBufferedReader6.mark((int) 'a');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader29 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader30 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader29);
        int int31 = extendedBufferedReader30.readAgain();
        int int32 = extendedBufferedReader30.getLineNumber();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-2) + "'", int31 == (-2));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] { '4', ' ', 'a' };
        int int14 = reader9.read(charArray13);
        int int15 = extendedBufferedReader6.read(charArray13);
        long long17 = extendedBufferedReader6.skip(10L);
        int int18 = extendedBufferedReader6.lookAhead();
        int int19 = extendedBufferedReader6.readAgain();
        int int20 = extendedBufferedReader6.lookAhead();
        boolean boolean21 = extendedBufferedReader6.markSupported();
        int int22 = extendedBufferedReader6.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.lang.Class<?> wildcardClass24 = extendedBufferedReader6.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        int int12 = extendedBufferedReader6.getLineNumber();
        java.lang.String str13 = extendedBufferedReader6.readLine();
        java.nio.CharBuffer charBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = extendedBufferedReader6.read(charBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        extendedBufferedReader6.reset();
        int int10 = extendedBufferedReader6.getLineNumber();
        long long12 = extendedBufferedReader6.skip((long) '4');
        extendedBufferedReader6.mark((int) (short) 10);
        extendedBufferedReader6.reset();
        int int16 = extendedBufferedReader6.lookAhead();
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = extendedBufferedReader6.transferTo(writer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        extendedBufferedReader6.reset();
        int int10 = extendedBufferedReader6.getLineNumber();
        boolean boolean11 = extendedBufferedReader6.markSupported();
        int int12 = extendedBufferedReader6.read();
        int int13 = extendedBufferedReader6.getLineNumber();
        boolean boolean14 = extendedBufferedReader6.markSupported();
        int int15 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        int int11 = extendedBufferedReader10.getLineNumber();
        int int12 = extendedBufferedReader10.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader10);
        int int14 = extendedBufferedReader13.getLineNumber();
        java.lang.Class<?> wildcardClass15 = extendedBufferedReader13.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream12 = extendedBufferedReader6.lines();
        extendedBufferedReader6.mark((int) (short) 10);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.util.stream.Stream<java.lang.String> strStream16 = extendedBufferedReader15.lines();
        long long18 = extendedBufferedReader15.skip((long) 0);
        extendedBufferedReader15.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = extendedBufferedReader15.ready();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertNotNull(strStream16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        extendedBufferedReader6.mark((int) (byte) 10);
        boolean boolean9 = extendedBufferedReader6.markSupported();
        int int10 = extendedBufferedReader6.lookAhead();
        java.io.Reader reader11 = java.io.Reader.nullReader();
        char[] charArray15 = new char[] { '4', ' ', 'a' };
        int int16 = reader11.read(charArray15);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        java.util.stream.Stream<java.lang.String> strStream18 = extendedBufferedReader17.lines();
        int int19 = extendedBufferedReader17.readAgain();
        int int20 = extendedBufferedReader17.lookAhead();
        boolean boolean21 = extendedBufferedReader17.markSupported();
        java.io.Reader reader22 = java.io.Reader.nullReader();
        char[] charArray26 = new char[] { '4', ' ', 'a' };
        int int27 = reader22.read(charArray26);
        char[] charArray33 = new char[] { '4', ' ', '#', '4', ' ' };
        int int34 = reader22.read(charArray33);
        int int35 = extendedBufferedReader17.read(charArray33);
        int int36 = extendedBufferedReader6.read(charArray33);
        extendedBufferedReader6.close();
        java.util.stream.Stream<java.lang.String> strStream38 = extendedBufferedReader6.lines();
        int int39 = extendedBufferedReader6.readAgain();
        extendedBufferedReader6.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(reader22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strStream38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        java.util.stream.Stream<java.lang.String> strStream9 = extendedBufferedReader6.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int11 = extendedBufferedReader6.readAgain();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.util.stream.Stream<java.lang.String> strStream13 = extendedBufferedReader12.lines();
        int int14 = extendedBufferedReader12.lookAhead();
        java.nio.CharBuffer charBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedBufferedReader12.read(charBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.read();
        int int11 = extendedBufferedReader9.readAgain();
        long long13 = extendedBufferedReader9.skip((long) 10);
        java.io.Reader reader14 = java.io.Reader.nullReader();
        char[] charArray18 = new char[] { '4', ' ', 'a' };
        int int19 = reader14.read(charArray18);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        int int21 = extendedBufferedReader20.lookAhead();
        java.lang.String str22 = extendedBufferedReader20.readLine();
        extendedBufferedReader20.reset();
        int int24 = extendedBufferedReader20.getLineNumber();
        char[] charArray31 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int32 = extendedBufferedReader20.read(charArray31);
        int int33 = extendedBufferedReader9.read(charArray31);
        java.util.stream.Stream<java.lang.String> strStream34 = extendedBufferedReader9.lines();
        java.io.Reader reader35 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader36 = new org.apache.commons.csv.ExtendedBufferedReader(reader35);
        extendedBufferedReader36.close();
        extendedBufferedReader36.close();
        int int39 = extendedBufferedReader36.getLineNumber();
        java.io.Reader reader40 = java.io.Reader.nullReader();
        char[] charArray44 = new char[] { '4', ' ', 'a' };
        int int45 = reader40.read(charArray44);
        char[] charArray51 = new char[] { '4', ' ', '#', '4', ' ' };
        int int52 = reader40.read(charArray51);
        java.io.Reader reader53 = java.io.Reader.nullReader();
        char[] charArray57 = new char[] { '4', ' ', 'a' };
        int int58 = reader53.read(charArray57);
        char[] charArray64 = new char[] { '4', ' ', '#', '4', ' ' };
        int int65 = reader53.read(charArray64);
        int int66 = reader40.read(charArray64);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader67 = new org.apache.commons.csv.ExtendedBufferedReader(reader40);
        int int68 = extendedBufferedReader67.getLineNumber();
        int int69 = extendedBufferedReader67.lookAhead();
        int int70 = extendedBufferedReader67.read();
        extendedBufferedReader67.mark((int) (byte) 1);
        boolean boolean73 = extendedBufferedReader67.markSupported();
        java.io.Reader reader74 = java.io.Reader.nullReader();
        char[] charArray78 = new char[] { '4', ' ', 'a' };
        int int79 = reader74.read(charArray78);
        int int80 = extendedBufferedReader67.read(charArray78);
        int int83 = extendedBufferedReader36.read(charArray78, 0, 0);
        int int84 = extendedBufferedReader9.read(charArray78);
        int int85 = extendedBufferedReader9.read();
        java.util.stream.Stream<java.lang.String> strStream86 = extendedBufferedReader9.lines();
        long long88 = extendedBufferedReader9.skip((long) 'a');
        java.nio.CharBuffer charBuffer89 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int90 = extendedBufferedReader9.read(charBuffer89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strStream34);
        org.junit.Assert.assertNotNull(reader35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(reader40);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(reader53);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(reader74);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(strStream86);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream12 = extendedBufferedReader6.lines();
        extendedBufferedReader6.mark((int) (short) 10);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.mark(10);
        boolean boolean18 = extendedBufferedReader6.markSupported();
        extendedBufferedReader6.mark(100);
        int int21 = extendedBufferedReader6.readAgain();
        extendedBufferedReader6.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        boolean boolean24 = extendedBufferedReader6.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.lookAhead();
        int int10 = extendedBufferedReader6.lookAhead();
        long long12 = extendedBufferedReader6.skip(0L);
        extendedBufferedReader6.mark((int) (byte) 1);
        java.io.Reader reader15 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader(reader15);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader16);
        int int18 = extendedBufferedReader17.read();
        java.io.Reader reader19 = java.io.Reader.nullReader();
        char[] charArray23 = new char[] { '4', ' ', 'a' };
        int int24 = reader19.read(charArray23);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader(reader19);
        int int26 = extendedBufferedReader25.lookAhead();
        java.lang.String str27 = extendedBufferedReader25.readLine();
        int int28 = extendedBufferedReader25.lookAhead();
        java.io.Reader reader29 = java.io.Reader.nullReader();
        char[] charArray33 = new char[] { '4', ' ', 'a' };
        int int34 = reader29.read(charArray33);
        char[] charArray40 = new char[] { '4', ' ', '#', '4', ' ' };
        int int41 = reader29.read(charArray40);
        int int42 = extendedBufferedReader25.read(charArray40);
        java.io.Reader reader43 = java.io.Reader.nullReader();
        char[] charArray47 = new char[] { '4', ' ', 'a' };
        int int48 = reader43.read(charArray47);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader49 = new org.apache.commons.csv.ExtendedBufferedReader(reader43);
        int int50 = extendedBufferedReader49.lookAhead();
        boolean boolean51 = extendedBufferedReader49.markSupported();
        java.io.Reader reader52 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader53 = new org.apache.commons.csv.ExtendedBufferedReader(reader52);
        char[] charArray55 = new char[] { ' ' };
        int int56 = reader52.read(charArray55);
        int int57 = extendedBufferedReader49.read(charArray55);
        int int58 = extendedBufferedReader25.read(charArray55);
        int int59 = extendedBufferedReader17.read(charArray55);
        int int60 = extendedBufferedReader6.read(charArray55);
        boolean boolean61 = extendedBufferedReader6.markSupported();
        extendedBufferedReader6.reset();
        int int63 = extendedBufferedReader6.readAgain();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(reader19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(reader29);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(reader43);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(reader52);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        extendedBufferedReader6.reset();
        int int10 = extendedBufferedReader6.getLineNumber();
        char[] charArray17 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int18 = extendedBufferedReader6.read(charArray17);
        int int19 = extendedBufferedReader6.lookAhead();
        int int20 = extendedBufferedReader6.readAgain();
        java.util.stream.Stream<java.lang.String> strStream21 = extendedBufferedReader6.lines();
        int int22 = extendedBufferedReader6.read();
        long long24 = extendedBufferedReader6.skip((long) ' ');
        extendedBufferedReader6.mark((int) ' ');
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        boolean boolean10 = extendedBufferedReader6.markSupported();
        int int11 = extendedBufferedReader6.readAgain();
        int int12 = extendedBufferedReader6.read();
        java.util.stream.Stream<java.lang.String> strStream13 = extendedBufferedReader6.lines();
        int int14 = extendedBufferedReader6.getLineNumber();
        int int15 = extendedBufferedReader6.getLineNumber();
        java.io.Reader reader16 = java.io.Reader.nullReader();
        char[] charArray20 = new char[] { '4', ' ', 'a' };
        int int21 = reader16.read(charArray20);
        char[] charArray27 = new char[] { '4', ' ', '#', '4', ' ' };
        int int28 = reader16.read(charArray27);
        java.io.Reader reader29 = java.io.Reader.nullReader();
        char[] charArray33 = new char[] { '4', ' ', 'a' };
        int int34 = reader29.read(charArray33);
        char[] charArray40 = new char[] { '4', ' ', '#', '4', ' ' };
        int int41 = reader29.read(charArray40);
        int int42 = reader16.read(charArray40);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader43 = new org.apache.commons.csv.ExtendedBufferedReader(reader16);
        boolean boolean44 = extendedBufferedReader43.markSupported();
        extendedBufferedReader43.mark(1);
        extendedBufferedReader43.mark(100);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader49 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader43);
        java.io.Reader reader50 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader51 = new org.apache.commons.csv.ExtendedBufferedReader(reader50);
        boolean boolean52 = extendedBufferedReader51.markSupported();
        long long54 = extendedBufferedReader51.skip((long) '#');
        char[] charArray60 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int61 = extendedBufferedReader51.read(charArray60);
        int int64 = extendedBufferedReader49.read(charArray60, (int) (byte) 1, (int) (byte) 1);
        int int65 = extendedBufferedReader6.read(charArray60);
        int int66 = extendedBufferedReader6.read();
        java.lang.String str67 = extendedBufferedReader6.readLine();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(reader29);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(reader50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.getLineNumber();
        java.io.Reader reader11 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        char[] charArray14 = new char[] { ' ' };
        int int15 = reader11.read(charArray14);
        int int16 = extendedBufferedReader9.read(charArray14);
        boolean boolean17 = extendedBufferedReader9.markSupported();
        java.util.stream.Stream<java.lang.String> strStream18 = extendedBufferedReader9.lines();
        extendedBufferedReader9.mark((int) (byte) 1);
        extendedBufferedReader9.close();
        java.lang.Class<?> wildcardClass22 = extendedBufferedReader9.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        int int9 = extendedBufferedReader6.lookAhead();
        java.io.Reader reader10 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] { '4', ' ', 'a' };
        int int15 = reader10.read(charArray14);
        char[] charArray21 = new char[] { '4', ' ', '#', '4', ' ' };
        int int22 = reader10.read(charArray21);
        int int23 = extendedBufferedReader6.read(charArray21);
        int int24 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader26 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader25);
        java.nio.CharBuffer charBuffer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = extendedBufferedReader26.read(charBuffer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        boolean boolean8 = extendedBufferedReader6.markSupported();
        java.io.Reader reader9 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader(reader9);
        char[] charArray12 = new char[] { ' ' };
        int int13 = reader9.read(charArray12);
        int int14 = extendedBufferedReader6.read(charArray12);
        java.util.stream.Stream<java.lang.String> strStream15 = extendedBufferedReader6.lines();
        int int16 = extendedBufferedReader6.read();
        java.lang.String str17 = extendedBufferedReader6.readLine();
        boolean boolean18 = extendedBufferedReader6.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strStream15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.close();
        java.io.Reader reader11 = java.io.Reader.nullReader();
        char[] charArray15 = new char[] { '4', ' ', 'a' };
        int int16 = reader11.read(charArray15);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        int int18 = extendedBufferedReader17.lookAhead();
        java.lang.String str19 = extendedBufferedReader17.readLine();
        extendedBufferedReader17.reset();
        java.lang.String str21 = extendedBufferedReader17.readLine();
        extendedBufferedReader17.mark((int) (byte) 100);
        int int24 = extendedBufferedReader17.lookAhead();
        java.io.Reader reader25 = java.io.Reader.nullReader();
        char[] charArray29 = new char[] { '4', ' ', 'a' };
        int int30 = reader25.read(charArray29);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader31 = new org.apache.commons.csv.ExtendedBufferedReader(reader25);
        java.lang.String str32 = extendedBufferedReader31.readLine();
        int int33 = extendedBufferedReader31.read();
        int int34 = extendedBufferedReader31.readAgain();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader35 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader31);
        java.io.Reader reader36 = java.io.Reader.nullReader();
        char[] charArray40 = new char[] { '4', ' ', 'a' };
        int int41 = reader36.read(charArray40);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader42 = new org.apache.commons.csv.ExtendedBufferedReader(reader36);
        int int43 = extendedBufferedReader42.lookAhead();
        int int44 = extendedBufferedReader42.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader45 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader42);
        int int46 = extendedBufferedReader45.read();
        int int47 = extendedBufferedReader45.readAgain();
        long long49 = extendedBufferedReader45.skip((long) 10);
        java.io.Reader reader50 = java.io.Reader.nullReader();
        char[] charArray54 = new char[] { '4', ' ', 'a' };
        int int55 = reader50.read(charArray54);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader56 = new org.apache.commons.csv.ExtendedBufferedReader(reader50);
        int int57 = extendedBufferedReader56.lookAhead();
        java.lang.String str58 = extendedBufferedReader56.readLine();
        extendedBufferedReader56.reset();
        int int60 = extendedBufferedReader56.getLineNumber();
        char[] charArray67 = new char[] { '4', 'a', ' ', '#', 'a', 'a' };
        int int68 = extendedBufferedReader56.read(charArray67);
        int int69 = extendedBufferedReader45.read(charArray67);
        char[] charArray71 = new char[] { 'a' };
        int int74 = extendedBufferedReader45.read(charArray71, 1, 0);
        int int77 = extendedBufferedReader31.read(charArray71, (int) 'a', 0);
        int int78 = extendedBufferedReader17.read(charArray71);
        // The following exception was thrown during execution in test generation
        try {
            int int81 = extendedBufferedReader6.read(charArray71, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(reader36);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(reader50);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '4', 'a', ' ', '#', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.read();
        int int10 = extendedBufferedReader6.lookAhead();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        long long10 = extendedBufferedReader6.skip(0L);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.io.Reader reader12 = java.io.Reader.nullReader();
        char[] charArray16 = new char[] { '4', ' ', 'a' };
        int int17 = reader12.read(charArray16);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = new org.apache.commons.csv.ExtendedBufferedReader(reader12);
        int int19 = extendedBufferedReader18.lookAhead();
        int int20 = extendedBufferedReader18.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader18);
        extendedBufferedReader18.reset();
        extendedBufferedReader18.reset();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader18);
        int int25 = extendedBufferedReader18.readAgain();
        int int26 = extendedBufferedReader18.read();
        java.io.Reader reader27 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader28 = new org.apache.commons.csv.ExtendedBufferedReader(reader27);
        char[] charArray30 = new char[] { ' ' };
        int int31 = reader27.read(charArray30);
        int int32 = extendedBufferedReader18.read(charArray30);
        java.io.Reader reader33 = java.io.Reader.nullReader();
        char[] charArray37 = new char[] { '4', ' ', 'a' };
        int int38 = reader33.read(charArray37);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader39 = new org.apache.commons.csv.ExtendedBufferedReader(reader33);
        int int40 = extendedBufferedReader39.lookAhead();
        java.lang.String str41 = extendedBufferedReader39.readLine();
        java.lang.String str42 = extendedBufferedReader39.readLine();
        boolean boolean43 = extendedBufferedReader39.markSupported();
        java.io.Reader reader44 = java.io.Reader.nullReader();
        char[] charArray48 = new char[] { '4', ' ', 'a' };
        int int49 = reader44.read(charArray48);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader50 = new org.apache.commons.csv.ExtendedBufferedReader(reader44);
        int int51 = extendedBufferedReader50.lookAhead();
        int int52 = extendedBufferedReader50.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader53 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader50);
        int int54 = extendedBufferedReader50.lookAhead();
        java.io.Reader reader55 = java.io.Reader.nullReader();
        char[] charArray59 = new char[] { '4', ' ', 'a' };
        int int60 = reader55.read(charArray59);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader61 = new org.apache.commons.csv.ExtendedBufferedReader(reader55);
        int int62 = extendedBufferedReader61.lookAhead();
        java.lang.String str63 = extendedBufferedReader61.readLine();
        java.io.Reader reader64 = java.io.Reader.nullReader();
        char[] charArray68 = new char[] { '4', ' ', 'a' };
        int int69 = reader64.read(charArray68);
        int int70 = extendedBufferedReader61.read(charArray68);
        int int71 = extendedBufferedReader50.read(charArray68);
        int int72 = extendedBufferedReader39.read(charArray68);
        int int73 = extendedBufferedReader18.read(charArray68);
        int int74 = extendedBufferedReader11.read(charArray68);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2) + "'", int25 == (-2));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(reader27);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(reader33);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(reader44);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(reader55);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(reader64);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader6.lookAhead();
        int int11 = extendedBufferedReader6.readAgain();
        int int12 = extendedBufferedReader6.getLineNumber();
        int int13 = extendedBufferedReader6.lookAhead();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.close();
        boolean boolean11 = extendedBufferedReader6.markSupported();
        boolean boolean12 = extendedBufferedReader6.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.io.Reader reader14 = java.io.Reader.nullReader();
        char[] charArray18 = new char[] { '4', ' ', 'a' };
        int int19 = reader14.read(charArray18);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = new org.apache.commons.csv.ExtendedBufferedReader(reader14);
        int int21 = extendedBufferedReader20.lookAhead();
        boolean boolean22 = extendedBufferedReader20.markSupported();
        java.util.stream.Stream<java.lang.String> strStream23 = extendedBufferedReader20.lines();
        int int24 = extendedBufferedReader20.read();
        java.io.Reader reader25 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader26 = new org.apache.commons.csv.ExtendedBufferedReader(reader25);
        boolean boolean27 = extendedBufferedReader26.markSupported();
        long long29 = extendedBufferedReader26.skip((long) '#');
        char[] charArray35 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int36 = extendedBufferedReader26.read(charArray35);
        int int37 = extendedBufferedReader26.lookAhead();
        boolean boolean38 = extendedBufferedReader26.markSupported();
        int int39 = extendedBufferedReader26.readAgain();
        int int40 = extendedBufferedReader26.lookAhead();
        int int41 = extendedBufferedReader26.readAgain();
        java.lang.String str42 = extendedBufferedReader26.readLine();
        java.io.Reader reader43 = java.io.Reader.nullReader();
        char[] charArray47 = new char[] { '4', ' ', 'a' };
        int int48 = reader43.read(charArray47);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader49 = new org.apache.commons.csv.ExtendedBufferedReader(reader43);
        java.util.stream.Stream<java.lang.String> strStream50 = extendedBufferedReader49.lines();
        int int51 = extendedBufferedReader49.readAgain();
        int int52 = extendedBufferedReader49.lookAhead();
        boolean boolean53 = extendedBufferedReader49.markSupported();
        java.io.Reader reader54 = java.io.Reader.nullReader();
        char[] charArray58 = new char[] { '4', ' ', 'a' };
        int int59 = reader54.read(charArray58);
        char[] charArray65 = new char[] { '4', ' ', '#', '4', ' ' };
        int int66 = reader54.read(charArray65);
        int int67 = extendedBufferedReader49.read(charArray65);
        int int68 = extendedBufferedReader26.read(charArray65);
        int int69 = extendedBufferedReader20.read(charArray65);
        // The following exception was thrown during execution in test generation
        try {
            int int70 = extendedBufferedReader6.read(charArray65);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(reader43);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strStream50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-2) + "'", int51 == (-2));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(reader54);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.reset();
        int int11 = extendedBufferedReader6.read();
        java.util.stream.Stream<java.lang.String> strStream12 = extendedBufferedReader6.lines();
        extendedBufferedReader6.close();
        boolean boolean14 = extendedBufferedReader6.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        boolean boolean10 = extendedBufferedReader6.markSupported();
        boolean boolean11 = extendedBufferedReader6.markSupported();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.reset();
        boolean boolean15 = extendedBufferedReader6.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.lookAhead();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        long long12 = extendedBufferedReader9.skip((long) 'a');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        java.lang.String str14 = extendedBufferedReader9.readLine();
        int int15 = extendedBufferedReader9.getLineNumber();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        extendedBufferedReader16.close();
        java.nio.CharBuffer charBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = extendedBufferedReader16.read(charBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        int int9 = extendedBufferedReader6.read();
        java.io.Reader reader10 = java.io.Reader.nullReader();
        java.io.Reader reader11 = java.io.Reader.nullReader();
        char[] charArray15 = new char[] { '4', ' ', 'a' };
        int int16 = reader11.read(charArray15);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader(reader11);
        int int18 = extendedBufferedReader17.lookAhead();
        java.lang.String str19 = extendedBufferedReader17.readLine();
        extendedBufferedReader17.reset();
        int int21 = extendedBufferedReader17.getLineNumber();
        java.io.Reader reader22 = java.io.Reader.nullReader();
        char[] charArray26 = new char[] { '4', ' ', 'a' };
        int int27 = reader22.read(charArray26);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader28 = new org.apache.commons.csv.ExtendedBufferedReader(reader22);
        int int29 = extendedBufferedReader28.lookAhead();
        int int30 = extendedBufferedReader28.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader31 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader28);
        int int32 = extendedBufferedReader31.read();
        java.util.stream.Stream<java.lang.String> strStream33 = extendedBufferedReader31.lines();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader34 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader31);
        java.io.Reader reader35 = java.io.Reader.nullReader();
        char[] charArray39 = new char[] { '4', ' ', 'a' };
        int int40 = reader35.read(charArray39);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader41 = new org.apache.commons.csv.ExtendedBufferedReader(reader35);
        int int42 = extendedBufferedReader41.lookAhead();
        boolean boolean43 = extendedBufferedReader41.markSupported();
        java.io.Reader reader44 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader45 = new org.apache.commons.csv.ExtendedBufferedReader(reader44);
        char[] charArray47 = new char[] { ' ' };
        int int48 = reader44.read(charArray47);
        int int49 = extendedBufferedReader41.read(charArray47);
        int int50 = extendedBufferedReader31.read(charArray47);
        int int51 = extendedBufferedReader17.read(charArray47);
        java.io.Reader reader52 = java.io.Reader.nullReader();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader53 = new org.apache.commons.csv.ExtendedBufferedReader(reader52);
        boolean boolean54 = extendedBufferedReader53.markSupported();
        long long56 = extendedBufferedReader53.skip((long) '#');
        char[] charArray62 = new char[] { '#', 'a', '4', 'a', 'a' };
        int int63 = extendedBufferedReader53.read(charArray62);
        int int64 = extendedBufferedReader17.read(charArray62);
        int int65 = reader10.read(charArray62);
        int int66 = extendedBufferedReader6.read(charArray62);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader67 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        java.lang.String str68 = extendedBufferedReader6.readLine();
        boolean boolean69 = extendedBufferedReader6.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(reader22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strStream33);
        org.junit.Assert.assertNotNull(reader35);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(reader44);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(reader52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '#', 'a', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.lookAhead();
        int int10 = extendedBufferedReader6.lookAhead();
        int int11 = extendedBufferedReader6.lookAhead();
        extendedBufferedReader6.mark(0);
        java.util.stream.Stream<java.lang.String> strStream14 = extendedBufferedReader6.lines();
        int int15 = extendedBufferedReader6.getLineNumber();
        extendedBufferedReader6.reset();
        int int17 = extendedBufferedReader6.readAgain();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        char[] charArray11 = new char[] { '4', ' ', '#', '4', ' ' };
        int int12 = reader0.read(charArray11);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] { '4', ' ', 'a' };
        int int18 = reader13.read(charArray17);
        char[] charArray24 = new char[] { '4', ' ', '#', '4', ' ' };
        int int25 = reader13.read(charArray24);
        int int26 = reader0.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        boolean boolean28 = extendedBufferedReader27.markSupported();
        extendedBufferedReader27.mark(1);
        extendedBufferedReader27.reset();
        extendedBufferedReader27.reset();
        java.util.stream.Stream<java.lang.String> strStream33 = extendedBufferedReader27.lines();
        java.lang.String str34 = extendedBufferedReader27.readLine();
        extendedBufferedReader27.close();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strStream33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        java.lang.String str8 = extendedBufferedReader6.readLine();
        java.lang.String str9 = extendedBufferedReader6.readLine();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int11 = extendedBufferedReader6.readAgain();
        extendedBufferedReader6.mark((int) (byte) 0);
        extendedBufferedReader6.reset();
        extendedBufferedReader6.mark(100);
        // The following exception was thrown during execution in test generation
        try {
            extendedBufferedReader6.mark((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Read-ahead limit < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream7 = extendedBufferedReader6.lines();
        int int8 = extendedBufferedReader6.readAgain();
        int int9 = extendedBufferedReader6.readAgain();
        extendedBufferedReader6.mark(0);
        int int12 = extendedBufferedReader6.readAgain();
        java.util.stream.Stream<java.lang.String> strStream13 = extendedBufferedReader6.lines();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(strStream13);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        char[] charArray11 = new char[] { '4', ' ', '#', '4', ' ' };
        int int12 = reader0.read(charArray11);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] { '4', ' ', 'a' };
        int int18 = reader13.read(charArray17);
        char[] charArray24 = new char[] { '4', ' ', '#', '4', ' ' };
        int int25 = reader13.read(charArray24);
        int int26 = reader0.read(charArray24);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int28 = extendedBufferedReader27.getLineNumber();
        int int29 = extendedBufferedReader27.lookAhead();
        java.lang.Class<?> wildcardClass30 = extendedBufferedReader27.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', '#', '4', ' ' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.read();
        java.util.stream.Stream<java.lang.String> strStream11 = extendedBufferedReader9.lines();
        int int12 = extendedBufferedReader9.readAgain();
        java.lang.String str13 = extendedBufferedReader9.readLine();
        extendedBufferedReader9.mark(10);
        int int16 = extendedBufferedReader9.readAgain();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        int int5 = reader0.read(charArray4);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = new org.apache.commons.csv.ExtendedBufferedReader(reader0);
        int int7 = extendedBufferedReader6.lookAhead();
        int int8 = extendedBufferedReader6.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader6);
        int int10 = extendedBufferedReader9.read();
        java.util.stream.Stream<java.lang.String> strStream11 = extendedBufferedReader9.lines();
        int int12 = extendedBufferedReader9.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        int int15 = extendedBufferedReader9.getLineNumber();
        int int16 = extendedBufferedReader9.read();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = new org.apache.commons.csv.ExtendedBufferedReader((java.io.Reader) extendedBufferedReader9);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }
}

