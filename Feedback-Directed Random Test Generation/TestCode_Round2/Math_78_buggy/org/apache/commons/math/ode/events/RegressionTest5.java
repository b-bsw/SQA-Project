package org.apache.commons.math.ode.events;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        double[] doubleArray27 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean28 = eventState19.reset(10.0d, doubleArray27);
        boolean boolean29 = eventState13.reset((double) 1, doubleArray27);
        boolean boolean30 = eventState4.reset((double) (short) 0, doubleArray27);
        double double31 = eventState4.getMaxCheckInterval();
        double double32 = eventState4.getConvergence();
        double double33 = eventState4.getEventTime();
        int int34 = eventState4.getMaxIterationCount();
        boolean boolean35 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        int int9 = eventState4.getMaxIterationCount();
        int int10 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState4.getEventHandler();
        double double12 = eventState4.getConvergence();
        int int13 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (-1.0d), (double) 0.0f, (int) (byte) 0);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, (double) (short) -1, (int) '#');
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getConvergence();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) (short) 100, Double.NaN, (int) (short) 10);
        int int14 = eventState13.getMaxIterationCount();
        double double15 = eventState13.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = eventState13.getEventHandler();
        double double17 = eventState13.getEventTime();
        boolean boolean18 = eventState13.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = null;
        org.apache.commons.math.ode.events.EventState eventState24 = new org.apache.commons.math.ode.events.EventState(eventHandler20, (double) (byte) 10, (double) 1.0f, 0);
        boolean boolean25 = eventState24.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = null;
        org.apache.commons.math.ode.events.EventState eventState31 = new org.apache.commons.math.ode.events.EventState(eventHandler27, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = null;
        org.apache.commons.math.ode.events.EventState eventState37 = new org.apache.commons.math.ode.events.EventState(eventHandler33, (double) '#', (double) 0L, (int) (short) -1);
        org.apache.commons.math.ode.events.EventHandler eventHandler39 = null;
        org.apache.commons.math.ode.events.EventState eventState43 = new org.apache.commons.math.ode.events.EventState(eventHandler39, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler44 = eventState43.getEventHandler();
        int int45 = eventState43.getMaxIterationCount();
        double double46 = eventState43.getMaxCheckInterval();
        double double47 = eventState43.getEventTime();
        double double48 = eventState43.getEventTime();
        boolean boolean49 = eventState43.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler51 = null;
        org.apache.commons.math.ode.events.EventState eventState55 = new org.apache.commons.math.ode.events.EventState(eventHandler51, (double) '#', (double) 100.0f, 1);
        int int56 = eventState55.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler58 = null;
        org.apache.commons.math.ode.events.EventState eventState62 = new org.apache.commons.math.ode.events.EventState(eventHandler58, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler63 = eventState62.getEventHandler();
        double[] doubleArray70 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean71 = eventState62.reset(10.0d, doubleArray70);
        boolean boolean72 = eventState55.reset(0.0d, doubleArray70);
        boolean boolean73 = eventState43.reset((double) (byte) 0, doubleArray70);
        boolean boolean74 = eventState37.reset((double) (short) 10, doubleArray70);
        boolean boolean75 = eventState31.reset((double) (short) 10, doubleArray70);
        boolean boolean76 = eventState24.reset((double) (short) 100, doubleArray70);
        boolean boolean77 = eventState13.reset((double) '#', doubleArray70);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) 35, doubleArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(eventHandler16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(eventHandler44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 35.0d + "'", double46 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNull(eventHandler63);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getMaxCheckInterval();
        boolean boolean9 = eventState4.stop();
        boolean boolean10 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        double double7 = eventState4.getConvergence();
        boolean boolean8 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = null;
        org.apache.commons.math.ode.events.EventState eventState15 = new org.apache.commons.math.ode.events.EventState(eventHandler11, 35.0d, 0.0d, 10);
        double double16 = eventState15.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = null;
        org.apache.commons.math.ode.events.EventState eventState22 = new org.apache.commons.math.ode.events.EventState(eventHandler18, (double) 1, 100.0d, (int) (byte) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = null;
        org.apache.commons.math.ode.events.EventState eventState28 = new org.apache.commons.math.ode.events.EventState(eventHandler24, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler29 = eventState28.getEventHandler();
        int int30 = eventState28.getMaxIterationCount();
        double double31 = eventState28.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = null;
        org.apache.commons.math.ode.events.EventState eventState37 = new org.apache.commons.math.ode.events.EventState(eventHandler33, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler39 = null;
        org.apache.commons.math.ode.events.EventState eventState43 = new org.apache.commons.math.ode.events.EventState(eventHandler39, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler44 = eventState43.getEventHandler();
        double[] doubleArray51 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean52 = eventState43.reset(10.0d, doubleArray51);
        boolean boolean53 = eventState37.reset((double) 1, doubleArray51);
        boolean boolean54 = eventState28.reset((double) (short) 0, doubleArray51);
        double double55 = eventState28.getMaxCheckInterval();
        int int56 = eventState28.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler58 = null;
        org.apache.commons.math.ode.events.EventState eventState62 = new org.apache.commons.math.ode.events.EventState(eventHandler58, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler63 = eventState62.getEventHandler();
        double[] doubleArray70 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean71 = eventState62.reset(10.0d, doubleArray70);
        boolean boolean72 = eventState28.reset(35.0d, doubleArray70);
        boolean boolean73 = eventState22.reset(35.0d, doubleArray70);
        boolean boolean74 = eventState15.reset((double) 32, doubleArray70);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted(35.0d, doubleArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(eventHandler9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(eventHandler29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertNull(eventHandler44);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 35.0d + "'", double55 == 35.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNull(eventHandler63);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        int int9 = eventState4.getMaxIterationCount();
        double double10 = eventState4.getConvergence();
        boolean boolean11 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) (byte) -1, Double.NaN, 10);
        double double18 = eventState17.getMaxCheckInterval();
        double double19 = eventState17.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = null;
        org.apache.commons.math.ode.events.EventState eventState25 = new org.apache.commons.math.ode.events.EventState(eventHandler21, (double) (short) 10, (double) '#', (int) (short) 0);
        int int26 = eventState25.getMaxIterationCount();
        double double27 = eventState25.getEventTime();
        boolean boolean28 = eventState25.stop();
        int int29 = eventState25.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = null;
        org.apache.commons.math.ode.events.EventState eventState35 = new org.apache.commons.math.ode.events.EventState(eventHandler31, (double) (short) 10, (double) '#', (int) (short) 0);
        int int36 = eventState35.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = null;
        org.apache.commons.math.ode.events.EventState eventState42 = new org.apache.commons.math.ode.events.EventState(eventHandler38, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler44 = null;
        org.apache.commons.math.ode.events.EventState eventState48 = new org.apache.commons.math.ode.events.EventState(eventHandler44, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler49 = eventState48.getEventHandler();
        double[] doubleArray56 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean57 = eventState48.reset(10.0d, doubleArray56);
        boolean boolean58 = eventState42.reset((double) 1, doubleArray56);
        boolean boolean59 = eventState35.reset((double) (-1L), doubleArray56);
        boolean boolean60 = eventState25.reset(0.0d, doubleArray56);
        boolean boolean61 = eventState17.reset((double) (short) 10, doubleArray56);
        boolean boolean62 = eventState4.reset((double) (-1L), doubleArray56);
        int int63 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler64 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(eventHandler49);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNull(eventHandler64);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 100.0d, 0.0d, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (short) -1, (double) (short) -1, (int) '#');
        int int11 = eventState10.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) 10, 0.0d, (int) (short) 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray29 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean30 = eventState23.reset((double) (byte) 100, doubleArray29);
        boolean boolean31 = eventState17.reset((double) ' ', doubleArray29);
        boolean boolean32 = eventState10.reset((double) 10.0f, doubleArray29);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) (byte) 100, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getConvergence();
        double double9 = eventState4.getEventTime();
        int int10 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 0, (double) (byte) 10, (int) (byte) 0);
        boolean boolean5 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10.0f, (double) (byte) 0, (int) (short) -1);
        double double5 = eventState4.getEventTime();
        boolean boolean6 = eventState4.stop();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 0.0d, (double) (byte) -1, 0);
        double double5 = eventState4.getConvergence();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = eventState4.evaluateStep(stepInterpolator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 32, (double) (-1.0f), 32);
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = eventState4.evaluateStep(stepInterpolator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 0.0d, (double) 0.0f, 0);
        double double5 = eventState4.getMaxCheckInterval();
        double double6 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        boolean boolean9 = eventState4.stop();
        double double10 = eventState4.getMaxCheckInterval();
        double double11 = eventState4.getMaxCheckInterval();
        double double12 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 10.0d, (double) 1.0f, (int) (short) 100);
        double double5 = eventState4.getEventTime();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(eventHandler7);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) (byte) 100, 1);
        double double5 = eventState4.getMaxCheckInterval();
        double double6 = eventState4.getEventTime();
        int int7 = eventState4.getMaxIterationCount();
        double double8 = eventState4.getConvergence();
        double double9 = eventState4.getConvergence();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = eventState4.evaluateStep(stepInterpolator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 1.0d, (double) 1.0f, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = eventState4.evaluateStep(stepInterpolator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 1.0d, 10.0d, (int) (byte) 100);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 0, (double) 0.0f, (int) (byte) 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        boolean boolean6 = eventState4.stop();
        double double7 = eventState4.getMaxCheckInterval();
        int int8 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10.0f, Double.NaN, (int) (short) 1);
        double double5 = eventState4.getMaxCheckInterval();
        double double6 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = eventState4.evaluateStep(stepInterpolator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNull(eventHandler7);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double double5 = eventState4.getConvergence();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        double double9 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(eventHandler10);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) 0.0f, 100);
        int int5 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        double double7 = eventState4.getEventTime();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getEventTime();
        double double10 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = eventState16.getEventHandler();
        int int18 = eventState16.getMaxIterationCount();
        double double19 = eventState16.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState16.getEventHandler();
        double double21 = eventState16.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = eventState16.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = null;
        org.apache.commons.math.ode.events.EventState eventState28 = new org.apache.commons.math.ode.events.EventState(eventHandler24, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler29 = eventState28.getEventHandler();
        double double30 = eventState28.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = eventState28.getEventHandler();
        double double32 = eventState28.getMaxCheckInterval();
        int int33 = eventState28.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = null;
        org.apache.commons.math.ode.events.EventState eventState39 = new org.apache.commons.math.ode.events.EventState(eventHandler35, (double) (short) 10, (double) '#', (int) (short) 0);
        int int40 = eventState39.getMaxIterationCount();
        double double41 = eventState39.getEventTime();
        boolean boolean42 = eventState39.stop();
        int int43 = eventState39.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = null;
        org.apache.commons.math.ode.events.EventState eventState49 = new org.apache.commons.math.ode.events.EventState(eventHandler45, (double) (short) 10, (double) '#', (int) (short) 0);
        int int50 = eventState49.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler52 = null;
        org.apache.commons.math.ode.events.EventState eventState56 = new org.apache.commons.math.ode.events.EventState(eventHandler52, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler58 = null;
        org.apache.commons.math.ode.events.EventState eventState62 = new org.apache.commons.math.ode.events.EventState(eventHandler58, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler63 = eventState62.getEventHandler();
        double[] doubleArray70 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean71 = eventState62.reset(10.0d, doubleArray70);
        boolean boolean72 = eventState56.reset((double) 1, doubleArray70);
        boolean boolean73 = eventState49.reset((double) (-1L), doubleArray70);
        boolean boolean74 = eventState39.reset(0.0d, doubleArray70);
        boolean boolean75 = eventState28.reset((double) 10L, doubleArray70);
        boolean boolean76 = eventState16.reset((double) (-1L), doubleArray70);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin(1.0d, doubleArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(eventHandler6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNull(eventHandler17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNull(eventHandler22);
        org.junit.Assert.assertNull(eventHandler29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
        org.junit.Assert.assertNull(eventHandler31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 35.0d + "'", double32 == 35.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(eventHandler63);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getEventTime();
        boolean boolean9 = eventState4.stop();
        double double10 = eventState4.getConvergence();
        double double11 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray23 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean24 = eventState17.reset((double) (byte) 100, doubleArray23);
        boolean boolean25 = eventState4.reset((double) '#', doubleArray23);
        boolean boolean26 = eventState4.stop();
        boolean boolean27 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState4.getEventHandler();
        double double29 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getConvergence();
        double double7 = eventState4.getConvergence();
        double double8 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, (double) (-1L), (int) (short) 100);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        double double7 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 1, (double) ' ', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        int int12 = eventState10.getMaxIterationCount();
        double double13 = eventState10.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        double[] doubleArray27 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean28 = eventState19.reset(10.0d, doubleArray27);
        boolean boolean29 = eventState10.reset((double) (byte) 1, doubleArray27);
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = null;
        org.apache.commons.math.ode.events.EventState eventState35 = new org.apache.commons.math.ode.events.EventState(eventHandler31, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = eventState35.getEventHandler();
        int int37 = eventState35.getMaxIterationCount();
        double double38 = eventState35.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler39 = eventState35.getEventHandler();
        double double40 = eventState35.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = null;
        org.apache.commons.math.ode.events.EventState eventState46 = new org.apache.commons.math.ode.events.EventState(eventHandler42, (double) (-1), (double) (byte) 100, 1);
        double double47 = eventState46.getMaxCheckInterval();
        boolean boolean48 = eventState46.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler50 = null;
        org.apache.commons.math.ode.events.EventState eventState54 = new org.apache.commons.math.ode.events.EventState(eventHandler50, (double) '#', (double) 100.0f, 1);
        int int55 = eventState54.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler57 = null;
        org.apache.commons.math.ode.events.EventState eventState61 = new org.apache.commons.math.ode.events.EventState(eventHandler57, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler62 = eventState61.getEventHandler();
        double[] doubleArray69 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean70 = eventState61.reset(10.0d, doubleArray69);
        boolean boolean71 = eventState54.reset(0.0d, doubleArray69);
        org.apache.commons.math.ode.events.EventHandler eventHandler73 = null;
        org.apache.commons.math.ode.events.EventState eventState77 = new org.apache.commons.math.ode.events.EventState(eventHandler73, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler78 = eventState77.getEventHandler();
        double[] doubleArray86 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean87 = eventState77.reset(0.0d, doubleArray86);
        boolean boolean88 = eventState54.reset(Double.NaN, doubleArray86);
        boolean boolean89 = eventState46.reset((double) (short) 10, doubleArray86);
        boolean boolean90 = eventState35.reset((double) (short) 0, doubleArray86);
        boolean boolean91 = eventState10.reset((double) '#', doubleArray86);
        boolean boolean92 = eventState4.reset(0.0d, doubleArray86);
        double double93 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(eventHandler36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 35.0d + "'", double38 == 35.0d);
        org.junit.Assert.assertNull(eventHandler39);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNull(eventHandler62);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(eventHandler78);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 1.0d + "'", double93 == 1.0d);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) (byte) 0, 97);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, (double) 10, 1);
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = eventState4.evaluateStep(stepInterpolator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        double[] doubleArray27 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean28 = eventState19.reset(10.0d, doubleArray27);
        boolean boolean29 = eventState13.reset((double) 1, doubleArray27);
        boolean boolean30 = eventState4.reset((double) (short) 0, doubleArray27);
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = eventState4.getEventHandler();
        double double32 = eventState4.getEventTime();
        double double33 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(eventHandler31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 0.0d, (double) 100.0f, (int) (short) 100);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = eventState16.getEventHandler();
        double[] doubleArray24 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean25 = eventState16.reset(10.0d, doubleArray24);
        boolean boolean26 = eventState10.reset((double) 1, doubleArray24);
        boolean boolean27 = eventState4.reset((double) (byte) -1, doubleArray24);
        double double28 = eventState4.getMaxCheckInterval();
        double double29 = eventState4.getEventTime();
        int int30 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = eventState4.evaluateStep(stepInterpolator31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler17);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 35.0d, 35.0d, (int) (short) -1);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1L), 52.0d, (int) (byte) 0);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getConvergence();
        double double9 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        double double11 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState4.getEventHandler();
        double double13 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(eventHandler10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNull(eventHandler12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray13 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean14 = eventState4.reset(0.0d, doubleArray13);
        int int15 = eventState4.getMaxIterationCount();
        double double16 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = eventState4.getEventHandler();
        double double18 = eventState4.getEventTime();
        double double19 = eventState4.getMaxCheckInterval();
        double double20 = eventState4.getConvergence();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNull(eventHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        double[] doubleArray27 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean28 = eventState19.reset(10.0d, doubleArray27);
        boolean boolean29 = eventState13.reset((double) 1, doubleArray27);
        boolean boolean30 = eventState4.reset((double) (short) 0, doubleArray27);
        int int31 = eventState4.getMaxIterationCount();
        double[] doubleArray37 = new double[] { (-1), 'a', (short) 100, (-1) };
        boolean boolean38 = eventState4.reset((double) (byte) 100, doubleArray37);
        double double39 = eventState4.getConvergence();
        double[] doubleArray41 = null;
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin(0.0d, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { (-1.0d), 97.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 100, (double) 1L, 100);
        boolean boolean5 = eventState4.stop();
        double double6 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10, 0.0d, (int) (short) 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (short) 10, (double) '#', (int) (short) 0);
        int int11 = eventState10.getMaxIterationCount();
        double double12 = eventState10.getEventTime();
        boolean boolean13 = eventState10.stop();
        int int14 = eventState10.getMaxIterationCount();
        double double15 = eventState10.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState27.getEventHandler();
        double[] doubleArray35 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean36 = eventState27.reset(10.0d, doubleArray35);
        boolean boolean37 = eventState21.reset((double) 1, doubleArray35);
        boolean boolean38 = eventState10.reset((double) (short) -1, doubleArray35);
        int int39 = eventState10.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler41 = null;
        org.apache.commons.math.ode.events.EventState eventState45 = new org.apache.commons.math.ode.events.EventState(eventHandler41, (double) (-1), (double) '#', (int) (byte) 1);
        double double46 = eventState45.getConvergence();
        int int47 = eventState45.getMaxIterationCount();
        double double48 = eventState45.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler50 = null;
        org.apache.commons.math.ode.events.EventState eventState54 = new org.apache.commons.math.ode.events.EventState(eventHandler50, (double) 100.0f, (double) 10, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler56 = null;
        org.apache.commons.math.ode.events.EventState eventState60 = new org.apache.commons.math.ode.events.EventState(eventHandler56, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler61 = eventState60.getEventHandler();
        int int62 = eventState60.getMaxIterationCount();
        double double63 = eventState60.getMaxCheckInterval();
        double double64 = eventState60.getEventTime();
        double double65 = eventState60.getEventTime();
        boolean boolean66 = eventState60.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler68 = null;
        org.apache.commons.math.ode.events.EventState eventState72 = new org.apache.commons.math.ode.events.EventState(eventHandler68, (double) '#', (double) 100.0f, 1);
        int int73 = eventState72.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler75 = null;
        org.apache.commons.math.ode.events.EventState eventState79 = new org.apache.commons.math.ode.events.EventState(eventHandler75, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler80 = eventState79.getEventHandler();
        double[] doubleArray87 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean88 = eventState79.reset(10.0d, doubleArray87);
        boolean boolean89 = eventState72.reset(0.0d, doubleArray87);
        boolean boolean90 = eventState60.reset((double) (byte) 0, doubleArray87);
        boolean boolean91 = eventState54.reset(0.0d, doubleArray87);
        boolean boolean92 = eventState45.reset((double) 1, doubleArray87);
        boolean boolean93 = eventState10.reset((double) 1L, doubleArray87);
        boolean boolean94 = eventState4.reset((double) (byte) 1, doubleArray87);
        double double95 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler96 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler97 = eventState4.getEventHandler();
        double double98 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 35.0d + "'", double46 == 35.0d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNull(eventHandler61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 35.0d + "'", double63 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNull(eventHandler80);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 10.0d + "'", double95 == 10.0d);
        org.junit.Assert.assertNull(eventHandler96);
        org.junit.Assert.assertNull(eventHandler97);
        org.junit.Assert.assertTrue(Double.isNaN(double98));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 1, (double) 0L, 10);
        boolean boolean5 = eventState4.stop();
        int int6 = eventState4.getMaxIterationCount();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getMaxCheckInterval();
        int int9 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        int int8 = eventState4.getMaxIterationCount();
        boolean boolean9 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNull(eventHandler6);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        int int5 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState11.getEventHandler();
        double[] doubleArray19 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean20 = eventState11.reset(10.0d, doubleArray19);
        boolean boolean21 = eventState4.reset(0.0d, doubleArray19);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState27.getEventHandler();
        double[] doubleArray35 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean36 = eventState27.reset(10.0d, doubleArray35);
        boolean boolean37 = eventState4.reset(10.0d, doubleArray35);
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = eventState4.getEventHandler();
        double double39 = eventState4.getConvergence();
        boolean boolean40 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(eventHandler12);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(eventHandler38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        double double7 = eventState4.getConvergence();
        int int8 = eventState4.getMaxIterationCount();
        double double9 = eventState4.getEventTime();
        double double10 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState4.getEventHandler();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = eventState4.evaluateStep(stepInterpolator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(eventHandler11);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 100.0d, 35.0d, (int) (short) 100);
        double double5 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 0.0f, (double) 35, (int) (short) 1);
        int int5 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        double double7 = eventState4.getEventTime();
        double double8 = eventState4.getEventTime();
        int int9 = eventState4.getMaxIterationCount();
        boolean boolean10 = eventState4.stop();
        int int11 = eventState4.getMaxIterationCount();
        double double12 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = eventState4.getEventHandler();
        double double14 = eventState4.getConvergence();
        double double15 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertNull(eventHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray13 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean14 = eventState4.reset(0.0d, doubleArray13);
        int int15 = eventState4.getMaxIterationCount();
        double double16 = eventState4.getMaxCheckInterval();
        double double17 = eventState4.getConvergence();
        boolean boolean18 = eventState4.stop();
        double double19 = eventState4.getEventTime();
        boolean boolean20 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = null;
        org.apache.commons.math.ode.events.EventState eventState26 = new org.apache.commons.math.ode.events.EventState(eventHandler22, (double) 10.0f, (double) (byte) -1, (int) ' ');
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = null;
        org.apache.commons.math.ode.events.EventState eventState32 = new org.apache.commons.math.ode.events.EventState(eventHandler28, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = eventState32.getEventHandler();
        int int34 = eventState32.getMaxIterationCount();
        double double35 = eventState32.getMaxCheckInterval();
        double double36 = eventState32.getEventTime();
        double double37 = eventState32.getEventTime();
        boolean boolean38 = eventState32.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler39 = eventState32.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler41 = null;
        org.apache.commons.math.ode.events.EventState eventState45 = new org.apache.commons.math.ode.events.EventState(eventHandler41, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = null;
        org.apache.commons.math.ode.events.EventState eventState51 = new org.apache.commons.math.ode.events.EventState(eventHandler47, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler52 = eventState51.getEventHandler();
        double[] doubleArray59 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean60 = eventState51.reset(10.0d, doubleArray59);
        boolean boolean61 = eventState45.reset((double) 1, doubleArray59);
        boolean boolean62 = eventState32.reset((double) 35, doubleArray59);
        org.apache.commons.math.ode.events.EventHandler eventHandler64 = null;
        org.apache.commons.math.ode.events.EventState eventState68 = new org.apache.commons.math.ode.events.EventState(eventHandler64, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler70 = null;
        org.apache.commons.math.ode.events.EventState eventState74 = new org.apache.commons.math.ode.events.EventState(eventHandler70, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler76 = null;
        org.apache.commons.math.ode.events.EventState eventState80 = new org.apache.commons.math.ode.events.EventState(eventHandler76, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler81 = eventState80.getEventHandler();
        double[] doubleArray88 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean89 = eventState80.reset(10.0d, doubleArray88);
        boolean boolean90 = eventState74.reset((double) 1, doubleArray88);
        boolean boolean91 = eventState68.reset((double) (byte) -1, doubleArray88);
        boolean boolean92 = eventState32.reset((double) (-1.0f), doubleArray88);
        boolean boolean93 = eventState26.reset((double) 10, doubleArray88);
        boolean boolean94 = eventState4.reset((double) (byte) -1, doubleArray88);
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator95 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean96 = eventState4.evaluateStep(stepInterpolator95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(eventHandler33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 35.0d + "'", double35 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(eventHandler39);
        org.junit.Assert.assertNull(eventHandler52);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(eventHandler81);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getEventTime();
        boolean boolean10 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        double[] doubleArray31 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean32 = eventState23.reset(10.0d, doubleArray31);
        boolean boolean33 = eventState17.reset((double) 1, doubleArray31);
        boolean boolean34 = eventState4.reset((double) 35, doubleArray31);
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = null;
        org.apache.commons.math.ode.events.EventState eventState41 = new org.apache.commons.math.ode.events.EventState(eventHandler37, (double) '#', (double) 100.0f, 1);
        int int42 = eventState41.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler44 = null;
        org.apache.commons.math.ode.events.EventState eventState48 = new org.apache.commons.math.ode.events.EventState(eventHandler44, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler49 = eventState48.getEventHandler();
        double[] doubleArray56 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean57 = eventState48.reset(10.0d, doubleArray56);
        boolean boolean58 = eventState41.reset(0.0d, doubleArray56);
        boolean boolean59 = eventState4.reset((double) '4', doubleArray56);
        double double60 = eventState4.getConvergence();
        int int61 = eventState4.getMaxIterationCount();
        double double62 = eventState4.getEventTime();
        double double63 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(eventHandler35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNull(eventHandler49);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 0, (double) (byte) -1, (int) (short) -1);
        double double5 = eventState4.getMaxCheckInterval();
        boolean boolean6 = eventState4.stop();
        java.lang.Class<?> wildcardClass7 = eventState4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 10.0d, (double) 35, 0);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 0L, (double) (short) 10, 0);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) 100L, (int) (short) 100);
        boolean boolean5 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        int int5 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState11.getEventHandler();
        double[] doubleArray19 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean20 = eventState11.reset(10.0d, doubleArray19);
        boolean boolean21 = eventState4.reset((double) '#', doubleArray19);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) 97, 0.0d, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler29 = null;
        org.apache.commons.math.ode.events.EventState eventState33 = new org.apache.commons.math.ode.events.EventState(eventHandler29, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = eventState33.getEventHandler();
        double[] doubleArray42 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean43 = eventState33.reset(0.0d, doubleArray42);
        int int44 = eventState33.getMaxIterationCount();
        double double45 = eventState33.getMaxCheckInterval();
        double double46 = eventState33.getConvergence();
        boolean boolean47 = eventState33.stop();
        double double48 = eventState33.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler50 = null;
        org.apache.commons.math.ode.events.EventState eventState54 = new org.apache.commons.math.ode.events.EventState(eventHandler50, (double) (short) 10, (double) '#', (int) (short) 0);
        int int55 = eventState54.getMaxIterationCount();
        double double56 = eventState54.getEventTime();
        boolean boolean57 = eventState54.stop();
        int int58 = eventState54.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler60 = null;
        org.apache.commons.math.ode.events.EventState eventState64 = new org.apache.commons.math.ode.events.EventState(eventHandler60, (double) (short) 10, (double) '#', (int) (short) 0);
        int int65 = eventState64.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler67 = null;
        org.apache.commons.math.ode.events.EventState eventState71 = new org.apache.commons.math.ode.events.EventState(eventHandler67, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler73 = null;
        org.apache.commons.math.ode.events.EventState eventState77 = new org.apache.commons.math.ode.events.EventState(eventHandler73, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler78 = eventState77.getEventHandler();
        double[] doubleArray85 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean86 = eventState77.reset(10.0d, doubleArray85);
        boolean boolean87 = eventState71.reset((double) 1, doubleArray85);
        boolean boolean88 = eventState64.reset((double) (-1L), doubleArray85);
        boolean boolean89 = eventState54.reset(0.0d, doubleArray85);
        boolean boolean90 = eventState33.reset((double) 1.0f, doubleArray85);
        boolean boolean91 = eventState27.reset((double) '4', doubleArray85);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin(0.0d, doubleArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(eventHandler12);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(eventHandler34);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 35.0d + "'", double45 == 35.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(eventHandler78);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 97, 10.0d, (int) (short) -1);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 97, 1.0d, 97);
        double double5 = eventState4.getMaxCheckInterval();
        double double6 = eventState4.getEventTime();
        double double7 = eventState4.getConvergence();
        boolean boolean8 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 1, (double) (byte) -1, (int) (byte) 0);
        double double5 = eventState4.getEventTime();
        boolean boolean6 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, 100.0d, (double) (short) 1, (int) (byte) -1);
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = null;
        org.apache.commons.math.ode.events.EventState eventState18 = new org.apache.commons.math.ode.events.EventState(eventHandler14, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = eventState18.getEventHandler();
        double[] doubleArray26 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean27 = eventState18.reset(10.0d, doubleArray26);
        org.apache.commons.math.ode.events.EventHandler eventHandler29 = null;
        org.apache.commons.math.ode.events.EventState eventState33 = new org.apache.commons.math.ode.events.EventState(eventHandler29, (double) (short) 10, (double) '#', (int) (short) 0);
        int int34 = eventState33.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = null;
        org.apache.commons.math.ode.events.EventState eventState40 = new org.apache.commons.math.ode.events.EventState(eventHandler36, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = null;
        org.apache.commons.math.ode.events.EventState eventState46 = new org.apache.commons.math.ode.events.EventState(eventHandler42, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = eventState46.getEventHandler();
        double[] doubleArray54 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean55 = eventState46.reset(10.0d, doubleArray54);
        boolean boolean56 = eventState40.reset((double) 1, doubleArray54);
        boolean boolean57 = eventState33.reset((double) (-1L), doubleArray54);
        boolean boolean58 = eventState18.reset((-1.0d), doubleArray54);
        boolean boolean59 = eventState12.reset((double) (-1.0f), doubleArray54);
        boolean boolean60 = eventState4.reset((double) 1.0f, doubleArray54);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(eventHandler19);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(eventHandler47);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        double[] doubleArray27 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean28 = eventState19.reset(10.0d, doubleArray27);
        boolean boolean29 = eventState13.reset((double) 1, doubleArray27);
        boolean boolean30 = eventState4.reset((double) (short) 0, doubleArray27);
        int int31 = eventState4.getMaxIterationCount();
        double[] doubleArray37 = new double[] { (-1), 'a', (short) 100, (-1) };
        boolean boolean38 = eventState4.reset((double) (byte) 100, doubleArray37);
        double double39 = eventState4.getMaxCheckInterval();
        double double40 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { (-1.0d), 97.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 35.0d + "'", double39 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 0.0d, (double) 100L, (int) ' ');
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, 32.0d, (double) (byte) 10, (int) (short) 0);
        int int11 = eventState10.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) (short) 10, (double) '#', (int) (short) 0);
        int int18 = eventState17.getMaxIterationCount();
        double double19 = eventState17.getEventTime();
        boolean boolean20 = eventState17.stop();
        boolean boolean21 = eventState17.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        int int28 = eventState27.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = eventState34.getEventHandler();
        double[] doubleArray42 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean43 = eventState34.reset(10.0d, doubleArray42);
        boolean boolean44 = eventState27.reset(0.0d, doubleArray42);
        org.apache.commons.math.ode.events.EventHandler eventHandler46 = null;
        org.apache.commons.math.ode.events.EventState eventState50 = new org.apache.commons.math.ode.events.EventState(eventHandler46, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler51 = eventState50.getEventHandler();
        double[] doubleArray59 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean60 = eventState50.reset(0.0d, doubleArray59);
        boolean boolean61 = eventState27.reset(Double.NaN, doubleArray59);
        boolean boolean62 = eventState17.reset((double) 10L, doubleArray59);
        boolean boolean63 = eventState10.reset((double) 1L, doubleArray59);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted(35.0d, doubleArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(eventHandler35);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(eventHandler51);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 35.0d, (double) 0.0f, (int) '4');
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        int int17 = eventState16.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        double[] doubleArray31 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean32 = eventState23.reset(10.0d, doubleArray31);
        boolean boolean33 = eventState16.reset(0.0d, doubleArray31);
        boolean boolean34 = eventState10.reset((double) (byte) 0, doubleArray31);
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = null;
        org.apache.commons.math.ode.events.EventState eventState40 = new org.apache.commons.math.ode.events.EventState(eventHandler36, (double) '#', (double) 100.0f, 1);
        int int41 = eventState40.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler43 = null;
        org.apache.commons.math.ode.events.EventState eventState47 = new org.apache.commons.math.ode.events.EventState(eventHandler43, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler48 = eventState47.getEventHandler();
        double[] doubleArray55 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean56 = eventState47.reset(10.0d, doubleArray55);
        boolean boolean57 = eventState40.reset(0.0d, doubleArray55);
        org.apache.commons.math.ode.events.EventHandler eventHandler59 = null;
        org.apache.commons.math.ode.events.EventState eventState63 = new org.apache.commons.math.ode.events.EventState(eventHandler59, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler64 = eventState63.getEventHandler();
        double[] doubleArray71 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean72 = eventState63.reset(10.0d, doubleArray71);
        boolean boolean73 = eventState40.reset(10.0d, doubleArray71);
        boolean boolean74 = eventState10.reset((double) 0.0f, doubleArray71);
        org.apache.commons.math.ode.events.EventHandler eventHandler76 = null;
        org.apache.commons.math.ode.events.EventState eventState80 = new org.apache.commons.math.ode.events.EventState(eventHandler76, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler81 = eventState80.getEventHandler();
        int int82 = eventState80.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler83 = eventState80.getEventHandler();
        int int84 = eventState80.getMaxIterationCount();
        int int85 = eventState80.getMaxIterationCount();
        double[] doubleArray92 = new double[] { (-1), (-1L), 100.0d, 0, 10.0d };
        boolean boolean93 = eventState80.reset(1.0d, doubleArray92);
        boolean boolean94 = eventState10.reset(1.0d, doubleArray92);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) 32, doubleArray92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(eventHandler48);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(eventHandler64);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(eventHandler81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNull(eventHandler83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { (-1.0d), (-1.0d), 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        double[] doubleArray27 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean28 = eventState19.reset(10.0d, doubleArray27);
        boolean boolean29 = eventState13.reset((double) 1, doubleArray27);
        boolean boolean30 = eventState4.reset((double) (short) 0, doubleArray27);
        double double31 = eventState4.getMaxCheckInterval();
        boolean boolean32 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = eventState4.getEventHandler();
        boolean boolean34 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(eventHandler33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double double5 = eventState4.getMaxCheckInterval();
        double double6 = eventState4.getMaxCheckInterval();
        int int7 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = eventState13.getEventHandler();
        double[] doubleArray22 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean23 = eventState13.reset(0.0d, doubleArray22);
        boolean boolean24 = eventState4.reset((double) (byte) 1, doubleArray22);
        boolean boolean25 = eventState4.stop();
        double double26 = eventState4.getMaxCheckInterval();
        double double27 = eventState4.getMaxCheckInterval();
        boolean boolean28 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(eventHandler14);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double double5 = eventState4.getMaxCheckInterval();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getConvergence();
        boolean boolean8 = eventState4.stop();
        int int9 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = null;
        org.apache.commons.math.ode.events.EventState eventState15 = new org.apache.commons.math.ode.events.EventState(eventHandler11, (double) 10, (double) 1L, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) (short) 10, (double) '#', (int) (short) 0);
        int int22 = eventState21.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = null;
        org.apache.commons.math.ode.events.EventState eventState28 = new org.apache.commons.math.ode.events.EventState(eventHandler24, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = eventState34.getEventHandler();
        double[] doubleArray42 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean43 = eventState34.reset(10.0d, doubleArray42);
        boolean boolean44 = eventState28.reset((double) 1, doubleArray42);
        boolean boolean45 = eventState21.reset((double) (-1L), doubleArray42);
        boolean boolean46 = eventState15.reset((double) ' ', doubleArray42);
        boolean boolean47 = eventState4.reset((double) 0.0f, doubleArray42);
        java.lang.Class<?> wildcardClass48 = doubleArray42.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(eventHandler35);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray13 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean14 = eventState4.reset(0.0d, doubleArray13);
        int int15 = eventState4.getMaxIterationCount();
        double double16 = eventState4.getConvergence();
        double double17 = eventState4.getMaxCheckInterval();
        int int18 = eventState4.getMaxIterationCount();
        double double19 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = null;
        org.apache.commons.math.ode.events.EventState eventState26 = new org.apache.commons.math.ode.events.EventState(eventHandler22, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray32 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean33 = eventState26.reset((double) (byte) 100, doubleArray32);
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = null;
        org.apache.commons.math.ode.events.EventState eventState39 = new org.apache.commons.math.ode.events.EventState(eventHandler35, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler40 = eventState39.getEventHandler();
        double[] doubleArray48 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean49 = eventState39.reset(0.0d, doubleArray48);
        int int50 = eventState39.getMaxIterationCount();
        double double51 = eventState39.getMaxCheckInterval();
        double double52 = eventState39.getConvergence();
        boolean boolean53 = eventState39.stop();
        double double54 = eventState39.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler56 = null;
        org.apache.commons.math.ode.events.EventState eventState60 = new org.apache.commons.math.ode.events.EventState(eventHandler56, (double) (short) 10, (double) '#', (int) (short) 0);
        int int61 = eventState60.getMaxIterationCount();
        double double62 = eventState60.getEventTime();
        boolean boolean63 = eventState60.stop();
        int int64 = eventState60.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler66 = null;
        org.apache.commons.math.ode.events.EventState eventState70 = new org.apache.commons.math.ode.events.EventState(eventHandler66, (double) (short) 10, (double) '#', (int) (short) 0);
        int int71 = eventState70.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler73 = null;
        org.apache.commons.math.ode.events.EventState eventState77 = new org.apache.commons.math.ode.events.EventState(eventHandler73, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler79 = null;
        org.apache.commons.math.ode.events.EventState eventState83 = new org.apache.commons.math.ode.events.EventState(eventHandler79, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler84 = eventState83.getEventHandler();
        double[] doubleArray91 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean92 = eventState83.reset(10.0d, doubleArray91);
        boolean boolean93 = eventState77.reset((double) 1, doubleArray91);
        boolean boolean94 = eventState70.reset((double) (-1L), doubleArray91);
        boolean boolean95 = eventState60.reset(0.0d, doubleArray91);
        boolean boolean96 = eventState39.reset((double) 1.0f, doubleArray91);
        boolean boolean97 = eventState26.reset(100.0d, doubleArray91);
        boolean boolean98 = eventState4.reset((double) (-1), doubleArray91);
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(eventHandler40);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 35.0d + "'", double51 == 35.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(eventHandler84);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, (double) (short) -1, (int) '#');
        double double5 = eventState4.getConvergence();
        boolean boolean6 = eventState4.stop();
        double double7 = eventState4.getConvergence();
        double double8 = eventState4.getEventTime();
        boolean boolean9 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 10.0d, 10.0d, 10);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) ' ', 0.0d, (int) (byte) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = eventState13.getEventHandler();
        double[] doubleArray21 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean22 = eventState13.reset(10.0d, doubleArray21);
        boolean boolean23 = eventState4.reset((double) (byte) 1, doubleArray21);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState4.getEventHandler();
        double double25 = eventState4.getMaxCheckInterval();
        boolean boolean26 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler14);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 35.0d + "'", double25 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(eventHandler27);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray13 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean14 = eventState4.reset(0.0d, doubleArray13);
        int int15 = eventState4.getMaxIterationCount();
        double double16 = eventState4.getMaxCheckInterval();
        double double17 = eventState4.getConvergence();
        boolean boolean18 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = null;
        org.apache.commons.math.ode.events.EventState eventState24 = new org.apache.commons.math.ode.events.EventState(eventHandler20, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = eventState24.getEventHandler();
        int int26 = eventState24.getMaxIterationCount();
        double double27 = eventState24.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState24.getEventHandler();
        int int29 = eventState24.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = null;
        org.apache.commons.math.ode.events.EventState eventState35 = new org.apache.commons.math.ode.events.EventState(eventHandler31, (double) (-1), (double) '#', (int) (byte) 1);
        boolean boolean36 = eventState35.stop();
        double double37 = eventState35.getMaxCheckInterval();
        double double38 = eventState35.getMaxCheckInterval();
        boolean boolean39 = eventState35.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler41 = null;
        org.apache.commons.math.ode.events.EventState eventState45 = new org.apache.commons.math.ode.events.EventState(eventHandler41, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler46 = eventState45.getEventHandler();
        double double47 = eventState45.getMaxCheckInterval();
        double double48 = eventState45.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler50 = null;
        org.apache.commons.math.ode.events.EventState eventState54 = new org.apache.commons.math.ode.events.EventState(eventHandler50, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler55 = eventState54.getEventHandler();
        double[] doubleArray62 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean63 = eventState54.reset(10.0d, doubleArray62);
        org.apache.commons.math.ode.events.EventHandler eventHandler65 = null;
        org.apache.commons.math.ode.events.EventState eventState69 = new org.apache.commons.math.ode.events.EventState(eventHandler65, (double) (short) 10, (double) '#', (int) (short) 0);
        int int70 = eventState69.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler72 = null;
        org.apache.commons.math.ode.events.EventState eventState76 = new org.apache.commons.math.ode.events.EventState(eventHandler72, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler78 = null;
        org.apache.commons.math.ode.events.EventState eventState82 = new org.apache.commons.math.ode.events.EventState(eventHandler78, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler83 = eventState82.getEventHandler();
        double[] doubleArray90 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean91 = eventState82.reset(10.0d, doubleArray90);
        boolean boolean92 = eventState76.reset((double) 1, doubleArray90);
        boolean boolean93 = eventState69.reset((double) (-1L), doubleArray90);
        boolean boolean94 = eventState54.reset((-1.0d), doubleArray90);
        boolean boolean95 = eventState45.reset((double) (byte) 100, doubleArray90);
        boolean boolean96 = eventState35.reset(35.0d, doubleArray90);
        boolean boolean97 = eventState24.reset((double) 0L, doubleArray90);
        boolean boolean98 = eventState4.reset((double) 10.0f, doubleArray90);
        int int99 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(eventHandler25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(eventHandler46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 35.0d + "'", double47 == 35.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertNull(eventHandler55);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNull(eventHandler83);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 1 + "'", int99 == 1);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        int int8 = eventState4.getMaxIterationCount();
        int int9 = eventState4.getMaxIterationCount();
        double[] doubleArray16 = new double[] { (-1), (-1L), 100.0d, 0, 10.0d };
        boolean boolean17 = eventState4.reset(1.0d, doubleArray16);
        double double18 = eventState4.getConvergence();
        double double19 = eventState4.getConvergence();
        double double20 = eventState4.getConvergence();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), (-1.0d), 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 0.0d, (double) (short) -1, (int) ' ');
        double double5 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) (byte) 100, 1);
        boolean boolean5 = eventState4.stop();
        double double6 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = eventState12.getEventHandler();
        int int14 = eventState12.getMaxIterationCount();
        double double15 = eventState12.getMaxCheckInterval();
        double double16 = eventState12.getEventTime();
        int int17 = eventState12.getMaxIterationCount();
        double double18 = eventState12.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = null;
        org.apache.commons.math.ode.events.EventState eventState24 = new org.apache.commons.math.ode.events.EventState(eventHandler20, (double) (short) 10, (double) '#', (int) (short) 0);
        int int25 = eventState24.getMaxIterationCount();
        double double26 = eventState24.getEventTime();
        boolean boolean27 = eventState24.stop();
        int int28 = eventState24.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) (short) 10, (double) '#', (int) (short) 0);
        int int35 = eventState34.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = null;
        org.apache.commons.math.ode.events.EventState eventState41 = new org.apache.commons.math.ode.events.EventState(eventHandler37, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler43 = null;
        org.apache.commons.math.ode.events.EventState eventState47 = new org.apache.commons.math.ode.events.EventState(eventHandler43, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler48 = eventState47.getEventHandler();
        double[] doubleArray55 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean56 = eventState47.reset(10.0d, doubleArray55);
        boolean boolean57 = eventState41.reset((double) 1, doubleArray55);
        boolean boolean58 = eventState34.reset((double) (-1L), doubleArray55);
        boolean boolean59 = eventState24.reset(0.0d, doubleArray55);
        boolean boolean60 = eventState12.reset((double) '#', doubleArray55);
        boolean boolean61 = eventState4.reset((double) 1.0f, doubleArray55);
        int int62 = eventState4.getMaxIterationCount();
        double double63 = eventState4.getConvergence();
        double double64 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler65 = eventState4.getEventHandler();
        double double66 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNull(eventHandler13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(eventHandler48);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 100.0d + "'", double63 == 100.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.0d) + "'", double64 == (-1.0d));
        org.junit.Assert.assertNull(eventHandler65);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 97, (double) 'a', (int) '4');
        double double5 = eventState4.getEventTime();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        int int8 = eventState4.getMaxIterationCount();
        boolean boolean9 = eventState4.stop();
        java.lang.Class<?> wildcardClass10 = eventState4.getClass();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        double[] doubleArray18 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean19 = eventState10.reset(10.0d, doubleArray18);
        boolean boolean20 = eventState4.reset((double) (byte) 0, doubleArray18);
        double[] doubleArray22 = null;
        boolean boolean23 = eventState4.reset((double) 97, doubleArray22);
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = null;
        org.apache.commons.math.ode.events.EventState eventState29 = new org.apache.commons.math.ode.events.EventState(eventHandler25, (double) '#', (double) 0L, (int) (short) -1);
        int int30 = eventState29.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = null;
        org.apache.commons.math.ode.events.EventState eventState36 = new org.apache.commons.math.ode.events.EventState(eventHandler32, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = eventState36.getEventHandler();
        double[] doubleArray45 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean46 = eventState36.reset(0.0d, doubleArray45);
        int int47 = eventState36.getMaxIterationCount();
        double double48 = eventState36.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler49 = eventState36.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler51 = null;
        org.apache.commons.math.ode.events.EventState eventState55 = new org.apache.commons.math.ode.events.EventState(eventHandler51, (double) '#', (double) 100.0f, 1);
        int int56 = eventState55.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler58 = null;
        org.apache.commons.math.ode.events.EventState eventState62 = new org.apache.commons.math.ode.events.EventState(eventHandler58, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler63 = eventState62.getEventHandler();
        double[] doubleArray70 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean71 = eventState62.reset(10.0d, doubleArray70);
        boolean boolean72 = eventState55.reset(0.0d, doubleArray70);
        org.apache.commons.math.ode.events.EventHandler eventHandler74 = null;
        org.apache.commons.math.ode.events.EventState eventState78 = new org.apache.commons.math.ode.events.EventState(eventHandler74, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler79 = eventState78.getEventHandler();
        double[] doubleArray87 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean88 = eventState78.reset(0.0d, doubleArray87);
        boolean boolean89 = eventState55.reset(Double.NaN, doubleArray87);
        boolean boolean90 = eventState36.reset((double) (-1), doubleArray87);
        boolean boolean91 = eventState29.reset((double) 10L, doubleArray87);
        boolean boolean92 = eventState4.reset((double) 10, doubleArray87);
        double double93 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(eventHandler37);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertNull(eventHandler49);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNull(eventHandler63);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(eventHandler79);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double93));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        boolean boolean6 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) '#', (double) 100.0f, 1);
        int int13 = eventState12.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        double[] doubleArray27 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean28 = eventState19.reset(10.0d, doubleArray27);
        boolean boolean29 = eventState12.reset(0.0d, doubleArray27);
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = null;
        org.apache.commons.math.ode.events.EventState eventState35 = new org.apache.commons.math.ode.events.EventState(eventHandler31, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = eventState35.getEventHandler();
        double[] doubleArray43 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean44 = eventState35.reset(10.0d, doubleArray43);
        boolean boolean45 = eventState12.reset(10.0d, doubleArray43);
        boolean boolean46 = eventState4.reset(Double.NaN, doubleArray43);
        int int47 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler48 = eventState4.getEventHandler();
        double double49 = eventState4.getMaxCheckInterval();
        double double50 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(eventHandler36);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(eventHandler48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 35.0d + "'", double50 == 35.0d);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 10, (double) (byte) 1, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        int int12 = eventState10.getMaxIterationCount();
        double double13 = eventState10.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = null;
        org.apache.commons.math.ode.events.EventState eventState25 = new org.apache.commons.math.ode.events.EventState(eventHandler21, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler26 = eventState25.getEventHandler();
        double[] doubleArray33 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean34 = eventState25.reset(10.0d, doubleArray33);
        boolean boolean35 = eventState19.reset((double) 1, doubleArray33);
        boolean boolean36 = eventState10.reset((double) (short) 0, doubleArray33);
        int int37 = eventState10.getMaxIterationCount();
        double double38 = eventState10.getMaxCheckInterval();
        double double39 = eventState10.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler41 = null;
        org.apache.commons.math.ode.events.EventState eventState45 = new org.apache.commons.math.ode.events.EventState(eventHandler41, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = null;
        org.apache.commons.math.ode.events.EventState eventState51 = new org.apache.commons.math.ode.events.EventState(eventHandler47, (double) '#', (double) 100.0f, 1);
        int int52 = eventState51.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler54 = null;
        org.apache.commons.math.ode.events.EventState eventState58 = new org.apache.commons.math.ode.events.EventState(eventHandler54, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler59 = eventState58.getEventHandler();
        double[] doubleArray66 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean67 = eventState58.reset(10.0d, doubleArray66);
        boolean boolean68 = eventState51.reset(0.0d, doubleArray66);
        boolean boolean69 = eventState45.reset((double) (byte) 0, doubleArray66);
        boolean boolean70 = eventState10.reset(52.0d, doubleArray66);
        boolean boolean71 = eventState4.reset((double) 10.0f, doubleArray66);
        double double72 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler73 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNull(eventHandler26);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 35.0d + "'", double38 == 35.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNull(eventHandler59);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertNull(eventHandler73);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) (short) 10, (int) (byte) -1);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, Double.NaN, (double) (short) -1, (-1));
        double double11 = eventState10.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) (short) 10, (double) '#', (int) (short) 0);
        int int18 = eventState17.getMaxIterationCount();
        double double19 = eventState17.getEventTime();
        boolean boolean20 = eventState17.stop();
        int int21 = eventState17.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) (short) 10, (double) '#', (int) (short) 0);
        int int28 = eventState27.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = null;
        org.apache.commons.math.ode.events.EventState eventState40 = new org.apache.commons.math.ode.events.EventState(eventHandler36, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler41 = eventState40.getEventHandler();
        double[] doubleArray48 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean49 = eventState40.reset(10.0d, doubleArray48);
        boolean boolean50 = eventState34.reset((double) 1, doubleArray48);
        boolean boolean51 = eventState27.reset((double) (-1L), doubleArray48);
        boolean boolean52 = eventState17.reset(0.0d, doubleArray48);
        boolean boolean53 = eventState10.reset(52.0d, doubleArray48);
        boolean boolean54 = eventState4.reset((double) 97, doubleArray48);
        double double55 = eventState4.getMaxCheckInterval();
        double[] doubleArray57 = null;
        boolean boolean58 = eventState4.reset(Double.NaN, doubleArray57);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(eventHandler41);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 1L, (double) 10L, (int) ' ');
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = eventState4.evaluateStep(stepInterpolator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        int int8 = eventState4.getMaxIterationCount();
        int int9 = eventState4.getMaxIterationCount();
        double[] doubleArray16 = new double[] { (-1), (-1L), 100.0d, 0, 10.0d };
        boolean boolean17 = eventState4.reset(1.0d, doubleArray16);
        int int18 = eventState4.getMaxIterationCount();
        boolean boolean19 = eventState4.stop();
        double double20 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = eventState4.getEventHandler();
        double double22 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), (-1.0d), 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertNull(eventHandler21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        int int7 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertNull(eventHandler9);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '4', (double) 32, (int) (short) 0);
        double double5 = eventState4.getConvergence();
        java.lang.Class<?> wildcardClass6 = eventState4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getEventTime();
        boolean boolean9 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        double double11 = eventState4.getConvergence();
        double double12 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(eventHandler10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNull(eventHandler6);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 35.0d, (double) 0.0f, (int) '4');
        int int5 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', 0.0d, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1.0f), (double) '#', (int) (short) -1);
        double double5 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) 1L, (double) (short) 1, (int) (byte) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) (byte) -1, Double.NaN, 10);
        double double18 = eventState17.getMaxCheckInterval();
        double double19 = eventState17.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = null;
        org.apache.commons.math.ode.events.EventState eventState25 = new org.apache.commons.math.ode.events.EventState(eventHandler21, (double) (short) 10, (double) '#', (int) (short) 0);
        int int26 = eventState25.getMaxIterationCount();
        double double27 = eventState25.getEventTime();
        boolean boolean28 = eventState25.stop();
        int int29 = eventState25.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = null;
        org.apache.commons.math.ode.events.EventState eventState35 = new org.apache.commons.math.ode.events.EventState(eventHandler31, (double) (short) 10, (double) '#', (int) (short) 0);
        int int36 = eventState35.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = null;
        org.apache.commons.math.ode.events.EventState eventState42 = new org.apache.commons.math.ode.events.EventState(eventHandler38, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler44 = null;
        org.apache.commons.math.ode.events.EventState eventState48 = new org.apache.commons.math.ode.events.EventState(eventHandler44, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler49 = eventState48.getEventHandler();
        double[] doubleArray56 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean57 = eventState48.reset(10.0d, doubleArray56);
        boolean boolean58 = eventState42.reset((double) 1, doubleArray56);
        boolean boolean59 = eventState35.reset((double) (-1L), doubleArray56);
        boolean boolean60 = eventState25.reset(0.0d, doubleArray56);
        boolean boolean61 = eventState17.reset((double) (short) 10, doubleArray56);
        boolean boolean62 = eventState11.reset((double) 32, doubleArray56);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((-1.0d), doubleArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(eventHandler49);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getEventTime();
        int int10 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState4.getEventHandler();
        boolean boolean12 = eventState4.stop();
        boolean boolean13 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        int int21 = eventState19.getMaxIterationCount();
        double double22 = eventState19.getMaxCheckInterval();
        double double23 = eventState19.getEventTime();
        double double24 = eventState19.getEventTime();
        boolean boolean25 = eventState19.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = null;
        org.apache.commons.math.ode.events.EventState eventState31 = new org.apache.commons.math.ode.events.EventState(eventHandler27, (double) '#', (double) 100.0f, 1);
        int int32 = eventState31.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = null;
        org.apache.commons.math.ode.events.EventState eventState38 = new org.apache.commons.math.ode.events.EventState(eventHandler34, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler39 = eventState38.getEventHandler();
        double[] doubleArray46 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean47 = eventState38.reset(10.0d, doubleArray46);
        boolean boolean48 = eventState31.reset(0.0d, doubleArray46);
        boolean boolean49 = eventState19.reset((double) (byte) 0, doubleArray46);
        boolean boolean50 = eventState4.reset((double) 0.0f, doubleArray46);
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(eventHandler39);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 0, (double) 'a', (int) '4');
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getEventTime();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = eventState13.getEventHandler();
        int int15 = eventState13.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = eventState13.getEventHandler();
        int int17 = eventState13.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '4', (double) 100, 97);
        double double24 = eventState23.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler26 = null;
        org.apache.commons.math.ode.events.EventState eventState30 = new org.apache.commons.math.ode.events.EventState(eventHandler26, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = eventState30.getEventHandler();
        double[] doubleArray39 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean40 = eventState30.reset(0.0d, doubleArray39);
        int int41 = eventState30.getMaxIterationCount();
        double double42 = eventState30.getMaxCheckInterval();
        double double43 = eventState30.getConvergence();
        boolean boolean44 = eventState30.stop();
        double double45 = eventState30.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = null;
        org.apache.commons.math.ode.events.EventState eventState51 = new org.apache.commons.math.ode.events.EventState(eventHandler47, (double) (short) 10, (double) '#', (int) (short) 0);
        int int52 = eventState51.getMaxIterationCount();
        double double53 = eventState51.getEventTime();
        boolean boolean54 = eventState51.stop();
        int int55 = eventState51.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler57 = null;
        org.apache.commons.math.ode.events.EventState eventState61 = new org.apache.commons.math.ode.events.EventState(eventHandler57, (double) (short) 10, (double) '#', (int) (short) 0);
        int int62 = eventState61.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler64 = null;
        org.apache.commons.math.ode.events.EventState eventState68 = new org.apache.commons.math.ode.events.EventState(eventHandler64, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler70 = null;
        org.apache.commons.math.ode.events.EventState eventState74 = new org.apache.commons.math.ode.events.EventState(eventHandler70, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler75 = eventState74.getEventHandler();
        double[] doubleArray82 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean83 = eventState74.reset(10.0d, doubleArray82);
        boolean boolean84 = eventState68.reset((double) 1, doubleArray82);
        boolean boolean85 = eventState61.reset((double) (-1L), doubleArray82);
        boolean boolean86 = eventState51.reset(0.0d, doubleArray82);
        boolean boolean87 = eventState30.reset((double) 1.0f, doubleArray82);
        boolean boolean88 = eventState23.reset(97.0d, doubleArray82);
        boolean boolean89 = eventState13.reset((double) '4', doubleArray82);
        boolean boolean90 = eventState4.reset((double) 35, doubleArray82);
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(eventHandler14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(eventHandler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertNull(eventHandler31);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 35.0d + "'", double42 == 35.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(eventHandler75);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        int int9 = eventState4.getMaxIterationCount();
        double double10 = eventState4.getConvergence();
        boolean boolean11 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(eventHandler12);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        int int8 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = null;
        org.apache.commons.math.ode.events.EventState eventState14 = new org.apache.commons.math.ode.events.EventState(eventHandler10, (double) (short) 10, (double) '#', (int) (short) 0);
        int int15 = eventState14.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState27.getEventHandler();
        double[] doubleArray35 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean36 = eventState27.reset(10.0d, doubleArray35);
        boolean boolean37 = eventState21.reset((double) 1, doubleArray35);
        boolean boolean38 = eventState14.reset((double) (-1L), doubleArray35);
        boolean boolean39 = eventState4.reset(0.0d, doubleArray35);
        org.apache.commons.math.ode.events.EventHandler eventHandler40 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler41 = eventState4.getEventHandler();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(eventHandler40);
        org.junit.Assert.assertNull(eventHandler41);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray13 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean14 = eventState4.reset(0.0d, doubleArray13);
        int int15 = eventState4.getMaxIterationCount();
        int int16 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = eventState4.getEventHandler();
        double double18 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = null;
        org.apache.commons.math.ode.events.EventState eventState24 = new org.apache.commons.math.ode.events.EventState(eventHandler20, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = eventState24.getEventHandler();
        int int26 = eventState24.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = eventState24.getEventHandler();
        int int28 = eventState24.getMaxIterationCount();
        double double29 = eventState24.getEventTime();
        int int30 = eventState24.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = null;
        org.apache.commons.math.ode.events.EventState eventState36 = new org.apache.commons.math.ode.events.EventState(eventHandler32, (double) (-1), (double) (byte) 100, 1);
        double double37 = eventState36.getMaxCheckInterval();
        boolean boolean38 = eventState36.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler40 = null;
        org.apache.commons.math.ode.events.EventState eventState44 = new org.apache.commons.math.ode.events.EventState(eventHandler40, (double) '#', (double) 100.0f, 1);
        int int45 = eventState44.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = null;
        org.apache.commons.math.ode.events.EventState eventState51 = new org.apache.commons.math.ode.events.EventState(eventHandler47, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler52 = eventState51.getEventHandler();
        double[] doubleArray59 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean60 = eventState51.reset(10.0d, doubleArray59);
        boolean boolean61 = eventState44.reset(0.0d, doubleArray59);
        org.apache.commons.math.ode.events.EventHandler eventHandler63 = null;
        org.apache.commons.math.ode.events.EventState eventState67 = new org.apache.commons.math.ode.events.EventState(eventHandler63, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler68 = eventState67.getEventHandler();
        double[] doubleArray76 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean77 = eventState67.reset(0.0d, doubleArray76);
        boolean boolean78 = eventState44.reset(Double.NaN, doubleArray76);
        boolean boolean79 = eventState36.reset((double) (short) 10, doubleArray76);
        boolean boolean80 = eventState24.reset((double) 100, doubleArray76);
        boolean boolean81 = eventState4.reset((double) (-1L), doubleArray76);
        int int82 = eventState4.getMaxIterationCount();
        double double83 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(eventHandler17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertNull(eventHandler25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(eventHandler27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNull(eventHandler52);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(eventHandler68);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 35.0d + "'", double83 == 35.0d);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        double[] doubleArray18 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean19 = eventState10.reset(10.0d, doubleArray18);
        boolean boolean20 = eventState4.reset((double) 1, doubleArray18);
        boolean boolean21 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = eventState4.getEventHandler();
        double double23 = eventState4.getEventTime();
        boolean boolean24 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(eventHandler22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '4', (double) (byte) 100, (int) (byte) -1);
        double double5 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) 100.0f, (double) 10, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = eventState17.getEventHandler();
        int int19 = eventState17.getMaxIterationCount();
        double double20 = eventState17.getMaxCheckInterval();
        double double21 = eventState17.getEventTime();
        double double22 = eventState17.getEventTime();
        boolean boolean23 = eventState17.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = null;
        org.apache.commons.math.ode.events.EventState eventState29 = new org.apache.commons.math.ode.events.EventState(eventHandler25, (double) '#', (double) 100.0f, 1);
        int int30 = eventState29.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = null;
        org.apache.commons.math.ode.events.EventState eventState36 = new org.apache.commons.math.ode.events.EventState(eventHandler32, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = eventState36.getEventHandler();
        double[] doubleArray44 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean45 = eventState36.reset(10.0d, doubleArray44);
        boolean boolean46 = eventState29.reset(0.0d, doubleArray44);
        boolean boolean47 = eventState17.reset((double) (byte) 0, doubleArray44);
        boolean boolean48 = eventState11.reset(0.0d, doubleArray44);
        boolean boolean49 = eventState4.reset((double) 100L, doubleArray44);
        double double50 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNull(eventHandler18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(eventHandler37);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 97, (double) 'a', (int) (short) -1);
        double double5 = eventState4.getEventTime();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getEventTime();
        boolean boolean8 = eventState4.stop();
        double double9 = eventState4.getConvergence();
        double double10 = eventState4.getMaxCheckInterval();
        double double11 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 1.0d, (double) (short) 0, 1);
        double double5 = eventState4.getEventTime();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 1L, (double) 1, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, 35.0d, 0.0d, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 0L, (int) (short) -1);
        int int17 = eventState16.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        double[] doubleArray32 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean33 = eventState23.reset(0.0d, doubleArray32);
        int int34 = eventState23.getMaxIterationCount();
        double double35 = eventState23.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = eventState23.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = null;
        org.apache.commons.math.ode.events.EventState eventState42 = new org.apache.commons.math.ode.events.EventState(eventHandler38, (double) '#', (double) 100.0f, 1);
        int int43 = eventState42.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = null;
        org.apache.commons.math.ode.events.EventState eventState49 = new org.apache.commons.math.ode.events.EventState(eventHandler45, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler50 = eventState49.getEventHandler();
        double[] doubleArray57 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean58 = eventState49.reset(10.0d, doubleArray57);
        boolean boolean59 = eventState42.reset(0.0d, doubleArray57);
        org.apache.commons.math.ode.events.EventHandler eventHandler61 = null;
        org.apache.commons.math.ode.events.EventState eventState65 = new org.apache.commons.math.ode.events.EventState(eventHandler61, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler66 = eventState65.getEventHandler();
        double[] doubleArray74 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean75 = eventState65.reset(0.0d, doubleArray74);
        boolean boolean76 = eventState42.reset(Double.NaN, doubleArray74);
        boolean boolean77 = eventState23.reset((double) (-1), doubleArray74);
        boolean boolean78 = eventState16.reset((double) 10L, doubleArray74);
        boolean boolean79 = eventState10.reset((double) (byte) 10, doubleArray74);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin(Double.NaN, doubleArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertNull(eventHandler36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(eventHandler50);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(eventHandler66);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        double double7 = eventState4.getEventTime();
        boolean boolean8 = eventState4.stop();
        double double9 = eventState4.getEventTime();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = eventState4.evaluateStep(stepInterpolator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray10 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean11 = eventState4.reset((double) (byte) 100, doubleArray10);
        double double12 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = eventState4.getEventHandler();
        boolean boolean14 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = eventState4.getEventHandler();
        double double16 = eventState4.getConvergence();
        int int17 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertNull(eventHandler13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(eventHandler15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        int int8 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = null;
        org.apache.commons.math.ode.events.EventState eventState14 = new org.apache.commons.math.ode.events.EventState(eventHandler10, (double) (short) 10, (double) '#', (int) (short) 0);
        int int15 = eventState14.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState27.getEventHandler();
        double[] doubleArray35 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean36 = eventState27.reset(10.0d, doubleArray35);
        boolean boolean37 = eventState21.reset((double) 1, doubleArray35);
        boolean boolean38 = eventState14.reset((double) (-1L), doubleArray35);
        boolean boolean39 = eventState4.reset(0.0d, doubleArray35);
        double double40 = eventState4.getConvergence();
        double double41 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 35.0d + "'", double40 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = null;
        org.apache.commons.math.ode.events.EventState eventState14 = new org.apache.commons.math.ode.events.EventState(eventHandler10, (double) (short) 10, (double) '#', (int) (short) 0);
        int int15 = eventState14.getMaxIterationCount();
        boolean boolean16 = eventState14.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = null;
        org.apache.commons.math.ode.events.EventState eventState22 = new org.apache.commons.math.ode.events.EventState(eventHandler18, (double) '#', (double) 100.0f, 1);
        int int23 = eventState22.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = null;
        org.apache.commons.math.ode.events.EventState eventState29 = new org.apache.commons.math.ode.events.EventState(eventHandler25, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = eventState29.getEventHandler();
        double[] doubleArray37 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean38 = eventState29.reset(10.0d, doubleArray37);
        boolean boolean39 = eventState22.reset(0.0d, doubleArray37);
        org.apache.commons.math.ode.events.EventHandler eventHandler41 = null;
        org.apache.commons.math.ode.events.EventState eventState45 = new org.apache.commons.math.ode.events.EventState(eventHandler41, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler46 = eventState45.getEventHandler();
        double[] doubleArray53 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean54 = eventState45.reset(10.0d, doubleArray53);
        boolean boolean55 = eventState22.reset(10.0d, doubleArray53);
        boolean boolean56 = eventState14.reset(Double.NaN, doubleArray53);
        boolean boolean57 = eventState4.reset(1.0d, doubleArray53);
        double double58 = eventState4.getEventTime();
        double double59 = eventState4.getConvergence();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(eventHandler30);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(eventHandler46);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 97, (double) '#', (int) (byte) 100);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        double double9 = eventState4.getEventTime();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = eventState4.evaluateStep(stepInterpolator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) (byte) 0, 35);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        int int12 = eventState10.getMaxIterationCount();
        double double13 = eventState10.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        double[] doubleArray27 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean28 = eventState19.reset(10.0d, doubleArray27);
        boolean boolean29 = eventState10.reset((double) (byte) 1, doubleArray27);
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = eventState10.getEventHandler();
        int int31 = eventState10.getMaxIterationCount();
        double double32 = eventState10.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = eventState10.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = eventState10.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = null;
        org.apache.commons.math.ode.events.EventState eventState40 = new org.apache.commons.math.ode.events.EventState(eventHandler36, (double) (short) 10, (double) '#', (int) (short) 0);
        int int41 = eventState40.getMaxIterationCount();
        double double42 = eventState40.getEventTime();
        boolean boolean43 = eventState40.stop();
        double double44 = eventState40.getEventTime();
        boolean boolean45 = eventState40.stop();
        double double46 = eventState40.getEventTime();
        double double47 = eventState40.getMaxCheckInterval();
        boolean boolean48 = eventState40.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler50 = null;
        org.apache.commons.math.ode.events.EventState eventState54 = new org.apache.commons.math.ode.events.EventState(eventHandler50, (double) (short) 10, (double) '#', (int) (short) 0);
        int int55 = eventState54.getMaxIterationCount();
        double double56 = eventState54.getEventTime();
        boolean boolean57 = eventState54.stop();
        double double58 = eventState54.getEventTime();
        boolean boolean59 = eventState54.stop();
        double double60 = eventState54.getConvergence();
        double double61 = eventState54.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler63 = null;
        org.apache.commons.math.ode.events.EventState eventState67 = new org.apache.commons.math.ode.events.EventState(eventHandler63, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray73 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean74 = eventState67.reset((double) (byte) 100, doubleArray73);
        boolean boolean75 = eventState54.reset((double) '#', doubleArray73);
        boolean boolean76 = eventState40.reset((double) (byte) 0, doubleArray73);
        boolean boolean77 = eventState10.reset((double) 10, doubleArray73);
        boolean boolean78 = eventState4.reset((double) (-1L), doubleArray73);
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(eventHandler30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNull(eventHandler33);
        org.junit.Assert.assertNull(eventHandler34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 35.0d + "'", double60 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) 0.0f, 100);
        boolean boolean5 = eventState4.stop();
        boolean boolean6 = eventState4.stop();
        int int7 = eventState4.getMaxIterationCount();
        double double8 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = null;
        org.apache.commons.math.ode.events.EventState eventState14 = new org.apache.commons.math.ode.events.EventState(eventHandler10, (double) (byte) -1, Double.NaN, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = eventState14.getEventHandler();
        double double16 = eventState14.getConvergence();
        boolean boolean17 = eventState14.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        int int24 = eventState23.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler26 = null;
        org.apache.commons.math.ode.events.EventState eventState30 = new org.apache.commons.math.ode.events.EventState(eventHandler26, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = eventState30.getEventHandler();
        double[] doubleArray38 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean39 = eventState30.reset(10.0d, doubleArray38);
        boolean boolean40 = eventState23.reset(0.0d, doubleArray38);
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = null;
        org.apache.commons.math.ode.events.EventState eventState46 = new org.apache.commons.math.ode.events.EventState(eventHandler42, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = eventState46.getEventHandler();
        double[] doubleArray55 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean56 = eventState46.reset(0.0d, doubleArray55);
        boolean boolean57 = eventState23.reset(Double.NaN, doubleArray55);
        boolean boolean58 = eventState14.reset((double) 10, doubleArray55);
        boolean boolean59 = eventState4.reset((double) 1L, doubleArray55);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(eventHandler15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(eventHandler31);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(eventHandler47);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) (byte) 100, 1);
        boolean boolean5 = eventState4.stop();
        double double6 = eventState4.getMaxCheckInterval();
        double double7 = eventState4.getEventTime();
        double double8 = eventState4.getMaxCheckInterval();
        java.lang.Class<?> wildcardClass9 = eventState4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10L, (double) 35, (-1));
        java.lang.Class<?> wildcardClass5 = eventState4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getEventTime();
        int int10 = eventState4.getMaxIterationCount();
        double double11 = eventState4.getMaxCheckInterval();
        boolean boolean12 = eventState4.stop();
        double double13 = eventState4.getConvergence();
        boolean boolean14 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(eventHandler15);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 52.0d, 0.0d, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        boolean boolean6 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        int int8 = eventState4.getMaxIterationCount();
        double double9 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = null;
        org.apache.commons.math.ode.events.EventState eventState15 = new org.apache.commons.math.ode.events.EventState(eventHandler11, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = eventState21.getEventHandler();
        double[] doubleArray29 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean30 = eventState21.reset(10.0d, doubleArray29);
        boolean boolean31 = eventState15.reset((double) 1, doubleArray29);
        boolean boolean32 = eventState4.reset((double) (short) -1, doubleArray29);
        double double33 = eventState4.getEventTime();
        int int34 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = null;
        org.apache.commons.math.ode.events.EventState eventState40 = new org.apache.commons.math.ode.events.EventState(eventHandler36, (double) 100.0f, (double) 10, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = null;
        org.apache.commons.math.ode.events.EventState eventState46 = new org.apache.commons.math.ode.events.EventState(eventHandler42, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = eventState46.getEventHandler();
        int int48 = eventState46.getMaxIterationCount();
        double double49 = eventState46.getMaxCheckInterval();
        double double50 = eventState46.getEventTime();
        double double51 = eventState46.getEventTime();
        boolean boolean52 = eventState46.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler54 = null;
        org.apache.commons.math.ode.events.EventState eventState58 = new org.apache.commons.math.ode.events.EventState(eventHandler54, (double) '#', (double) 100.0f, 1);
        int int59 = eventState58.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler61 = null;
        org.apache.commons.math.ode.events.EventState eventState65 = new org.apache.commons.math.ode.events.EventState(eventHandler61, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler66 = eventState65.getEventHandler();
        double[] doubleArray73 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean74 = eventState65.reset(10.0d, doubleArray73);
        boolean boolean75 = eventState58.reset(0.0d, doubleArray73);
        boolean boolean76 = eventState46.reset((double) (byte) 0, doubleArray73);
        boolean boolean77 = eventState40.reset(0.0d, doubleArray73);
        boolean boolean78 = eventState4.reset(Double.NaN, doubleArray73);
        int int79 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNull(eventHandler22);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(eventHandler47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 35.0d + "'", double49 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNull(eventHandler66);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, Double.NaN, (double) (byte) 100, 10);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '4', (double) 100, 97);
        double double5 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState11.getEventHandler();
        double[] doubleArray20 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean21 = eventState11.reset(0.0d, doubleArray20);
        int int22 = eventState11.getMaxIterationCount();
        double double23 = eventState11.getMaxCheckInterval();
        double double24 = eventState11.getConvergence();
        boolean boolean25 = eventState11.stop();
        double double26 = eventState11.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = null;
        org.apache.commons.math.ode.events.EventState eventState32 = new org.apache.commons.math.ode.events.EventState(eventHandler28, (double) (short) 10, (double) '#', (int) (short) 0);
        int int33 = eventState32.getMaxIterationCount();
        double double34 = eventState32.getEventTime();
        boolean boolean35 = eventState32.stop();
        int int36 = eventState32.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = null;
        org.apache.commons.math.ode.events.EventState eventState42 = new org.apache.commons.math.ode.events.EventState(eventHandler38, (double) (short) 10, (double) '#', (int) (short) 0);
        int int43 = eventState42.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = null;
        org.apache.commons.math.ode.events.EventState eventState49 = new org.apache.commons.math.ode.events.EventState(eventHandler45, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler51 = null;
        org.apache.commons.math.ode.events.EventState eventState55 = new org.apache.commons.math.ode.events.EventState(eventHandler51, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler56 = eventState55.getEventHandler();
        double[] doubleArray63 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean64 = eventState55.reset(10.0d, doubleArray63);
        boolean boolean65 = eventState49.reset((double) 1, doubleArray63);
        boolean boolean66 = eventState42.reset((double) (-1L), doubleArray63);
        boolean boolean67 = eventState32.reset(0.0d, doubleArray63);
        boolean boolean68 = eventState11.reset((double) 1.0f, doubleArray63);
        boolean boolean69 = eventState4.reset(97.0d, doubleArray63);
        java.lang.Class<?> wildcardClass70 = eventState4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(eventHandler12);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(eventHandler56);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 0, (double) 'a', (int) '4');
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) (-1), (double) '#', (int) (byte) 1);
        double double13 = eventState12.getConvergence();
        int int14 = eventState12.getMaxIterationCount();
        double double15 = eventState12.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) 100.0f, (double) 10, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState27.getEventHandler();
        int int29 = eventState27.getMaxIterationCount();
        double double30 = eventState27.getMaxCheckInterval();
        double double31 = eventState27.getEventTime();
        double double32 = eventState27.getEventTime();
        boolean boolean33 = eventState27.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = null;
        org.apache.commons.math.ode.events.EventState eventState39 = new org.apache.commons.math.ode.events.EventState(eventHandler35, (double) '#', (double) 100.0f, 1);
        int int40 = eventState39.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = null;
        org.apache.commons.math.ode.events.EventState eventState46 = new org.apache.commons.math.ode.events.EventState(eventHandler42, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = eventState46.getEventHandler();
        double[] doubleArray54 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean55 = eventState46.reset(10.0d, doubleArray54);
        boolean boolean56 = eventState39.reset(0.0d, doubleArray54);
        boolean boolean57 = eventState27.reset((double) (byte) 0, doubleArray54);
        boolean boolean58 = eventState21.reset(0.0d, doubleArray54);
        boolean boolean59 = eventState12.reset((double) 1, doubleArray54);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin(Double.NaN, doubleArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNull(eventHandler47);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        int int9 = eventState4.getMaxIterationCount();
        double double10 = eventState4.getMaxCheckInterval();
        double double11 = eventState4.getEventTime();
        double double12 = eventState4.getEventTime();
        int int13 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        int int9 = eventState4.getMaxIterationCount();
        int int10 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState4.getEventHandler();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = eventState4.evaluateStep(stepInterpolator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(eventHandler11);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 100, (double) 10.0f, (int) 'a');
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray13 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean14 = eventState4.reset(0.0d, doubleArray13);
        int int15 = eventState4.getMaxIterationCount();
        double double16 = eventState4.getConvergence();
        int int17 = eventState4.getMaxIterationCount();
        double double18 = eventState4.getMaxCheckInterval();
        int int19 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState4.getEventHandler();
        double double21 = eventState4.getConvergence();
        double double22 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = null;
        org.apache.commons.math.ode.events.EventState eventState28 = new org.apache.commons.math.ode.events.EventState(eventHandler24, (double) (-1), (double) '#', (int) (byte) 1);
        double double29 = eventState28.getMaxCheckInterval();
        int int30 = eventState28.getMaxIterationCount();
        double double31 = eventState28.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = eventState28.getEventHandler();
        int int33 = eventState28.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = null;
        org.apache.commons.math.ode.events.EventState eventState39 = new org.apache.commons.math.ode.events.EventState(eventHandler35, (double) (short) 10, (double) '#', (int) (short) 0);
        int int40 = eventState39.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = null;
        org.apache.commons.math.ode.events.EventState eventState46 = new org.apache.commons.math.ode.events.EventState(eventHandler42, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler48 = null;
        org.apache.commons.math.ode.events.EventState eventState52 = new org.apache.commons.math.ode.events.EventState(eventHandler48, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler53 = eventState52.getEventHandler();
        double[] doubleArray60 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean61 = eventState52.reset(10.0d, doubleArray60);
        boolean boolean62 = eventState46.reset((double) 1, doubleArray60);
        boolean boolean63 = eventState39.reset((double) (-1L), doubleArray60);
        boolean boolean64 = eventState28.reset((double) 97, doubleArray60);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) (byte) 10, doubleArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertNull(eventHandler32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(eventHandler53);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 1, (double) 100L, (int) 'a');
        double double5 = eventState4.getConvergence();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 10, (double) '#', (int) (byte) 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray13 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean14 = eventState4.reset(0.0d, doubleArray13);
        int int15 = eventState4.getMaxIterationCount();
        double double16 = eventState4.getConvergence();
        double double17 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) 1, (double) 35, (int) (byte) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = null;
        org.apache.commons.math.ode.events.EventState eventState29 = new org.apache.commons.math.ode.events.EventState(eventHandler25, (double) (short) 10, (double) '#', (int) (short) 0);
        int int30 = eventState29.getMaxIterationCount();
        double double31 = eventState29.getEventTime();
        boolean boolean32 = eventState29.stop();
        double double33 = eventState29.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = null;
        org.apache.commons.math.ode.events.EventState eventState39 = new org.apache.commons.math.ode.events.EventState(eventHandler35, (double) 100.0f, (double) 10, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler41 = null;
        org.apache.commons.math.ode.events.EventState eventState45 = new org.apache.commons.math.ode.events.EventState(eventHandler41, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler46 = eventState45.getEventHandler();
        int int47 = eventState45.getMaxIterationCount();
        double double48 = eventState45.getMaxCheckInterval();
        double double49 = eventState45.getEventTime();
        double double50 = eventState45.getEventTime();
        boolean boolean51 = eventState45.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler53 = null;
        org.apache.commons.math.ode.events.EventState eventState57 = new org.apache.commons.math.ode.events.EventState(eventHandler53, (double) '#', (double) 100.0f, 1);
        int int58 = eventState57.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler60 = null;
        org.apache.commons.math.ode.events.EventState eventState64 = new org.apache.commons.math.ode.events.EventState(eventHandler60, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler65 = eventState64.getEventHandler();
        double[] doubleArray72 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean73 = eventState64.reset(10.0d, doubleArray72);
        boolean boolean74 = eventState57.reset(0.0d, doubleArray72);
        boolean boolean75 = eventState45.reset((double) (byte) 0, doubleArray72);
        boolean boolean76 = eventState39.reset(0.0d, doubleArray72);
        boolean boolean77 = eventState29.reset(100.0d, doubleArray72);
        boolean boolean78 = eventState23.reset((double) 1, doubleArray72);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted(97.0d, doubleArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 35.0d + "'", double33 == 35.0d);
        org.junit.Assert.assertNull(eventHandler46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 35.0d + "'", double48 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNull(eventHandler65);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getEventTime();
        boolean boolean8 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(eventHandler9);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 1.0d, Double.NaN, (int) (byte) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getConvergence();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        int int9 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        int int9 = eventState4.getMaxIterationCount();
        int int10 = eventState4.getMaxIterationCount();
        int int11 = eventState4.getMaxIterationCount();
        double double12 = eventState4.getEventTime();
        int int13 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 0.0d, 0.0d, (int) ' ');
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray13 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean14 = eventState4.reset(0.0d, doubleArray13);
        int int15 = eventState4.getMaxIterationCount();
        double double16 = eventState4.getConvergence();
        int int17 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        int int24 = eventState23.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler26 = null;
        org.apache.commons.math.ode.events.EventState eventState30 = new org.apache.commons.math.ode.events.EventState(eventHandler26, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = eventState30.getEventHandler();
        double[] doubleArray38 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean39 = eventState30.reset(10.0d, doubleArray38);
        boolean boolean40 = eventState23.reset((double) '#', doubleArray38);
        boolean boolean41 = eventState4.reset((double) '#', doubleArray38);
        double double42 = eventState4.getConvergence();
        double double43 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler44 = eventState4.getEventHandler();
        int int45 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(eventHandler31);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertNull(eventHandler44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (-1.0d), (double) (byte) 0, (int) '#');
        double double5 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 97.0d, (-1.0d), (int) (byte) 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getConvergence();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 'a', (double) 10.0f, 10);
        double double5 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        boolean boolean7 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNull(eventHandler6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 0.0d, 10.0d, (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = eventState4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray12 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean13 = eventState4.reset(10.0d, doubleArray12);
        double double14 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = eventState4.getEventHandler();
        int int17 = eventState4.getMaxIterationCount();
        double double18 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(eventHandler15);
        org.junit.Assert.assertNull(eventHandler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) -1, Double.NaN, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getConvergence();
        double double7 = eventState4.getConvergence();
        int int8 = eventState4.getMaxIterationCount();
        double double9 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState4.getEventHandler();
        boolean boolean12 = eventState4.stop();
        double double13 = eventState4.getEventTime();
        double double14 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(eventHandler10);
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) (byte) 0, 97);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = eventState12.getEventHandler();
        double double14 = eventState12.getMaxCheckInterval();
        double double15 = eventState12.getConvergence();
        int int16 = eventState12.getMaxIterationCount();
        double double17 = eventState12.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        int int25 = eventState23.getMaxIterationCount();
        double double26 = eventState23.getMaxCheckInterval();
        double double27 = eventState23.getEventTime();
        double double28 = eventState23.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = eventState34.getEventHandler();
        double[] doubleArray43 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean44 = eventState34.reset(0.0d, doubleArray43);
        int int45 = eventState34.getMaxIterationCount();
        double double46 = eventState34.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = eventState34.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler49 = null;
        org.apache.commons.math.ode.events.EventState eventState53 = new org.apache.commons.math.ode.events.EventState(eventHandler49, (double) '#', (double) 100.0f, 1);
        int int54 = eventState53.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler56 = null;
        org.apache.commons.math.ode.events.EventState eventState60 = new org.apache.commons.math.ode.events.EventState(eventHandler56, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler61 = eventState60.getEventHandler();
        double[] doubleArray68 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean69 = eventState60.reset(10.0d, doubleArray68);
        boolean boolean70 = eventState53.reset(0.0d, doubleArray68);
        org.apache.commons.math.ode.events.EventHandler eventHandler72 = null;
        org.apache.commons.math.ode.events.EventState eventState76 = new org.apache.commons.math.ode.events.EventState(eventHandler72, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler77 = eventState76.getEventHandler();
        double[] doubleArray85 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean86 = eventState76.reset(0.0d, doubleArray85);
        boolean boolean87 = eventState53.reset(Double.NaN, doubleArray85);
        boolean boolean88 = eventState34.reset((double) (-1), doubleArray85);
        boolean boolean89 = eventState23.reset(35.0d, doubleArray85);
        boolean boolean90 = eventState12.reset((double) 35, doubleArray85);
        boolean boolean91 = eventState4.reset((double) 1, doubleArray85);
        boolean boolean92 = eventState4.stop();
        int int93 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNull(eventHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 35.0d + "'", double26 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNull(eventHandler35);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertNull(eventHandler47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(eventHandler61);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(eventHandler77);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 97 + "'", int93 == 97);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        int int5 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState11.getEventHandler();
        double[] doubleArray19 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean20 = eventState11.reset(10.0d, doubleArray19);
        boolean boolean21 = eventState4.reset(0.0d, doubleArray19);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState27.getEventHandler();
        double[] doubleArray36 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean37 = eventState27.reset(0.0d, doubleArray36);
        boolean boolean38 = eventState4.reset(Double.NaN, doubleArray36);
        boolean boolean39 = eventState4.stop();
        double double40 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = null;
        org.apache.commons.math.ode.events.EventState eventState46 = new org.apache.commons.math.ode.events.EventState(eventHandler42, (double) (short) 10, (double) '#', (int) (short) 0);
        int int47 = eventState46.getMaxIterationCount();
        double double48 = eventState46.getEventTime();
        boolean boolean49 = eventState46.stop();
        double double50 = eventState46.getEventTime();
        boolean boolean51 = eventState46.stop();
        double double52 = eventState46.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler53 = eventState46.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler55 = null;
        org.apache.commons.math.ode.events.EventState eventState59 = new org.apache.commons.math.ode.events.EventState(eventHandler55, (double) (-1), (double) '#', (int) (byte) 1);
        boolean boolean60 = eventState59.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler62 = null;
        org.apache.commons.math.ode.events.EventState eventState66 = new org.apache.commons.math.ode.events.EventState(eventHandler62, (double) (short) 10, (double) '#', (int) (short) 0);
        int int67 = eventState66.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler69 = null;
        org.apache.commons.math.ode.events.EventState eventState73 = new org.apache.commons.math.ode.events.EventState(eventHandler69, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler75 = null;
        org.apache.commons.math.ode.events.EventState eventState79 = new org.apache.commons.math.ode.events.EventState(eventHandler75, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler80 = eventState79.getEventHandler();
        double[] doubleArray87 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean88 = eventState79.reset(10.0d, doubleArray87);
        boolean boolean89 = eventState73.reset((double) 1, doubleArray87);
        boolean boolean90 = eventState66.reset((double) (-1L), doubleArray87);
        boolean boolean91 = eventState59.reset((double) (byte) 10, doubleArray87);
        boolean boolean92 = eventState46.reset(1.0d, doubleArray87);
        boolean boolean93 = eventState4.reset((double) (short) 10, doubleArray87);
        double double94 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(eventHandler12);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNull(eventHandler53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(eventHandler80);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 100.0d + "'", double94 == 100.0d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) -1, Double.NaN, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(eventHandler9);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) 0.0f, 100);
        int int5 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        double double7 = eventState4.getEventTime();
        double double8 = eventState4.getEventTime();
        int int9 = eventState4.getMaxIterationCount();
        double double10 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(eventHandler6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray13 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean14 = eventState4.reset(0.0d, doubleArray13);
        int int15 = eventState4.getMaxIterationCount();
        double double16 = eventState4.getConvergence();
        int int17 = eventState4.getMaxIterationCount();
        double double18 = eventState4.getMaxCheckInterval();
        int int19 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState4.getEventHandler();
        double double21 = eventState4.getConvergence();
        int int22 = eventState4.getMaxIterationCount();
        int int23 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        int int9 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        double double11 = eventState4.getEventTime();
        boolean boolean12 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(eventHandler10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(eventHandler13);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray13 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean14 = eventState4.reset(0.0d, doubleArray13);
        double double15 = eventState4.getEventTime();
        double double16 = eventState4.getEventTime();
        boolean boolean17 = eventState4.stop();
        int int18 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = eventState4.getEventHandler();
        int int20 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(eventHandler19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(eventHandler21);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getMaxCheckInterval();
        double double10 = eventState4.getEventTime();
        int int11 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(eventHandler6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getEventTime();
        boolean boolean9 = eventState4.stop();
        double double10 = eventState4.getConvergence();
        double double11 = eventState4.getEventTime();
        boolean boolean12 = eventState4.stop();
        double double13 = eventState4.getEventTime();
        double double14 = eventState4.getConvergence();
        double double15 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) (short) -1, 1.0d, (int) (byte) 1);
        double double22 = eventState21.getMaxCheckInterval();
        int int23 = eventState21.getMaxIterationCount();
        int int24 = eventState21.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler26 = null;
        org.apache.commons.math.ode.events.EventState eventState30 = new org.apache.commons.math.ode.events.EventState(eventHandler26, 35.0d, 0.0d, 10);
        double double31 = eventState30.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = null;
        org.apache.commons.math.ode.events.EventState eventState37 = new org.apache.commons.math.ode.events.EventState(eventHandler33, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = eventState37.getEventHandler();
        double double39 = eventState37.getMaxCheckInterval();
        double double40 = eventState37.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = null;
        org.apache.commons.math.ode.events.EventState eventState46 = new org.apache.commons.math.ode.events.EventState(eventHandler42, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = eventState46.getEventHandler();
        double[] doubleArray54 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean55 = eventState46.reset(10.0d, doubleArray54);
        org.apache.commons.math.ode.events.EventHandler eventHandler57 = null;
        org.apache.commons.math.ode.events.EventState eventState61 = new org.apache.commons.math.ode.events.EventState(eventHandler57, (double) (short) 10, (double) '#', (int) (short) 0);
        int int62 = eventState61.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler64 = null;
        org.apache.commons.math.ode.events.EventState eventState68 = new org.apache.commons.math.ode.events.EventState(eventHandler64, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler70 = null;
        org.apache.commons.math.ode.events.EventState eventState74 = new org.apache.commons.math.ode.events.EventState(eventHandler70, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler75 = eventState74.getEventHandler();
        double[] doubleArray82 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean83 = eventState74.reset(10.0d, doubleArray82);
        boolean boolean84 = eventState68.reset((double) 1, doubleArray82);
        boolean boolean85 = eventState61.reset((double) (-1L), doubleArray82);
        boolean boolean86 = eventState46.reset((-1.0d), doubleArray82);
        boolean boolean87 = eventState37.reset((double) (byte) 100, doubleArray82);
        boolean boolean88 = eventState30.reset((double) 0, doubleArray82);
        boolean boolean89 = eventState21.reset((double) 10L, doubleArray82);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) 0, doubleArray82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertNull(eventHandler38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 35.0d + "'", double39 == 35.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertNull(eventHandler47);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(eventHandler75);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getEventTime();
        boolean boolean9 = eventState4.stop();
        double double10 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) (-1), (double) '#', (int) (byte) 1);
        double double17 = eventState16.getMaxCheckInterval();
        double double18 = eventState16.getMaxCheckInterval();
        int int19 = eventState16.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = null;
        org.apache.commons.math.ode.events.EventState eventState25 = new org.apache.commons.math.ode.events.EventState(eventHandler21, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler26 = eventState25.getEventHandler();
        double[] doubleArray34 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean35 = eventState25.reset(0.0d, doubleArray34);
        boolean boolean36 = eventState16.reset((double) (byte) 1, doubleArray34);
        boolean boolean37 = eventState4.reset(1.0d, doubleArray34);
        int int38 = eventState4.getMaxIterationCount();
        int int39 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler41 = null;
        org.apache.commons.math.ode.events.EventState eventState45 = new org.apache.commons.math.ode.events.EventState(eventHandler41, (double) (-1), (double) '#', (int) (byte) 1);
        boolean boolean46 = eventState45.stop();
        double double47 = eventState45.getMaxCheckInterval();
        boolean boolean48 = eventState45.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler50 = null;
        org.apache.commons.math.ode.events.EventState eventState54 = new org.apache.commons.math.ode.events.EventState(eventHandler50, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler56 = null;
        org.apache.commons.math.ode.events.EventState eventState60 = new org.apache.commons.math.ode.events.EventState(eventHandler56, (double) (short) 10, (double) '#', (int) (short) 0);
        int int61 = eventState60.getMaxIterationCount();
        double double62 = eventState60.getEventTime();
        boolean boolean63 = eventState60.stop();
        int int64 = eventState60.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler66 = null;
        org.apache.commons.math.ode.events.EventState eventState70 = new org.apache.commons.math.ode.events.EventState(eventHandler66, (double) (short) 10, (double) '#', (int) (short) 0);
        int int71 = eventState70.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler73 = null;
        org.apache.commons.math.ode.events.EventState eventState77 = new org.apache.commons.math.ode.events.EventState(eventHandler73, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler79 = null;
        org.apache.commons.math.ode.events.EventState eventState83 = new org.apache.commons.math.ode.events.EventState(eventHandler79, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler84 = eventState83.getEventHandler();
        double[] doubleArray91 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean92 = eventState83.reset(10.0d, doubleArray91);
        boolean boolean93 = eventState77.reset((double) 1, doubleArray91);
        boolean boolean94 = eventState70.reset((double) (-1L), doubleArray91);
        boolean boolean95 = eventState60.reset(0.0d, doubleArray91);
        boolean boolean96 = eventState54.reset((double) (byte) 1, doubleArray91);
        boolean boolean97 = eventState45.reset((double) (byte) 1, doubleArray91);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) (byte) 100, doubleArray91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(eventHandler26);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(eventHandler84);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 1.0d, (double) 1.0f, (int) '#');
        double double5 = eventState4.getEventTime();
        double double6 = eventState4.getEventTime();
        int int7 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        double[] doubleArray18 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean19 = eventState10.reset(10.0d, doubleArray18);
        boolean boolean20 = eventState4.reset((double) 1, doubleArray18);
        double double21 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler29 = null;
        org.apache.commons.math.ode.events.EventState eventState33 = new org.apache.commons.math.ode.events.EventState(eventHandler29, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = eventState33.getEventHandler();
        double[] doubleArray41 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean42 = eventState33.reset(10.0d, doubleArray41);
        boolean boolean43 = eventState27.reset((double) 1, doubleArray41);
        double double44 = eventState27.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler46 = null;
        org.apache.commons.math.ode.events.EventState eventState50 = new org.apache.commons.math.ode.events.EventState(eventHandler46, (double) (-1), (double) '#', (int) (byte) 1);
        boolean boolean51 = eventState50.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler53 = null;
        org.apache.commons.math.ode.events.EventState eventState57 = new org.apache.commons.math.ode.events.EventState(eventHandler53, (double) (short) 10, (double) '#', (int) (short) 0);
        int int58 = eventState57.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler60 = null;
        org.apache.commons.math.ode.events.EventState eventState64 = new org.apache.commons.math.ode.events.EventState(eventHandler60, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler66 = null;
        org.apache.commons.math.ode.events.EventState eventState70 = new org.apache.commons.math.ode.events.EventState(eventHandler66, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler71 = eventState70.getEventHandler();
        double[] doubleArray78 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean79 = eventState70.reset(10.0d, doubleArray78);
        boolean boolean80 = eventState64.reset((double) 1, doubleArray78);
        boolean boolean81 = eventState57.reset((double) (-1L), doubleArray78);
        boolean boolean82 = eventState50.reset((double) (byte) 10, doubleArray78);
        boolean boolean83 = eventState27.reset(1.0d, doubleArray78);
        boolean boolean84 = eventState4.reset((double) ' ', doubleArray78);
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator85 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean86 = eventState4.evaluateStep(stepInterpolator85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNull(eventHandler34);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(eventHandler71);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10.0f, (double) (byte) 0, (int) (short) -1);
        double double5 = eventState4.getMaxCheckInterval();
        int int6 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        int int8 = eventState4.getMaxIterationCount();
        double double9 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = null;
        org.apache.commons.math.ode.events.EventState eventState15 = new org.apache.commons.math.ode.events.EventState(eventHandler11, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = eventState21.getEventHandler();
        double[] doubleArray29 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean30 = eventState21.reset(10.0d, doubleArray29);
        boolean boolean31 = eventState15.reset((double) 1, doubleArray29);
        boolean boolean32 = eventState4.reset((double) (short) -1, doubleArray29);
        double double33 = eventState4.getConvergence();
        double double34 = eventState4.getMaxCheckInterval();
        double double35 = eventState4.getMaxCheckInterval();
        double double36 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = null;
        org.apache.commons.math.ode.events.EventState eventState42 = new org.apache.commons.math.ode.events.EventState(eventHandler38, (double) (-1), (double) '#', (int) (byte) 1);
        boolean boolean43 = eventState42.stop();
        double double44 = eventState42.getMaxCheckInterval();
        boolean boolean45 = eventState42.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = null;
        org.apache.commons.math.ode.events.EventState eventState51 = new org.apache.commons.math.ode.events.EventState(eventHandler47, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler53 = null;
        org.apache.commons.math.ode.events.EventState eventState57 = new org.apache.commons.math.ode.events.EventState(eventHandler53, (double) (short) 10, (double) '#', (int) (short) 0);
        int int58 = eventState57.getMaxIterationCount();
        double double59 = eventState57.getEventTime();
        boolean boolean60 = eventState57.stop();
        int int61 = eventState57.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler63 = null;
        org.apache.commons.math.ode.events.EventState eventState67 = new org.apache.commons.math.ode.events.EventState(eventHandler63, (double) (short) 10, (double) '#', (int) (short) 0);
        int int68 = eventState67.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler70 = null;
        org.apache.commons.math.ode.events.EventState eventState74 = new org.apache.commons.math.ode.events.EventState(eventHandler70, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler76 = null;
        org.apache.commons.math.ode.events.EventState eventState80 = new org.apache.commons.math.ode.events.EventState(eventHandler76, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler81 = eventState80.getEventHandler();
        double[] doubleArray88 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean89 = eventState80.reset(10.0d, doubleArray88);
        boolean boolean90 = eventState74.reset((double) 1, doubleArray88);
        boolean boolean91 = eventState67.reset((double) (-1L), doubleArray88);
        boolean boolean92 = eventState57.reset(0.0d, doubleArray88);
        boolean boolean93 = eventState51.reset((double) (byte) 1, doubleArray88);
        boolean boolean94 = eventState42.reset((double) (byte) 1, doubleArray88);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) 1L, doubleArray88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNull(eventHandler22);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 35.0d + "'", double33 == 35.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 35.0d + "'", double36 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(eventHandler81);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double double5 = eventState4.getMaxCheckInterval();
        double double6 = eventState4.getMaxCheckInterval();
        int int7 = eventState4.getMaxIterationCount();
        boolean boolean8 = eventState4.stop();
        double double9 = eventState4.getEventTime();
        double double10 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = eventState16.getEventHandler();
        int int18 = eventState16.getMaxIterationCount();
        double double19 = eventState16.getMaxCheckInterval();
        double double20 = eventState16.getEventTime();
        int int21 = eventState16.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState27.getEventHandler();
        int int29 = eventState27.getMaxIterationCount();
        double double30 = eventState27.getMaxCheckInterval();
        double double31 = eventState27.getEventTime();
        double double32 = eventState27.getEventTime();
        boolean boolean33 = eventState27.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = eventState27.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = null;
        org.apache.commons.math.ode.events.EventState eventState40 = new org.apache.commons.math.ode.events.EventState(eventHandler36, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = null;
        org.apache.commons.math.ode.events.EventState eventState46 = new org.apache.commons.math.ode.events.EventState(eventHandler42, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = eventState46.getEventHandler();
        double[] doubleArray54 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean55 = eventState46.reset(10.0d, doubleArray54);
        boolean boolean56 = eventState40.reset((double) 1, doubleArray54);
        boolean boolean57 = eventState27.reset((double) 35, doubleArray54);
        org.apache.commons.math.ode.events.EventHandler eventHandler58 = eventState27.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler60 = null;
        org.apache.commons.math.ode.events.EventState eventState64 = new org.apache.commons.math.ode.events.EventState(eventHandler60, (double) '#', (double) 100.0f, 1);
        int int65 = eventState64.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler67 = null;
        org.apache.commons.math.ode.events.EventState eventState71 = new org.apache.commons.math.ode.events.EventState(eventHandler67, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler72 = eventState71.getEventHandler();
        double[] doubleArray79 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean80 = eventState71.reset(10.0d, doubleArray79);
        boolean boolean81 = eventState64.reset(0.0d, doubleArray79);
        boolean boolean82 = eventState27.reset((double) '4', doubleArray79);
        boolean boolean83 = eventState16.reset(0.0d, doubleArray79);
        boolean boolean84 = eventState4.reset((double) (-1.0f), doubleArray79);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNull(eventHandler17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(eventHandler34);
        org.junit.Assert.assertNull(eventHandler47);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(eventHandler58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNull(eventHandler72);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        int int12 = eventState10.getMaxIterationCount();
        double double13 = eventState10.getMaxCheckInterval();
        double double14 = eventState10.getEventTime();
        double double15 = eventState10.getEventTime();
        boolean boolean16 = eventState10.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = null;
        org.apache.commons.math.ode.events.EventState eventState22 = new org.apache.commons.math.ode.events.EventState(eventHandler18, (double) '#', (double) 100.0f, 1);
        int int23 = eventState22.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = null;
        org.apache.commons.math.ode.events.EventState eventState29 = new org.apache.commons.math.ode.events.EventState(eventHandler25, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = eventState29.getEventHandler();
        double[] doubleArray37 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean38 = eventState29.reset(10.0d, doubleArray37);
        boolean boolean39 = eventState22.reset(0.0d, doubleArray37);
        boolean boolean40 = eventState10.reset((double) (byte) 0, doubleArray37);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) (short) -1, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(eventHandler30);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 35, 0.0d, 35);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 100.0f, (double) 10, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        int int12 = eventState10.getMaxIterationCount();
        double double13 = eventState10.getMaxCheckInterval();
        double double14 = eventState10.getEventTime();
        double double15 = eventState10.getEventTime();
        boolean boolean16 = eventState10.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = null;
        org.apache.commons.math.ode.events.EventState eventState22 = new org.apache.commons.math.ode.events.EventState(eventHandler18, (double) '#', (double) 100.0f, 1);
        int int23 = eventState22.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = null;
        org.apache.commons.math.ode.events.EventState eventState29 = new org.apache.commons.math.ode.events.EventState(eventHandler25, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = eventState29.getEventHandler();
        double[] doubleArray37 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean38 = eventState29.reset(10.0d, doubleArray37);
        boolean boolean39 = eventState22.reset(0.0d, doubleArray37);
        boolean boolean40 = eventState10.reset((double) (byte) 0, doubleArray37);
        boolean boolean41 = eventState4.reset(0.0d, doubleArray37);
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = eventState4.getEventHandler();
        double double43 = eventState4.getEventTime();
        boolean boolean44 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(eventHandler30);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(eventHandler42);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) -1, Double.NaN, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getConvergence();
        double double7 = eventState4.getConvergence();
        int int8 = eventState4.getMaxIterationCount();
        double double9 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState4.getEventHandler();
        boolean boolean13 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(eventHandler10);
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertNull(eventHandler12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(eventHandler14);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        double double7 = eventState4.getEventTime();
        boolean boolean8 = eventState4.stop();
        double double9 = eventState4.getEventTime();
        int int10 = eventState4.getMaxIterationCount();
        boolean boolean11 = eventState4.stop();
        boolean boolean12 = eventState4.stop();
        double double13 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 1.0f, (double) 0L, (int) (short) 10);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 100, (double) (-1), (int) (byte) 10);
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = eventState4.evaluateStep(stepInterpolator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 100, (double) (short) 1, (int) '#');
        boolean boolean5 = eventState4.stop();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 10.0d, (double) 1.0f, (int) (short) 100);
        double double5 = eventState4.getEventTime();
        double double6 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) 10, (double) (byte) 10, (int) (byte) 1);
        double double13 = eventState12.getEventTime();
        int int14 = eventState12.getMaxIterationCount();
        double double15 = eventState12.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) 97, 0.0d, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState27.getEventHandler();
        double[] doubleArray36 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean37 = eventState27.reset(0.0d, doubleArray36);
        int int38 = eventState27.getMaxIterationCount();
        double double39 = eventState27.getMaxCheckInterval();
        double double40 = eventState27.getConvergence();
        boolean boolean41 = eventState27.stop();
        double double42 = eventState27.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler44 = null;
        org.apache.commons.math.ode.events.EventState eventState48 = new org.apache.commons.math.ode.events.EventState(eventHandler44, (double) (short) 10, (double) '#', (int) (short) 0);
        int int49 = eventState48.getMaxIterationCount();
        double double50 = eventState48.getEventTime();
        boolean boolean51 = eventState48.stop();
        int int52 = eventState48.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler54 = null;
        org.apache.commons.math.ode.events.EventState eventState58 = new org.apache.commons.math.ode.events.EventState(eventHandler54, (double) (short) 10, (double) '#', (int) (short) 0);
        int int59 = eventState58.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler61 = null;
        org.apache.commons.math.ode.events.EventState eventState65 = new org.apache.commons.math.ode.events.EventState(eventHandler61, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler67 = null;
        org.apache.commons.math.ode.events.EventState eventState71 = new org.apache.commons.math.ode.events.EventState(eventHandler67, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler72 = eventState71.getEventHandler();
        double[] doubleArray79 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean80 = eventState71.reset(10.0d, doubleArray79);
        boolean boolean81 = eventState65.reset((double) 1, doubleArray79);
        boolean boolean82 = eventState58.reset((double) (-1L), doubleArray79);
        boolean boolean83 = eventState48.reset(0.0d, doubleArray79);
        boolean boolean84 = eventState27.reset((double) 1.0f, doubleArray79);
        boolean boolean85 = eventState21.reset((double) '4', doubleArray79);
        boolean boolean86 = eventState12.reset(97.0d, doubleArray79);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) (byte) -1, doubleArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 35.0d + "'", double39 == 35.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(eventHandler72);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) -1, (double) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double double5 = eventState4.getMaxCheckInterval();
        double double6 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        int int9 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1.0f), 1.0d, (int) (short) 0);
        boolean boolean5 = eventState4.stop();
        double double6 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) ' ', (double) 0.0f, 97);
        int int5 = eventState4.getMaxIterationCount();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = null;
        org.apache.commons.math.ode.events.EventState eventState18 = new org.apache.commons.math.ode.events.EventState(eventHandler14, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = null;
        org.apache.commons.math.ode.events.EventState eventState24 = new org.apache.commons.math.ode.events.EventState(eventHandler20, (double) '#', (double) 100.0f, 1);
        int int25 = eventState24.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = null;
        org.apache.commons.math.ode.events.EventState eventState31 = new org.apache.commons.math.ode.events.EventState(eventHandler27, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = eventState31.getEventHandler();
        double[] doubleArray39 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean40 = eventState31.reset(10.0d, doubleArray39);
        boolean boolean41 = eventState24.reset(0.0d, doubleArray39);
        boolean boolean42 = eventState18.reset((double) (byte) 0, doubleArray39);
        boolean boolean43 = eventState12.reset(Double.NaN, doubleArray39);
        org.apache.commons.math.ode.events.EventHandler eventHandler44 = eventState12.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler46 = null;
        org.apache.commons.math.ode.events.EventState eventState50 = new org.apache.commons.math.ode.events.EventState(eventHandler46, (double) 10, (double) 1L, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler52 = null;
        org.apache.commons.math.ode.events.EventState eventState56 = new org.apache.commons.math.ode.events.EventState(eventHandler52, (double) (short) 10, (double) '#', (int) (short) 0);
        int int57 = eventState56.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler59 = null;
        org.apache.commons.math.ode.events.EventState eventState63 = new org.apache.commons.math.ode.events.EventState(eventHandler59, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler65 = null;
        org.apache.commons.math.ode.events.EventState eventState69 = new org.apache.commons.math.ode.events.EventState(eventHandler65, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler70 = eventState69.getEventHandler();
        double[] doubleArray77 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean78 = eventState69.reset(10.0d, doubleArray77);
        boolean boolean79 = eventState63.reset((double) 1, doubleArray77);
        boolean boolean80 = eventState56.reset((double) (-1L), doubleArray77);
        boolean boolean81 = eventState50.reset((double) ' ', doubleArray77);
        boolean boolean82 = eventState12.reset((double) 32, doubleArray77);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) (short) 1, doubleArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(eventHandler32);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(eventHandler44);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(eventHandler70);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 1.0d, (double) (short) 0, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        double double8 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), 0.0d, (int) (byte) -1);
        double double5 = eventState4.getMaxCheckInterval();
        double double6 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) 10.0f, (double) (byte) -1, (int) ' ');
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = null;
        org.apache.commons.math.ode.events.EventState eventState18 = new org.apache.commons.math.ode.events.EventState(eventHandler14, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = eventState18.getEventHandler();
        int int20 = eventState18.getMaxIterationCount();
        double double21 = eventState18.getMaxCheckInterval();
        double double22 = eventState18.getEventTime();
        double double23 = eventState18.getEventTime();
        boolean boolean24 = eventState18.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = eventState18.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = null;
        org.apache.commons.math.ode.events.EventState eventState31 = new org.apache.commons.math.ode.events.EventState(eventHandler27, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = null;
        org.apache.commons.math.ode.events.EventState eventState37 = new org.apache.commons.math.ode.events.EventState(eventHandler33, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = eventState37.getEventHandler();
        double[] doubleArray45 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean46 = eventState37.reset(10.0d, doubleArray45);
        boolean boolean47 = eventState31.reset((double) 1, doubleArray45);
        boolean boolean48 = eventState18.reset((double) 35, doubleArray45);
        org.apache.commons.math.ode.events.EventHandler eventHandler50 = null;
        org.apache.commons.math.ode.events.EventState eventState54 = new org.apache.commons.math.ode.events.EventState(eventHandler50, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler56 = null;
        org.apache.commons.math.ode.events.EventState eventState60 = new org.apache.commons.math.ode.events.EventState(eventHandler56, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler62 = null;
        org.apache.commons.math.ode.events.EventState eventState66 = new org.apache.commons.math.ode.events.EventState(eventHandler62, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler67 = eventState66.getEventHandler();
        double[] doubleArray74 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean75 = eventState66.reset(10.0d, doubleArray74);
        boolean boolean76 = eventState60.reset((double) 1, doubleArray74);
        boolean boolean77 = eventState54.reset((double) (byte) -1, doubleArray74);
        boolean boolean78 = eventState18.reset((double) (-1.0f), doubleArray74);
        boolean boolean79 = eventState12.reset((double) 10, doubleArray74);
        boolean boolean80 = eventState4.reset((double) 10.0f, doubleArray74);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNull(eventHandler19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(eventHandler25);
        org.junit.Assert.assertNull(eventHandler38);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(eventHandler67);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 0, (double) 0.0f, (int) (byte) 1);
        int int5 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = eventState4.evaluateStep(stepInterpolator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 0.0d, (double) (byte) -1, 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        double double7 = eventState4.getMaxCheckInterval();
        int int8 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        double double9 = eventState4.getEventTime();
        double double10 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = eventState16.getEventHandler();
        int int18 = eventState16.getMaxIterationCount();
        double double19 = eventState16.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = null;
        org.apache.commons.math.ode.events.EventState eventState25 = new org.apache.commons.math.ode.events.EventState(eventHandler21, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = null;
        org.apache.commons.math.ode.events.EventState eventState31 = new org.apache.commons.math.ode.events.EventState(eventHandler27, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = eventState31.getEventHandler();
        double[] doubleArray39 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean40 = eventState31.reset(10.0d, doubleArray39);
        boolean boolean41 = eventState25.reset((double) 1, doubleArray39);
        boolean boolean42 = eventState16.reset((double) (short) 0, doubleArray39);
        org.apache.commons.math.ode.events.EventHandler eventHandler43 = eventState16.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = null;
        org.apache.commons.math.ode.events.EventState eventState49 = new org.apache.commons.math.ode.events.EventState(eventHandler45, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler50 = eventState49.getEventHandler();
        double[] doubleArray57 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean58 = eventState49.reset(10.0d, doubleArray57);
        org.apache.commons.math.ode.events.EventHandler eventHandler60 = null;
        org.apache.commons.math.ode.events.EventState eventState64 = new org.apache.commons.math.ode.events.EventState(eventHandler60, (double) (short) 10, (double) '#', (int) (short) 0);
        int int65 = eventState64.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler67 = null;
        org.apache.commons.math.ode.events.EventState eventState71 = new org.apache.commons.math.ode.events.EventState(eventHandler67, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler73 = null;
        org.apache.commons.math.ode.events.EventState eventState77 = new org.apache.commons.math.ode.events.EventState(eventHandler73, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler78 = eventState77.getEventHandler();
        double[] doubleArray85 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean86 = eventState77.reset(10.0d, doubleArray85);
        boolean boolean87 = eventState71.reset((double) 1, doubleArray85);
        boolean boolean88 = eventState64.reset((double) (-1L), doubleArray85);
        boolean boolean89 = eventState49.reset((-1.0d), doubleArray85);
        boolean boolean90 = eventState16.reset((-1.0d), doubleArray85);
        boolean boolean91 = eventState4.reset(52.0d, doubleArray85);
        double double92 = eventState4.getEventTime();
        double double93 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertNull(eventHandler17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertNull(eventHandler32);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(eventHandler43);
        org.junit.Assert.assertNull(eventHandler50);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(eventHandler78);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double92));
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 35.0d + "'", double93 == 35.0d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 0, 0.0d, (int) (byte) 100);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10.0f, (double) 35, 0);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 97.0d, (-1.0d), (int) (byte) 100);
        int int5 = eventState4.getMaxIterationCount();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(eventHandler7);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) (byte) 10, (int) ' ');
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        int int8 = eventState4.getMaxIterationCount();
        int int9 = eventState4.getMaxIterationCount();
        double[] doubleArray16 = new double[] { (-1), (-1L), 100.0d, 0, 10.0d };
        boolean boolean17 = eventState4.reset(1.0d, doubleArray16);
        int int18 = eventState4.getMaxIterationCount();
        boolean boolean19 = eventState4.stop();
        double double20 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = null;
        org.apache.commons.math.ode.events.EventState eventState26 = new org.apache.commons.math.ode.events.EventState(eventHandler22, (double) (short) 10, (double) '#', (int) (short) 0);
        int int27 = eventState26.getMaxIterationCount();
        double double28 = eventState26.getEventTime();
        boolean boolean29 = eventState26.stop();
        boolean boolean30 = eventState26.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = null;
        org.apache.commons.math.ode.events.EventState eventState36 = new org.apache.commons.math.ode.events.EventState(eventHandler32, (double) '#', (double) 100.0f, 1);
        int int37 = eventState36.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler39 = null;
        org.apache.commons.math.ode.events.EventState eventState43 = new org.apache.commons.math.ode.events.EventState(eventHandler39, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler44 = eventState43.getEventHandler();
        double[] doubleArray51 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean52 = eventState43.reset(10.0d, doubleArray51);
        boolean boolean53 = eventState36.reset(0.0d, doubleArray51);
        org.apache.commons.math.ode.events.EventHandler eventHandler55 = null;
        org.apache.commons.math.ode.events.EventState eventState59 = new org.apache.commons.math.ode.events.EventState(eventHandler55, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler60 = eventState59.getEventHandler();
        double[] doubleArray68 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean69 = eventState59.reset(0.0d, doubleArray68);
        boolean boolean70 = eventState36.reset(Double.NaN, doubleArray68);
        boolean boolean71 = eventState26.reset((double) 10L, doubleArray68);
        boolean boolean72 = eventState4.reset((double) 1, doubleArray68);
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), (-1.0d), 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNull(eventHandler44);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(eventHandler60);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) (byte) 100, 1);
        double double5 = eventState4.getMaxCheckInterval();
        double double6 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = eventState4.evaluateStep(stepInterpolator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 0.0d, (double) 100L, (int) ' ');
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray16 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean17 = eventState10.reset((double) (byte) 100, doubleArray16);
        boolean boolean18 = eventState4.reset((double) 0.0f, doubleArray16);
        double double19 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState4.getEventHandler();
        java.lang.Class<?> wildcardClass21 = eventState4.getClass();
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10, (double) (byte) 10, (int) (byte) 1);
        double double5 = eventState4.getEventTime();
        boolean boolean6 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = eventState12.getEventHandler();
        double double14 = eventState12.getMaxCheckInterval();
        double double15 = eventState12.getConvergence();
        int int16 = eventState12.getMaxIterationCount();
        double double17 = eventState12.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        int int25 = eventState23.getMaxIterationCount();
        double double26 = eventState23.getMaxCheckInterval();
        double double27 = eventState23.getEventTime();
        double double28 = eventState23.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = eventState34.getEventHandler();
        double[] doubleArray43 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean44 = eventState34.reset(0.0d, doubleArray43);
        int int45 = eventState34.getMaxIterationCount();
        double double46 = eventState34.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = eventState34.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler49 = null;
        org.apache.commons.math.ode.events.EventState eventState53 = new org.apache.commons.math.ode.events.EventState(eventHandler49, (double) '#', (double) 100.0f, 1);
        int int54 = eventState53.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler56 = null;
        org.apache.commons.math.ode.events.EventState eventState60 = new org.apache.commons.math.ode.events.EventState(eventHandler56, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler61 = eventState60.getEventHandler();
        double[] doubleArray68 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean69 = eventState60.reset(10.0d, doubleArray68);
        boolean boolean70 = eventState53.reset(0.0d, doubleArray68);
        org.apache.commons.math.ode.events.EventHandler eventHandler72 = null;
        org.apache.commons.math.ode.events.EventState eventState76 = new org.apache.commons.math.ode.events.EventState(eventHandler72, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler77 = eventState76.getEventHandler();
        double[] doubleArray85 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean86 = eventState76.reset(0.0d, doubleArray85);
        boolean boolean87 = eventState53.reset(Double.NaN, doubleArray85);
        boolean boolean88 = eventState34.reset((double) (-1), doubleArray85);
        boolean boolean89 = eventState23.reset(35.0d, doubleArray85);
        boolean boolean90 = eventState12.reset((double) 35, doubleArray85);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted(10.0d, doubleArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(eventHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 35.0d + "'", double26 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNull(eventHandler35);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertNull(eventHandler47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(eventHandler61);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(eventHandler77);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        int int8 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = null;
        org.apache.commons.math.ode.events.EventState eventState14 = new org.apache.commons.math.ode.events.EventState(eventHandler10, (double) (byte) -1, Double.NaN, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = eventState14.getEventHandler();
        double double16 = eventState14.getConvergence();
        double double17 = eventState14.getConvergence();
        int int18 = eventState14.getMaxIterationCount();
        double double19 = eventState14.getEventTime();
        boolean boolean20 = eventState14.stop();
        int int21 = eventState14.getMaxIterationCount();
        double double22 = eventState14.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = null;
        org.apache.commons.math.ode.events.EventState eventState28 = new org.apache.commons.math.ode.events.EventState(eventHandler24, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler29 = eventState28.getEventHandler();
        double double30 = eventState28.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = eventState28.getEventHandler();
        double double32 = eventState28.getMaxCheckInterval();
        int int33 = eventState28.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = null;
        org.apache.commons.math.ode.events.EventState eventState39 = new org.apache.commons.math.ode.events.EventState(eventHandler35, (double) (short) 10, (double) '#', (int) (short) 0);
        int int40 = eventState39.getMaxIterationCount();
        double double41 = eventState39.getEventTime();
        boolean boolean42 = eventState39.stop();
        int int43 = eventState39.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = null;
        org.apache.commons.math.ode.events.EventState eventState49 = new org.apache.commons.math.ode.events.EventState(eventHandler45, (double) (short) 10, (double) '#', (int) (short) 0);
        int int50 = eventState49.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler52 = null;
        org.apache.commons.math.ode.events.EventState eventState56 = new org.apache.commons.math.ode.events.EventState(eventHandler52, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler58 = null;
        org.apache.commons.math.ode.events.EventState eventState62 = new org.apache.commons.math.ode.events.EventState(eventHandler58, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler63 = eventState62.getEventHandler();
        double[] doubleArray70 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean71 = eventState62.reset(10.0d, doubleArray70);
        boolean boolean72 = eventState56.reset((double) 1, doubleArray70);
        boolean boolean73 = eventState49.reset((double) (-1L), doubleArray70);
        boolean boolean74 = eventState39.reset(0.0d, doubleArray70);
        boolean boolean75 = eventState28.reset((double) 10L, doubleArray70);
        boolean boolean76 = eventState14.reset(Double.NaN, doubleArray70);
        boolean boolean77 = eventState4.reset((double) (byte) 0, doubleArray70);
        double double78 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(eventHandler15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNull(eventHandler29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
        org.junit.Assert.assertNull(eventHandler31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 35.0d + "'", double32 == 35.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(eventHandler63);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 35.0d + "'", double78 == 35.0d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 97, (double) 35, (int) (short) 0);
        boolean boolean5 = eventState4.stop();
        int int6 = eventState4.getMaxIterationCount();
        boolean boolean7 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 100L, (double) 0.0f, (int) (short) 0);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double double5 = eventState4.getConvergence();
        boolean boolean6 = eventState4.stop();
        int int7 = eventState4.getMaxIterationCount();
        double double8 = eventState4.getMaxCheckInterval();
        double double9 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        boolean boolean11 = eventState4.stop();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = eventState4.evaluateStep(stepInterpolator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(eventHandler10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        int int8 = eventState4.getMaxIterationCount();
        int int9 = eventState4.getMaxIterationCount();
        int int10 = eventState4.getMaxIterationCount();
        int int11 = eventState4.getMaxIterationCount();
        int int12 = eventState4.getMaxIterationCount();
        double double13 = eventState4.getMaxCheckInterval();
        double double14 = eventState4.getEventTime();
        boolean boolean15 = eventState4.stop();
        double[] doubleArray17 = null;
        boolean boolean18 = eventState4.reset((double) (byte) 10, doubleArray17);
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = eventState4.evaluateStep(stepInterpolator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        int int8 = eventState4.getMaxIterationCount();
        double double9 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = null;
        org.apache.commons.math.ode.events.EventState eventState15 = new org.apache.commons.math.ode.events.EventState(eventHandler11, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = eventState21.getEventHandler();
        double[] doubleArray29 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean30 = eventState21.reset(10.0d, doubleArray29);
        boolean boolean31 = eventState15.reset((double) 1, doubleArray29);
        boolean boolean32 = eventState4.reset((double) (short) -1, doubleArray29);
        int int33 = eventState4.getMaxIterationCount();
        double double34 = eventState4.getEventTime();
        double double35 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = null;
        org.apache.commons.math.ode.events.EventState eventState41 = new org.apache.commons.math.ode.events.EventState(eventHandler37, (double) '#', (double) 100.0f, 1);
        int int42 = eventState41.getMaxIterationCount();
        double double43 = eventState41.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = null;
        org.apache.commons.math.ode.events.EventState eventState49 = new org.apache.commons.math.ode.events.EventState(eventHandler45, (double) 100.0f, (double) 10, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler51 = null;
        org.apache.commons.math.ode.events.EventState eventState55 = new org.apache.commons.math.ode.events.EventState(eventHandler51, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler56 = eventState55.getEventHandler();
        int int57 = eventState55.getMaxIterationCount();
        double double58 = eventState55.getMaxCheckInterval();
        double double59 = eventState55.getEventTime();
        double double60 = eventState55.getEventTime();
        boolean boolean61 = eventState55.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler63 = null;
        org.apache.commons.math.ode.events.EventState eventState67 = new org.apache.commons.math.ode.events.EventState(eventHandler63, (double) '#', (double) 100.0f, 1);
        int int68 = eventState67.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler70 = null;
        org.apache.commons.math.ode.events.EventState eventState74 = new org.apache.commons.math.ode.events.EventState(eventHandler70, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler75 = eventState74.getEventHandler();
        double[] doubleArray82 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean83 = eventState74.reset(10.0d, doubleArray82);
        boolean boolean84 = eventState67.reset(0.0d, doubleArray82);
        boolean boolean85 = eventState55.reset((double) (byte) 0, doubleArray82);
        boolean boolean86 = eventState49.reset(0.0d, doubleArray82);
        boolean boolean87 = eventState41.reset(1.0d, doubleArray82);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) 0L, doubleArray82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNull(eventHandler22);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNull(eventHandler56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 35.0d + "'", double58 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNull(eventHandler75);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 97.0d, (-1.0d), (int) (byte) 100);
        double double5 = eventState4.getConvergence();
        double double6 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = eventState13.getEventHandler();
        double[] doubleArray21 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean22 = eventState13.reset(10.0d, doubleArray21);
        boolean boolean23 = eventState4.reset((double) (byte) 1, doubleArray21);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState4.getEventHandler();
        int int25 = eventState4.getMaxIterationCount();
        double double26 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState4.getEventHandler();
        double[] doubleArray30 = null;
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) (short) 1, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler14);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNull(eventHandler27);
        org.junit.Assert.assertNull(eventHandler28);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        double[] doubleArray27 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean28 = eventState19.reset(10.0d, doubleArray27);
        boolean boolean29 = eventState13.reset((double) 1, doubleArray27);
        boolean boolean30 = eventState4.reset((double) (short) 0, doubleArray27);
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = eventState4.getEventHandler();
        double double32 = eventState4.getMaxCheckInterval();
        boolean boolean33 = eventState4.stop();
        int int34 = eventState4.getMaxIterationCount();
        int int35 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(eventHandler31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 35.0d + "'", double32 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(eventHandler36);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 100.0f, (double) 10, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        int int11 = eventState10.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = eventState17.getEventHandler();
        double[] doubleArray25 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean26 = eventState17.reset(10.0d, doubleArray25);
        boolean boolean27 = eventState10.reset(0.0d, doubleArray25);
        boolean boolean28 = eventState4.reset((double) 100, doubleArray25);
        double double29 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = eventState4.getEventHandler();
        double double31 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(eventHandler18);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNull(eventHandler30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 1.0d, (double) 1.0f, (int) '#');
        double double5 = eventState4.getEventTime();
        double double6 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        boolean boolean8 = eventState4.stop();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getConvergence();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10.0f, (double) (byte) 0, (int) (short) -1);
        double double5 = eventState4.getMaxCheckInterval();
        double double6 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        boolean boolean8 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray13 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean14 = eventState4.reset(0.0d, doubleArray13);
        int int15 = eventState4.getMaxIterationCount();
        double double16 = eventState4.getMaxCheckInterval();
        double double17 = eventState4.getConvergence();
        boolean boolean18 = eventState4.stop();
        double double19 = eventState4.getEventTime();
        boolean boolean20 = eventState4.stop();
        double double21 = eventState4.getEventTime();
        double double22 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = null;
        org.apache.commons.math.ode.events.EventState eventState28 = new org.apache.commons.math.ode.events.EventState(eventHandler24, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler29 = eventState28.getEventHandler();
        double[] doubleArray37 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean38 = eventState28.reset(0.0d, doubleArray37);
        boolean boolean39 = eventState4.reset(Double.NaN, doubleArray37);
        int int40 = eventState4.getMaxIterationCount();
        boolean boolean41 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
        org.junit.Assert.assertNull(eventHandler29);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        boolean boolean9 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        double double11 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(eventHandler10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10, (double) 1L, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (short) 10, (double) '#', (int) (short) 0);
        int int11 = eventState10.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        double[] doubleArray31 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean32 = eventState23.reset(10.0d, doubleArray31);
        boolean boolean33 = eventState17.reset((double) 1, doubleArray31);
        boolean boolean34 = eventState10.reset((double) (-1L), doubleArray31);
        boolean boolean35 = eventState4.reset((double) ' ', doubleArray31);
        double double36 = eventState4.getEventTime();
        double double37 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        double double7 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        double double9 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = null;
        org.apache.commons.math.ode.events.EventState eventState15 = new org.apache.commons.math.ode.events.EventState(eventHandler11, (double) 1L, (double) 10L, (int) ' ');
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler29 = null;
        org.apache.commons.math.ode.events.EventState eventState33 = new org.apache.commons.math.ode.events.EventState(eventHandler29, (double) '#', (double) 100.0f, 1);
        int int34 = eventState33.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = null;
        org.apache.commons.math.ode.events.EventState eventState40 = new org.apache.commons.math.ode.events.EventState(eventHandler36, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler41 = eventState40.getEventHandler();
        double[] doubleArray48 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean49 = eventState40.reset(10.0d, doubleArray48);
        boolean boolean50 = eventState33.reset(0.0d, doubleArray48);
        boolean boolean51 = eventState27.reset((double) (byte) 0, doubleArray48);
        boolean boolean52 = eventState21.reset(Double.NaN, doubleArray48);
        boolean boolean53 = eventState15.reset((double) (byte) -1, doubleArray48);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) (short) -1, doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNull(eventHandler41);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 1.0d, (double) 10, (int) (short) 10);
        boolean boolean5 = eventState4.stop();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = eventState4.evaluateStep(stepInterpolator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 100.0f, (double) 10, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        int int11 = eventState10.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = eventState17.getEventHandler();
        double[] doubleArray25 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean26 = eventState17.reset(10.0d, doubleArray25);
        boolean boolean27 = eventState10.reset(0.0d, doubleArray25);
        boolean boolean28 = eventState4.reset((double) 100, doubleArray25);
        double double29 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(eventHandler18);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) -1, Double.NaN, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = eventState4.evaluateStep(stepInterpolator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        int int8 = eventState4.getMaxIterationCount();
        double double9 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = null;
        org.apache.commons.math.ode.events.EventState eventState15 = new org.apache.commons.math.ode.events.EventState(eventHandler11, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = eventState21.getEventHandler();
        double[] doubleArray29 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean30 = eventState21.reset(10.0d, doubleArray29);
        boolean boolean31 = eventState15.reset((double) 1, doubleArray29);
        boolean boolean32 = eventState4.reset((double) (short) -1, doubleArray29);
        double double33 = eventState4.getConvergence();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = eventState4.evaluateStep(stepInterpolator34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNull(eventHandler22);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 35.0d + "'", double33 == 35.0d);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        double double7 = eventState4.getEventTime();
        double double8 = eventState4.getEventTime();
        int int9 = eventState4.getMaxIterationCount();
        boolean boolean10 = eventState4.stop();
        int int11 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState4.getEventHandler();
        double double13 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) 10, 0.0d, (int) (short) 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = null;
        org.apache.commons.math.ode.events.EventState eventState25 = new org.apache.commons.math.ode.events.EventState(eventHandler21, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray31 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean32 = eventState25.reset((double) (byte) 100, doubleArray31);
        boolean boolean33 = eventState19.reset((double) ' ', doubleArray31);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) 10, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(eventHandler12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray12 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean13 = eventState4.reset(10.0d, doubleArray12);
        boolean boolean14 = eventState4.stop();
        boolean boolean15 = eventState4.stop();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = eventState4.evaluateStep(stepInterpolator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = null;
        org.apache.commons.math.ode.events.EventState eventState15 = new org.apache.commons.math.ode.events.EventState(eventHandler11, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = eventState15.getEventHandler();
        int int17 = eventState15.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = eventState15.getEventHandler();
        int int19 = eventState15.getMaxIterationCount();
        int int20 = eventState15.getMaxIterationCount();
        double[] doubleArray27 = new double[] { (-1), (-1L), 100.0d, 0, 10.0d };
        boolean boolean28 = eventState15.reset(1.0d, doubleArray27);
        int int29 = eventState15.getMaxIterationCount();
        boolean boolean30 = eventState15.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = null;
        org.apache.commons.math.ode.events.EventState eventState36 = new org.apache.commons.math.ode.events.EventState(eventHandler32, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = null;
        org.apache.commons.math.ode.events.EventState eventState42 = new org.apache.commons.math.ode.events.EventState(eventHandler38, (double) '#', (double) 0L, (int) (short) -1);
        org.apache.commons.math.ode.events.EventHandler eventHandler44 = null;
        org.apache.commons.math.ode.events.EventState eventState48 = new org.apache.commons.math.ode.events.EventState(eventHandler44, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler49 = eventState48.getEventHandler();
        int int50 = eventState48.getMaxIterationCount();
        double double51 = eventState48.getMaxCheckInterval();
        double double52 = eventState48.getEventTime();
        double double53 = eventState48.getEventTime();
        boolean boolean54 = eventState48.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler56 = null;
        org.apache.commons.math.ode.events.EventState eventState60 = new org.apache.commons.math.ode.events.EventState(eventHandler56, (double) '#', (double) 100.0f, 1);
        int int61 = eventState60.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler63 = null;
        org.apache.commons.math.ode.events.EventState eventState67 = new org.apache.commons.math.ode.events.EventState(eventHandler63, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler68 = eventState67.getEventHandler();
        double[] doubleArray75 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean76 = eventState67.reset(10.0d, doubleArray75);
        boolean boolean77 = eventState60.reset(0.0d, doubleArray75);
        boolean boolean78 = eventState48.reset((double) (byte) 0, doubleArray75);
        boolean boolean79 = eventState42.reset((double) (short) 10, doubleArray75);
        boolean boolean80 = eventState36.reset((double) (short) 10, doubleArray75);
        boolean boolean81 = eventState15.reset((double) 1, doubleArray75);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) 10L, doubleArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(eventHandler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(eventHandler18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { (-1.0d), (-1.0d), 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(eventHandler49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 35.0d + "'", double51 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNull(eventHandler68);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 97.0d, 10.0d, (int) (short) 0);
        double double5 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 1L, 32.0d, 10);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 52.0d, (double) 35, (int) (short) -1);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10L, (double) (short) 100, (int) (short) 0);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        double[] doubleArray27 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean28 = eventState19.reset(10.0d, doubleArray27);
        boolean boolean29 = eventState13.reset((double) 1, doubleArray27);
        boolean boolean30 = eventState4.reset((double) (short) 0, doubleArray27);
        double double31 = eventState4.getMaxCheckInterval();
        int int32 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = null;
        org.apache.commons.math.ode.events.EventState eventState38 = new org.apache.commons.math.ode.events.EventState(eventHandler34, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler39 = eventState38.getEventHandler();
        double[] doubleArray46 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean47 = eventState38.reset(10.0d, doubleArray46);
        boolean boolean48 = eventState4.reset(35.0d, doubleArray46);
        double double49 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(eventHandler39);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        boolean boolean8 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = null;
        org.apache.commons.math.ode.events.EventState eventState14 = new org.apache.commons.math.ode.events.EventState(eventHandler10, (double) '#', (double) 100.0f, 1);
        int int15 = eventState14.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = eventState21.getEventHandler();
        double[] doubleArray29 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean30 = eventState21.reset(10.0d, doubleArray29);
        boolean boolean31 = eventState14.reset(0.0d, doubleArray29);
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = null;
        org.apache.commons.math.ode.events.EventState eventState37 = new org.apache.commons.math.ode.events.EventState(eventHandler33, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = eventState37.getEventHandler();
        double[] doubleArray46 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean47 = eventState37.reset(0.0d, doubleArray46);
        boolean boolean48 = eventState14.reset(Double.NaN, doubleArray46);
        boolean boolean49 = eventState4.reset((double) 10L, doubleArray46);
        org.apache.commons.math.ode.events.EventHandler eventHandler50 = eventState4.getEventHandler();
        double double51 = eventState4.getEventTime();
        double double52 = eventState4.getConvergence();
        double double53 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(eventHandler22);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(eventHandler38);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(eventHandler50);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 35.0d + "'", double52 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getConvergence();
        int int7 = eventState4.getMaxIterationCount();
        int int8 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = eventState4.getEventHandler();
        double double10 = eventState4.getMaxCheckInterval();
        int int11 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(eventHandler9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        int int17 = eventState16.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        double[] doubleArray31 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean32 = eventState23.reset(10.0d, doubleArray31);
        boolean boolean33 = eventState16.reset(0.0d, doubleArray31);
        boolean boolean34 = eventState10.reset((double) (byte) 0, doubleArray31);
        boolean boolean35 = eventState4.reset(Double.NaN, doubleArray31);
        boolean boolean36 = eventState4.stop();
        double double37 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getConvergence();
        double double9 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState4.getEventHandler();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(eventHandler10);
        org.junit.Assert.assertNull(eventHandler11);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray10 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean11 = eventState4.reset((double) (byte) 100, doubleArray10);
        double double12 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = eventState4.getEventHandler();
        boolean boolean14 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = null;
        org.apache.commons.math.ode.events.EventState eventState20 = new org.apache.commons.math.ode.events.EventState(eventHandler16, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = null;
        org.apache.commons.math.ode.events.EventState eventState26 = new org.apache.commons.math.ode.events.EventState(eventHandler22, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = null;
        org.apache.commons.math.ode.events.EventState eventState32 = new org.apache.commons.math.ode.events.EventState(eventHandler28, (double) '#', (double) 100.0f, 1);
        int int33 = eventState32.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = null;
        org.apache.commons.math.ode.events.EventState eventState39 = new org.apache.commons.math.ode.events.EventState(eventHandler35, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler40 = eventState39.getEventHandler();
        double[] doubleArray47 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean48 = eventState39.reset(10.0d, doubleArray47);
        boolean boolean49 = eventState32.reset(0.0d, doubleArray47);
        boolean boolean50 = eventState26.reset((double) (byte) 0, doubleArray47);
        boolean boolean51 = eventState20.reset(Double.NaN, doubleArray47);
        org.apache.commons.math.ode.events.EventHandler eventHandler52 = eventState20.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler54 = null;
        org.apache.commons.math.ode.events.EventState eventState58 = new org.apache.commons.math.ode.events.EventState(eventHandler54, (double) 10, (double) 1L, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler60 = null;
        org.apache.commons.math.ode.events.EventState eventState64 = new org.apache.commons.math.ode.events.EventState(eventHandler60, (double) (short) 10, (double) '#', (int) (short) 0);
        int int65 = eventState64.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler67 = null;
        org.apache.commons.math.ode.events.EventState eventState71 = new org.apache.commons.math.ode.events.EventState(eventHandler67, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler73 = null;
        org.apache.commons.math.ode.events.EventState eventState77 = new org.apache.commons.math.ode.events.EventState(eventHandler73, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler78 = eventState77.getEventHandler();
        double[] doubleArray85 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean86 = eventState77.reset(10.0d, doubleArray85);
        boolean boolean87 = eventState71.reset((double) 1, doubleArray85);
        boolean boolean88 = eventState64.reset((double) (-1L), doubleArray85);
        boolean boolean89 = eventState58.reset((double) ' ', doubleArray85);
        boolean boolean90 = eventState20.reset((double) 32, doubleArray85);
        boolean boolean91 = eventState4.reset(1.0d, doubleArray85);
        double double92 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler93 = eventState4.getEventHandler();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertNull(eventHandler13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(eventHandler40);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(eventHandler52);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(eventHandler78);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-1.0d) + "'", double92 == (-1.0d));
        org.junit.Assert.assertNull(eventHandler93);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray13 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean14 = eventState4.reset(0.0d, doubleArray13);
        int int15 = eventState4.getMaxIterationCount();
        int int16 = eventState4.getMaxIterationCount();
        int int17 = eventState4.getMaxIterationCount();
        java.lang.Class<?> wildcardClass18 = eventState4.getClass();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) 0.0f, 100);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getConvergence();
        double double7 = eventState4.getEventTime();
        java.lang.Class<?> wildcardClass8 = eventState4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 1.0d, (double) '4', 10);
        double double5 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        double double7 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNull(eventHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, Double.NaN, (double) (short) -1, (-1));
        double double5 = eventState4.getEventTime();
        double double6 = eventState4.getEventTime();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) -1, Double.NaN, 10);
        double double5 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        double double7 = eventState4.getEventTime();
        double double8 = eventState4.getConvergence();
        int int9 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = eventState4.evaluateStep(stepInterpolator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNull(eventHandler6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        double double7 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        boolean boolean9 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        boolean boolean11 = eventState4.stop();
        java.lang.Class<?> wildcardClass12 = eventState4.getClass();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(eventHandler10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 10, (double) 1.0f, 0);
        boolean boolean5 = eventState4.stop();
        int int6 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        int int8 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = null;
        org.apache.commons.math.ode.events.EventState eventState14 = new org.apache.commons.math.ode.events.EventState(eventHandler10, (double) (short) 10, (double) '#', (int) (short) 0);
        int int15 = eventState14.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState27.getEventHandler();
        double[] doubleArray35 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean36 = eventState27.reset(10.0d, doubleArray35);
        boolean boolean37 = eventState21.reset((double) 1, doubleArray35);
        boolean boolean38 = eventState14.reset((double) (-1L), doubleArray35);
        boolean boolean39 = eventState4.reset(0.0d, doubleArray35);
        int int40 = eventState4.getMaxIterationCount();
        int int41 = eventState4.getMaxIterationCount();
        double double42 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 35.0d + "'", double42 == 35.0d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        int int8 = eventState4.getMaxIterationCount();
        int int9 = eventState4.getMaxIterationCount();
        double[] doubleArray16 = new double[] { (-1), (-1L), 100.0d, 0, 10.0d };
        boolean boolean17 = eventState4.reset(1.0d, doubleArray16);
        int int18 = eventState4.getMaxIterationCount();
        boolean boolean19 = eventState4.stop();
        double double20 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = eventState4.getEventHandler();
        double double22 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), (-1.0d), 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertNull(eventHandler21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 1, (double) 100L, (int) (short) 0);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        boolean boolean6 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) '#', (double) 100.0f, 1);
        int int13 = eventState12.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        double[] doubleArray27 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean28 = eventState19.reset(10.0d, doubleArray27);
        boolean boolean29 = eventState12.reset(0.0d, doubleArray27);
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = null;
        org.apache.commons.math.ode.events.EventState eventState35 = new org.apache.commons.math.ode.events.EventState(eventHandler31, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = eventState35.getEventHandler();
        double[] doubleArray43 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean44 = eventState35.reset(10.0d, doubleArray43);
        boolean boolean45 = eventState12.reset(10.0d, doubleArray43);
        boolean boolean46 = eventState4.reset(Double.NaN, doubleArray43);
        int int47 = eventState4.getMaxIterationCount();
        double double48 = eventState4.getEventTime();
        double double49 = eventState4.getMaxCheckInterval();
        int int50 = eventState4.getMaxIterationCount();
        double double51 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(eventHandler36);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 35.0d + "'", double51 == 35.0d);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        double double9 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        double double11 = eventState4.getConvergence();
        double double12 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = null;
        org.apache.commons.math.ode.events.EventState eventState18 = new org.apache.commons.math.ode.events.EventState(eventHandler14, (double) (short) 10, (double) '#', (int) (short) 0);
        int int19 = eventState18.getMaxIterationCount();
        double double20 = eventState18.getEventTime();
        boolean boolean21 = eventState18.stop();
        double double22 = eventState18.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = eventState18.getEventHandler();
        double double24 = eventState18.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler26 = null;
        org.apache.commons.math.ode.events.EventState eventState30 = new org.apache.commons.math.ode.events.EventState(eventHandler26, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = eventState30.getEventHandler();
        int int32 = eventState30.getMaxIterationCount();
        double double33 = eventState30.getMaxCheckInterval();
        double double34 = eventState30.getEventTime();
        double double35 = eventState30.getEventTime();
        int int36 = eventState30.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = eventState30.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler39 = null;
        org.apache.commons.math.ode.events.EventState eventState43 = new org.apache.commons.math.ode.events.EventState(eventHandler39, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler44 = eventState43.getEventHandler();
        int int45 = eventState43.getMaxIterationCount();
        double double46 = eventState43.getMaxCheckInterval();
        double double47 = eventState43.getEventTime();
        int int48 = eventState43.getMaxIterationCount();
        double double49 = eventState43.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler51 = null;
        org.apache.commons.math.ode.events.EventState eventState55 = new org.apache.commons.math.ode.events.EventState(eventHandler51, (double) (short) 10, (double) '#', (int) (short) 0);
        int int56 = eventState55.getMaxIterationCount();
        double double57 = eventState55.getEventTime();
        boolean boolean58 = eventState55.stop();
        int int59 = eventState55.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler61 = null;
        org.apache.commons.math.ode.events.EventState eventState65 = new org.apache.commons.math.ode.events.EventState(eventHandler61, (double) (short) 10, (double) '#', (int) (short) 0);
        int int66 = eventState65.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler68 = null;
        org.apache.commons.math.ode.events.EventState eventState72 = new org.apache.commons.math.ode.events.EventState(eventHandler68, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler74 = null;
        org.apache.commons.math.ode.events.EventState eventState78 = new org.apache.commons.math.ode.events.EventState(eventHandler74, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler79 = eventState78.getEventHandler();
        double[] doubleArray86 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean87 = eventState78.reset(10.0d, doubleArray86);
        boolean boolean88 = eventState72.reset((double) 1, doubleArray86);
        boolean boolean89 = eventState65.reset((double) (-1L), doubleArray86);
        boolean boolean90 = eventState55.reset(0.0d, doubleArray86);
        boolean boolean91 = eventState43.reset((double) '#', doubleArray86);
        boolean boolean92 = eventState30.reset(0.0d, doubleArray86);
        boolean boolean93 = eventState18.reset((double) (short) 1, doubleArray86);
        boolean boolean94 = eventState4.reset((double) (byte) -1, doubleArray86);
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(eventHandler10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
        org.junit.Assert.assertNull(eventHandler23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNull(eventHandler31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 35.0d + "'", double33 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(eventHandler37);
        org.junit.Assert.assertNull(eventHandler44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 35.0d + "'", double46 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 35.0d + "'", double49 == 35.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(eventHandler79);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = eventState13.getEventHandler();
        double[] doubleArray21 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean22 = eventState13.reset(10.0d, doubleArray21);
        boolean boolean23 = eventState4.reset((double) (byte) 1, doubleArray21);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState4.getEventHandler();
        int int25 = eventState4.getMaxIterationCount();
        double double26 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) (short) 10, (double) '#', (int) (short) 0);
        int int35 = eventState34.getMaxIterationCount();
        double double36 = eventState34.getEventTime();
        boolean boolean37 = eventState34.stop();
        double double38 = eventState34.getEventTime();
        boolean boolean39 = eventState34.stop();
        double double40 = eventState34.getEventTime();
        double double41 = eventState34.getMaxCheckInterval();
        boolean boolean42 = eventState34.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler44 = null;
        org.apache.commons.math.ode.events.EventState eventState48 = new org.apache.commons.math.ode.events.EventState(eventHandler44, (double) (short) 10, (double) '#', (int) (short) 0);
        int int49 = eventState48.getMaxIterationCount();
        double double50 = eventState48.getEventTime();
        boolean boolean51 = eventState48.stop();
        double double52 = eventState48.getEventTime();
        boolean boolean53 = eventState48.stop();
        double double54 = eventState48.getConvergence();
        double double55 = eventState48.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler57 = null;
        org.apache.commons.math.ode.events.EventState eventState61 = new org.apache.commons.math.ode.events.EventState(eventHandler57, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray67 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean68 = eventState61.reset((double) (byte) 100, doubleArray67);
        boolean boolean69 = eventState48.reset((double) '#', doubleArray67);
        boolean boolean70 = eventState34.reset((double) (byte) 0, doubleArray67);
        boolean boolean71 = eventState4.reset((double) 10, doubleArray67);
        double double72 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler14);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNull(eventHandler27);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 35.0d + "'", double54 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) -1, (double) 1, (int) ' ');
        double double5 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        int int5 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState11.getEventHandler();
        double[] doubleArray19 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean20 = eventState11.reset(10.0d, doubleArray19);
        boolean boolean21 = eventState4.reset(0.0d, doubleArray19);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState27.getEventHandler();
        double[] doubleArray35 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean36 = eventState27.reset(10.0d, doubleArray35);
        boolean boolean37 = eventState4.reset(10.0d, doubleArray35);
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = eventState4.getEventHandler();
        int int39 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator40 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = eventState4.evaluateStep(stepInterpolator40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(eventHandler12);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(eventHandler38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 0.0d, (double) (byte) 0, (int) (byte) 0);
        double double5 = eventState4.getMaxCheckInterval();
        java.lang.Class<?> wildcardClass6 = eventState4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 10.0d, (double) 1.0f, (int) (short) 100);
        double double5 = eventState4.getEventTime();
        double double6 = eventState4.getConvergence();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10.0f, Double.NaN, (int) (short) 1);
        boolean boolean5 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        double double7 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(eventHandler6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = eventState16.getEventHandler();
        double[] doubleArray24 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean25 = eventState16.reset(10.0d, doubleArray24);
        boolean boolean26 = eventState10.reset((double) 1, doubleArray24);
        boolean boolean27 = eventState4.reset((double) (byte) -1, doubleArray24);
        boolean boolean28 = eventState4.stop();
        int int29 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler17);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray10 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean11 = eventState4.reset((double) (byte) 100, doubleArray10);
        double double12 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = eventState4.getEventHandler();
        boolean boolean14 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = eventState21.getEventHandler();
        double[] doubleArray30 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean31 = eventState21.reset(0.0d, doubleArray30);
        int int32 = eventState21.getMaxIterationCount();
        double double33 = eventState21.getMaxCheckInterval();
        double double34 = eventState21.getConvergence();
        boolean boolean35 = eventState21.stop();
        double double36 = eventState21.getEventTime();
        boolean boolean37 = eventState21.stop();
        double double38 = eventState21.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler40 = null;
        org.apache.commons.math.ode.events.EventState eventState44 = new org.apache.commons.math.ode.events.EventState(eventHandler40, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler46 = null;
        org.apache.commons.math.ode.events.EventState eventState50 = new org.apache.commons.math.ode.events.EventState(eventHandler46, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler52 = null;
        org.apache.commons.math.ode.events.EventState eventState56 = new org.apache.commons.math.ode.events.EventState(eventHandler52, (double) '#', (double) 100.0f, 1);
        int int57 = eventState56.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler59 = null;
        org.apache.commons.math.ode.events.EventState eventState63 = new org.apache.commons.math.ode.events.EventState(eventHandler59, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler64 = eventState63.getEventHandler();
        double[] doubleArray71 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean72 = eventState63.reset(10.0d, doubleArray71);
        boolean boolean73 = eventState56.reset(0.0d, doubleArray71);
        boolean boolean74 = eventState50.reset((double) (byte) 0, doubleArray71);
        boolean boolean75 = eventState44.reset(Double.NaN, doubleArray71);
        boolean boolean76 = eventState21.reset((double) 1, doubleArray71);
        boolean boolean77 = eventState4.reset((double) (short) 10, doubleArray71);
        boolean boolean78 = eventState4.stop();
        double double79 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertNull(eventHandler13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(eventHandler15);
        org.junit.Assert.assertNull(eventHandler22);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 35.0d + "'", double33 == 35.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNull(eventHandler64);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        double double7 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) (-1), (double) '#', (int) (byte) 1);
        double double14 = eventState13.getMaxCheckInterval();
        double double15 = eventState13.getMaxCheckInterval();
        int int16 = eventState13.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = null;
        org.apache.commons.math.ode.events.EventState eventState22 = new org.apache.commons.math.ode.events.EventState(eventHandler18, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = eventState22.getEventHandler();
        double[] doubleArray31 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean32 = eventState22.reset(0.0d, doubleArray31);
        boolean boolean33 = eventState13.reset((double) (byte) 1, doubleArray31);
        boolean boolean34 = eventState4.reset((double) 100L, doubleArray31);
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNull(eventHandler6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(eventHandler23);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 10.0d, (double) 'a', (int) 'a');
        double double5 = eventState4.getEventTime();
        double double6 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) (-1), (double) '#', (int) (byte) 1);
        double double13 = eventState12.getMaxCheckInterval();
        double double14 = eventState12.getMaxCheckInterval();
        int int15 = eventState12.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) '#', (double) 100.0f, 1);
        int int22 = eventState21.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = null;
        org.apache.commons.math.ode.events.EventState eventState28 = new org.apache.commons.math.ode.events.EventState(eventHandler24, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler29 = eventState28.getEventHandler();
        double[] doubleArray36 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean37 = eventState28.reset(10.0d, doubleArray36);
        boolean boolean38 = eventState21.reset(0.0d, doubleArray36);
        org.apache.commons.math.ode.events.EventHandler eventHandler40 = null;
        org.apache.commons.math.ode.events.EventState eventState44 = new org.apache.commons.math.ode.events.EventState(eventHandler40, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = eventState44.getEventHandler();
        double[] doubleArray53 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean54 = eventState44.reset(0.0d, doubleArray53);
        boolean boolean55 = eventState21.reset(Double.NaN, doubleArray53);
        boolean boolean56 = eventState12.reset(1.0d, doubleArray53);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) (short) 100, doubleArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(eventHandler29);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(eventHandler45);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        double[] doubleArray18 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean19 = eventState10.reset(10.0d, doubleArray18);
        boolean boolean20 = eventState4.reset((double) (byte) 0, doubleArray18);
        double double21 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = null;
        org.apache.commons.math.ode.events.EventState eventState28 = new org.apache.commons.math.ode.events.EventState(eventHandler24, (double) (byte) 10, (double) '#', (int) (byte) 1);
        double double29 = eventState28.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = null;
        org.apache.commons.math.ode.events.EventState eventState35 = new org.apache.commons.math.ode.events.EventState(eventHandler31, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = eventState35.getEventHandler();
        int int37 = eventState35.getMaxIterationCount();
        double double38 = eventState35.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler40 = null;
        org.apache.commons.math.ode.events.EventState eventState44 = new org.apache.commons.math.ode.events.EventState(eventHandler40, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler46 = null;
        org.apache.commons.math.ode.events.EventState eventState50 = new org.apache.commons.math.ode.events.EventState(eventHandler46, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler51 = eventState50.getEventHandler();
        double[] doubleArray58 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean59 = eventState50.reset(10.0d, doubleArray58);
        boolean boolean60 = eventState44.reset((double) 1, doubleArray58);
        boolean boolean61 = eventState35.reset((double) (short) 0, doubleArray58);
        int int62 = eventState35.getMaxIterationCount();
        double[] doubleArray68 = new double[] { (-1), 'a', (short) 100, (-1) };
        boolean boolean69 = eventState35.reset((double) (byte) 100, doubleArray68);
        boolean boolean70 = eventState28.reset((double) (short) 100, doubleArray68);
        boolean boolean71 = eventState4.reset((double) 'a', doubleArray68);
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNull(eventHandler22);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNull(eventHandler36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 35.0d + "'", double38 == 35.0d);
        org.junit.Assert.assertNull(eventHandler51);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { (-1.0d), 97.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 0, (double) (-1), (int) (byte) 10);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        int int8 = eventState4.getMaxIterationCount();
        double double9 = eventState4.getEventTime();
        double double10 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = eventState16.getEventHandler();
        int int18 = eventState16.getMaxIterationCount();
        double double19 = eventState16.getMaxCheckInterval();
        double double20 = eventState16.getEventTime();
        double double21 = eventState16.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState27.getEventHandler();
        double[] doubleArray36 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean37 = eventState27.reset(0.0d, doubleArray36);
        int int38 = eventState27.getMaxIterationCount();
        double double39 = eventState27.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler40 = eventState27.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = null;
        org.apache.commons.math.ode.events.EventState eventState46 = new org.apache.commons.math.ode.events.EventState(eventHandler42, (double) '#', (double) 100.0f, 1);
        int int47 = eventState46.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler49 = null;
        org.apache.commons.math.ode.events.EventState eventState53 = new org.apache.commons.math.ode.events.EventState(eventHandler49, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler54 = eventState53.getEventHandler();
        double[] doubleArray61 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean62 = eventState53.reset(10.0d, doubleArray61);
        boolean boolean63 = eventState46.reset(0.0d, doubleArray61);
        org.apache.commons.math.ode.events.EventHandler eventHandler65 = null;
        org.apache.commons.math.ode.events.EventState eventState69 = new org.apache.commons.math.ode.events.EventState(eventHandler65, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler70 = eventState69.getEventHandler();
        double[] doubleArray78 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean79 = eventState69.reset(0.0d, doubleArray78);
        boolean boolean80 = eventState46.reset(Double.NaN, doubleArray78);
        boolean boolean81 = eventState27.reset((double) (-1), doubleArray78);
        boolean boolean82 = eventState16.reset(35.0d, doubleArray78);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) (byte) 1, doubleArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNull(eventHandler17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertNull(eventHandler40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(eventHandler54);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(eventHandler70);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10, (double) (byte) 10, (int) (byte) 1);
        double double5 = eventState4.getEventTime();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) 10, (double) 1L, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) (short) 10, (double) '#', (int) (short) 0);
        int int20 = eventState19.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = null;
        org.apache.commons.math.ode.events.EventState eventState26 = new org.apache.commons.math.ode.events.EventState(eventHandler22, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = null;
        org.apache.commons.math.ode.events.EventState eventState32 = new org.apache.commons.math.ode.events.EventState(eventHandler28, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = eventState32.getEventHandler();
        double[] doubleArray40 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean41 = eventState32.reset(10.0d, doubleArray40);
        boolean boolean42 = eventState26.reset((double) 1, doubleArray40);
        boolean boolean43 = eventState19.reset((double) (-1L), doubleArray40);
        boolean boolean44 = eventState13.reset((double) ' ', doubleArray40);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin(100.0d, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(eventHandler33);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) ' ', (double) 1.0f, (int) 'a');
        double double5 = eventState4.getConvergence();
        double double6 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(eventHandler7);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) ' ', (double) 1.0f, (int) 'a');
        double double5 = eventState4.getConvergence();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) (byte) -1, Double.NaN, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = null;
        org.apache.commons.math.ode.events.EventState eventState18 = new org.apache.commons.math.ode.events.EventState(eventHandler14, (double) 10, 0.0d, (int) (short) 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = null;
        org.apache.commons.math.ode.events.EventState eventState24 = new org.apache.commons.math.ode.events.EventState(eventHandler20, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray30 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean31 = eventState24.reset((double) (byte) 100, doubleArray30);
        boolean boolean32 = eventState18.reset((double) ' ', doubleArray30);
        boolean boolean33 = eventState12.reset((double) (byte) 0, doubleArray30);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) '#', doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 0, (double) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = eventState4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) (byte) 0, 97);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = eventState12.getEventHandler();
        double double14 = eventState12.getMaxCheckInterval();
        double double15 = eventState12.getConvergence();
        int int16 = eventState12.getMaxIterationCount();
        double double17 = eventState12.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        int int25 = eventState23.getMaxIterationCount();
        double double26 = eventState23.getMaxCheckInterval();
        double double27 = eventState23.getEventTime();
        double double28 = eventState23.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = eventState34.getEventHandler();
        double[] doubleArray43 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean44 = eventState34.reset(0.0d, doubleArray43);
        int int45 = eventState34.getMaxIterationCount();
        double double46 = eventState34.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = eventState34.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler49 = null;
        org.apache.commons.math.ode.events.EventState eventState53 = new org.apache.commons.math.ode.events.EventState(eventHandler49, (double) '#', (double) 100.0f, 1);
        int int54 = eventState53.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler56 = null;
        org.apache.commons.math.ode.events.EventState eventState60 = new org.apache.commons.math.ode.events.EventState(eventHandler56, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler61 = eventState60.getEventHandler();
        double[] doubleArray68 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean69 = eventState60.reset(10.0d, doubleArray68);
        boolean boolean70 = eventState53.reset(0.0d, doubleArray68);
        org.apache.commons.math.ode.events.EventHandler eventHandler72 = null;
        org.apache.commons.math.ode.events.EventState eventState76 = new org.apache.commons.math.ode.events.EventState(eventHandler72, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler77 = eventState76.getEventHandler();
        double[] doubleArray85 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean86 = eventState76.reset(0.0d, doubleArray85);
        boolean boolean87 = eventState53.reset(Double.NaN, doubleArray85);
        boolean boolean88 = eventState34.reset((double) (-1), doubleArray85);
        boolean boolean89 = eventState23.reset(35.0d, doubleArray85);
        boolean boolean90 = eventState12.reset((double) 35, doubleArray85);
        boolean boolean91 = eventState4.reset((double) 1, doubleArray85);
        double double92 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNull(eventHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 35.0d + "'", double26 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNull(eventHandler35);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertNull(eventHandler47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(eventHandler61);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(eventHandler77);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 10.0d + "'", double92 == 10.0d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double double5 = eventState4.getConvergence();
        boolean boolean6 = eventState4.stop();
        int int7 = eventState4.getMaxIterationCount();
        double double8 = eventState4.getMaxCheckInterval();
        double double9 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        double double11 = eventState4.getEventTime();
        boolean boolean12 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(eventHandler10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        double[] doubleArray18 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean19 = eventState10.reset(10.0d, doubleArray18);
        boolean boolean20 = eventState4.reset((double) 1, doubleArray18);
        double double21 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) (-1), (double) '#', (int) (byte) 1);
        boolean boolean28 = eventState27.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) (short) 10, (double) '#', (int) (short) 0);
        int int35 = eventState34.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = null;
        org.apache.commons.math.ode.events.EventState eventState41 = new org.apache.commons.math.ode.events.EventState(eventHandler37, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler43 = null;
        org.apache.commons.math.ode.events.EventState eventState47 = new org.apache.commons.math.ode.events.EventState(eventHandler43, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler48 = eventState47.getEventHandler();
        double[] doubleArray55 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean56 = eventState47.reset(10.0d, doubleArray55);
        boolean boolean57 = eventState41.reset((double) 1, doubleArray55);
        boolean boolean58 = eventState34.reset((double) (-1L), doubleArray55);
        boolean boolean59 = eventState27.reset((double) (byte) 10, doubleArray55);
        boolean boolean60 = eventState4.reset(1.0d, doubleArray55);
        double double61 = eventState4.getConvergence();
        boolean boolean62 = eventState4.stop();
        double double63 = eventState4.getConvergence();
        int int64 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(eventHandler48);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 35.0d + "'", double61 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 35.0d + "'", double63 == 35.0d);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) ' ', (double) 10.0f, (int) (short) 0);
        boolean boolean5 = eventState4.stop();
        double double6 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        boolean boolean8 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = null;
        org.apache.commons.math.ode.events.EventState eventState14 = new org.apache.commons.math.ode.events.EventState(eventHandler10, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = eventState14.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = eventState14.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = null;
        org.apache.commons.math.ode.events.EventState eventState22 = new org.apache.commons.math.ode.events.EventState(eventHandler18, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = eventState22.getEventHandler();
        int int24 = eventState22.getMaxIterationCount();
        double double25 = eventState22.getMaxCheckInterval();
        double double26 = eventState22.getEventTime();
        double double27 = eventState22.getEventTime();
        boolean boolean28 = eventState22.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) '#', (double) 100.0f, 1);
        int int35 = eventState34.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = null;
        org.apache.commons.math.ode.events.EventState eventState41 = new org.apache.commons.math.ode.events.EventState(eventHandler37, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = eventState41.getEventHandler();
        double[] doubleArray49 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean50 = eventState41.reset(10.0d, doubleArray49);
        boolean boolean51 = eventState34.reset(0.0d, doubleArray49);
        boolean boolean52 = eventState22.reset((double) (byte) 0, doubleArray49);
        boolean boolean53 = eventState14.reset((double) (short) 100, doubleArray49);
        boolean boolean54 = eventState4.reset((double) 32, doubleArray49);
        double double55 = eventState4.getConvergence();
        java.lang.Class<?> wildcardClass56 = eventState4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(eventHandler15);
        org.junit.Assert.assertNull(eventHandler16);
        org.junit.Assert.assertNull(eventHandler23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 35.0d + "'", double25 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(eventHandler42);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, (double) (short) -1, (int) '#');
        double double5 = eventState4.getConvergence();
        boolean boolean6 = eventState4.stop();
        double double7 = eventState4.getConvergence();
        double double8 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = null;
        org.apache.commons.math.ode.events.EventState eventState14 = new org.apache.commons.math.ode.events.EventState(eventHandler10, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = null;
        org.apache.commons.math.ode.events.EventState eventState20 = new org.apache.commons.math.ode.events.EventState(eventHandler16, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = eventState20.getEventHandler();
        double[] doubleArray28 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean29 = eventState20.reset(10.0d, doubleArray28);
        boolean boolean30 = eventState14.reset((double) 1, doubleArray28);
        double double31 = eventState14.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = null;
        org.apache.commons.math.ode.events.EventState eventState37 = new org.apache.commons.math.ode.events.EventState(eventHandler33, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler39 = null;
        org.apache.commons.math.ode.events.EventState eventState43 = new org.apache.commons.math.ode.events.EventState(eventHandler39, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler44 = eventState43.getEventHandler();
        double[] doubleArray51 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean52 = eventState43.reset(10.0d, doubleArray51);
        boolean boolean53 = eventState37.reset((double) 1, doubleArray51);
        double double54 = eventState37.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler56 = null;
        org.apache.commons.math.ode.events.EventState eventState60 = new org.apache.commons.math.ode.events.EventState(eventHandler56, (double) (-1), (double) '#', (int) (byte) 1);
        boolean boolean61 = eventState60.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler63 = null;
        org.apache.commons.math.ode.events.EventState eventState67 = new org.apache.commons.math.ode.events.EventState(eventHandler63, (double) (short) 10, (double) '#', (int) (short) 0);
        int int68 = eventState67.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler70 = null;
        org.apache.commons.math.ode.events.EventState eventState74 = new org.apache.commons.math.ode.events.EventState(eventHandler70, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler76 = null;
        org.apache.commons.math.ode.events.EventState eventState80 = new org.apache.commons.math.ode.events.EventState(eventHandler76, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler81 = eventState80.getEventHandler();
        double[] doubleArray88 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean89 = eventState80.reset(10.0d, doubleArray88);
        boolean boolean90 = eventState74.reset((double) 1, doubleArray88);
        boolean boolean91 = eventState67.reset((double) (-1L), doubleArray88);
        boolean boolean92 = eventState60.reset((double) (byte) 10, doubleArray88);
        boolean boolean93 = eventState37.reset(1.0d, doubleArray88);
        boolean boolean94 = eventState14.reset((double) ' ', doubleArray88);
        boolean boolean95 = eventState4.reset((double) 'a', doubleArray88);
        org.apache.commons.math.ode.events.EventHandler eventHandler96 = eventState4.getEventHandler();
        double double97 = eventState4.getConvergence();
        double double98 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(eventHandler21);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNull(eventHandler44);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(eventHandler81);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNull(eventHandler96);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 1.0d + "'", double97 == 1.0d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + (-1.0d) + "'", double98 == (-1.0d));
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double double5 = eventState4.getConvergence();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) 100.0f, (double) 10, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        int int21 = eventState19.getMaxIterationCount();
        double double22 = eventState19.getMaxCheckInterval();
        double double23 = eventState19.getEventTime();
        double double24 = eventState19.getEventTime();
        boolean boolean25 = eventState19.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = null;
        org.apache.commons.math.ode.events.EventState eventState31 = new org.apache.commons.math.ode.events.EventState(eventHandler27, (double) '#', (double) 100.0f, 1);
        int int32 = eventState31.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = null;
        org.apache.commons.math.ode.events.EventState eventState38 = new org.apache.commons.math.ode.events.EventState(eventHandler34, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler39 = eventState38.getEventHandler();
        double[] doubleArray46 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean47 = eventState38.reset(10.0d, doubleArray46);
        boolean boolean48 = eventState31.reset(0.0d, doubleArray46);
        boolean boolean49 = eventState19.reset((double) (byte) 0, doubleArray46);
        boolean boolean50 = eventState13.reset(0.0d, doubleArray46);
        boolean boolean51 = eventState4.reset((double) 1, doubleArray46);
        org.apache.commons.math.ode.events.EventHandler eventHandler52 = eventState4.getEventHandler();
        double double53 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(eventHandler39);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(eventHandler52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 35.0d + "'", double53 == 35.0d);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 10.0d, (double) 97, 0);
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = eventState4.evaluateStep(stepInterpolator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10.0f, Double.NaN, (int) (short) 1);
        boolean boolean5 = eventState4.stop();
        double double6 = eventState4.getConvergence();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getMaxCheckInterval();
        boolean boolean9 = eventState4.stop();
        java.lang.Class<?> wildcardClass10 = eventState4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 1.0f, (int) 'a');
        boolean boolean5 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(eventHandler6);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        boolean boolean5 = eventState4.stop();
        double double6 = eventState4.getMaxCheckInterval();
        double double7 = eventState4.getMaxCheckInterval();
        boolean boolean8 = eventState4.stop();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = eventState4.evaluateStep(stepInterpolator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) (byte) 0, 97);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        double double7 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) 'a', 1.0d, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) (short) 10, (double) 0.0f, 100);
        int int20 = eventState19.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = eventState19.getEventHandler();
        double double22 = eventState19.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = null;
        org.apache.commons.math.ode.events.EventState eventState28 = new org.apache.commons.math.ode.events.EventState(eventHandler24, (double) (short) 10, (double) '#', (int) (short) 0);
        int int29 = eventState28.getMaxIterationCount();
        double double30 = eventState28.getEventTime();
        boolean boolean31 = eventState28.stop();
        int int32 = eventState28.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = null;
        org.apache.commons.math.ode.events.EventState eventState38 = new org.apache.commons.math.ode.events.EventState(eventHandler34, (double) (short) 10, (double) '#', (int) (short) 0);
        int int39 = eventState38.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler41 = null;
        org.apache.commons.math.ode.events.EventState eventState45 = new org.apache.commons.math.ode.events.EventState(eventHandler41, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = null;
        org.apache.commons.math.ode.events.EventState eventState51 = new org.apache.commons.math.ode.events.EventState(eventHandler47, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler52 = eventState51.getEventHandler();
        double[] doubleArray59 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean60 = eventState51.reset(10.0d, doubleArray59);
        boolean boolean61 = eventState45.reset((double) 1, doubleArray59);
        boolean boolean62 = eventState38.reset((double) (-1L), doubleArray59);
        boolean boolean63 = eventState28.reset(0.0d, doubleArray59);
        boolean boolean64 = eventState19.reset((double) (byte) 1, doubleArray59);
        boolean boolean65 = eventState13.reset(0.0d, doubleArray59);
        boolean boolean66 = eventState4.reset((double) 0L, doubleArray59);
        double double67 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNull(eventHandler21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(eventHandler52);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 100.0d, (double) (short) 1, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        double[] doubleArray19 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean20 = eventState10.reset(0.0d, doubleArray19);
        int int21 = eventState10.getMaxIterationCount();
        double double22 = eventState10.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = eventState10.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = null;
        org.apache.commons.math.ode.events.EventState eventState29 = new org.apache.commons.math.ode.events.EventState(eventHandler25, (double) '#', (double) 100.0f, 1);
        int int30 = eventState29.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = null;
        org.apache.commons.math.ode.events.EventState eventState36 = new org.apache.commons.math.ode.events.EventState(eventHandler32, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = eventState36.getEventHandler();
        double[] doubleArray44 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean45 = eventState36.reset(10.0d, doubleArray44);
        boolean boolean46 = eventState29.reset(0.0d, doubleArray44);
        org.apache.commons.math.ode.events.EventHandler eventHandler48 = null;
        org.apache.commons.math.ode.events.EventState eventState52 = new org.apache.commons.math.ode.events.EventState(eventHandler48, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler53 = eventState52.getEventHandler();
        double[] doubleArray61 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean62 = eventState52.reset(0.0d, doubleArray61);
        boolean boolean63 = eventState29.reset(Double.NaN, doubleArray61);
        boolean boolean64 = eventState10.reset((double) (-1), doubleArray61);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) 0L, doubleArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNull(eventHandler23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(eventHandler37);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(eventHandler53);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 100.0f, (double) 10, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        int int12 = eventState10.getMaxIterationCount();
        double double13 = eventState10.getMaxCheckInterval();
        double double14 = eventState10.getEventTime();
        double double15 = eventState10.getEventTime();
        boolean boolean16 = eventState10.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = null;
        org.apache.commons.math.ode.events.EventState eventState22 = new org.apache.commons.math.ode.events.EventState(eventHandler18, (double) '#', (double) 100.0f, 1);
        int int23 = eventState22.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = null;
        org.apache.commons.math.ode.events.EventState eventState29 = new org.apache.commons.math.ode.events.EventState(eventHandler25, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = eventState29.getEventHandler();
        double[] doubleArray37 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean38 = eventState29.reset(10.0d, doubleArray37);
        boolean boolean39 = eventState22.reset(0.0d, doubleArray37);
        boolean boolean40 = eventState10.reset((double) (byte) 0, doubleArray37);
        boolean boolean41 = eventState4.reset(0.0d, doubleArray37);
        int int42 = eventState4.getMaxIterationCount();
        double double43 = eventState4.getConvergence();
        double double44 = eventState4.getConvergence();
        java.lang.Class<?> wildcardClass45 = eventState4.getClass();
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(eventHandler30);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray13 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean14 = eventState4.reset(0.0d, doubleArray13);
        int int15 = eventState4.getMaxIterationCount();
        double double16 = eventState4.getMaxCheckInterval();
        double double17 = eventState4.getConvergence();
        boolean boolean18 = eventState4.stop();
        double double19 = eventState4.getEventTime();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = eventState4.evaluateStep(stepInterpolator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (-1.0d), (double) (-1.0f), 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState11.getEventHandler();
        int int13 = eventState11.getMaxIterationCount();
        double double14 = eventState11.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = null;
        org.apache.commons.math.ode.events.EventState eventState20 = new org.apache.commons.math.ode.events.EventState(eventHandler16, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = null;
        org.apache.commons.math.ode.events.EventState eventState26 = new org.apache.commons.math.ode.events.EventState(eventHandler22, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = eventState26.getEventHandler();
        double[] doubleArray34 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean35 = eventState26.reset(10.0d, doubleArray34);
        boolean boolean36 = eventState20.reset((double) 1, doubleArray34);
        boolean boolean37 = eventState11.reset((double) (short) 0, doubleArray34);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) 97, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNull(eventHandler12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertNull(eventHandler27);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1.0f), (double) ' ', (int) (byte) 1);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getConvergence();
        double double7 = eventState4.getConvergence();
        java.lang.Class<?> wildcardClass8 = eventState4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 100.0f, (double) 10, 0);
        double[] doubleArray6 = null;
        boolean boolean7 = eventState4.reset((double) (byte) 1, doubleArray6);
        int int8 = eventState4.getMaxIterationCount();
        java.lang.Class<?> wildcardClass9 = eventState4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray12 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean13 = eventState4.reset(10.0d, doubleArray12);
        int int14 = eventState4.getMaxIterationCount();
        double double15 = eventState4.getConvergence();
        double double16 = eventState4.getEventTime();
        int int17 = eventState4.getMaxIterationCount();
        double double18 = eventState4.getConvergence();
        double double19 = eventState4.getConvergence();
        double double20 = eventState4.getEventTime();
        int int21 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        double double7 = eventState4.getEventTime();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray10 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean11 = eventState4.reset((double) (byte) 100, doubleArray10);
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = eventState4.evaluateStep(stepInterpolator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 0, (double) (-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass5 = eventState4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 32.0d, (double) 10.0f, 32);
        boolean boolean5 = eventState4.stop();
        double double6 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 10, (double) '#', (int) (byte) 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (byte) -1, Double.NaN, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        double double12 = eventState10.getConvergence();
        double double13 = eventState10.getConvergence();
        int int14 = eventState10.getMaxIterationCount();
        double double15 = eventState10.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = eventState10.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = eventState10.getEventHandler();
        boolean boolean18 = eventState10.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = null;
        org.apache.commons.math.ode.events.EventState eventState24 = new org.apache.commons.math.ode.events.EventState(eventHandler20, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler26 = null;
        org.apache.commons.math.ode.events.EventState eventState30 = new org.apache.commons.math.ode.events.EventState(eventHandler26, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = null;
        org.apache.commons.math.ode.events.EventState eventState36 = new org.apache.commons.math.ode.events.EventState(eventHandler32, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = eventState36.getEventHandler();
        double[] doubleArray44 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean45 = eventState36.reset(10.0d, doubleArray44);
        boolean boolean46 = eventState30.reset((double) 1, doubleArray44);
        boolean boolean47 = eventState24.reset((double) (byte) -1, doubleArray44);
        boolean boolean48 = eventState10.reset((double) (-1), doubleArray44);
        boolean boolean49 = eventState4.reset((double) (-1), doubleArray44);
        double double50 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(eventHandler16);
        org.junit.Assert.assertNull(eventHandler17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(eventHandler37);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getEventTime();
        boolean boolean10 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        int int17 = eventState16.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        double[] doubleArray31 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean32 = eventState23.reset(10.0d, doubleArray31);
        boolean boolean33 = eventState16.reset(0.0d, doubleArray31);
        boolean boolean34 = eventState4.reset((double) (byte) 0, doubleArray31);
        int int35 = eventState4.getMaxIterationCount();
        int int36 = eventState4.getMaxIterationCount();
        int int37 = eventState4.getMaxIterationCount();
        double double38 = eventState4.getConvergence();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        double[] doubleArray18 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean19 = eventState10.reset(10.0d, doubleArray18);
        boolean boolean20 = eventState4.reset((double) 1, doubleArray18);
        double double21 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) (-1), (double) '#', (int) (byte) 1);
        boolean boolean28 = eventState27.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) (short) 10, (double) '#', (int) (short) 0);
        int int35 = eventState34.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = null;
        org.apache.commons.math.ode.events.EventState eventState41 = new org.apache.commons.math.ode.events.EventState(eventHandler37, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler43 = null;
        org.apache.commons.math.ode.events.EventState eventState47 = new org.apache.commons.math.ode.events.EventState(eventHandler43, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler48 = eventState47.getEventHandler();
        double[] doubleArray55 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean56 = eventState47.reset(10.0d, doubleArray55);
        boolean boolean57 = eventState41.reset((double) 1, doubleArray55);
        boolean boolean58 = eventState34.reset((double) (-1L), doubleArray55);
        boolean boolean59 = eventState27.reset((double) (byte) 10, doubleArray55);
        boolean boolean60 = eventState4.reset(1.0d, doubleArray55);
        double double61 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler62 = eventState4.getEventHandler();
        boolean boolean63 = eventState4.stop();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator64 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = eventState4.evaluateStep(stepInterpolator64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(eventHandler48);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertNull(eventHandler62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        int int9 = eventState4.getMaxIterationCount();
        double double10 = eventState4.getMaxCheckInterval();
        boolean boolean11 = eventState4.stop();
        double double12 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1.0f), 1.0d, (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = eventState4.evaluateStep(stepInterpolator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 1, (double) (byte) 100, (int) 'a');
        double double5 = eventState4.getConvergence();
        int int6 = eventState4.getMaxIterationCount();
        int int7 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        double double9 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = null;
        org.apache.commons.math.ode.events.EventState eventState15 = new org.apache.commons.math.ode.events.EventState(eventHandler11, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = eventState15.getEventHandler();
        double[] doubleArray24 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean25 = eventState15.reset(0.0d, doubleArray24);
        int int26 = eventState15.getMaxIterationCount();
        double double27 = eventState15.getConvergence();
        int int28 = eventState15.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) '#', (double) 100.0f, 1);
        int int35 = eventState34.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = null;
        org.apache.commons.math.ode.events.EventState eventState41 = new org.apache.commons.math.ode.events.EventState(eventHandler37, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = eventState41.getEventHandler();
        double[] doubleArray49 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean50 = eventState41.reset(10.0d, doubleArray49);
        boolean boolean51 = eventState34.reset((double) '#', doubleArray49);
        boolean boolean52 = eventState15.reset((double) '#', doubleArray49);
        org.apache.commons.math.ode.events.EventHandler eventHandler54 = null;
        org.apache.commons.math.ode.events.EventState eventState58 = new org.apache.commons.math.ode.events.EventState(eventHandler54, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler59 = eventState58.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler60 = eventState58.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler62 = null;
        org.apache.commons.math.ode.events.EventState eventState66 = new org.apache.commons.math.ode.events.EventState(eventHandler62, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler67 = eventState66.getEventHandler();
        int int68 = eventState66.getMaxIterationCount();
        double double69 = eventState66.getMaxCheckInterval();
        double double70 = eventState66.getEventTime();
        double double71 = eventState66.getEventTime();
        boolean boolean72 = eventState66.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler74 = null;
        org.apache.commons.math.ode.events.EventState eventState78 = new org.apache.commons.math.ode.events.EventState(eventHandler74, (double) '#', (double) 100.0f, 1);
        int int79 = eventState78.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler81 = null;
        org.apache.commons.math.ode.events.EventState eventState85 = new org.apache.commons.math.ode.events.EventState(eventHandler81, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler86 = eventState85.getEventHandler();
        double[] doubleArray93 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean94 = eventState85.reset(10.0d, doubleArray93);
        boolean boolean95 = eventState78.reset(0.0d, doubleArray93);
        boolean boolean96 = eventState66.reset((double) (byte) 0, doubleArray93);
        boolean boolean97 = eventState58.reset((double) (short) 100, doubleArray93);
        boolean boolean98 = eventState15.reset((double) 35, doubleArray93);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((-1.0d), doubleArray93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNull(eventHandler16);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(eventHandler42);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(eventHandler59);
        org.junit.Assert.assertNull(eventHandler60);
        org.junit.Assert.assertNull(eventHandler67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 35.0d + "'", double69 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNull(eventHandler86);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertArrayEquals(doubleArray93, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        int int8 = eventState4.getMaxIterationCount();
        boolean boolean9 = eventState4.stop();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = eventState4.evaluateStep(stepInterpolator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 1, 100.0d, (int) (byte) 0);
        double double5 = eventState4.getEventTime();
        double double6 = eventState4.getEventTime();
        double double7 = eventState4.getConvergence();
        double double8 = eventState4.getEventTime();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, 0.0d, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        int int7 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = eventState16.getEventHandler();
        double[] doubleArray24 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean25 = eventState16.reset(10.0d, doubleArray24);
        boolean boolean26 = eventState10.reset((double) 1, doubleArray24);
        boolean boolean27 = eventState4.reset((double) (byte) -1, doubleArray24);
        boolean boolean28 = eventState4.stop();
        double double29 = eventState4.getConvergence();
        org.junit.Assert.assertNull(eventHandler17);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) -1, Double.NaN, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getEventTime();
        int int7 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) (byte) 10, (double) 1.0f, 0);
        boolean boolean14 = eventState13.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = null;
        org.apache.commons.math.ode.events.EventState eventState20 = new org.apache.commons.math.ode.events.EventState(eventHandler16, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = null;
        org.apache.commons.math.ode.events.EventState eventState26 = new org.apache.commons.math.ode.events.EventState(eventHandler22, (double) '#', (double) 0L, (int) (short) -1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = null;
        org.apache.commons.math.ode.events.EventState eventState32 = new org.apache.commons.math.ode.events.EventState(eventHandler28, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = eventState32.getEventHandler();
        int int34 = eventState32.getMaxIterationCount();
        double double35 = eventState32.getMaxCheckInterval();
        double double36 = eventState32.getEventTime();
        double double37 = eventState32.getEventTime();
        boolean boolean38 = eventState32.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler40 = null;
        org.apache.commons.math.ode.events.EventState eventState44 = new org.apache.commons.math.ode.events.EventState(eventHandler40, (double) '#', (double) 100.0f, 1);
        int int45 = eventState44.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = null;
        org.apache.commons.math.ode.events.EventState eventState51 = new org.apache.commons.math.ode.events.EventState(eventHandler47, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler52 = eventState51.getEventHandler();
        double[] doubleArray59 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean60 = eventState51.reset(10.0d, doubleArray59);
        boolean boolean61 = eventState44.reset(0.0d, doubleArray59);
        boolean boolean62 = eventState32.reset((double) (byte) 0, doubleArray59);
        boolean boolean63 = eventState26.reset((double) (short) 10, doubleArray59);
        boolean boolean64 = eventState20.reset((double) (short) 10, doubleArray59);
        boolean boolean65 = eventState13.reset((double) (short) 100, doubleArray59);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) (byte) 100, doubleArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(eventHandler33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 35.0d + "'", double35 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNull(eventHandler52);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        boolean boolean9 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        boolean boolean11 = eventState4.stop();
        int int12 = eventState4.getMaxIterationCount();
        boolean boolean13 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(eventHandler10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) (byte) 100, 1);
        boolean boolean5 = eventState4.stop();
        double double6 = eventState4.getMaxCheckInterval();
        int int7 = eventState4.getMaxIterationCount();
        double double8 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getEventTime();
        boolean boolean10 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        int int17 = eventState16.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        double[] doubleArray31 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean32 = eventState23.reset(10.0d, doubleArray31);
        boolean boolean33 = eventState16.reset(0.0d, doubleArray31);
        boolean boolean34 = eventState4.reset((double) (byte) 0, doubleArray31);
        int int35 = eventState4.getMaxIterationCount();
        int int36 = eventState4.getMaxIterationCount();
        double double37 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = eventState4.getEventHandler();
        double double39 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertNull(eventHandler38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 35.0d + "'", double39 == 35.0d);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 100.0d, (double) (-1), (int) (byte) -1);
        double double5 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) (short) 10, (double) '#', (int) (short) 0);
        int int13 = eventState12.getMaxIterationCount();
        boolean boolean14 = eventState12.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = null;
        org.apache.commons.math.ode.events.EventState eventState20 = new org.apache.commons.math.ode.events.EventState(eventHandler16, (double) (-1), (double) (byte) 100, 1);
        boolean boolean21 = eventState20.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState27.getEventHandler();
        int int29 = eventState27.getMaxIterationCount();
        double double30 = eventState27.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = null;
        org.apache.commons.math.ode.events.EventState eventState36 = new org.apache.commons.math.ode.events.EventState(eventHandler32, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = eventState36.getEventHandler();
        double[] doubleArray44 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean45 = eventState36.reset(10.0d, doubleArray44);
        boolean boolean46 = eventState27.reset((double) (byte) 1, doubleArray44);
        boolean boolean47 = eventState20.reset((double) 10L, doubleArray44);
        boolean boolean48 = eventState12.reset((double) 32, doubleArray44);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) (byte) 100, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNull(eventHandler6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
        org.junit.Assert.assertNull(eventHandler37);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getEventTime();
        boolean boolean10 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        int int17 = eventState16.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        double[] doubleArray31 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean32 = eventState23.reset(10.0d, doubleArray31);
        boolean boolean33 = eventState16.reset(0.0d, doubleArray31);
        boolean boolean34 = eventState4.reset((double) (byte) 0, doubleArray31);
        int int35 = eventState4.getMaxIterationCount();
        java.lang.Class<?> wildcardClass36 = eventState4.getClass();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) (byte) 100, 1);
        boolean boolean5 = eventState4.stop();
        double double6 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = eventState12.getEventHandler();
        int int14 = eventState12.getMaxIterationCount();
        double double15 = eventState12.getMaxCheckInterval();
        double double16 = eventState12.getEventTime();
        int int17 = eventState12.getMaxIterationCount();
        double double18 = eventState12.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = null;
        org.apache.commons.math.ode.events.EventState eventState24 = new org.apache.commons.math.ode.events.EventState(eventHandler20, (double) (short) 10, (double) '#', (int) (short) 0);
        int int25 = eventState24.getMaxIterationCount();
        double double26 = eventState24.getEventTime();
        boolean boolean27 = eventState24.stop();
        int int28 = eventState24.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) (short) 10, (double) '#', (int) (short) 0);
        int int35 = eventState34.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = null;
        org.apache.commons.math.ode.events.EventState eventState41 = new org.apache.commons.math.ode.events.EventState(eventHandler37, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler43 = null;
        org.apache.commons.math.ode.events.EventState eventState47 = new org.apache.commons.math.ode.events.EventState(eventHandler43, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler48 = eventState47.getEventHandler();
        double[] doubleArray55 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean56 = eventState47.reset(10.0d, doubleArray55);
        boolean boolean57 = eventState41.reset((double) 1, doubleArray55);
        boolean boolean58 = eventState34.reset((double) (-1L), doubleArray55);
        boolean boolean59 = eventState24.reset(0.0d, doubleArray55);
        boolean boolean60 = eventState12.reset((double) '#', doubleArray55);
        boolean boolean61 = eventState4.reset((double) 1.0f, doubleArray55);
        int int62 = eventState4.getMaxIterationCount();
        double double63 = eventState4.getConvergence();
        double double64 = eventState4.getMaxCheckInterval();
        double double65 = eventState4.getEventTime();
        double double66 = eventState4.getMaxCheckInterval();
        int int67 = eventState4.getMaxIterationCount();
        double double68 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNull(eventHandler13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(eventHandler48);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 100.0d + "'", double63 == 100.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.0d) + "'", double64 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        double double7 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        java.lang.Class<?> wildcardClass9 = eventState4.getClass();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) -1, Double.NaN, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getConvergence();
        boolean boolean7 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) '#', (double) 100.0f, 1);
        int int14 = eventState13.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = null;
        org.apache.commons.math.ode.events.EventState eventState20 = new org.apache.commons.math.ode.events.EventState(eventHandler16, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = eventState20.getEventHandler();
        double[] doubleArray28 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean29 = eventState20.reset(10.0d, doubleArray28);
        boolean boolean30 = eventState13.reset(0.0d, doubleArray28);
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = null;
        org.apache.commons.math.ode.events.EventState eventState36 = new org.apache.commons.math.ode.events.EventState(eventHandler32, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = eventState36.getEventHandler();
        double[] doubleArray45 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean46 = eventState36.reset(0.0d, doubleArray45);
        boolean boolean47 = eventState13.reset(Double.NaN, doubleArray45);
        boolean boolean48 = eventState4.reset((double) 10, doubleArray45);
        double double49 = eventState4.getConvergence();
        double double50 = eventState4.getMaxCheckInterval();
        double double51 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(eventHandler21);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(eventHandler37);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1L), (double) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 1.0d, (double) (short) 10, (-1));
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        int int17 = eventState16.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        double[] doubleArray31 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean32 = eventState23.reset(10.0d, doubleArray31);
        boolean boolean33 = eventState16.reset(0.0d, doubleArray31);
        boolean boolean34 = eventState10.reset((double) (byte) 0, doubleArray31);
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = null;
        org.apache.commons.math.ode.events.EventState eventState40 = new org.apache.commons.math.ode.events.EventState(eventHandler36, (double) '#', (double) 100.0f, 1);
        int int41 = eventState40.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler43 = null;
        org.apache.commons.math.ode.events.EventState eventState47 = new org.apache.commons.math.ode.events.EventState(eventHandler43, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler48 = eventState47.getEventHandler();
        double[] doubleArray55 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean56 = eventState47.reset(10.0d, doubleArray55);
        boolean boolean57 = eventState40.reset(0.0d, doubleArray55);
        org.apache.commons.math.ode.events.EventHandler eventHandler59 = null;
        org.apache.commons.math.ode.events.EventState eventState63 = new org.apache.commons.math.ode.events.EventState(eventHandler59, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler64 = eventState63.getEventHandler();
        double[] doubleArray71 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean72 = eventState63.reset(10.0d, doubleArray71);
        boolean boolean73 = eventState40.reset(10.0d, doubleArray71);
        boolean boolean74 = eventState10.reset((double) 0.0f, doubleArray71);
        org.apache.commons.math.ode.events.EventHandler eventHandler76 = null;
        org.apache.commons.math.ode.events.EventState eventState80 = new org.apache.commons.math.ode.events.EventState(eventHandler76, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler81 = eventState80.getEventHandler();
        int int82 = eventState80.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler83 = eventState80.getEventHandler();
        int int84 = eventState80.getMaxIterationCount();
        int int85 = eventState80.getMaxIterationCount();
        double[] doubleArray92 = new double[] { (-1), (-1L), 100.0d, 0, 10.0d };
        boolean boolean93 = eventState80.reset(1.0d, doubleArray92);
        boolean boolean94 = eventState10.reset(1.0d, doubleArray92);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) (-1L), doubleArray92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(eventHandler48);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(eventHandler64);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(eventHandler81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNull(eventHandler83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { (-1.0d), (-1.0d), 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double double5 = eventState4.getMaxCheckInterval();
        boolean boolean6 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = eventState16.getEventHandler();
        double[] doubleArray24 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean25 = eventState16.reset(10.0d, doubleArray24);
        boolean boolean26 = eventState10.reset((double) 1, doubleArray24);
        boolean boolean27 = eventState4.reset((double) (byte) -1, doubleArray24);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState4.getEventHandler();
        double double29 = eventState4.getConvergence();
        double double30 = eventState4.getConvergence();
        int int31 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = null;
        org.apache.commons.math.ode.events.EventState eventState37 = new org.apache.commons.math.ode.events.EventState(eventHandler33, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = eventState37.getEventHandler();
        int int39 = eventState37.getMaxIterationCount();
        double double40 = eventState37.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = null;
        org.apache.commons.math.ode.events.EventState eventState46 = new org.apache.commons.math.ode.events.EventState(eventHandler42, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler48 = null;
        org.apache.commons.math.ode.events.EventState eventState52 = new org.apache.commons.math.ode.events.EventState(eventHandler48, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler53 = eventState52.getEventHandler();
        double[] doubleArray60 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean61 = eventState52.reset(10.0d, doubleArray60);
        boolean boolean62 = eventState46.reset((double) 1, doubleArray60);
        boolean boolean63 = eventState37.reset((double) (short) 0, doubleArray60);
        int int64 = eventState37.getMaxIterationCount();
        double[] doubleArray70 = new double[] { (-1), 'a', (short) 100, (-1) };
        boolean boolean71 = eventState37.reset((double) (byte) 100, doubleArray70);
        boolean boolean72 = eventState4.reset((double) (short) 100, doubleArray70);
        org.junit.Assert.assertNull(eventHandler17);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNull(eventHandler38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 35.0d + "'", double40 == 35.0d);
        org.junit.Assert.assertNull(eventHandler53);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { (-1.0d), 97.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (-1.0d), (double) (byte) 0, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) 1L, (double) (short) 1, (int) (byte) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) (byte) -1, Double.NaN, 10);
        double double17 = eventState16.getMaxCheckInterval();
        double double18 = eventState16.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = null;
        org.apache.commons.math.ode.events.EventState eventState24 = new org.apache.commons.math.ode.events.EventState(eventHandler20, (double) (short) 10, (double) '#', (int) (short) 0);
        int int25 = eventState24.getMaxIterationCount();
        double double26 = eventState24.getEventTime();
        boolean boolean27 = eventState24.stop();
        int int28 = eventState24.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) (short) 10, (double) '#', (int) (short) 0);
        int int35 = eventState34.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = null;
        org.apache.commons.math.ode.events.EventState eventState41 = new org.apache.commons.math.ode.events.EventState(eventHandler37, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler43 = null;
        org.apache.commons.math.ode.events.EventState eventState47 = new org.apache.commons.math.ode.events.EventState(eventHandler43, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler48 = eventState47.getEventHandler();
        double[] doubleArray55 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean56 = eventState47.reset(10.0d, doubleArray55);
        boolean boolean57 = eventState41.reset((double) 1, doubleArray55);
        boolean boolean58 = eventState34.reset((double) (-1L), doubleArray55);
        boolean boolean59 = eventState24.reset(0.0d, doubleArray55);
        boolean boolean60 = eventState16.reset((double) (short) 10, doubleArray55);
        boolean boolean61 = eventState10.reset((double) 32, doubleArray55);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) 100, doubleArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(eventHandler48);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        double double9 = eventState4.getMaxCheckInterval();
        boolean boolean10 = eventState4.stop();
        double double11 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 0, 0.0d, 35);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getEventTime();
        double double7 = eventState4.getConvergence();
        java.lang.Class<?> wildcardClass8 = eventState4.getClass();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        boolean boolean11 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) (byte) 1, (double) 0L, 10);
        boolean boolean18 = eventState17.stop();
        double double19 = eventState17.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = null;
        org.apache.commons.math.ode.events.EventState eventState25 = new org.apache.commons.math.ode.events.EventState(eventHandler21, (double) '#', (double) 0L, (int) (short) -1);
        int int26 = eventState25.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = null;
        org.apache.commons.math.ode.events.EventState eventState32 = new org.apache.commons.math.ode.events.EventState(eventHandler28, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = eventState32.getEventHandler();
        double[] doubleArray41 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean42 = eventState32.reset(0.0d, doubleArray41);
        int int43 = eventState32.getMaxIterationCount();
        double double44 = eventState32.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = eventState32.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = null;
        org.apache.commons.math.ode.events.EventState eventState51 = new org.apache.commons.math.ode.events.EventState(eventHandler47, (double) '#', (double) 100.0f, 1);
        int int52 = eventState51.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler54 = null;
        org.apache.commons.math.ode.events.EventState eventState58 = new org.apache.commons.math.ode.events.EventState(eventHandler54, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler59 = eventState58.getEventHandler();
        double[] doubleArray66 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean67 = eventState58.reset(10.0d, doubleArray66);
        boolean boolean68 = eventState51.reset(0.0d, doubleArray66);
        org.apache.commons.math.ode.events.EventHandler eventHandler70 = null;
        org.apache.commons.math.ode.events.EventState eventState74 = new org.apache.commons.math.ode.events.EventState(eventHandler70, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler75 = eventState74.getEventHandler();
        double[] doubleArray83 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean84 = eventState74.reset(0.0d, doubleArray83);
        boolean boolean85 = eventState51.reset(Double.NaN, doubleArray83);
        boolean boolean86 = eventState32.reset((double) (-1), doubleArray83);
        boolean boolean87 = eventState25.reset((double) 10L, doubleArray83);
        boolean boolean88 = eventState17.reset((double) '#', doubleArray83);
        boolean boolean89 = eventState4.reset((double) (byte) 1, doubleArray83);
        double double90 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertNull(eventHandler9);
        org.junit.Assert.assertNull(eventHandler10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(eventHandler33);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertNull(eventHandler45);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNull(eventHandler59);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(eventHandler75);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) (byte) 100, 1);
        double double5 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState11.getEventHandler();
        int int13 = eventState11.getMaxIterationCount();
        double double14 = eventState11.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = null;
        org.apache.commons.math.ode.events.EventState eventState20 = new org.apache.commons.math.ode.events.EventState(eventHandler16, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = null;
        org.apache.commons.math.ode.events.EventState eventState26 = new org.apache.commons.math.ode.events.EventState(eventHandler22, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = eventState26.getEventHandler();
        double[] doubleArray34 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean35 = eventState26.reset(10.0d, doubleArray34);
        boolean boolean36 = eventState20.reset((double) 1, doubleArray34);
        boolean boolean37 = eventState11.reset((double) (short) 0, doubleArray34);
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = eventState11.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler40 = null;
        org.apache.commons.math.ode.events.EventState eventState44 = new org.apache.commons.math.ode.events.EventState(eventHandler40, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = eventState44.getEventHandler();
        double[] doubleArray52 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean53 = eventState44.reset(10.0d, doubleArray52);
        org.apache.commons.math.ode.events.EventHandler eventHandler55 = null;
        org.apache.commons.math.ode.events.EventState eventState59 = new org.apache.commons.math.ode.events.EventState(eventHandler55, (double) (short) 10, (double) '#', (int) (short) 0);
        int int60 = eventState59.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler62 = null;
        org.apache.commons.math.ode.events.EventState eventState66 = new org.apache.commons.math.ode.events.EventState(eventHandler62, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler68 = null;
        org.apache.commons.math.ode.events.EventState eventState72 = new org.apache.commons.math.ode.events.EventState(eventHandler68, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler73 = eventState72.getEventHandler();
        double[] doubleArray80 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean81 = eventState72.reset(10.0d, doubleArray80);
        boolean boolean82 = eventState66.reset((double) 1, doubleArray80);
        boolean boolean83 = eventState59.reset((double) (-1L), doubleArray80);
        boolean boolean84 = eventState44.reset((-1.0d), doubleArray80);
        boolean boolean85 = eventState11.reset((-1.0d), doubleArray80);
        boolean boolean86 = eventState4.reset((double) 10L, doubleArray80);
        double double87 = eventState4.getEventTime();
        int int88 = eventState4.getMaxIterationCount();
        boolean boolean89 = eventState4.stop();
        double double90 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNull(eventHandler12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertNull(eventHandler27);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(eventHandler38);
        org.junit.Assert.assertNull(eventHandler45);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(eventHandler73);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-1.0d) + "'", double90 == (-1.0d));
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 35.0d, 0.0d, 10);
        double double5 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        double[] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) (short) 0, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(eventHandler6);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 35.0d, (double) (short) 0, (int) (byte) -1);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = eventState16.getEventHandler();
        int int18 = eventState16.getMaxIterationCount();
        double double19 = eventState16.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = null;
        org.apache.commons.math.ode.events.EventState eventState25 = new org.apache.commons.math.ode.events.EventState(eventHandler21, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = null;
        org.apache.commons.math.ode.events.EventState eventState31 = new org.apache.commons.math.ode.events.EventState(eventHandler27, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = eventState31.getEventHandler();
        double[] doubleArray39 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean40 = eventState31.reset(10.0d, doubleArray39);
        boolean boolean41 = eventState25.reset((double) 1, doubleArray39);
        boolean boolean42 = eventState16.reset((double) (short) 0, doubleArray39);
        org.apache.commons.math.ode.events.EventHandler eventHandler43 = eventState16.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = null;
        org.apache.commons.math.ode.events.EventState eventState49 = new org.apache.commons.math.ode.events.EventState(eventHandler45, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler50 = eventState49.getEventHandler();
        double[] doubleArray57 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean58 = eventState49.reset(10.0d, doubleArray57);
        org.apache.commons.math.ode.events.EventHandler eventHandler60 = null;
        org.apache.commons.math.ode.events.EventState eventState64 = new org.apache.commons.math.ode.events.EventState(eventHandler60, (double) (short) 10, (double) '#', (int) (short) 0);
        int int65 = eventState64.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler67 = null;
        org.apache.commons.math.ode.events.EventState eventState71 = new org.apache.commons.math.ode.events.EventState(eventHandler67, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler73 = null;
        org.apache.commons.math.ode.events.EventState eventState77 = new org.apache.commons.math.ode.events.EventState(eventHandler73, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler78 = eventState77.getEventHandler();
        double[] doubleArray85 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean86 = eventState77.reset(10.0d, doubleArray85);
        boolean boolean87 = eventState71.reset((double) 1, doubleArray85);
        boolean boolean88 = eventState64.reset((double) (-1L), doubleArray85);
        boolean boolean89 = eventState49.reset((-1.0d), doubleArray85);
        boolean boolean90 = eventState16.reset((-1.0d), doubleArray85);
        boolean boolean91 = eventState10.reset((double) (-1), doubleArray85);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) 10L, doubleArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertNull(eventHandler32);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(eventHandler43);
        org.junit.Assert.assertNull(eventHandler50);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(eventHandler78);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 0.0d, 0.0d, (int) 'a');
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 100.0f, (double) 1, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (short) 10, (double) '#', (int) (short) 0);
        int int11 = eventState10.getMaxIterationCount();
        double double12 = eventState10.getConvergence();
        int int13 = eventState10.getMaxIterationCount();
        int int14 = eventState10.getMaxIterationCount();
        boolean boolean15 = eventState10.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, 100.0d, (double) (short) 1, (int) (byte) -1);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState27.getEventHandler();
        double[] doubleArray35 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean36 = eventState27.reset(10.0d, doubleArray35);
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = null;
        org.apache.commons.math.ode.events.EventState eventState42 = new org.apache.commons.math.ode.events.EventState(eventHandler38, (double) (short) 10, (double) '#', (int) (short) 0);
        int int43 = eventState42.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = null;
        org.apache.commons.math.ode.events.EventState eventState49 = new org.apache.commons.math.ode.events.EventState(eventHandler45, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler51 = null;
        org.apache.commons.math.ode.events.EventState eventState55 = new org.apache.commons.math.ode.events.EventState(eventHandler51, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler56 = eventState55.getEventHandler();
        double[] doubleArray63 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean64 = eventState55.reset(10.0d, doubleArray63);
        boolean boolean65 = eventState49.reset((double) 1, doubleArray63);
        boolean boolean66 = eventState42.reset((double) (-1L), doubleArray63);
        boolean boolean67 = eventState27.reset((-1.0d), doubleArray63);
        boolean boolean68 = eventState21.reset((double) (-1.0f), doubleArray63);
        boolean boolean69 = eventState10.reset((double) (-1.0f), doubleArray63);
        boolean boolean70 = eventState4.reset((double) 0, doubleArray63);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(eventHandler56);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        int int8 = eventState4.getMaxIterationCount();
        double double9 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = null;
        org.apache.commons.math.ode.events.EventState eventState15 = new org.apache.commons.math.ode.events.EventState(eventHandler11, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = eventState21.getEventHandler();
        double[] doubleArray29 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean30 = eventState21.reset(10.0d, doubleArray29);
        boolean boolean31 = eventState15.reset((double) 1, doubleArray29);
        boolean boolean32 = eventState4.reset((double) (short) -1, doubleArray29);
        double double33 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = eventState4.getEventHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass35 = eventHandler34.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNull(eventHandler22);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 35.0d + "'", double33 == 35.0d);
        org.junit.Assert.assertNull(eventHandler34);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 0.0f, Double.NaN, 97);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 10.0d, (double) 'a', (int) 'a');
        int int5 = eventState4.getMaxIterationCount();
        double[] doubleArray7 = null;
        boolean boolean8 = eventState4.reset((double) (short) 100, doubleArray7);
        java.lang.Class<?> wildcardClass9 = eventState4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        boolean boolean8 = eventState4.stop();
        int int9 = eventState4.getMaxIterationCount();
        double double10 = eventState4.getMaxCheckInterval();
        double double11 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) -1, Double.NaN, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getConvergence();
        double double7 = eventState4.getConvergence();
        int int8 = eventState4.getMaxIterationCount();
        double double9 = eventState4.getEventTime();
        boolean boolean10 = eventState4.stop();
        int int11 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) 0, (double) 'a', (int) '4');
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        double[] doubleArray32 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean33 = eventState23.reset(0.0d, doubleArray32);
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = eventState23.getEventHandler();
        double double35 = eventState23.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = null;
        org.apache.commons.math.ode.events.EventState eventState41 = new org.apache.commons.math.ode.events.EventState(eventHandler37, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = eventState41.getEventHandler();
        double[] doubleArray49 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean50 = eventState41.reset(10.0d, doubleArray49);
        boolean boolean51 = eventState23.reset((double) 10L, doubleArray49);
        boolean boolean52 = eventState17.reset(100.0d, doubleArray49);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) (-1), doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(eventHandler34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertNull(eventHandler42);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, 97.0d, (int) (short) 0);
        boolean boolean5 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) 100.0f, (double) 10, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = eventState17.getEventHandler();
        int int19 = eventState17.getMaxIterationCount();
        double double20 = eventState17.getMaxCheckInterval();
        double double21 = eventState17.getEventTime();
        double double22 = eventState17.getEventTime();
        boolean boolean23 = eventState17.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = null;
        org.apache.commons.math.ode.events.EventState eventState29 = new org.apache.commons.math.ode.events.EventState(eventHandler25, (double) '#', (double) 100.0f, 1);
        int int30 = eventState29.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = null;
        org.apache.commons.math.ode.events.EventState eventState36 = new org.apache.commons.math.ode.events.EventState(eventHandler32, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = eventState36.getEventHandler();
        double[] doubleArray44 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean45 = eventState36.reset(10.0d, doubleArray44);
        boolean boolean46 = eventState29.reset(0.0d, doubleArray44);
        boolean boolean47 = eventState17.reset((double) (byte) 0, doubleArray44);
        boolean boolean48 = eventState11.reset(0.0d, doubleArray44);
        int int49 = eventState11.getMaxIterationCount();
        double double50 = eventState11.getConvergence();
        double double51 = eventState11.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler53 = null;
        org.apache.commons.math.ode.events.EventState eventState57 = new org.apache.commons.math.ode.events.EventState(eventHandler53, (double) (byte) -1, Double.NaN, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler58 = eventState57.getEventHandler();
        double double59 = eventState57.getConvergence();
        double double60 = eventState57.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler62 = null;
        org.apache.commons.math.ode.events.EventState eventState66 = new org.apache.commons.math.ode.events.EventState(eventHandler62, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler67 = eventState66.getEventHandler();
        double double68 = eventState66.getMaxCheckInterval();
        int int69 = eventState66.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler71 = null;
        org.apache.commons.math.ode.events.EventState eventState75 = new org.apache.commons.math.ode.events.EventState(eventHandler71, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler76 = eventState75.getEventHandler();
        int int77 = eventState75.getMaxIterationCount();
        double double78 = eventState75.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler80 = null;
        org.apache.commons.math.ode.events.EventState eventState84 = new org.apache.commons.math.ode.events.EventState(eventHandler80, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler85 = eventState84.getEventHandler();
        double[] doubleArray92 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean93 = eventState84.reset(10.0d, doubleArray92);
        boolean boolean94 = eventState75.reset((double) (byte) 1, doubleArray92);
        boolean boolean95 = eventState66.reset((double) (byte) 10, doubleArray92);
        boolean boolean96 = eventState57.reset((double) (byte) 100, doubleArray92);
        boolean boolean97 = eventState11.reset(1.0d, doubleArray92);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) (short) -1, doubleArray92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(eventHandler18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(eventHandler37);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNull(eventHandler58);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNull(eventHandler67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 35.0d + "'", double68 == 35.0d);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNull(eventHandler76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 35.0d + "'", double78 == 35.0d);
        org.junit.Assert.assertNull(eventHandler85);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double double5 = eventState4.getMaxCheckInterval();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getConvergence();
        boolean boolean8 = eventState4.stop();
        int int9 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = null;
        org.apache.commons.math.ode.events.EventState eventState15 = new org.apache.commons.math.ode.events.EventState(eventHandler11, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = eventState15.getEventHandler();
        int int17 = eventState15.getMaxIterationCount();
        double double18 = eventState15.getMaxCheckInterval();
        double double19 = eventState15.getEventTime();
        int int20 = eventState15.getMaxIterationCount();
        double double21 = eventState15.getConvergence();
        boolean boolean22 = eventState15.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = null;
        org.apache.commons.math.ode.events.EventState eventState28 = new org.apache.commons.math.ode.events.EventState(eventHandler24, (double) (byte) -1, Double.NaN, 10);
        double double29 = eventState28.getMaxCheckInterval();
        double double30 = eventState28.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = null;
        org.apache.commons.math.ode.events.EventState eventState36 = new org.apache.commons.math.ode.events.EventState(eventHandler32, (double) (short) 10, (double) '#', (int) (short) 0);
        int int37 = eventState36.getMaxIterationCount();
        double double38 = eventState36.getEventTime();
        boolean boolean39 = eventState36.stop();
        int int40 = eventState36.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = null;
        org.apache.commons.math.ode.events.EventState eventState46 = new org.apache.commons.math.ode.events.EventState(eventHandler42, (double) (short) 10, (double) '#', (int) (short) 0);
        int int47 = eventState46.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler49 = null;
        org.apache.commons.math.ode.events.EventState eventState53 = new org.apache.commons.math.ode.events.EventState(eventHandler49, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler55 = null;
        org.apache.commons.math.ode.events.EventState eventState59 = new org.apache.commons.math.ode.events.EventState(eventHandler55, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler60 = eventState59.getEventHandler();
        double[] doubleArray67 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean68 = eventState59.reset(10.0d, doubleArray67);
        boolean boolean69 = eventState53.reset((double) 1, doubleArray67);
        boolean boolean70 = eventState46.reset((double) (-1L), doubleArray67);
        boolean boolean71 = eventState36.reset(0.0d, doubleArray67);
        boolean boolean72 = eventState28.reset((double) (short) 10, doubleArray67);
        boolean boolean73 = eventState15.reset((double) (-1L), doubleArray67);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) (short) 10, doubleArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(eventHandler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(eventHandler60);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getMaxCheckInterval();
        double double10 = eventState4.getConvergence();
        double double11 = eventState4.getEventTime();
        java.lang.Class<?> wildcardClass12 = eventState4.getClass();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray12 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean13 = eventState4.reset(10.0d, doubleArray12);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) (short) 10, (double) '#', (int) (short) 0);
        int int20 = eventState19.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = null;
        org.apache.commons.math.ode.events.EventState eventState26 = new org.apache.commons.math.ode.events.EventState(eventHandler22, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = null;
        org.apache.commons.math.ode.events.EventState eventState32 = new org.apache.commons.math.ode.events.EventState(eventHandler28, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = eventState32.getEventHandler();
        double[] doubleArray40 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean41 = eventState32.reset(10.0d, doubleArray40);
        boolean boolean42 = eventState26.reset((double) 1, doubleArray40);
        boolean boolean43 = eventState19.reset((double) (-1L), doubleArray40);
        boolean boolean44 = eventState4.reset((-1.0d), doubleArray40);
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = eventState4.getEventHandler();
        boolean boolean46 = eventState4.stop();
        double double47 = eventState4.getMaxCheckInterval();
        boolean boolean48 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler49 = eventState4.getEventHandler();
        double double50 = eventState4.getEventTime();
        double double51 = eventState4.getConvergence();
        double double52 = eventState4.getConvergence();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(eventHandler33);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(eventHandler45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 35.0d + "'", double47 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(eventHandler49);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 97, 52.0d, (int) (byte) 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, 100.0d, (double) (-1), (int) (byte) -1);
        double double12 = eventState11.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = null;
        org.apache.commons.math.ode.events.EventState eventState18 = new org.apache.commons.math.ode.events.EventState(eventHandler14, (double) (byte) 10, (double) (byte) 1, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = null;
        org.apache.commons.math.ode.events.EventState eventState24 = new org.apache.commons.math.ode.events.EventState(eventHandler20, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = eventState24.getEventHandler();
        int int26 = eventState24.getMaxIterationCount();
        double double27 = eventState24.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler29 = null;
        org.apache.commons.math.ode.events.EventState eventState33 = new org.apache.commons.math.ode.events.EventState(eventHandler29, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = null;
        org.apache.commons.math.ode.events.EventState eventState39 = new org.apache.commons.math.ode.events.EventState(eventHandler35, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler40 = eventState39.getEventHandler();
        double[] doubleArray47 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean48 = eventState39.reset(10.0d, doubleArray47);
        boolean boolean49 = eventState33.reset((double) 1, doubleArray47);
        boolean boolean50 = eventState24.reset((double) (short) 0, doubleArray47);
        int int51 = eventState24.getMaxIterationCount();
        double double52 = eventState24.getMaxCheckInterval();
        double double53 = eventState24.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler55 = null;
        org.apache.commons.math.ode.events.EventState eventState59 = new org.apache.commons.math.ode.events.EventState(eventHandler55, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler61 = null;
        org.apache.commons.math.ode.events.EventState eventState65 = new org.apache.commons.math.ode.events.EventState(eventHandler61, (double) '#', (double) 100.0f, 1);
        int int66 = eventState65.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler68 = null;
        org.apache.commons.math.ode.events.EventState eventState72 = new org.apache.commons.math.ode.events.EventState(eventHandler68, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler73 = eventState72.getEventHandler();
        double[] doubleArray80 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean81 = eventState72.reset(10.0d, doubleArray80);
        boolean boolean82 = eventState65.reset(0.0d, doubleArray80);
        boolean boolean83 = eventState59.reset((double) (byte) 0, doubleArray80);
        boolean boolean84 = eventState24.reset(52.0d, doubleArray80);
        boolean boolean85 = eventState18.reset((double) 10.0f, doubleArray80);
        boolean boolean86 = eventState11.reset((double) 0, doubleArray80);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) 0.0f, doubleArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNull(eventHandler25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
        org.junit.Assert.assertNull(eventHandler40);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 35.0d + "'", double52 == 35.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNull(eventHandler73);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 10.0d, (double) 1.0f, (int) (short) 100);
        double double5 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) (short) 10, (double) '#', (int) (short) 0);
        int int12 = eventState11.getMaxIterationCount();
        double double13 = eventState11.getEventTime();
        boolean boolean14 = eventState11.stop();
        double double15 = eventState11.getEventTime();
        boolean boolean16 = eventState11.stop();
        double double17 = eventState11.getEventTime();
        double double18 = eventState11.getMaxCheckInterval();
        boolean boolean19 = eventState11.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = null;
        org.apache.commons.math.ode.events.EventState eventState25 = new org.apache.commons.math.ode.events.EventState(eventHandler21, (double) (short) 10, (double) '#', (int) (short) 0);
        int int26 = eventState25.getMaxIterationCount();
        double double27 = eventState25.getEventTime();
        boolean boolean28 = eventState25.stop();
        double double29 = eventState25.getEventTime();
        boolean boolean30 = eventState25.stop();
        double double31 = eventState25.getConvergence();
        double double32 = eventState25.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = null;
        org.apache.commons.math.ode.events.EventState eventState38 = new org.apache.commons.math.ode.events.EventState(eventHandler34, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray44 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean45 = eventState38.reset((double) (byte) 100, doubleArray44);
        boolean boolean46 = eventState25.reset((double) '#', doubleArray44);
        boolean boolean47 = eventState11.reset((double) (byte) 0, doubleArray44);
        boolean boolean48 = eventState4.reset((double) (-1L), doubleArray44);
        int int49 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        double double7 = eventState4.getEventTime();
        double double8 = eventState4.getMaxCheckInterval();
        boolean boolean9 = eventState4.stop();
        double double10 = eventState4.getMaxCheckInterval();
        double double11 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState4.getEventHandler();
        boolean boolean13 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNull(eventHandler12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) ' ', 97.0d, (int) (short) 1);
        double double5 = eventState4.getEventTime();
        double double6 = eventState4.getConvergence();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', 0.0d, 100);
        double double5 = eventState4.getEventTime();
        double double6 = eventState4.getEventTime();
        double double7 = eventState4.getEventTime();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getConvergence();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, 0.0d, (int) (byte) 100);
        double double5 = eventState4.getEventTime();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 10, 0.0d, 1);
        boolean boolean5 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) (short) 10, (double) '#', (int) (short) 0);
        int int12 = eventState11.getMaxIterationCount();
        double double13 = eventState11.getEventTime();
        boolean boolean14 = eventState11.stop();
        double double15 = eventState11.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) 100.0f, (double) 10, 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState27.getEventHandler();
        int int29 = eventState27.getMaxIterationCount();
        double double30 = eventState27.getMaxCheckInterval();
        double double31 = eventState27.getEventTime();
        double double32 = eventState27.getEventTime();
        boolean boolean33 = eventState27.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler35 = null;
        org.apache.commons.math.ode.events.EventState eventState39 = new org.apache.commons.math.ode.events.EventState(eventHandler35, (double) '#', (double) 100.0f, 1);
        int int40 = eventState39.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = null;
        org.apache.commons.math.ode.events.EventState eventState46 = new org.apache.commons.math.ode.events.EventState(eventHandler42, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = eventState46.getEventHandler();
        double[] doubleArray54 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean55 = eventState46.reset(10.0d, doubleArray54);
        boolean boolean56 = eventState39.reset(0.0d, doubleArray54);
        boolean boolean57 = eventState27.reset((double) (byte) 0, doubleArray54);
        boolean boolean58 = eventState21.reset(0.0d, doubleArray54);
        boolean boolean59 = eventState11.reset(100.0d, doubleArray54);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) 97, doubleArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNull(eventHandler47);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        int int5 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState11.getEventHandler();
        double[] doubleArray19 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean20 = eventState11.reset(10.0d, doubleArray19);
        boolean boolean21 = eventState4.reset((double) '#', doubleArray19);
        boolean boolean22 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(eventHandler12);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        int int8 = eventState4.getMaxIterationCount();
        int int9 = eventState4.getMaxIterationCount();
        int int10 = eventState4.getMaxIterationCount();
        int int11 = eventState4.getMaxIterationCount();
        int int12 = eventState4.getMaxIterationCount();
        double double13 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        int int21 = eventState19.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = eventState19.getEventHandler();
        int int23 = eventState19.getMaxIterationCount();
        int int24 = eventState19.getMaxIterationCount();
        double[] doubleArray31 = new double[] { (-1), (-1L), 100.0d, 0, 10.0d };
        boolean boolean32 = eventState19.reset(1.0d, doubleArray31);
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = null;
        org.apache.commons.math.ode.events.EventState eventState38 = new org.apache.commons.math.ode.events.EventState(eventHandler34, (double) (-1), (double) '#', (int) (byte) 1);
        boolean boolean39 = eventState38.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler41 = null;
        org.apache.commons.math.ode.events.EventState eventState45 = new org.apache.commons.math.ode.events.EventState(eventHandler41, (double) (short) 10, (double) '#', (int) (short) 0);
        int int46 = eventState45.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler48 = null;
        org.apache.commons.math.ode.events.EventState eventState52 = new org.apache.commons.math.ode.events.EventState(eventHandler48, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler54 = null;
        org.apache.commons.math.ode.events.EventState eventState58 = new org.apache.commons.math.ode.events.EventState(eventHandler54, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler59 = eventState58.getEventHandler();
        double[] doubleArray66 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean67 = eventState58.reset(10.0d, doubleArray66);
        boolean boolean68 = eventState52.reset((double) 1, doubleArray66);
        boolean boolean69 = eventState45.reset((double) (-1L), doubleArray66);
        boolean boolean70 = eventState38.reset((double) (byte) 10, doubleArray66);
        boolean boolean71 = eventState19.reset((double) 0L, doubleArray66);
        boolean boolean72 = eventState4.reset((double) 0.0f, doubleArray66);
        double double73 = eventState4.getEventTime();
        int int74 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(eventHandler22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { (-1.0d), (-1.0d), 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(eventHandler59);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 100, (double) 1L, (int) (byte) -1);
        double double5 = eventState4.getMaxCheckInterval();
        boolean boolean6 = eventState4.stop();
        double double7 = eventState4.getConvergence();
        double double8 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 0, 0.0d, 35);
        double double5 = eventState4.getMaxCheckInterval();
        double double6 = eventState4.getConvergence();
        double double7 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 1, (double) (byte) 100, (int) (byte) 1);
        double double5 = eventState4.getEventTime();
        double double6 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = null;
        org.apache.commons.math.ode.events.EventState eventState12 = new org.apache.commons.math.ode.events.EventState(eventHandler8, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = eventState12.getEventHandler();
        double[] doubleArray20 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean21 = eventState12.reset(10.0d, doubleArray20);
        int int22 = eventState12.getMaxIterationCount();
        double double23 = eventState12.getConvergence();
        double double24 = eventState12.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler26 = null;
        org.apache.commons.math.ode.events.EventState eventState30 = new org.apache.commons.math.ode.events.EventState(eventHandler26, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = null;
        org.apache.commons.math.ode.events.EventState eventState36 = new org.apache.commons.math.ode.events.EventState(eventHandler32, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = null;
        org.apache.commons.math.ode.events.EventState eventState42 = new org.apache.commons.math.ode.events.EventState(eventHandler38, (double) '#', (double) 100.0f, 1);
        int int43 = eventState42.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = null;
        org.apache.commons.math.ode.events.EventState eventState49 = new org.apache.commons.math.ode.events.EventState(eventHandler45, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler50 = eventState49.getEventHandler();
        double[] doubleArray57 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean58 = eventState49.reset(10.0d, doubleArray57);
        boolean boolean59 = eventState42.reset(0.0d, doubleArray57);
        boolean boolean60 = eventState36.reset((double) (byte) 0, doubleArray57);
        boolean boolean61 = eventState30.reset(Double.NaN, doubleArray57);
        boolean boolean62 = eventState12.reset((double) 0L, doubleArray57);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) 100.0f, doubleArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNull(eventHandler13);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(eventHandler50);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double double5 = eventState4.getMaxCheckInterval();
        double double6 = eventState4.getMaxCheckInterval();
        int int7 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = eventState13.getEventHandler();
        double[] doubleArray22 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean23 = eventState13.reset(0.0d, doubleArray22);
        boolean boolean24 = eventState4.reset((double) (byte) 1, doubleArray22);
        boolean boolean25 = eventState4.stop();
        double double26 = eventState4.getMaxCheckInterval();
        double double27 = eventState4.getMaxCheckInterval();
        int int28 = eventState4.getMaxIterationCount();
        double double29 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = null;
        org.apache.commons.math.ode.events.EventState eventState36 = new org.apache.commons.math.ode.events.EventState(eventHandler32, (double) (short) 10, (double) '#', (int) (short) 0);
        int int37 = eventState36.getMaxIterationCount();
        double double38 = eventState36.getEventTime();
        boolean boolean39 = eventState36.stop();
        double double40 = eventState36.getEventTime();
        boolean boolean41 = eventState36.stop();
        double double42 = eventState36.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler43 = eventState36.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = null;
        org.apache.commons.math.ode.events.EventState eventState49 = new org.apache.commons.math.ode.events.EventState(eventHandler45, (double) (-1), (double) '#', (int) (byte) 1);
        boolean boolean50 = eventState49.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler52 = null;
        org.apache.commons.math.ode.events.EventState eventState56 = new org.apache.commons.math.ode.events.EventState(eventHandler52, (double) (short) 10, (double) '#', (int) (short) 0);
        int int57 = eventState56.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler59 = null;
        org.apache.commons.math.ode.events.EventState eventState63 = new org.apache.commons.math.ode.events.EventState(eventHandler59, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler65 = null;
        org.apache.commons.math.ode.events.EventState eventState69 = new org.apache.commons.math.ode.events.EventState(eventHandler65, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler70 = eventState69.getEventHandler();
        double[] doubleArray77 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean78 = eventState69.reset(10.0d, doubleArray77);
        boolean boolean79 = eventState63.reset((double) 1, doubleArray77);
        boolean boolean80 = eventState56.reset((double) (-1L), doubleArray77);
        boolean boolean81 = eventState49.reset((double) (byte) 10, doubleArray77);
        boolean boolean82 = eventState36.reset(1.0d, doubleArray77);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) (byte) 0, doubleArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(eventHandler14);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNull(eventHandler30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNull(eventHandler43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(eventHandler70);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getEventTime();
        int int10 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState4.getEventHandler();
        boolean boolean12 = eventState4.stop();
        boolean boolean13 = eventState4.stop();
        boolean boolean14 = eventState4.stop();
        int int15 = eventState4.getMaxIterationCount();
        double double16 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 0L, (double) 100L, (int) (byte) 1);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) ' ', (double) 1.0f, (int) 'a');
        double double5 = eventState4.getConvergence();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) '4', (double) (short) 10, (int) (short) 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = eventState13.getEventHandler();
        double double15 = eventState13.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = null;
        org.apache.commons.math.ode.events.EventState eventState21 = new org.apache.commons.math.ode.events.EventState(eventHandler17, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = eventState21.getEventHandler();
        double double23 = eventState21.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = null;
        org.apache.commons.math.ode.events.EventState eventState29 = new org.apache.commons.math.ode.events.EventState(eventHandler25, (double) (-1), (double) (byte) 100, 1);
        boolean boolean30 = eventState29.stop();
        double double31 = eventState29.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = null;
        org.apache.commons.math.ode.events.EventState eventState37 = new org.apache.commons.math.ode.events.EventState(eventHandler33, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = eventState37.getEventHandler();
        int int39 = eventState37.getMaxIterationCount();
        double double40 = eventState37.getMaxCheckInterval();
        double double41 = eventState37.getEventTime();
        int int42 = eventState37.getMaxIterationCount();
        double double43 = eventState37.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = null;
        org.apache.commons.math.ode.events.EventState eventState49 = new org.apache.commons.math.ode.events.EventState(eventHandler45, (double) (short) 10, (double) '#', (int) (short) 0);
        int int50 = eventState49.getMaxIterationCount();
        double double51 = eventState49.getEventTime();
        boolean boolean52 = eventState49.stop();
        int int53 = eventState49.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler55 = null;
        org.apache.commons.math.ode.events.EventState eventState59 = new org.apache.commons.math.ode.events.EventState(eventHandler55, (double) (short) 10, (double) '#', (int) (short) 0);
        int int60 = eventState59.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler62 = null;
        org.apache.commons.math.ode.events.EventState eventState66 = new org.apache.commons.math.ode.events.EventState(eventHandler62, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler68 = null;
        org.apache.commons.math.ode.events.EventState eventState72 = new org.apache.commons.math.ode.events.EventState(eventHandler68, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler73 = eventState72.getEventHandler();
        double[] doubleArray80 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean81 = eventState72.reset(10.0d, doubleArray80);
        boolean boolean82 = eventState66.reset((double) 1, doubleArray80);
        boolean boolean83 = eventState59.reset((double) (-1L), doubleArray80);
        boolean boolean84 = eventState49.reset(0.0d, doubleArray80);
        boolean boolean85 = eventState37.reset((double) '#', doubleArray80);
        boolean boolean86 = eventState29.reset((double) 1.0f, doubleArray80);
        boolean boolean87 = eventState21.reset(1.0d, doubleArray80);
        boolean boolean88 = eventState13.reset((double) 100L, doubleArray80);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) (short) 100, doubleArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertNull(eventHandler14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(eventHandler22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNull(eventHandler38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 35.0d + "'", double40 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 35.0d + "'", double43 == 35.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(eventHandler73);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getEventTime();
        int int10 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState4.getEventHandler();
        boolean boolean12 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = null;
        org.apache.commons.math.ode.events.EventState eventState18 = new org.apache.commons.math.ode.events.EventState(eventHandler14, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = eventState18.getEventHandler();
        int int20 = eventState18.getMaxIterationCount();
        double double21 = eventState18.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = null;
        org.apache.commons.math.ode.events.EventState eventState27 = new org.apache.commons.math.ode.events.EventState(eventHandler23, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler29 = null;
        org.apache.commons.math.ode.events.EventState eventState33 = new org.apache.commons.math.ode.events.EventState(eventHandler29, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = eventState33.getEventHandler();
        double[] doubleArray41 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean42 = eventState33.reset(10.0d, doubleArray41);
        boolean boolean43 = eventState27.reset((double) 1, doubleArray41);
        boolean boolean44 = eventState18.reset((double) (short) 0, doubleArray41);
        int int45 = eventState18.getMaxIterationCount();
        double double46 = eventState18.getMaxCheckInterval();
        double double47 = eventState18.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler49 = null;
        org.apache.commons.math.ode.events.EventState eventState53 = new org.apache.commons.math.ode.events.EventState(eventHandler49, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler55 = null;
        org.apache.commons.math.ode.events.EventState eventState59 = new org.apache.commons.math.ode.events.EventState(eventHandler55, (double) '#', (double) 100.0f, 1);
        int int60 = eventState59.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler62 = null;
        org.apache.commons.math.ode.events.EventState eventState66 = new org.apache.commons.math.ode.events.EventState(eventHandler62, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler67 = eventState66.getEventHandler();
        double[] doubleArray74 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean75 = eventState66.reset(10.0d, doubleArray74);
        boolean boolean76 = eventState59.reset(0.0d, doubleArray74);
        boolean boolean77 = eventState53.reset((double) (byte) 0, doubleArray74);
        boolean boolean78 = eventState18.reset(52.0d, doubleArray74);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin(Double.NaN, doubleArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(eventHandler19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertNull(eventHandler34);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 35.0d + "'", double46 == 35.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNull(eventHandler67);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) 0.0f, 100);
        boolean boolean5 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        double double7 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(eventHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = eventState13.getEventHandler();
        double[] doubleArray21 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean22 = eventState13.reset(10.0d, doubleArray21);
        boolean boolean23 = eventState4.reset((double) (byte) 1, doubleArray21);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState4.getEventHandler();
        double double25 = eventState4.getMaxCheckInterval();
        boolean boolean26 = eventState4.stop();
        double double27 = eventState4.getMaxCheckInterval();
        double double28 = eventState4.getConvergence();
        double double29 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler14);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 35.0d + "'", double25 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) 0.0f, 100);
        int int5 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        boolean boolean8 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(eventHandler6);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) -1, Double.NaN, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        int int7 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        double[] doubleArray27 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean28 = eventState19.reset(10.0d, doubleArray27);
        boolean boolean29 = eventState13.reset((double) 1, doubleArray27);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) 100.0f, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNull(eventHandler6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 100, (double) 97, (int) (short) -1);
        double double5 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, 0.0d, (double) (byte) -1, 0);
        int int12 = eventState11.getMaxIterationCount();
        double double13 = eventState11.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray25 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean26 = eventState19.reset((double) (byte) 100, doubleArray25);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = null;
        org.apache.commons.math.ode.events.EventState eventState32 = new org.apache.commons.math.ode.events.EventState(eventHandler28, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = eventState32.getEventHandler();
        double[] doubleArray41 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean42 = eventState32.reset(0.0d, doubleArray41);
        int int43 = eventState32.getMaxIterationCount();
        double double44 = eventState32.getMaxCheckInterval();
        double double45 = eventState32.getConvergence();
        boolean boolean46 = eventState32.stop();
        double double47 = eventState32.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler49 = null;
        org.apache.commons.math.ode.events.EventState eventState53 = new org.apache.commons.math.ode.events.EventState(eventHandler49, (double) (short) 10, (double) '#', (int) (short) 0);
        int int54 = eventState53.getMaxIterationCount();
        double double55 = eventState53.getEventTime();
        boolean boolean56 = eventState53.stop();
        int int57 = eventState53.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler59 = null;
        org.apache.commons.math.ode.events.EventState eventState63 = new org.apache.commons.math.ode.events.EventState(eventHandler59, (double) (short) 10, (double) '#', (int) (short) 0);
        int int64 = eventState63.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler66 = null;
        org.apache.commons.math.ode.events.EventState eventState70 = new org.apache.commons.math.ode.events.EventState(eventHandler66, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler72 = null;
        org.apache.commons.math.ode.events.EventState eventState76 = new org.apache.commons.math.ode.events.EventState(eventHandler72, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler77 = eventState76.getEventHandler();
        double[] doubleArray84 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean85 = eventState76.reset(10.0d, doubleArray84);
        boolean boolean86 = eventState70.reset((double) 1, doubleArray84);
        boolean boolean87 = eventState63.reset((double) (-1L), doubleArray84);
        boolean boolean88 = eventState53.reset(0.0d, doubleArray84);
        boolean boolean89 = eventState32.reset((double) 1.0f, doubleArray84);
        boolean boolean90 = eventState19.reset(100.0d, doubleArray84);
        boolean boolean91 = eventState11.reset((double) 0.0f, doubleArray84);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.reinitializeBegin((double) (byte) -1, doubleArray84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(eventHandler33);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 35.0d + "'", double44 == 35.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(eventHandler77);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 100.0d, (double) (byte) -1, 10);
        double double5 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) (-1), (double) '#', (int) (byte) 1);
        double[] doubleArray17 = new double[] { 100L, (byte) 0, 1, 0.0f };
        boolean boolean18 = eventState11.reset((double) (byte) 100, doubleArray17);
        double double19 = eventState11.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState11.getEventHandler();
        boolean boolean21 = eventState11.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = eventState11.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = null;
        org.apache.commons.math.ode.events.EventState eventState28 = new org.apache.commons.math.ode.events.EventState(eventHandler24, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler29 = eventState28.getEventHandler();
        double[] doubleArray37 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean38 = eventState28.reset(0.0d, doubleArray37);
        int int39 = eventState28.getMaxIterationCount();
        double double40 = eventState28.getMaxCheckInterval();
        double double41 = eventState28.getConvergence();
        boolean boolean42 = eventState28.stop();
        double double43 = eventState28.getEventTime();
        boolean boolean44 = eventState28.stop();
        double double45 = eventState28.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = null;
        org.apache.commons.math.ode.events.EventState eventState51 = new org.apache.commons.math.ode.events.EventState(eventHandler47, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler53 = null;
        org.apache.commons.math.ode.events.EventState eventState57 = new org.apache.commons.math.ode.events.EventState(eventHandler53, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler59 = null;
        org.apache.commons.math.ode.events.EventState eventState63 = new org.apache.commons.math.ode.events.EventState(eventHandler59, (double) '#', (double) 100.0f, 1);
        int int64 = eventState63.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler66 = null;
        org.apache.commons.math.ode.events.EventState eventState70 = new org.apache.commons.math.ode.events.EventState(eventHandler66, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler71 = eventState70.getEventHandler();
        double[] doubleArray78 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean79 = eventState70.reset(10.0d, doubleArray78);
        boolean boolean80 = eventState63.reset(0.0d, doubleArray78);
        boolean boolean81 = eventState57.reset((double) (byte) 0, doubleArray78);
        boolean boolean82 = eventState51.reset(Double.NaN, doubleArray78);
        boolean boolean83 = eventState28.reset((double) 1, doubleArray78);
        boolean boolean84 = eventState11.reset((double) (short) 10, doubleArray78);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) 1, doubleArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(eventHandler22);
        org.junit.Assert.assertNull(eventHandler29);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 35.0d + "'", double40 == 35.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNull(eventHandler71);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 'a', 35.0d, (int) (byte) 0);
        boolean boolean5 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState11.getEventHandler();
        int int13 = eventState11.getMaxIterationCount();
        double double14 = eventState11.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = eventState11.getEventHandler();
        double double16 = eventState11.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = null;
        org.apache.commons.math.ode.events.EventState eventState22 = new org.apache.commons.math.ode.events.EventState(eventHandler18, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = eventState22.getEventHandler();
        int int24 = eventState22.getMaxIterationCount();
        double double25 = eventState22.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = null;
        org.apache.commons.math.ode.events.EventState eventState31 = new org.apache.commons.math.ode.events.EventState(eventHandler27, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = null;
        org.apache.commons.math.ode.events.EventState eventState37 = new org.apache.commons.math.ode.events.EventState(eventHandler33, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = eventState37.getEventHandler();
        double[] doubleArray45 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean46 = eventState37.reset(10.0d, doubleArray45);
        boolean boolean47 = eventState31.reset((double) 1, doubleArray45);
        boolean boolean48 = eventState22.reset((double) (short) 0, doubleArray45);
        org.apache.commons.math.ode.events.EventHandler eventHandler49 = eventState22.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler51 = null;
        org.apache.commons.math.ode.events.EventState eventState55 = new org.apache.commons.math.ode.events.EventState(eventHandler51, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler56 = eventState55.getEventHandler();
        double[] doubleArray63 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean64 = eventState55.reset(10.0d, doubleArray63);
        org.apache.commons.math.ode.events.EventHandler eventHandler66 = null;
        org.apache.commons.math.ode.events.EventState eventState70 = new org.apache.commons.math.ode.events.EventState(eventHandler66, (double) (short) 10, (double) '#', (int) (short) 0);
        int int71 = eventState70.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler73 = null;
        org.apache.commons.math.ode.events.EventState eventState77 = new org.apache.commons.math.ode.events.EventState(eventHandler73, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler79 = null;
        org.apache.commons.math.ode.events.EventState eventState83 = new org.apache.commons.math.ode.events.EventState(eventHandler79, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler84 = eventState83.getEventHandler();
        double[] doubleArray91 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean92 = eventState83.reset(10.0d, doubleArray91);
        boolean boolean93 = eventState77.reset((double) 1, doubleArray91);
        boolean boolean94 = eventState70.reset((double) (-1L), doubleArray91);
        boolean boolean95 = eventState55.reset((-1.0d), doubleArray91);
        boolean boolean96 = eventState22.reset((-1.0d), doubleArray91);
        boolean boolean97 = eventState11.reset((double) 1.0f, doubleArray91);
        boolean boolean98 = eventState4.reset((double) 35, doubleArray91);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(eventHandler12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertNull(eventHandler15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNull(eventHandler23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 35.0d + "'", double25 == 35.0d);
        org.junit.Assert.assertNull(eventHandler38);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(eventHandler49);
        org.junit.Assert.assertNull(eventHandler56);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(eventHandler84);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 100.0f, (double) 0L, (int) (short) 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '4', (double) 1L, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10, 0.0d, (int) (short) 1);
        double double5 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 0, (double) 10L, (int) (short) 1);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        double[] doubleArray18 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean19 = eventState10.reset(10.0d, doubleArray18);
        boolean boolean20 = eventState4.reset((double) (byte) 0, doubleArray18);
        double double21 = eventState4.getEventTime();
        boolean boolean22 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler23 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = null;
        org.apache.commons.math.ode.events.EventState eventState29 = new org.apache.commons.math.ode.events.EventState(eventHandler25, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = null;
        org.apache.commons.math.ode.events.EventState eventState35 = new org.apache.commons.math.ode.events.EventState(eventHandler31, (double) '#', (double) 100.0f, 1);
        int int36 = eventState35.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = null;
        org.apache.commons.math.ode.events.EventState eventState42 = new org.apache.commons.math.ode.events.EventState(eventHandler38, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler43 = eventState42.getEventHandler();
        double[] doubleArray50 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean51 = eventState42.reset(10.0d, doubleArray50);
        boolean boolean52 = eventState35.reset(0.0d, doubleArray50);
        boolean boolean53 = eventState29.reset((double) (byte) 0, doubleArray50);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) (short) 10, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(eventHandler23);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(eventHandler43);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) (byte) 0, 35);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) 1, 100.0d, (int) (byte) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler17 = eventState16.getEventHandler();
        int int18 = eventState16.getMaxIterationCount();
        double double19 = eventState16.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = null;
        org.apache.commons.math.ode.events.EventState eventState25 = new org.apache.commons.math.ode.events.EventState(eventHandler21, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = null;
        org.apache.commons.math.ode.events.EventState eventState31 = new org.apache.commons.math.ode.events.EventState(eventHandler27, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = eventState31.getEventHandler();
        double[] doubleArray39 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean40 = eventState31.reset(10.0d, doubleArray39);
        boolean boolean41 = eventState25.reset((double) 1, doubleArray39);
        boolean boolean42 = eventState16.reset((double) (short) 0, doubleArray39);
        double double43 = eventState16.getMaxCheckInterval();
        int int44 = eventState16.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler46 = null;
        org.apache.commons.math.ode.events.EventState eventState50 = new org.apache.commons.math.ode.events.EventState(eventHandler46, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler51 = eventState50.getEventHandler();
        double[] doubleArray58 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean59 = eventState50.reset(10.0d, doubleArray58);
        boolean boolean60 = eventState16.reset(35.0d, doubleArray58);
        boolean boolean61 = eventState10.reset(35.0d, doubleArray58);
        boolean boolean62 = eventState4.reset((double) (-1.0f), doubleArray58);
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator63 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = eventState4.evaluateStep(stepInterpolator63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertNull(eventHandler32);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 35.0d + "'", double43 == 35.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNull(eventHandler51);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        int int9 = eventState4.getMaxIterationCount();
        double double10 = eventState4.getConvergence();
        boolean boolean11 = eventState4.stop();
        int int12 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 100, (double) 10L, (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        boolean boolean6 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(eventHandler7);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) 0, (double) (byte) 1, (int) (short) 100);
        double double5 = eventState4.getEventTime();
        double double6 = eventState4.getEventTime();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (byte) -1, Double.NaN, 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getEventTime();
        int int7 = eventState4.getMaxIterationCount();
        double double8 = eventState4.getMaxCheckInterval();
        boolean boolean9 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = eventState4.getEventHandler();
        boolean boolean11 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(eventHandler10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        boolean boolean7 = eventState4.stop();
        double double8 = eventState4.getEventTime();
        boolean boolean9 = eventState4.stop();
        double double10 = eventState4.getEventTime();
        boolean boolean11 = eventState4.stop();
        boolean boolean12 = eventState4.stop();
        double double13 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getEventTime();
        double double8 = eventState4.getEventTime();
        boolean boolean9 = eventState4.stop();
        double double10 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNull(eventHandler11);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 0, (double) 'a', (int) '4');
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getEventTime();
        double double7 = eventState4.getMaxCheckInterval();
        boolean boolean8 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) 100L, 100);
        boolean boolean5 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) 100L, (int) (short) 10);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        boolean boolean6 = eventState4.stop();
        int int7 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 1, (double) (byte) 100, (int) 'a');
        double double5 = eventState4.getConvergence();
        int int6 = eventState4.getMaxIterationCount();
        int int7 = eventState4.getMaxIterationCount();
        java.lang.Class<?> wildcardClass8 = eventState4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        int int5 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = null;
        org.apache.commons.math.ode.events.EventState eventState11 = new org.apache.commons.math.ode.events.EventState(eventHandler7, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = eventState11.getEventHandler();
        double[] doubleArray19 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean20 = eventState11.reset(10.0d, doubleArray19);
        boolean boolean21 = eventState4.reset(0.0d, doubleArray19);
        int int22 = eventState4.getMaxIterationCount();
        double double23 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler25 = null;
        org.apache.commons.math.ode.events.EventState eventState29 = new org.apache.commons.math.ode.events.EventState(eventHandler25, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = eventState29.getEventHandler();
        int int31 = eventState29.getMaxIterationCount();
        double double32 = eventState29.getMaxCheckInterval();
        double double33 = eventState29.getEventTime();
        double double34 = eventState29.getEventTime();
        int int35 = eventState29.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = eventState29.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = null;
        org.apache.commons.math.ode.events.EventState eventState42 = new org.apache.commons.math.ode.events.EventState(eventHandler38, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler43 = eventState42.getEventHandler();
        int int44 = eventState42.getMaxIterationCount();
        double double45 = eventState42.getMaxCheckInterval();
        double double46 = eventState42.getEventTime();
        int int47 = eventState42.getMaxIterationCount();
        double double48 = eventState42.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler50 = null;
        org.apache.commons.math.ode.events.EventState eventState54 = new org.apache.commons.math.ode.events.EventState(eventHandler50, (double) (short) 10, (double) '#', (int) (short) 0);
        int int55 = eventState54.getMaxIterationCount();
        double double56 = eventState54.getEventTime();
        boolean boolean57 = eventState54.stop();
        int int58 = eventState54.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler60 = null;
        org.apache.commons.math.ode.events.EventState eventState64 = new org.apache.commons.math.ode.events.EventState(eventHandler60, (double) (short) 10, (double) '#', (int) (short) 0);
        int int65 = eventState64.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler67 = null;
        org.apache.commons.math.ode.events.EventState eventState71 = new org.apache.commons.math.ode.events.EventState(eventHandler67, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler73 = null;
        org.apache.commons.math.ode.events.EventState eventState77 = new org.apache.commons.math.ode.events.EventState(eventHandler73, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler78 = eventState77.getEventHandler();
        double[] doubleArray85 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean86 = eventState77.reset(10.0d, doubleArray85);
        boolean boolean87 = eventState71.reset((double) 1, doubleArray85);
        boolean boolean88 = eventState64.reset((double) (-1L), doubleArray85);
        boolean boolean89 = eventState54.reset(0.0d, doubleArray85);
        boolean boolean90 = eventState42.reset((double) '#', doubleArray85);
        boolean boolean91 = eventState29.reset(0.0d, doubleArray85);
        boolean boolean92 = eventState4.reset((double) (byte) 100, doubleArray85);
        java.lang.Class<?> wildcardClass93 = eventState4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(eventHandler12);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNull(eventHandler30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 35.0d + "'", double32 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(eventHandler36);
        org.junit.Assert.assertNull(eventHandler43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 35.0d + "'", double45 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 35.0d + "'", double48 == 35.0d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(eventHandler78);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray12 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean13 = eventState4.reset(10.0d, doubleArray12);
        int int14 = eventState4.getMaxIterationCount();
        double double15 = eventState4.getConvergence();
        double double16 = eventState4.getConvergence();
        double double17 = eventState4.getMaxCheckInterval();
        double double18 = eventState4.getConvergence();
        double double19 = eventState4.getEventTime();
        double double20 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = null;
        org.apache.commons.math.ode.events.EventState eventState15 = new org.apache.commons.math.ode.events.EventState(eventHandler11, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler16 = eventState15.getEventHandler();
        double[] doubleArray24 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean25 = eventState15.reset(0.0d, doubleArray24);
        int int26 = eventState15.getMaxIterationCount();
        double double27 = eventState15.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = eventState15.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) '#', (double) 100.0f, 1);
        int int35 = eventState34.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = null;
        org.apache.commons.math.ode.events.EventState eventState41 = new org.apache.commons.math.ode.events.EventState(eventHandler37, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = eventState41.getEventHandler();
        double[] doubleArray49 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean50 = eventState41.reset(10.0d, doubleArray49);
        boolean boolean51 = eventState34.reset(0.0d, doubleArray49);
        org.apache.commons.math.ode.events.EventHandler eventHandler53 = null;
        org.apache.commons.math.ode.events.EventState eventState57 = new org.apache.commons.math.ode.events.EventState(eventHandler53, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler58 = eventState57.getEventHandler();
        double[] doubleArray66 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean67 = eventState57.reset(0.0d, doubleArray66);
        boolean boolean68 = eventState34.reset(Double.NaN, doubleArray66);
        boolean boolean69 = eventState15.reset((double) (-1), doubleArray66);
        boolean boolean70 = eventState4.reset(35.0d, doubleArray66);
        int int71 = eventState4.getMaxIterationCount();
        int int72 = eventState4.getMaxIterationCount();
        double double73 = eventState4.getConvergence();
        boolean boolean74 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(eventHandler16);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNull(eventHandler28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(eventHandler42);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(eventHandler58);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 100.0d + "'", double73 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler12 = null;
        org.apache.commons.math.ode.events.EventState eventState16 = new org.apache.commons.math.ode.events.EventState(eventHandler12, (double) '#', (double) 100.0f, 1);
        int int17 = eventState16.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        double[] doubleArray31 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean32 = eventState23.reset(10.0d, doubleArray31);
        boolean boolean33 = eventState16.reset(0.0d, doubleArray31);
        boolean boolean34 = eventState10.reset((double) (byte) 0, doubleArray31);
        boolean boolean35 = eventState4.reset(Double.NaN, doubleArray31);
        org.apache.commons.math.ode.events.EventHandler eventHandler36 = eventState4.getEventHandler();
        double double37 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = eventState4.getEventHandler();
        boolean boolean39 = eventState4.stop();
        double double40 = eventState4.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler41 = eventState4.getEventHandler();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(eventHandler36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertNull(eventHandler38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNull(eventHandler41);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray12 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean13 = eventState4.reset(10.0d, doubleArray12);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) (short) 10, (double) '#', (int) (short) 0);
        int int20 = eventState19.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = null;
        org.apache.commons.math.ode.events.EventState eventState26 = new org.apache.commons.math.ode.events.EventState(eventHandler22, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = null;
        org.apache.commons.math.ode.events.EventState eventState32 = new org.apache.commons.math.ode.events.EventState(eventHandler28, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = eventState32.getEventHandler();
        double[] doubleArray40 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean41 = eventState32.reset(10.0d, doubleArray40);
        boolean boolean42 = eventState26.reset((double) 1, doubleArray40);
        boolean boolean43 = eventState19.reset((double) (-1L), doubleArray40);
        boolean boolean44 = eventState4.reset((-1.0d), doubleArray40);
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = eventState4.getEventHandler();
        double double46 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(eventHandler33);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(eventHandler45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 35.0d + "'", double46 == 35.0d);
        org.junit.Assert.assertNull(eventHandler47);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        int int8 = eventState4.getMaxIterationCount();
        int int9 = eventState4.getMaxIterationCount();
        double double10 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState4.getEventHandler();
        double double12 = eventState4.getEventTime();
        double double13 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler20 = eventState19.getEventHandler();
        double[] doubleArray27 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean28 = eventState19.reset(10.0d, doubleArray27);
        boolean boolean29 = eventState13.reset((double) 1, doubleArray27);
        boolean boolean30 = eventState4.reset((double) (short) 0, doubleArray27);
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = eventState4.getEventHandler();
        double double32 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(eventHandler31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 35.0d + "'", double32 == 35.0d);
        org.junit.Assert.assertNull(eventHandler33);
        org.junit.Assert.assertNull(eventHandler34);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        int int9 = eventState4.getMaxIterationCount();
        double double10 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState4.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = eventState17.getEventHandler();
        double[] doubleArray25 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean26 = eventState17.reset(10.0d, doubleArray25);
        int int27 = eventState17.getMaxIterationCount();
        double double28 = eventState17.getConvergence();
        double double29 = eventState17.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler31 = null;
        org.apache.commons.math.ode.events.EventState eventState35 = new org.apache.commons.math.ode.events.EventState(eventHandler31, (double) (short) -1, (double) (short) -1, (int) '#');
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = null;
        org.apache.commons.math.ode.events.EventState eventState41 = new org.apache.commons.math.ode.events.EventState(eventHandler37, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler43 = null;
        org.apache.commons.math.ode.events.EventState eventState47 = new org.apache.commons.math.ode.events.EventState(eventHandler43, (double) '#', (double) 100.0f, 1);
        int int48 = eventState47.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler50 = null;
        org.apache.commons.math.ode.events.EventState eventState54 = new org.apache.commons.math.ode.events.EventState(eventHandler50, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler55 = eventState54.getEventHandler();
        double[] doubleArray62 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean63 = eventState54.reset(10.0d, doubleArray62);
        boolean boolean64 = eventState47.reset(0.0d, doubleArray62);
        boolean boolean65 = eventState41.reset((double) (byte) 0, doubleArray62);
        boolean boolean66 = eventState35.reset(Double.NaN, doubleArray62);
        boolean boolean67 = eventState17.reset((double) 0L, doubleArray62);
        boolean boolean68 = eventState4.reset(1.0d, doubleArray62);
        org.apache.commons.math.ode.events.EventHandler eventHandler69 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertNull(eventHandler18);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNull(eventHandler55);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(eventHandler69);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler9 = null;
        org.apache.commons.math.ode.events.EventState eventState13 = new org.apache.commons.math.ode.events.EventState(eventHandler9, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler14 = eventState13.getEventHandler();
        double[] doubleArray21 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean22 = eventState13.reset(10.0d, doubleArray21);
        boolean boolean23 = eventState4.reset((double) (byte) 1, doubleArray21);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState4.getEventHandler();
        double double25 = eventState4.getEventTime();
        boolean boolean26 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler14);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10, (double) 1L, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) (short) 10, (double) '#', (int) (short) 0);
        int int11 = eventState10.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        double[] doubleArray31 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean32 = eventState23.reset(10.0d, doubleArray31);
        boolean boolean33 = eventState17.reset((double) 1, doubleArray31);
        boolean boolean34 = eventState10.reset((double) (-1L), doubleArray31);
        boolean boolean35 = eventState4.reset((double) ' ', doubleArray31);
        double double36 = eventState4.getEventTime();
        boolean boolean37 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 1, (double) 0.0f, (int) 'a');
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = eventState4.evaluateStep(stepInterpolator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 97, 1.0d, 97);
        double double5 = eventState4.getMaxCheckInterval();
        double double6 = eventState4.getEventTime();
        double double7 = eventState4.getConvergence();
        double double8 = eventState4.getMaxCheckInterval();
        double double9 = eventState4.getConvergence();
        double double10 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        double double5 = eventState4.getMaxCheckInterval();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        int int9 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = null;
        org.apache.commons.math.ode.events.EventState eventState15 = new org.apache.commons.math.ode.events.EventState(eventHandler11, (double) (short) 10, (double) '#', (int) (short) 0);
        int int16 = eventState15.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = null;
        org.apache.commons.math.ode.events.EventState eventState22 = new org.apache.commons.math.ode.events.EventState(eventHandler18, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = null;
        org.apache.commons.math.ode.events.EventState eventState28 = new org.apache.commons.math.ode.events.EventState(eventHandler24, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler29 = eventState28.getEventHandler();
        double[] doubleArray36 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean37 = eventState28.reset(10.0d, doubleArray36);
        boolean boolean38 = eventState22.reset((double) 1, doubleArray36);
        boolean boolean39 = eventState15.reset((double) (-1L), doubleArray36);
        boolean boolean40 = eventState4.reset((double) 97, doubleArray36);
        double double41 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(eventHandler29);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        int int8 = eventState4.getMaxIterationCount();
        int int9 = eventState4.getMaxIterationCount();
        double double10 = eventState4.getMaxCheckInterval();
        boolean boolean11 = eventState4.stop();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 1.0d, (double) (short) 0, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        org.apache.commons.math.ode.sampling.StepInterpolator stepInterpolator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = eventState4.evaluateStep(stepInterpolator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler5);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray12 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean13 = eventState4.reset(10.0d, doubleArray12);
        int int14 = eventState4.getMaxIterationCount();
        double double15 = eventState4.getConvergence();
        double double16 = eventState4.getEventTime();
        double double17 = eventState4.getEventTime();
        double double18 = eventState4.getConvergence();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 100.0f, (double) '4', 32);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        int int12 = eventState10.getMaxIterationCount();
        double double13 = eventState10.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = null;
        org.apache.commons.math.ode.events.EventState eventState25 = new org.apache.commons.math.ode.events.EventState(eventHandler21, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler26 = eventState25.getEventHandler();
        double[] doubleArray33 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean34 = eventState25.reset(10.0d, doubleArray33);
        boolean boolean35 = eventState19.reset((double) 1, doubleArray33);
        boolean boolean36 = eventState10.reset((double) (short) 0, doubleArray33);
        boolean boolean37 = eventState4.reset(32.0d, doubleArray33);
        double double38 = eventState4.getConvergence();
        java.lang.Class<?> wildcardClass39 = eventState4.getClass();
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNull(eventHandler26);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 52.0d + "'", double38 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) '#', (int) (byte) 1);
        boolean boolean5 = eventState4.stop();
        double double6 = eventState4.getMaxCheckInterval();
        double double7 = eventState4.getMaxCheckInterval();
        boolean boolean8 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler10 = null;
        org.apache.commons.math.ode.events.EventState eventState14 = new org.apache.commons.math.ode.events.EventState(eventHandler10, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = eventState14.getEventHandler();
        double double16 = eventState14.getMaxCheckInterval();
        double double17 = eventState14.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = null;
        org.apache.commons.math.ode.events.EventState eventState23 = new org.apache.commons.math.ode.events.EventState(eventHandler19, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler24 = eventState23.getEventHandler();
        double[] doubleArray31 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean32 = eventState23.reset(10.0d, doubleArray31);
        org.apache.commons.math.ode.events.EventHandler eventHandler34 = null;
        org.apache.commons.math.ode.events.EventState eventState38 = new org.apache.commons.math.ode.events.EventState(eventHandler34, (double) (short) 10, (double) '#', (int) (short) 0);
        int int39 = eventState38.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler41 = null;
        org.apache.commons.math.ode.events.EventState eventState45 = new org.apache.commons.math.ode.events.EventState(eventHandler41, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = null;
        org.apache.commons.math.ode.events.EventState eventState51 = new org.apache.commons.math.ode.events.EventState(eventHandler47, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler52 = eventState51.getEventHandler();
        double[] doubleArray59 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean60 = eventState51.reset(10.0d, doubleArray59);
        boolean boolean61 = eventState45.reset((double) 1, doubleArray59);
        boolean boolean62 = eventState38.reset((double) (-1L), doubleArray59);
        boolean boolean63 = eventState23.reset((-1.0d), doubleArray59);
        boolean boolean64 = eventState14.reset((double) (byte) 100, doubleArray59);
        boolean boolean65 = eventState4.reset(35.0d, doubleArray59);
        int int66 = eventState4.getMaxIterationCount();
        double double67 = eventState4.getConvergence();
        double double68 = eventState4.getConvergence();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(eventHandler15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNull(eventHandler24);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(eventHandler52);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 35.0d + "'", double67 == 35.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 35.0d + "'", double68 == 35.0d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 1.0f, 1.0d, (int) (short) 10);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double[] doubleArray12 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean13 = eventState4.reset(10.0d, doubleArray12);
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) (short) 10, (double) '#', (int) (short) 0);
        int int20 = eventState19.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler22 = null;
        org.apache.commons.math.ode.events.EventState eventState26 = new org.apache.commons.math.ode.events.EventState(eventHandler22, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler28 = null;
        org.apache.commons.math.ode.events.EventState eventState32 = new org.apache.commons.math.ode.events.EventState(eventHandler28, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler33 = eventState32.getEventHandler();
        double[] doubleArray40 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean41 = eventState32.reset(10.0d, doubleArray40);
        boolean boolean42 = eventState26.reset((double) 1, doubleArray40);
        boolean boolean43 = eventState19.reset((double) (-1L), doubleArray40);
        boolean boolean44 = eventState4.reset((-1.0d), doubleArray40);
        org.apache.commons.math.ode.events.EventHandler eventHandler45 = eventState4.getEventHandler();
        double double46 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler47 = eventState4.getEventHandler();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(eventHandler33);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(eventHandler45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertNull(eventHandler47);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, 35.0d, (double) (short) 0, (int) (byte) -1);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState10.getEventHandler();
        double double12 = eventState10.getMaxCheckInterval();
        double double13 = eventState10.getEventTime();
        double double14 = eventState10.getEventTime();
        int int15 = eventState10.getMaxIterationCount();
        boolean boolean16 = eventState10.stop();
        int int17 = eventState10.getMaxIterationCount();
        double double18 = eventState10.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler19 = eventState10.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler21 = null;
        org.apache.commons.math.ode.events.EventState eventState25 = new org.apache.commons.math.ode.events.EventState(eventHandler21, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler26 = eventState25.getEventHandler();
        double[] doubleArray34 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean35 = eventState25.reset(0.0d, doubleArray34);
        int int36 = eventState25.getMaxIterationCount();
        double double37 = eventState25.getMaxCheckInterval();
        double double38 = eventState25.getConvergence();
        boolean boolean39 = eventState25.stop();
        double double40 = eventState25.getEventTime();
        boolean boolean41 = eventState25.stop();
        double double42 = eventState25.getEventTime();
        org.apache.commons.math.ode.events.EventHandler eventHandler44 = null;
        org.apache.commons.math.ode.events.EventState eventState48 = new org.apache.commons.math.ode.events.EventState(eventHandler44, (double) '#', (double) 100.0f, 1);
        int int49 = eventState48.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler51 = null;
        org.apache.commons.math.ode.events.EventState eventState55 = new org.apache.commons.math.ode.events.EventState(eventHandler51, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler56 = eventState55.getEventHandler();
        double[] doubleArray63 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean64 = eventState55.reset(10.0d, doubleArray63);
        boolean boolean65 = eventState48.reset(0.0d, doubleArray63);
        org.apache.commons.math.ode.events.EventHandler eventHandler67 = null;
        org.apache.commons.math.ode.events.EventState eventState71 = new org.apache.commons.math.ode.events.EventState(eventHandler67, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler72 = eventState71.getEventHandler();
        double[] doubleArray80 = new double[] { 0.0f, (byte) -1, 100, 1, 0.0f, (short) 10 };
        boolean boolean81 = eventState71.reset(0.0d, doubleArray80);
        boolean boolean82 = eventState48.reset(Double.NaN, doubleArray80);
        boolean boolean83 = eventState25.reset((double) (-1L), doubleArray80);
        boolean boolean84 = eventState10.reset(10.0d, doubleArray80);
        // The following exception was thrown during execution in test generation
        try {
            eventState4.stepAccepted((double) 0, doubleArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertNull(eventHandler19);
        org.junit.Assert.assertNull(eventHandler26);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 35.0d + "'", double37 == 35.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNull(eventHandler56);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(eventHandler72);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        double double7 = eventState4.getEventTime();
        double double8 = eventState4.getMaxCheckInterval();
        int int9 = eventState4.getMaxIterationCount();
        boolean boolean10 = eventState4.stop();
        double double11 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) 0.0f, 100);
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = null;
        org.apache.commons.math.ode.events.EventState eventState10 = new org.apache.commons.math.ode.events.EventState(eventHandler6, (double) '#', (double) 100.0f, 1);
        int int11 = eventState10.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler13 = null;
        org.apache.commons.math.ode.events.EventState eventState17 = new org.apache.commons.math.ode.events.EventState(eventHandler13, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler18 = eventState17.getEventHandler();
        double[] doubleArray25 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean26 = eventState17.reset(10.0d, doubleArray25);
        boolean boolean27 = eventState10.reset(0.0d, doubleArray25);
        boolean boolean28 = eventState4.reset((double) (byte) 0, doubleArray25);
        org.apache.commons.math.ode.events.EventHandler eventHandler30 = null;
        org.apache.commons.math.ode.events.EventState eventState34 = new org.apache.commons.math.ode.events.EventState(eventHandler30, (double) '#', (double) 100.0f, 1);
        int int35 = eventState34.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler37 = null;
        org.apache.commons.math.ode.events.EventState eventState41 = new org.apache.commons.math.ode.events.EventState(eventHandler37, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler42 = eventState41.getEventHandler();
        double[] doubleArray49 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean50 = eventState41.reset(10.0d, doubleArray49);
        boolean boolean51 = eventState34.reset(0.0d, doubleArray49);
        org.apache.commons.math.ode.events.EventHandler eventHandler53 = null;
        org.apache.commons.math.ode.events.EventState eventState57 = new org.apache.commons.math.ode.events.EventState(eventHandler53, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler58 = eventState57.getEventHandler();
        double[] doubleArray65 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean66 = eventState57.reset(10.0d, doubleArray65);
        boolean boolean67 = eventState34.reset(10.0d, doubleArray65);
        boolean boolean68 = eventState4.reset((double) 0.0f, doubleArray65);
        org.apache.commons.math.ode.events.EventHandler eventHandler70 = null;
        org.apache.commons.math.ode.events.EventState eventState74 = new org.apache.commons.math.ode.events.EventState(eventHandler70, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler75 = eventState74.getEventHandler();
        int int76 = eventState74.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler77 = eventState74.getEventHandler();
        int int78 = eventState74.getMaxIterationCount();
        int int79 = eventState74.getMaxIterationCount();
        double[] doubleArray86 = new double[] { (-1), (-1L), 100.0d, 0, 10.0d };
        boolean boolean87 = eventState74.reset(1.0d, doubleArray86);
        boolean boolean88 = eventState4.reset(1.0d, doubleArray86);
        double double89 = eventState4.getMaxCheckInterval();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(eventHandler18);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(eventHandler42);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(eventHandler58);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(eventHandler75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNull(eventHandler77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { (-1.0d), (-1.0d), 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 10.0d + "'", double89 == 10.0d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) '#', (int) (short) 0);
        int int5 = eventState4.getMaxIterationCount();
        double double6 = eventState4.getEventTime();
        double double7 = eventState4.getConvergence();
        double double8 = eventState4.getEventTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        double double8 = eventState4.getMaxCheckInterval();
        int int9 = eventState4.getMaxIterationCount();
        java.lang.Class<?> wildcardClass10 = eventState4.getClass();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 10, (double) (short) 0, (int) ' ');
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 'a', (double) (byte) -1, (int) (short) 0);
        boolean boolean5 = eventState4.stop();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) 0L, (double) 100, 0);
        double double5 = eventState4.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler6 = eventState4.getEventHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(eventHandler6);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        double double6 = eventState4.getMaxCheckInterval();
        int int7 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler8 = eventState4.getEventHandler();
        double double9 = eventState4.getConvergence();
        int int10 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(eventHandler8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (-1), (double) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) (short) 10, (double) 0.0f, 100);
        boolean boolean5 = eventState4.stop();
        boolean boolean6 = eventState4.stop();
        java.lang.Class<?> wildcardClass7 = eventState4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler7 = eventState4.getEventHandler();
        int int8 = eventState4.getMaxIterationCount();
        int int9 = eventState4.getMaxIterationCount();
        double[] doubleArray16 = new double[] { (-1), (-1L), 100.0d, 0, 10.0d };
        boolean boolean17 = eventState4.reset(1.0d, doubleArray16);
        int int18 = eventState4.getMaxIterationCount();
        boolean boolean19 = eventState4.stop();
        double double20 = eventState4.getMaxCheckInterval();
        int int21 = eventState4.getMaxIterationCount();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(eventHandler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), (-1.0d), 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.math.ode.events.EventHandler eventHandler0 = null;
        org.apache.commons.math.ode.events.EventState eventState4 = new org.apache.commons.math.ode.events.EventState(eventHandler0, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler5 = eventState4.getEventHandler();
        int int6 = eventState4.getMaxIterationCount();
        double double7 = eventState4.getMaxCheckInterval();
        double double8 = eventState4.getEventTime();
        double double9 = eventState4.getEventTime();
        int int10 = eventState4.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler11 = eventState4.getEventHandler();
        boolean boolean12 = eventState4.stop();
        boolean boolean13 = eventState4.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler15 = null;
        org.apache.commons.math.ode.events.EventState eventState19 = new org.apache.commons.math.ode.events.EventState(eventHandler15, (double) (short) 10, (double) '#', (int) (short) 0);
        int int20 = eventState19.getMaxIterationCount();
        double double21 = eventState19.getEventTime();
        boolean boolean22 = eventState19.stop();
        int int23 = eventState19.getMaxIterationCount();
        int int24 = eventState19.getMaxIterationCount();
        double double25 = eventState19.getConvergence();
        org.apache.commons.math.ode.events.EventHandler eventHandler27 = null;
        org.apache.commons.math.ode.events.EventState eventState31 = new org.apache.commons.math.ode.events.EventState(eventHandler27, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler32 = eventState31.getEventHandler();
        int int33 = eventState31.getMaxIterationCount();
        double double34 = eventState31.getMaxCheckInterval();
        double double35 = eventState31.getEventTime();
        double double36 = eventState31.getEventTime();
        boolean boolean37 = eventState31.stop();
        org.apache.commons.math.ode.events.EventHandler eventHandler38 = eventState31.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler40 = null;
        org.apache.commons.math.ode.events.EventState eventState44 = new org.apache.commons.math.ode.events.EventState(eventHandler40, (double) (short) 10, (double) '#', (int) (short) 0);
        org.apache.commons.math.ode.events.EventHandler eventHandler46 = null;
        org.apache.commons.math.ode.events.EventState eventState50 = new org.apache.commons.math.ode.events.EventState(eventHandler46, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler51 = eventState50.getEventHandler();
        double[] doubleArray58 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean59 = eventState50.reset(10.0d, doubleArray58);
        boolean boolean60 = eventState44.reset((double) 1, doubleArray58);
        boolean boolean61 = eventState31.reset((double) 35, doubleArray58);
        org.apache.commons.math.ode.events.EventHandler eventHandler62 = eventState31.getEventHandler();
        org.apache.commons.math.ode.events.EventHandler eventHandler64 = null;
        org.apache.commons.math.ode.events.EventState eventState68 = new org.apache.commons.math.ode.events.EventState(eventHandler64, (double) '#', (double) 100.0f, 1);
        int int69 = eventState68.getMaxIterationCount();
        org.apache.commons.math.ode.events.EventHandler eventHandler71 = null;
        org.apache.commons.math.ode.events.EventState eventState75 = new org.apache.commons.math.ode.events.EventState(eventHandler71, (double) '#', (double) 100.0f, 1);
        org.apache.commons.math.ode.events.EventHandler eventHandler76 = eventState75.getEventHandler();
        double[] doubleArray83 = new double[] { 10L, (-1), (-1), 0.0f, 10.0d };
        boolean boolean84 = eventState75.reset(10.0d, doubleArray83);
        boolean boolean85 = eventState68.reset(0.0d, doubleArray83);
        boolean boolean86 = eventState31.reset((double) '4', doubleArray83);
        boolean boolean87 = eventState19.reset(0.0d, doubleArray83);
        boolean boolean88 = eventState4.reset((double) (short) 1, doubleArray83);
        double double89 = eventState4.getEventTime();
        org.junit.Assert.assertNull(eventHandler5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(eventHandler11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 35.0d + "'", double25 == 35.0d);
        org.junit.Assert.assertNull(eventHandler32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 35.0d + "'", double34 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(eventHandler38);
        org.junit.Assert.assertNull(eventHandler51);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(eventHandler62);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNull(eventHandler76);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
    }
}

